package com.android.volley.toolbox;

import android.graphics.Bitmap;

public interface ImageLoader.ImageCache {
    Bitmap getBitmap(String arg1);

    void putBitmap(String arg1, Bitmap arg2);
}

