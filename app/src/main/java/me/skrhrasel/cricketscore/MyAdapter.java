package me.skrhrasel.cricketscore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sk Rockybul Hasan Rasel on 4/14/2019.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Model> modelList;
    private Context context;

    public MyAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model model = modelList.get(position);
        holder.teamTv.setText(model.getTeam1());
        holder.team2Tv.setText(model.getTeam2());
        holder.matchTypeTv.setText(model.getMatchType());
        holder.matchStatusTv.setText(model.getMatchStatus());
        holder.dateTv.setText(model.getDate());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView teamTv, team2Tv, matchTypeTv, matchStatusTv,dateTv;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            teamTv= itemView.findViewById(R.id.teamTv);
            team2Tv = itemView.findViewById(R.id.team2Tv);
            matchTypeTv = itemView.findViewById(R.id.matchTypeTv);
            matchStatusTv = itemView.findViewById(R.id.matchStatusTv);
            dateTv = itemView.findViewById(R.id.dateTv);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

}
