package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import fysf;
import fzau;
import fzav;
import fzaz;
import fzbh;
import fzbj;
import java.util.Arrays;
import jwe;
import kdl;
import kfe;
import kgy;
import khb;

public class ClockFaceView extends fzbj implements fzaz {
    public final ClockHandView h;
    public final Rect i;
    public final SparseArray j;
    public final int k;
    private final RectF m;
    private final Rect n;
    private final kdl o;
    private final int[] p;
    private final float[] q;
    private final int r;
    private final int s;
    private final int t;
    private String[] u;
    private float v;
    private final ColorStateList w;

    public ClockFaceView(Context context0) {
        this(context0, null);
    }

    public ClockFaceView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F04086B);  // attr:materialClockStyle
    }

    public ClockFaceView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = new Rect();
        this.m = new RectF();
        this.n = new Rect();
        this.j = new SparseArray();
        this.q = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fzbh.a, v, 0x7F1614E2);  // style:Widget.MaterialComponents.TimePicker.Clock
        Resources resources0 = this.getResources();
        ColorStateList colorStateList0 = fysf.d(context0, typedArray0, 1);
        this.w = colorStateList0;
        LayoutInflater.from(context0).inflate(0x7F0E0563, this, true);  // layout:material_clockface_view
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(0x7F0B18C2);  // id:material_clock_hand
        this.h = clockHandView0;
        this.k = resources0.getDimensionPixelSize(0x7F070BAC);  // dimen:material_clock_hand_padding
        int v1 = colorStateList0.getDefaultColor();
        int v2 = colorStateList0.getColorForState(new int[]{0x10100A1}, v1);
        this.p = new int[]{v2, v2, colorStateList0.getDefaultColor()};
        clockHandView0.a(this);
        int v3 = jwe.d(context0, 0x7F060CBB).getDefaultColor();  // color:material_timepicker_clockface
        ColorStateList colorStateList1 = fysf.d(context0, typedArray0, 0);
        if(colorStateList1 != null) {
            v3 = colorStateList1.getDefaultColor();
        }
        this.setBackgroundColor(v3);
        this.getViewTreeObserver().addOnPreDrawListener(new fzau(this));
        this.setFocusable(false);
        typedArray0.recycle();
        this.o = new fzav(this);
        String[] arr_s = new String[12];
        Arrays.fill(arr_s, "");
        this.h(arr_s, 0);
        this.r = resources0.getDimensionPixelSize(0x7F070BD4);  // dimen:material_time_picker_minimum_screen_height
        this.s = resources0.getDimensionPixelSize(0x7F070BD5);  // dimen:material_time_picker_minimum_screen_width
        this.t = resources0.getDimensionPixelSize(0x7F070BB3);  // dimen:material_clock_size
    }

    @Override  // fzaz
    public final void g(float f, boolean z) {
        if((Math.abs(this.v - f) > 0.001f)) {
            this.v = f;
            this.j();
        }
    }

    public final void h(String[] arr_s, int v) {
        this.u = arr_s;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        SparseArray sparseArray0 = this.j;
        int v1 = sparseArray0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < Math.max(this.u.length, v1); ++v2) {
            TextView textView0 = (TextView)sparseArray0.get(v2);
            if(v2 >= this.u.length) {
                this.removeView(textView0);
                sparseArray0.remove(v2);
            }
            else {
                if(textView0 == null) {
                    textView0 = (TextView)layoutInflater0.inflate(0x7F0E0562, this, false);  // layout:material_clockface_textview
                    sparseArray0.put(v2, textView0);
                    this.addView(textView0);
                }
                textView0.setText(this.u[v2]);
                textView0.setTag(0x7F0B18D3, Integer.valueOf(v2));  // id:material_value_index
                int v4 = v2 / 12 + 1;
                textView0.setTag(0x7F0B18C3, Integer.valueOf(v4));  // id:material_clock_level
                v3 |= 1 ^ (v4 <= 1 ? 1 : 0);
                kfe.j(textView0, this.o);
                textView0.setTextColor(this.w);
                if(v != 0) {
                    textView0.setContentDescription(this.getResources().getString(v, new Object[]{this.u[v2]}));
                }
            }
        }
        ClockHandView clockHandView0 = this.h;
        if(clockHandView0.b && v3 == 0) {
            clockHandView0.g = 1;
        }
        clockHandView0.b = v3;
        clockHandView0.invalidate();
    }

    @Override  // fzbj
    public final void i() {
        super.i();
        for(int v = 0; true; ++v) {
            SparseArray sparseArray0 = this.j;
            if(v >= sparseArray0.size()) {
                break;
            }
            ((TextView)sparseArray0.get(v)).setVisibility(0);
        }
    }

    private final void j() {
        RectF rectF0;
        SparseArray sparseArray0;
        float f = 3.402823E+38f;
        TextView textView0 = null;
        for(int v = 0; true; ++v) {
            sparseArray0 = this.j;
            rectF0 = this.h.d;
            if(v >= sparseArray0.size()) {
                break;
            }
            TextView textView1 = (TextView)sparseArray0.get(v);
            if(textView1 != null) {
                textView1.getHitRect(this.i);
                this.m.set(this.i);
                this.m.union(rectF0);
                float f1 = this.m.width() * this.m.height();
                if((f1 < f)) {
                    f = f1;
                    textView0 = textView1;
                }
            }
        }
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            TextView textView2 = (TextView)sparseArray0.get(v1);
            if(textView2 != null) {
                textView2.setSelected(textView2 == textView0);
                textView2.getHitRect(this.i);
                this.m.set(this.i);
                textView2.getLineBounds(0, this.n);
                this.m.inset(((float)this.n.left), ((float)this.n.top));
                RadialGradient radialGradient0 = RectF.intersects(rectF0, this.m) ? new RadialGradient(rectF0.centerX() - this.m.left, rectF0.centerY() - this.m.top, rectF0.width() * 0.5f, this.p, this.q, Shader.TileMode.CLAMP) : null;
                textView2.getPaint().setShader(radialGradient0);
                textView2.invalidate();
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        new khb(accessibilityNodeInfo0).A(kgy.a(1, this.u.length, 1));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.j();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected final void onMeasure(int v, int v1) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v2 = (int)(((float)this.t) / Math.max(Math.max(((float)this.r) / ((float)displayMetrics0.heightPixels), ((float)this.s) / ((float)displayMetrics0.widthPixels)), 1.0f));
        int v3 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        this.setMeasuredDimension(v2, v2);
        super.onMeasure(v3, v3);
    }
}

