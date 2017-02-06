package com.android.commonlibray.util.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.github.lazylibrary.R;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by leonWang on 2017/1/10.
 */

public class GlideImageLoader extends BaseImageLoader {

    private static GlideImageLoader instance;

    public static GlideImageLoader getInstance() {
        if (instance == null) {
            instance = new GlideImageLoader();
        }
        return instance;
    }


    /**
     * 加载普通图片
     *
     * @param context
     * @param path
     * @param imageView
     */
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context)
                .load(path)//路径
                .crossFade()//平滑动画
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存
                .centerCrop()//填充方式--完全
                .placeholder(R.mipmap.ic_launcher)//加载中默认图
                .error(R.mipmap.ic_launcher)//失败图
                .into(imageView);//view
    }


    /**
     * 加载圆角图片
     *
     * @param context
     * @param path
     * @param imageView
     */
    @Override
    public void displayCircleImage(Context context, Object path, ImageView imageView) {
        Glide.with(context)
                .load(path)
                .crossFade()
                .bitmapTransform(new CropCircleTransformation(context))//圆角转换器
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存
                .centerCrop()//填充方式--完全
                .placeholder(R.mipmap.ic_launcher)//加载中默认图
                .error(R.mipmap.ic_launcher)//失败图
                .into(imageView);
    }


    /**
     * 加载gif动画
     * @param context
     * @param path
     * @param imagerView
     */
    @Override
    public void displayGifImage(Context context, Object path, ImageView imagerView) {
        Glide.with(context)
                .load(path)
                .asGif()//加载gif
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .centerCrop()//填充
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imagerView);
    }


}
