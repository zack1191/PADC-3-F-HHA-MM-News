package com.hha.heinhtetaung.news.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hha.heinhtetaung.news.R;
import com.hha.heinhtetaung.news.data.vo.NewsVO;
import com.hha.heinhtetaung.news.delegates.NewsActionDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by E5 on 12/3/2017.
 */

public class ItemNewsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_publication_title)
    TextView tvPublicationTitle;

    @BindView(R.id.tv_news_brief)
    TextView tvNewsBrief;

    @BindView(R.id.tv_posted_date)
    TextView tvPostedDate;

    @BindView(R.id.iv_publication_logo)
    ImageView ivPublicationLogo;

    @BindView(R.id.iv_news)
    ImageView ivNews;

    private NewsActionDelegate mNewsActionDelegate;

    public ItemNewsViewHolder(View itemView, NewsActionDelegate newsActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mNewsActionDelegate = newsActionDelegate;
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @OnClick(R.id.cv_news_item_root)
    public void onNewsItemTap(View view) {
//        Toast.makeText(view.getContext(), "News Item Clicked", Toast.LENGTH_SHORT).show();
        mNewsActionDelegate.onTapNewsItem();
    }

    public void setNews(NewsVO news) {
        tvPublicationTitle.setText(news.getPublication().getTitle());
        tvPostedDate.setText(news.getPostedDate());
        tvNewsBrief.setText(news.getBrief());

        Glide.with(ivPublicationLogo.getContext())
                .load(news.getPublication().getLogo())
                .into(ivPublicationLogo);

        if (news.getImages() != null) {
            ivNews.setVisibility(View.VISIBLE);
            Glide.with(ivNews.getContext())
                    .load(news.getImages().get(0))
                    .into(ivNews);
        } else {
            ivNews.setVisibility(View.GONE);
        }

    }

}
