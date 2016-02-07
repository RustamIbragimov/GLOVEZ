package com.rustam.glovez.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rustam.glovez.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Rustam on 2/7/2016.
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    private List<FeedItemData> data = Collections.emptyList();

    public FeedAdapter(Context context, List<FeedItemData> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.feed_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FeedItemData item = data.get(position);
        holder.login.setText(item.getLogin());
        holder.avatar.setImageResource(item.getAvatar());
        holder.photo.setImageResource(item.getPhoto());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView login;
        private ImageView avatar;
        private ImageView photo;

        public MyViewHolder(View itemView) {
            super(itemView);

            login = (TextView) itemView.findViewById(R.id.feed_login);
            avatar = (ImageView) itemView.findViewById(R.id.feed_avatar);
            photo = (ImageView) itemView.findViewById(R.id.feed_photo);
        }

    }
}
