package com.hha.heinhtetaung.news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hha.heinhtetaung.news.R;
import com.hha.heinhtetaung.news.viewholders.ItemInternationalNewsViewHolder;
import com.hha.heinhtetaung.news.viewholders.ItemNewsViewHolder;

/**
 * Created by E5 on 1/12/2018.
 */

public class InternationalNewsAdapter extends RecyclerView.Adapter<ItemInternationalNewsViewHolder> {
    @Override
    public ItemInternationalNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsInternational = inflater.inflate(R.layout.item_international_news, parent, false);
        ItemInternationalNewsViewHolder itemInternationalNewsViewHolder = new ItemInternationalNewsViewHolder(newsInternational);
        return itemInternationalNewsViewHolder;

    }

    @Override
    public void onBindViewHolder(ItemInternationalNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
