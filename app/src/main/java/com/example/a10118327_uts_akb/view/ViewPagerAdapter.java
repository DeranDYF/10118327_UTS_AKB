package com.example.a10118327_uts_akb.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.a10118327_uts_akb.R;

public class ViewPagerAdapter extends PagerAdapter {

    String[] texts = {
            "Welcome To My Note",
            "You Can Make Your Own Notes",
            "You Can See What You Have Written"
    };

    int[] image = {
           R.drawable.ic_note_viewpager,
           R.drawable.ic_add_viewpager,
            R.drawable.ic_list_viewpager,
    };

    Context ctx;

    public ViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View layoutScreen = inflater.inflate(R.layout.item_viewpager, null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.image_viewpager);
        TextView title = layoutScreen.findViewById(R.id.text_viewpager);

        title.setText(texts[position]);
        imgSlide.setImageResource(image[position]);
        container.addView(layoutScreen);
        return layoutScreen;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
// 03 JUNI 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8
