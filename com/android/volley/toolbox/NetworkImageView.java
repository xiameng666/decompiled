package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import sqp;
import sqs;

public class NetworkImageView extends ImageView {
    public int a;
    public Drawable b;
    public Bitmap c;
    public int d;
    public Drawable e;
    public Bitmap f;
    private String g;
    private ImageLoader h;
    private ImageLoader.ImageContainer i;

    public NetworkImageView(Context context0) {
        this(context0, null);
    }

    public NetworkImageView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NetworkImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    final void a(boolean z) {
        int v3;
        int v2;
        int v = this.getWidth();
        int v1 = this.getHeight();
        ImageView.ScaleType imageView$ScaleType0 = this.getScaleType();
        if(this.getLayoutParams() == null) {
            v2 = 0;
            v3 = 0;
        }
        else {
            v2 = this.getLayoutParams().width == -2 ? 1 : 0;
            v3 = this.getLayoutParams().height == -2 ? 1 : 0;
        }
        if(v == 0) {
            if(v1 == 0) {
                if(v2 == 0 || v3 == 0) {
                    return;
                }
                v = 0;
                v1 = 0;
            }
            else {
                v = 0;
            }
        }
        if(TextUtils.isEmpty(this.g)) {
            ImageLoader.ImageContainer imageLoader$ImageContainer0 = this.i;
            if(imageLoader$ImageContainer0 != null) {
                imageLoader$ImageContainer0.cancelRequest();
                this.i = null;
            }
            this.b();
            return;
        }
        if(this.i != null && this.i.getRequestUrl() != null) {
            if(this.i.getRequestUrl().equals(this.g)) {
                return;
            }
            this.i.cancelRequest();
            this.b();
        }
        if(1 == v2) {
            v = 0;
        }
        this.i = this.h.get(this.g, new sqp(this, z), v, (1 == v3 ? 0 : v1), imageView$ScaleType0);
    }

    private final void b() {
        int v = this.a;
        if(v != 0) {
            this.setImageResource(v);
            return;
        }
        Drawable drawable0 = this.b;
        if(drawable0 != null) {
            this.setImageDrawable(drawable0);
            return;
        }
        Bitmap bitmap0 = this.c;
        if(bitmap0 != null) {
            this.setImageBitmap(bitmap0);
            return;
        }
        this.setImageBitmap(null);
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.invalidate();
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        ImageLoader.ImageContainer imageLoader$ImageContainer0 = this.i;
        if(imageLoader$ImageContainer0 != null) {
            imageLoader$ImageContainer0.cancelRequest();
            this.setImageBitmap(null);
            this.i = null;
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap0) {
        this.a = 0;
        this.b = null;
        this.c = bitmap0;
    }

    public void setDefaultImageDrawable(Drawable drawable0) {
        this.a = 0;
        this.c = null;
        this.b = drawable0;
    }

    public void setDefaultImageResId(int v) {
        this.c = null;
        this.b = null;
        this.a = v;
    }

    public void setErrorImageBitmap(Bitmap bitmap0) {
        this.d = 0;
        this.e = null;
        this.f = bitmap0;
    }

    public void setErrorImageDrawable(Drawable drawable0) {
        this.d = 0;
        this.f = null;
        this.e = drawable0;
    }

    public void setErrorImageResId(int v) {
        this.f = null;
        this.e = null;
        this.d = v;
    }

    public void setImageUrl(String s, ImageLoader imageLoader0) {
        sqs.a();
        this.g = s;
        this.h = imageLoader0;
        this.a(false);
    }
}

