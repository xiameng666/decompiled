package com.google.android.libraries.play.widget.listitem.component.image;

import android.content.Context;
import android.util.AttributeSet;
import fpuo;
import fpup;
import fpuq;
import fpuu;
import fpuv;
import fpux;
import fpuy;
import fpvd;
import fpvh;

public class CardImageView extends fpuu implements fpuo, fpuy {
    private float d;
    private int e;

    public CardImageView(Context context0) {
        this(context0, null);
    }

    public CardImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = 1.0f;
        this.e = fpux.a(this.getResources(), 1);
        this.f();
    }

    @Override  // fpuo
    public final void a(fpup fpup0) {
        fpuq fpuq0 = ((fpvh)fpup0) == null ? null : ((fpvh)fpup0).a;
        if(((fpuq)this.getTag(0x7F0B1CC4)) != fpuq0) {  // id:play__image_binder
            if(fpuq0 != null && fpuq0.a > 0) {
                throw new IllegalStateException("Trying to bind an already bound ImageBinder");
            }
            fpuq fpuq1 = (fpuq)this.getTag(0x7F0B1CC4);  // id:play__image_binder
            if(fpuq1 != null) {
                fpuq1.a(null);
            }
            if(fpuq0 != null) {
                fpuq0.a(this);
                if(this.isAttachedToWindow()) {
                    fpuq0.b(2);
                    if(this.isLaidOut() || this.getMeasuredHeight() > 0 && this.getMeasuredWidth() > 0) {
                        fpuq0.b(3);
                    }
                }
            }
        }
        this.setVisibility((fpuq0 == null ? 8 : 0));
        float f = ((fpvh)fpup0) == null ? 1.0f : ((fpvh)fpup0).c;
        if(Float.compare(this.d, f) != 0 && f > 0.0f) {
            this.d = f;
            this.f();
        }
        if(((fpvh)fpup0) == null) {
            this.e(1);
        }
        else {
            this.e(((fpvd)((fpvh)fpup0).b).a);
        }
        fpuv fpuv0 = this.a;
        fpuv0.a(0.0f);
        if(fpuv0.a == 0.0f) {
            return;
        }
        fpuv0.a = 0.0f;
        fpuv0.b = true;
        fpuv0.invalidateSelf();
    }

    @Override  // fpuy
    public final int b() {
        return this.getPaddingEnd();
    }

    @Override  // fpuy
    public final int c() {
        return 0x30;
    }

    @Override  // fpuy
    public final int d() {
        return this.getPaddingStart();
    }

    public final void e(int v) {
        int v1 = fpux.a(this.getResources(), v);
        if(this.e == v1) {
            return;
        }
        this.e = v1;
        this.f();
    }

    private final void f() {
        float f = this.d;
        if(f > 0.0f) {
            int v = this.e;
            int v1 = this.b;
            int v2 = (int)(((float)v) / f);
            if(v1 != v || this.c != v2) {
                this.b = v;
                this.c = v2;
                this.requestLayout();
            }
        }
    }
}

