package com.example.girish.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Girish on 7/17/2017.
 */

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.recyclerViewHolder>{
private List<String> mList;
    Context mcontext;

    public recyclerViewAdapter(Context context, List<String> list) {
            mList=list;
            this.mcontext=context;

    }

    @Override
    public recyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Getting the recyclerView item layout
        LayoutInflater inflater= LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.list_of_numbers,parent,false);

        return new recyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(recyclerViewHolder holder, int position) {
      String num=mList.get(position);
      holder.numberTextView.setText(num.toString());

    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    class recyclerViewHolder extends RecyclerView.ViewHolder{
TextView numberTextView;
        public recyclerViewHolder(View itemView) {
            super(itemView);
            numberTextView= (TextView) itemView.findViewById(R.id.list_id);
            //

        }
    }
}
