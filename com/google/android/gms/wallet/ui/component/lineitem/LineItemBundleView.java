package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import fbgn;
import fbzf;
import fbzg;
import fcca;
import gczw;
import gdcb;
import gfcf;
import gfci;
import gfcj;
import gfgo;
import java.util.Iterator;
import zdd;

public class LineItemBundleView extends FrameLayout implements View.OnClickListener, fbzf, gczw {
    public LineItemView a;
    LinearLayout b;
    LinearLayout c;
    View d;
    public ImageWithCaptionView e;
    View f;
    public gfcf g;
    boolean h;
    Paint i;
    Drawable j;
    public int k;
    public fcca l;
    private TextView m;
    private ViewGroup n;
    private boolean o;
    private int p;
    private int q;
    private Paint r;
    private int s;
    private int t;
    private boolean u;
    private int v;
    private boolean w;
    private float x;

    public LineItemBundleView(Context context0) {
        super(context0);
        this.u = false;
        this.k = 0;
        this.d(context0);
    }

    public LineItemBundleView(Context context0, int v) {
        super(context0);
        this.u = false;
        this.w = true;
        this.k = v;
        this.d(context0);
    }

    @Override  // fbzf
    public final void a(Object object0) {
        this.e(((gfcf)object0));
    }

    @Override  // fbzf
    public final boolean b(Object object0) {
        return ((gfcf)object0) != null;
    }

    public final void c(int v) {
        int v2;
        int v1;
        if(this.x > 0.0f && this.i() && this.o) {
            if(this.e.getWidth() == 0) {
                this.v = v;
                this.e.b = this;
                return;
            }
            float f = ((float)v) / this.x;
            if((f > 1.0f)) {
                f = 1.0f;
            }
            this.e.setAlpha(1.0f - f);
            if(this.getLayoutDirection() == 1) {
                v1 = this.a.getRight();
                v2 = this.e.getRight();
            }
            else {
                v1 = this.a.getLeft();
                v2 = this.e.getLeft();
            }
            int v3 = (int)(((float)(v1 - v2)) * f);
            this.n.setTranslationX(((float)(-v3)));
            this.a.a.setTranslationX(((float)v3));
        }
    }

