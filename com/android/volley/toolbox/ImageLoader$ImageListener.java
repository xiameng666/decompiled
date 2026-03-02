package com.android.volley.toolbox;

import com.android.volley.Response.ErrorListener;

public interface ImageLoader.ImageListener extends Response.ErrorListener {
    void onResponse(ImageLoader.ImageContainer arg1, boolean arg2);
}

