package com.android.commonlibray.util.imageloader;

import android.content.Context;
import android.widget.ImageView;


/**
 * Created by leonWang on 17/1/17.
 */

public abstract class BaseImageLoader implements ImageLoaderInterface<ImageView> {
    @Override
    public ImageView creteImageView(Context context) {
        ImageView imageView = new ImageView(context);
        return imageView;
    }
}
