package com.google.android.wallet.ui.card;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import gcio;
import gciq;
import gcqy;
import gcvh;
import gcxl;
import gdcb;
import gdgb;
import gfgo;
import java.util.ArrayList;
import java.util.HashSet;

public class CardImagesView extends RelativeLayout {
    public ImageView[] a;
    public ImageView[] b;
    public ImageView c;
    public gcxl d;
    public int e;
    public int f;
    public boolean g;
    gfgo h;
    public boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private gcqy m;

    public CardImagesView(Context context0) {
        super(context0);
        this.l = true;
    }

    public CardImagesView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l = true;
        this.e(context0, attributeSet0);
    }

    public CardImagesView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.l = true;
        this.e(context0, attributeSet0);
    }

    public final void a(gfgo gfgo0) {
        float f;
        int v1;
        if(this.g) {
            throw new IllegalStateException("setCardIcon cannot be used if allImagesStaticOnly is true.");
        }
        this.h = gfgo0;
        if(!this.l) {
            gcxl gcxl0 = this.d;
            gfgo gfgo1 = gcxl0.d;
            if(!gcvh.a(gfgo0, gfgo1) && (gfgo0 == null || gfgo1 == null || !gcvh.a(gfgo0.d, gfgo1.d))) {
                int v = gcxl0.a(gfgo0);
                if(v == -1) {
                    v1 = gcxl0.b(gfgo0);
                    v = -1;
                }
                else {
                    v1 = -1;
                }
                if(v != -1) {
                    f = 0.0f;
                }
                else if(v1 != -1) {
                    v = -1;
                    f = 0.0f;
                }
                else if(!gcxl0.e) {
                    v = -1;
                    v1 = -1;
                    f = 1.0f;
                }
                else {
                    v = -1;
                    v1 = -1;
                    f = 0.0f;
                }
                ImageView[] arr_imageView = gcxl0.a;
                for(int v3 = 0; v3 < arr_imageView.length; ++v3) {
                    if(v3 == v) {
                        arr_imageView[v3].animate().alpha(1.0f);
                        if(!gcxl0.e) {
                            arr_imageView[v3].animate().x(((float)arr_imageView[0].getLeft()));
                        }
                    }
                    else {
                        arr_imageView[v3].animate().alpha(f);
                        if(!gcxl0.e) {
                            arr_imageView[v3].animate().translationX(0.0f);
                        }
                    }
                }
                ImageView[] arr_imageView1 = gcxl0.b;
                for(int v2 = 0; v2 < arr_imageView1.length; ++v2) {
                    if(v2 == v1) {
                        arr_imageView1[v2].animate().alpha(1.0f);
                    }
                    else {
                        arr_imageView1[v2].animate().alpha(0.0f);
                    }
                }
                if(gcxl0.e) {
                    if(v == -1 && v1 == -1) {
                        gcxl0.c.animate().alpha(1.0f);
                    }
                    else {
                        gcxl0.c.animate().alpha(0.0f);
                    }
                }
                gcxl0.d = gfgo0;
            }
        }
    }

    public final void b() {
        int v1;
        if(this.g) {
            throw new IllegalStateException("One card mode cannot be used if allImagesStaticOnly is true.");
        }
        this.i = true;
        if(!this.l) {
            gcxl gcxl0 = this.d;
            if(!gcxl0.e) {
                int v = gcxl0.a(gcxl0.d);
                if(v == -1) {
                    v1 = gcxl0.b(gcxl0.d);
                    v = -1;
                }
                else {
                    v1 = -1;
                }
                ImageView[] arr_imageView = gcxl0.a;
                for(int v2 = 0; v2 < arr_imageView.length; ++v2) {
                    arr_imageView[v2].animate().cancel();
                    arr_imageView[v2].setX(((float)arr_imageView[0].getLeft()));
                    if(v2 == v) {
                        arr_imageView[v2].setAlpha(1.0f);
                    }
                    else {
                        arr_imageView[v2].setAlpha(0.0f);
                    }
                }
                ImageView[] arr_imageView1 = gcxl0.b;
                for(int v3 = 0; v3 < arr_imageView1.length; ++v3) {
                    arr_imageView1[v3].animate().cancel();
                    if(v3 == v1) {
                        arr_imageView1[v3].setAlpha(1.0f);
                    }
                    else {
                        arr_imageView1[v3].setAlpha(0.0f);
                    }
                }
                View view0 = gcxl0.c;
                view0.animate().cancel();
                view0.setVisibility(0);
                if(v == -1 && v1 == -1) {
                    view0.setAlpha(1.0f);
                }
                else {
                    view0.setAlpha(0.0f);
                }
            }
            gcxl0.e = true;
        }
    }

    // This method was un-flattened
    public final ImageView[] c(gfgo[] arr_gfgo, int v, int v1, boolean z, boolean z1) {
        int v7;
        int v6;
        ArrayList arrayList0 = new ArrayList(arr_gfgo.length);
        HashSet hashSet0 = new HashSet(arr_gfgo.length);
        int v2 = this.d().a();
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F040DD4});  // attr:uicCardGenericDrawable
        int v3 = 0;
        int v4 = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        int v5 = -1;
        while(v3 < arr_gfgo.length) {
            gfgo gfgo0 = arr_gfgo[v3];
            if(!hashSet0.contains(gfgo0.d)) {
                hashSet0.add(gfgo0.d);
                AppCompatImageView appCompatImageView0 = gcio.k(gfgo0.d) ? new AppCompatImageView(this.getContext()) : new ImageWithCaptionView(this.getContext());
                appCompatImageView0.setLayerType(2, null);
                appCompatImageView0.setId(v2);
                appCompatImageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v, v1);
                if(v5 == -1) {
                    if(this.k) {
                        relativeLayout$LayoutParams0.addRule(21, -1);
                        goto label_34;
                    }
                    else {
                        v5 = -1;
                    }
                }
                if(!z && !z1 && v5 > 0) {
                    relativeLayout$LayoutParams0.setMarginStart(this.j);
                    if(this.k) {
                        v6 = v5;
                        v7 = 16;
                    }
                    else {
                        v6 = v5;
                        v7 = 17;
                    }
                    relativeLayout$LayoutParams0.addRule(v7, v6);
                }
            label_34:
                this.addView(appCompatImageView0, relativeLayout$LayoutParams0);
                if((appCompatImageView0 instanceof ImageWithCaptionView)) {
                    ((ImageWithCaptionView)appCompatImageView0).o(gfgo0, gcio.c(this.getContext().getApplicationContext()));
                    ((ImageWithCaptionView)appCompatImageView0).g();
                    ((ImageWithCaptionView)appCompatImageView0).d(v4);
                }
                else {
                    appCompatImageView0.setImageResource(gdcb.ah(this.getContext(), gfgo0.d));
                }
                appCompatImageView0.setTag(gfgo0);
                arrayList0.add(appCompatImageView0);
                v5 = v2;
                v2 = this.d().a();
            }
            ++v3;
        }
        return (ImageView[])arrayList0.toArray(new ImageView[arrayList0.size()]);
    }

    private final gcqy d() {
        if(this.m == null) {
            this.m = gcqy.c();
        }
        return this.m;
    }

    private final void e(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, gdgb.a);
        this.e = typedArray0.getDimensionPixelSize(3, context0.getResources().getDimensionPixelSize(0x7F071566));  // dimen:wallet_uic_credit_card_icon_width
        this.f = typedArray0.getDimensionPixelSize(1, context0.getResources().getDimensionPixelSize(0x7F071565));  // dimen:wallet_uic_credit_card_icon_height
        this.j = typedArray0.getDimensionPixelSize(4, 0);
        this.k = typedArray0.getBoolean(2, false);
        this.g = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if(!this.g) {
            ImageView imageView0 = (ImageView)this.findViewById(0x7F0B23D1);  // id:unresolved_logo
            this.c = imageView0;
            if(imageView0 != null) {
                TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F040DD4});  // attr:uicCardGenericDrawable
                int v = typedArray0.getResourceId(0, -1);
                typedArray0.recycle();
                this.c.setImageResource(v);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.c.getLayoutParams();
                relativeLayout$LayoutParams0.width = this.e;
                relativeLayout$LayoutParams0.height = this.f;
                this.c.setLayoutParams(relativeLayout$LayoutParams0);
            }
        }
    }

    @Override  // android.widget.RelativeLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v7;
        super.onLayout(z, v, v1, v2, v3);
        if(!this.g && this.l) {
            this.l = false;
            gcxl gcxl0 = this.d;
            gfgo gfgo0 = this.h;
            int v5 = gcxl0.a(gfgo0);
            int v6 = -1;
            if(v5 == -1) {
                v7 = gcxl0.b(gfgo0);
                v5 = -1;
            }
            else {
                v7 = -1;
            }
            if(v5 != -1) {
                v6 = v5;
                f = 0.0f;
            }
            else if(v7 == -1) {
                v7 = -1;
                f = 1.0f;
            }
            else {
                f = 0.0f;
            }
            ImageView[] arr_imageView = gcxl0.a;
            for(int v8 = 0; v8 < arr_imageView.length; ++v8) {
                arr_imageView[v8].animate().cancel();
                if(v8 == v6) {
                    arr_imageView[v8].setAlpha(1.0f);
                    arr_imageView[v8].setX(((float)arr_imageView[0].getLeft()));
                }
                else {
                    arr_imageView[v8].setAlpha(f);
                    arr_imageView[v8].setTranslationX(0.0f);
                }
            }
            ImageView[] arr_imageView1 = gcxl0.b;
            for(int v4 = 0; v4 < arr_imageView1.length; ++v4) {
                arr_imageView1[v4].animate().cancel();
                if(v4 == v7) {
                    arr_imageView1[v4].setAlpha(1.0f);
                }
                else {
                    arr_imageView1[v4].setAlpha(0.0f);
                }
            }
            gcxl0.d = gfgo0;
            if(this.i) {
                this.b();
            }
        }
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            this.h = (gfgo)gciq.a(((Bundle)parcelable0), "currentIcon", ((Parser)((ProtoLiteMessage)gfgo.a).jf(7, null)));
            this.i = ((Bundle)parcelable0).getBoolean("oneCardMode");
            this.m = gcqy.e(((Bundle)parcelable0));
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        gciq.j(((Bundle)parcelable0), "currentIcon", ((MessageLite)this.h));
        ((Bundle)parcelable0).putBoolean("oneCardMode", this.i);
        gcqy gcqy0 = this.m;
        if(gcqy0 != null) {
            gcqy0.h(((Bundle)parcelable0));
        }
        return parcelable0;
    }
}

