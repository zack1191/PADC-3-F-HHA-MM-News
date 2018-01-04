package com.hha.heinhtetaung.news.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hha.heinhtetaung.news.R;
import com.hha.heinhtetaung.news.adapters.ImagesInNewsDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5 on 12/9/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {
    @BindView(R.id.tb_tool_bar)
    Toolbar toolbar;

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    private ImagesInNewsDetailsAdapter mImagesInNewsDetailsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_news_details);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        mImagesInNewsDetailsAdapter = new ImagesInNewsDetailsAdapter();
        vpNewsDetailsImages.setAdapter(mImagesInNewsDetailsAdapter);

    }
}
