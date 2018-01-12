package com.hha.heinhtetaung.news.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hha.heinhtetaung.news.R;
import com.hha.heinhtetaung.news.adapters.InternationalNewsAdapter;
import com.hha.heinhtetaung.news.adapters.SporrtsNewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5 on 1/7/2018.
 */

public class SportNewsFragment extends Fragment {
    @BindView(R.id.rv_sports_news)
    RecyclerView rvSportsNews;

    private SporrtsNewsAdapter mSporrtsNewsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sport_news, container, false);
        ButterKnife.bind(this, view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rvSportsNews.setLayoutManager(linearLayoutManager);

        mSporrtsNewsAdapter = new SporrtsNewsAdapter();
        rvSportsNews.setAdapter(mSporrtsNewsAdapter);
        return view;
    }
}
