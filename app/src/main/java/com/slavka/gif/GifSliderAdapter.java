package com.slavka.gif;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class GifSliderAdapter extends PagerAdapter {

    private Context mContext;
    private List<Integer> gifs;
    private LayoutInflater inflater;

    GifSliderAdapter(Context context, List<Integer> list) {
        mContext = context;
        gifs = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ViewGroup imageLayout = (ViewGroup) inflater.inflate(R.layout.gif_item, collection, false);
        GifImageView gif = imageLayout.findViewById(R.id.imageView);
        gif.setImageResource(gifs.get(position));
        collection.addView(imageLayout);
        return imageLayout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return gifs.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return gifs.get(position).toString();
    }
}