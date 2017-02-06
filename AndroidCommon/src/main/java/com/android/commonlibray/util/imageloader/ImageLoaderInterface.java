package com.android.commonlibray.util.imageloader;

import android.content.Context;
import android.view.View;

import java.io.Serializable;

/**
 * Created by leonWang on 2017/1/10.
 */

public interface ImageLoaderInterface<T extends View> extends Serializable {
    void displayImage(Context context, Object path, T imageView);

    void displayCircleImage(Context context, Object path, T imageView);

    void displayGifImage(Context context ,Object path,T imagerView);

    T creteImageView(Context context);
}
