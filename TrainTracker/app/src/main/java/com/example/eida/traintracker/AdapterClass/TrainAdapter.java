package com.example.eida.traintracker.AdapterClass;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.eida.traintracker.R;
import com.example.eida.traintracker.SendSmsActivity;
import com.example.eida.traintracker.Train;


import java.util.ArrayList;
import java.util.List;

public class TrainAdapter extends RecyclerView.Adapter<TrainAdapter.myViewHolder>  {

   private Context context;

    private List<Train> trainList;

    public TrainAdapter(List<Train> trainList) {

        this.trainList = trainList;

    }


    public class myViewHolder extends RecyclerView.ViewHolder {
        public TextView title, code, sms_code;
        RelativeLayout relative;

        public myViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.trainname);
            code = (TextView) view.findViewById(R.id.traincode);
            sms_code = (TextView) view.findViewById(R.id.trainsmscode);
            relative = (RelativeLayout) view.findViewById(R.id.relative);


        }
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {


        final Train train = trainList.get(position);
        holder.title.setText(train.getTitle());
        holder.code.setText(train.getCode());
        holder.sms_code.setText(train.getSms_code());
        holder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent code

                Intent intent = new Intent(view.getContext(), SendSmsActivity.class);
                intent.putExtra("name",train.getTitle());
                intent.putExtra("code",train.getSms_code() );
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return trainList.size();
    }


    public  void setSearchOperation(List<Train> newlist){

        trainList = new ArrayList<>();
        trainList.addAll(newlist);
        notifyDataSetChanged();
    }
}
