package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import fcbi;
import gcio;
import gcqy;
import gdcb;
import gfag;
import java.util.ArrayList;

public class CreditCardImagesView extends RelativeLayout {
    public ImageView[] a;
    public fcbi b;
    public boolean c;
    String d;
    private boolean e;
    private gcqy f;
    private ArrayList g;

    public CreditCardImagesView(Context context0) {
        super(context0);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public CreditCardImagesView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public CreditCardImagesView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public final gcqy a() {
        if(this.f == null) {
            this.f = gcqy.c();
        }
        return this.f;
    }

    public final void b(ArrayList arrayList0) {
        this.g = arrayList0;
        if(!this.e) {
            fcbi fcbi0 = this.b;
            ImageView[] arr_imageView = fcbi0.a;
            float f = (float)arr_imageView[0].getLeft();
            int v = 0;
            int v1 = 0;
            while(v < arr_imageView.length) {
                ImageView imageView0 = arr_imageView[v];
                int v2 = arrayList0.size();
                int v3 = 0;
                while(true) {
                    if(v3 < v2) {
                        if(gcio.j(((gfag)arrayList0.get(v3)), ((gfag)imageView0.getTag()))) {
                            fcbi0.a(v, true);
                            if(!gdcb.S(imageView0.getContext()) || Float.compare(imageView0.getAlpha(), 0.0f) == 0) {
                                imageView0.clearAnimation();
                                imageView0.setX(f);
                            }
                            else if(fcbi0.d[v] != v1 || fcbi0.c) {
                                imageView0.animate().x(f);
                            }
                            fcbi0.d[v] = v1;
                            f = fcbi0.b ? f - ((float)imageView0.getWidth()) : f + ((float)imageView0.getWidth());
                            ++v1;
                            break;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    fcbi0.a(v, false);
                    fcbi0.d[v] = -1;
                    break;
                }
                ++v;
            }
            fcbi0.c = false;
        }
    }

    @Override  // android.widget.RelativeLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.e && this.b != null) {
            this.e = false;
            this.b(this.g);
        }
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            this.d = ((Bundle)parcelable0).getString("cardNumber");
            this.f = gcqy.e(((Bundle)parcelable0));
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putString("cardNumber", this.d);
        gcqy gcqy0 = this.f;
        if(gcqy0 != null) {
            gcqy0.h(((Bundle)parcelable0));
        }
        return parcelable0;
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        fcbi fcbi0 = this.b;
        if(fcbi0 != null) {
            fcbi0.c = true;
            this.b(this.g);
        }
    }
}

