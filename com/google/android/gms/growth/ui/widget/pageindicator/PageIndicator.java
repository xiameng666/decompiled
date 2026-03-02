package com.google.android.gms.growth.ui.widget.pageindicator;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import bvvi;
import bvvj;
import java.util.ArrayList;

public class PageIndicator extends ViewGroup {
    public final ArrayList a;
    public bvvj b;
    public boolean c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private final Runnable i;

    public PageIndicator(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.g = -1;
        this.h = -1;
        this.i = new bvvi(this);
        int v = (int)context0.getResources().getDimension(0x7F070F4D);  // dimen:qs_page_indicator_width
        this.d = v;
        this.e = (int)context0.getResources().getDimension(0x7F070F4C);  // dimen:qs_page_indicator_height
        this.f = (int)(((float)v) * 0.4f);
        this.setLayerType(1, null);
    }

    public final void a(float f) {
        ArrayList arrayList0 = this.a;
        int v = (int)f;
        int v1 = (f == ((float)v) ? 0 : 1) | v + v;
        if(v1 == (arrayList0.isEmpty() ? this.g : ((int)(((Integer)arrayList0.get(arrayList0.size() - 1)))))) {
            return;
        }
        if(this.c) {
            arrayList0.add(Integer.valueOf(v1));
            return;
        }
        this.c(v1);
    }

    public final void b(int v) {
        if(this.h == v) {
            return;
        }
        this.h = v;
        if(this.c) {
            Log.w("PageIndicator", "setNumPages during animation");
        }
        while(v < this.getChildCount()) {
            this.removeViewAt(this.getChildCount() - 1);
        }
        while(v > this.getChildCount()) {
            ImageView imageView0 = new ImageView(this.getContext());
            imageView0.setImageResource(0x7F0808FF);  // drawable:minor_a_b
            this.addView(imageView0, new ViewGroup.LayoutParams(this.d, this.e));
        }
        this.f(this.g >> 1);
    }

    public final void c(int v) {
        boolean z;
        if(Math.abs(this.g - v) == 1) {
            int v1 = this.g;
            this.f(v1 >> 1);
            if((v1 & 1) == 0) {
                z = v1 < v;
            }
            else if(v1 > v) {
                z = true;
            }
            else {
                z = false;
            }
            int v2 = Math.min(v1 >> 1, v >> 1);
            int v3 = Math.max(v1 >> 1, v >> 1);
            ImageView imageView0 = (ImageView)this.getChildAt(v2);
            ImageView imageView1 = (ImageView)this.getChildAt((v3 == v2 ? v3 + 1 : Math.max(v1 >> 1, v >> 1)));
            if(imageView0 != null && imageView1 != null) {
                boolean z1 = 1 == (v1 & 1);
                imageView1.setTranslationX(imageView0.getX() - imageView1.getX());
                this.e(imageView0, PageIndicator.d(z1, z, false));
                imageView0.setAlpha(1.0f);
                this.e(imageView1, PageIndicator.d(z1, z, true));
                imageView1.setAlpha(1.0f);
                this.c = true;
            }
        }
        else {
            this.f(v >> 1);
        }
        this.g = v;
    }

    private static int d(boolean z, boolean z1, boolean z2) {
        if(z) {
            if(z1) {
                return z2 ? 0x7F0808D1 : 0x7F080904;  // drawable:major_b_a_animation
            }
            return z2 ? 0x7F0808D3 : 0x7F080902;  // drawable:major_b_c_animation
        }
        if(z1) {
            return z2 ? 0x7F0808CF : 0x7F080906;  // drawable:major_a_b_animation
        }
        return z2 ? 0x7F0808D5 : 0x7F080900;  // drawable:major_c_b_animation
    }

    private final void e(ImageView imageView0, int v) {
        AnimatedVectorDrawable animatedVectorDrawable0 = (AnimatedVectorDrawable)this.getContext().getDrawable(v);
        imageView0.setImageDrawable(animatedVectorDrawable0);
        animatedVectorDrawable0.start();
        this.postDelayed(this.i, 0xFAL);
    }

    private final void f(int v) {
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            ImageView imageView0 = (ImageView)this.getChildAt(v2);
            imageView0.setTranslationX(0.0f);
            imageView0.setImageResource((v2 == v ? 0x7F0808CE : 0x7F0808FF));  // drawable:major_a_b
            imageView0.setAlpha(1.0f);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        if(v4 != 0) {
            this.setRotationY((this.getLayoutDirection() == 1 ? 180.0f : 0.0f));
            for(int v5 = 0; v5 < v4; ++v5) {
                View view0 = this.getChildAt(v5);
                int v6 = (this.d - this.f) * (v5 + 1);
                view0.layout(v6, 0, this.d + v6, this.e);
            }
        }
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        int v2 = this.getChildCount();
        if(v2 == 0) {
            super.onMeasure(v, v1);
            return;
        }
        int v3 = this.d;
        int v4 = this.e;
        int v5 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        int v6 = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        for(int v7 = 0; v7 < v2; ++v7) {
            this.getChildAt(v7).measure(v5, v6);
        }
        this.setMeasuredDimension((v3 - this.f) * (v2 + 1) + this.f, v4);
    }
}

