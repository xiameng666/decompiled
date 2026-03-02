package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import fixj;
import fixk;
import frbd;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kv;

public class ProductLockupView extends ViewGroup {
    final ImageView a;
    final TextView b;
    fixj c;
    public int d;
    public fixj e;
    public int[] f;
    private static final Pattern g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static Typeface k;
    private final fixj l;
    private final fixj m;
    private int n;
    private Drawable o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;

    static {
        ProductLockupView.g = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
        ProductLockupView.h = new int[]{1};
        ProductLockupView.i = new int[]{2};
        ProductLockupView.j = new int[]{1, 2};
    }

    public ProductLockupView(Context context0) {
        this(context0, null);
    }

    public ProductLockupView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F0409F6);  // attr:productLockupViewStyle
    }

    public ProductLockupView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        if(ProductLockupView.k == null) {
            ProductLockupView.k = Typeface.createFromAsset(context0.getAssets(), "ProductSans-Regular.ttf");
        }
        this.l = new fixj(this.getResources(), 0x7F070ED3, 0x7F070916, 0x7F070919, 0x7F070913, 0x7F070FEF);  // dimen:product_name_text_size
        this.m = new fixj(this.getResources(), 0x7F070ED5, 0x7F070918, 0x7F07091B, 0x7F070915, 0x7F070FF1);  // dimen:product_name_text_size_small
        LayoutInflater.from(context0).inflate(0x7F0E0811, this, true);  // layout:product_lockup_view
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B1866);  // id:logo
        frbd.a(imageView0);
        this.a = imageView0;
        TextView textView0 = (TextView)this.findViewById(0x7F0B1D26);  // id:product_name
        frbd.a(textView0);
        this.b = textView0;
        textView0.setTypeface(ProductLockupView.k);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fixk.a, v, 0x7F161204);  // style:Widget.GoogleMaterial.ProductLockupView
        this.o = typedArray0.hasValue(2) ? typedArray0.getDrawable(2) : kv.a(context0, 0x7F080499);
        int v1 = typedArray0.getInt(1, 0);
        this.d = v1;
        this.l(v1);
        this.d(typedArray0.getColor(4, 0));
        this.c(typedArray0.getString(0));
        this.a(typedArray0.getInt(3, 0));
        typedArray0.recycle();
    }

    public final void a(int v) {
        this.n = v;
        this.m();
    }

    public final void b(Drawable drawable0) {
        this.o = drawable0;
        this.m();
    }

    public final void c(String s) {
        String s3;
        String s1 = (s == null ? "" : s).trim();
        this.p = s1;
        this.r = ProductLockupView.g.matcher(s1).find();
        this.q = TextUtils.isEmpty(s) || Charset.forName("ISO-8859-1").newEncoder().canEncode(s);
        TextView textView0 = this.b;
        String s2 = "Google";
        if(this.p.startsWith("Google")) {
            s3 = this.p.substring(6).trim();
        }
        else {
            s3 = this.p.endsWith("Google") ? this.p.substring(0, this.p.length() - 6).trim() : this.p;
        }
        textView0.setText(s3);
        if(!this.p.isEmpty()) {
            s2 = this.p;
        }
        this.setContentDescription(s2);
        this.requestLayout();
    }

    public final void d(int v) {
        this.b.setTextColor(v);
    }

    public final void e(int v) {
        int v1 = this.getContext().getColor(v);
        this.b.setTextColor(v1);
    }

    public final void f(int v) {
        this.d = v;
        this.requestLayout();
    }

    private final int g() {
        return this.p.isEmpty() ? 0 : Math.max(this.b.getPaint().getFontMetricsInt().top + this.b.getBaseline(), 0);
    }

    private final int h(fixj fixj0) {
        return this.r ? Math.round(((float)fixj0.e) * 1.0f) : Math.round(((float)fixj0.e) * 0.15f);
    }

    private final void i(View view0, int v, int v1, int v2, int v3) {
        boolean z = this.getLayoutDirection() == 1 && !this.q;
        int v4 = z ? this.getMeasuredWidth() - v2 : v;
        if(z) {
            v2 = this.getMeasuredWidth() - v;
        }
        view0.layout(v4, v1, v2, v3);
    }

    private final void j() {
        int v = View.MeasureSpec.makeMeasureSpec(this.c.c, 0x40000000);
        int v1 = View.MeasureSpec.makeMeasureSpec(this.c.d, 0x40000000);
        this.a.measure(v, v1);
    }

    private final void k() {
        this.b.setTextSize(0, this.c.a);
        this.b.measure(0, 0);
    }

    private final void l(int v) {
        fixj fixj0;
        switch(v) {
            case -1: {
                fixj0 = this.e;
                break;
            }
            case 0: {
                fixj0 = this.l;
                break;
            }
            case 1: {
                fixj0 = this.l;
                break;
            }
            case 2: {
                fixj0 = this.m;
                break;
            }
            default: {
                throw new IllegalStateException("Unrecognized sizingMode: " + v);
            }
        }
        this.c = fixj0;
    }

    private final void m() {
        int v1;
        Drawable drawable0 = this.o.mutate();
        int v = this.n;
        if(v == 0) {
            drawable0.setTintList(null);
        }
        else {
            switch(v) {
                case 1: {
                    v1 = 0x7F0606BF;  // color:google_black
                    break;
                }
                case 2: {
                    v1 = 0x7F060814;  // color:google_white
                    break;
                }
                case 3: {
                    v1 = 0x7F0607A3;  // color:google_grey700
                    break;
                }
                default: {
                    throw new IllegalStateException("Unrecognized logoColor: " + v);
                }
            }
            drawable0.setTint(this.getContext().getColor(v1));
        }
        this.a.setImageDrawable(drawable0);
    }

    private final boolean n(int v, boolean z) {
        int v1 = z ? this.c.c + this.h(this.c) : 0;
        this.k();
        return v1 + this.b.getMeasuredWidth() <= v;
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        ImageView imageView0 = this.a;
        int v4 = 0;
        if(imageView0.getVisibility() != 8) {
            int v5 = this.b.getVisibility() == 8 || this.s ? 0 : this.b.getMeasuredWidth() + this.h(this.c);
            int v6 = this.g() + this.c.b;
            this.i(imageView0, v5, v6, imageView0.getMeasuredWidth() + v5, imageView0.getMeasuredHeight() + v6);
        }
        TextView textView0 = this.b;
        if(textView0.getVisibility() != 8) {
            if(imageView0.getVisibility() != 8 && this.s) {
                v4 = imageView0.getMeasuredWidth() + this.h(this.c);
            }
            this.i(textView0, v4, 0, v4 + textView0.getMeasuredWidth(), textView0.getMeasuredHeight());
        }
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        int[] arr_v;
        ImageView imageView0 = this.a;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = 0;
        imageView0.setVisibility(0);
        TextView textView0 = this.b;
        textView0.setVisibility(0);
        this.s = this.p.startsWith("Google");
        boolean z = this.p.endsWith("Google");
        int v4 = this.d;
        boolean z1 = true;
        switch(v4) {
            case -1: {
                arr_v = this.f;
                break;
            }
            case 0: {
                arr_v = ProductLockupView.j;
                break;
            }
            case 1: {
                arr_v = ProductLockupView.h;
                break;
            }
            default: {
                if(v4 != 2) {
                    throw new IllegalStateException("Unrecognized sizingMode: " + v4);
                }
                arr_v = ProductLockupView.i;
                break;
            }
        }
        if(this.s || z) {
            int v5 = 0;
            while(v5 < arr_v.length) {
                this.l(arr_v[v5]);
                if(this.n(v2, true)) {
                    this.j();
                    this.k();
                    goto label_44;
                }
                ++v5;
            }
        }
        for(int v6 = 0; true; ++v6) {
            if(v6 >= arr_v.length) {
                this.l(1);
                this.s = true;
                this.j();
                textView0.setVisibility(8);
                break;
            }
            this.l(arr_v[v6]);
            if(this.n(v2, false)) {
                this.k();
                imageView0.setVisibility(8);
                break;
            }
        }
    label_44:
        boolean z2 = imageView0.getVisibility() == 0;
        if(textView0.getVisibility() != 0) {
            z1 = false;
        }
        if(z2) {
            v3 = imageView0.getMeasuredWidth();
        }
        if(z1) {
            v3 += textView0.getMeasuredWidth();
        }
        if(z2 && z1) {
            v3 += this.h(this.c);
        }
        this.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), View.MeasureSpec.makeMeasureSpec(Math.max(imageView0.getMeasuredHeight() + this.c.b + this.g(), textView0.getMeasuredHeight()), 0x40000000));
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        ProductLockupView.SavedState productLockupView$SavedState0 = (ProductLockupView.SavedState)parcelable0;
        super.onRestoreInstanceState(productLockupView$SavedState0.getSuperState());
        this.p = productLockupView$SavedState0.a;
        this.r = productLockupView$SavedState0.b;
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new ProductLockupView.SavedState(super.onSaveInstanceState());
        parcelable0.a = this.p;
        parcelable0.b = this.r;
        return parcelable0;
    }
}

