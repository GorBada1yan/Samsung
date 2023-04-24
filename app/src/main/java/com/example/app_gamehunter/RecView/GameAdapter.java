package com.example.app_gamehunter.RecView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_gamehunter.R;
import com.google.firebase.database.core.Context;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Game_Annotation> annotations;

    GameAdapter(Context context, List<Game_Annotation> game_annotations){
        this.annotations = game_annotations;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =     inflater.inflate(R.layout.product_rec_view, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Game_Annotation annotation =annotations.get(position);
        holder.Game_Price.setText(annotation.getGame_Price());
        holder.Game_Description.setText(annotation.getGame_Description());
        holder.Game_Name.setText(annotation.getGame_Name());

    }

    @Override
    public int getItemCount() {
        return annotations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
            TextView Game_Name, Game_Price, Game_Description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Game_Name = itemView.findViewById(R.id.Game_Name);
            Game_Description = itemView.findViewById(R.id.Game_Description);
            Game_Price = itemView.findViewById(R.id.Game_Price);
        }
    }
}
