package com.hha.heinhtetaung.news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hha.heinhtetaung.news.R;
import com.hha.heinhtetaung.news.viewholders.ItemInternationalNewsViewHolder;
import com.hha.heinhtetaung.news.viewholders.ItemSportsNewsViewHolder;

/**
 * Created by E5 on 1/12/2018.
 */

public class SporrtsNewsAdapter extends RecyclerView.Adapter<ItemSportsNewsViewHolder> {
    @Override
    public ItemSportsNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsSports = inflater.inflate(R.layout.item_sports_news, parent, false);
        ItemSportsNewsViewHolder itemSportsNewsViewHolder = new ItemSportsNewsViewHolder(newsSports);
        return itemSportsNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemSportsNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
