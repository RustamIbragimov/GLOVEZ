package com.rustam.glovez.model;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rustam.glovez.R;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.List;

/**
 * Created by Rustam on 2/7/2016.
 */
public class StatisticsAdapter extends RecyclerView.Adapter<StatisticsAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    private List<StatisticsItemData> data = Collections.emptyList();

    public StatisticsAdapter(Context context, List<StatisticsItemData> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.profile_statistics_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        StatisticsItemData current = data.get(position);
        holder.date.setText(current.getDate());
        holder.progressText.setText(current.getProgress());
        holder.progressImage.setImageResource(R.drawable.statistics_upward);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView date;
        private TextView progressText;
        private ImageView progressImage;

        public MyViewHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.statistics_date);
            progressText = (TextView) itemView.findViewById(R.id.statistics_progress_text);
            progressImage = (ImageView) itemView.findViewById(R.id.statistics_progress_image);
        }
    }
}