    protected final void d(Context context0) {
        View view0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        if(this.w) {
            int v = this.k;
            switch(v) {
                case 0: {
                    view0 = layoutInflater0.inflate(0x7F0E0E47, this, true);  // layout:wallet_view_line_item_bundle
                    break;
                }
                case 1: {
                    view0 = layoutInflater0.inflate(0x7F0E0E44, this, true);  // layout:wallet_view_landscape_line_item_bundle
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown StickyStyle: " + v);
                }
            }
        }
        else {
            view0 = layoutInflater0.inflate(0x7F0E0E47, this, true);  // layout:wallet_view_line_item_bundle
        }
        this.a = (LineItemView)view0.findViewById(0x7F0B17F8);  // id:line_item_bundle_hero
        this.n = (ViewGroup)view0.findViewById(0x7F0B17F9);  // id:line_item_bundle_hero_container
        this.b = (LinearLayout)view0.findViewById(0x7F0B17F7);  // id:line_item_bundle_expanded_items
        this.c = (LinearLayout)view0.findViewById(0x7F0B17F2);  // id:line_item_bundle_collapsed_items
        View view1 = view0.findViewById(0x7F0B17F4);  // id:line_item_bundle_expand_button
        this.d = view1;
        this.m = (TextView)view1.findViewById(0x7F0B17F6);  // id:line_item_bundle_expand_button_text
        this.e = (ImageWithCaptionView)view0.findViewById(0x7F0B17FA);  // id:line_item_bundle_image
        this.f = view0.findViewById(0x7F0B17FB);  // id:line_item_bundle_spacer
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x7F040147});  // attr:attrWalletShouldAnimateHeroImage
        this.o = typedArray0.getBoolean(0, true);
        typedArray0.recycle();
        this.d.setOnClickListener(this);
        this.k(false);
        gdcb.M(((ImageView)view0.findViewById(0x7F0B17F5)), gdcb.h(this.getContext(), 0x1010038));  // id:line_item_bundle_expand_button_image
    }

    public final void e(gfcf gfcf0) {
        this.g = gfcf0;
        this.g(gfcf0, this.h);
    }

    public final void f(boolean z, boolean z1, boolean z2) {
        int v = ((int)z) & this.m();
        if(v == this.u && !z1) {
            return;
        }
        this.u = v;
        this.k(z2);
        this.j();
    }

    protected final void g(gfcf gfcf0, boolean z) {
        Context context0 = this.getContext();
        LineItemView lineItemView0 = this.a;
        gfcj gfcj0 = gfcf0.d == null ? gfcj.a : gfcf0.d;
        boolean z1 = false;
        if(lineItemView0.b(gfcj0)) {
            lineItemView0.setVisibility(0);
            lineItemView0.a(gfcj0);
        }
        else {
            lineItemView0.setVisibility(8);
        }
        gfcj gfcj1 = gfcf0.d == null ? gfcj.a : gfcf0.d;
        fbgn.y(this.e, (gfcj1.h == null ? gfgo.a : gfcj1.h), context0);
        Paint paint0 = null;
        this.r = this.h() ? LineItemBundleView.o(context0, 0) : null;
        if(this.w) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.i = null;
            this.f.setVisibility(8);
            this.j = context0.getResources().getDrawable(0x7F08105C);  // drawable:wallet_header_shadow
            this.t = context0.getResources().getDimensionPixelSize(0x7F0714A9);  // dimen:wallet_header_shadow_height
            fbgn.U(this.a.a, this);
            this.x = context0.getResources().getDimension(0x7F0714B1);  // dimen:wallet_line_item_bundle_animation_scroll_distance
        }
        else {
            fbzg.a(context0, this.b, gfcf0.f, LineItemView.class);
            fbzg.a(context0, this.c, gfcf0.e, LineItemView.class);
            this.m.setText(gfcf0.h);
            if(this.h()) {
                TypedArray typedArray0 = context0.obtainStyledAttributes(0x7F16104B, zdd.t);  // style:WalletLineItemBundle
                boolean z2 = typedArray0.getBoolean(1, false);
                typedArray0.recycle();
                if(z2) {
                    TypedArray typedArray1 = context0.obtainStyledAttributes(new int[]{0x101032C});
                    this.j = typedArray1.getDrawable(0);
                    this.t = context0.getResources().getDimensionPixelSize(0x7F071485);  // dimen:wallet_dialog_divider_height
                    typedArray1.recycle();
                }
            }
            if(this.n() && !z) {
                Iterator iterator0 = gfcf0.f.iterator();
                while(true) {
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        if(gfci.a(((gfcj)object0).g) == 7) {
                            goto label_34;
                        }
                        continue;
                    }
                    paint0 = LineItemBundleView.o(context0, 2);
                    goto label_34;
                }
            }
            else {
            label_34:
                this.i = paint0;
                this.f(((boolean)(gfcf0.g ^ 1)), true, false);
            }
        }
        if(this.r == null && this.i == null) {
            z1 = true;
        }
        this.setWillNotDraw(z1);
    }

    public final boolean h() {
        return this.g != null && (this.g.b & 2) != 0;
    }

    public final boolean i() {
        return this.h() ? ((this.g.d == null ? gfcj.a : this.g.d).b & 8) != 0 : false;
    }

    public final void j() {
        fcca fcca0 = this.l;
        if(fcca0 != null) {
            fcca0.c = this.u;
        }
    }

    private final void k(boolean z) {
        int v = 0;
        if(this.u) {
            this.b.setVisibility(0);
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            this.f.setVisibility(0);
            if(z) {
                this.b.requestFocus();
            }
            return;
        }
        this.b.setVisibility(8);
        this.d.setVisibility((this.m() ? 0 : 8));
        this.c.setVisibility((this.l() ? 0 : 8));
        View view0 = this.f;
        if(this.h() && this.n()) {
            v = 8;
        }
        view0.setVisibility(v);
    }

    private final boolean l() {
        return this.g != null && this.g.e.size() > 0;
    }

    @Override  // gczw
    public final void lT() {
        this.c(this.v);
    }

    private final boolean m() {
        return this.g != null && this.g.f.size() > 0;
    }

    private final boolean n() {
        return this.m() || this.l();
    }

    private static final Paint o(Context context0, int v) {
        Paint paint0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(0x7F16104B, zdd.t);  // style:WalletLineItemBundle
        int v1 = typedArray0.getColor(v, 0x106000D);
        if(v1 == 0x106000D) {
            paint0 = null;
        }
        else {
            paint0 = new Paint(1);
            paint0.setColor(v1);
            paint0.setStyle(Paint.Style.FILL);
        }
        typedArray0.recycle();
        return paint0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this.d) {
            this.f(((boolean)(this.u ^ 1)), false, true);
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        Canvas canvas1;
        Paint paint0 = this.i;
        if(paint0 == null) {
            canvas1 = canvas0;
        }
        else {
            int v = this.p;
            if(v > 0) {
                int v1 = this.q;
                if(v1 > 0) {
                    canvas1 = canvas0;
                    canvas1.drawRect(0.0f, 0.0f, ((float)v), ((float)v1), paint0);
                }
                else {
                    canvas1 = canvas0;
                }
            }
            else {
                canvas1 = canvas0;
            }
        }
        Paint paint1 = this.r;
        if(paint1 != null) {
            int v2 = this.p;
            if(v2 > 0) {
                int v3 = this.s;
                if(v3 > 0) {
                    canvas1.drawRect(0.0f, 0.0f, ((float)v2), ((float)v3), paint1);
                    Drawable drawable0 = this.j;
                    if(drawable0 != null) {
                        drawable0.draw(canvas1);
                    }
                }
            }
        }
        super.onDraw(canvas1);
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4;
        super.onLayout(z, v, v1, v2, v3);
        if(this.a != null && this.a.getVisibility() == 0) {
            v4 = this.a.getBottom();
            this.s = v4;
        }
        else {
            this.s = 0;
            v4 = 0;
        }
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            drawable0.setBounds(0, v4, this.p, this.t + v4);
        }
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.j != null && this.t > 0) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight() + this.t);
        }
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.p = v;
        this.q = v1;
    }
}

