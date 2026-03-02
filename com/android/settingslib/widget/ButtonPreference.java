package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import androidx.preference.Preference;
import com.google.android.material.button.MaterialButton;
import oij;
import oik;
import sjs;
import sjy;
import sku;
import slg;

public class ButtonPreference extends Preference implements sjy {
    public Button a;
    private View.OnClickListener b;
    private CharSequence c;
    private Drawable d;
    private int e;

    public ButtonPreference(Context context0) {
        this(context0, null);
    }

    public ButtonPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ButtonPreference(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        int v1 = 0x7F0E0945;  // layout:settingslib_button_layout
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, oik.g, v, 0);
            this.c = typedArray0.getText(4);
            this.d = typedArray0.getDrawable(0);
            typedArray0.recycle();
            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, slg.a, v, 0);
            this.e = typedArray1.getInt(0, 0x800003);
            if(sku.a(context0)) {
                v1 = sjs.a(typedArray1.getInt(2, 0), typedArray1.getInt(1, 0));
            }
            typedArray1.recycle();
        }
        this.C = v1;
    }

    @Override  // androidx.preference.Preference
    public final void H(boolean z) {
        super.H(z);
        Button button0 = this.a;
        if(button0 != null) {
            button0.setEnabled(z);
        }
    }

    @Override  // androidx.preference.Preference
    public void J(Drawable drawable0) {
        this.d = drawable0;
        Button button0 = this.a;
        if(button0 != null && drawable0 != null) {
            if((button0 instanceof MaterialButton)) {
                ((MaterialButton)button0).u(drawable0);
                return;
            }
            int v = (int)TypedValue.applyDimension(1, 24.0f, this.j.getResources().getDisplayMetrics());
            drawable0.setBounds(0, 0, v, v);
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, null, null, null);
        }
    }

    @Override  // androidx.preference.Preference
    public final void S(CharSequence charSequence0) {
        this.c = charSequence0;
        Button button0 = this.a;
        if(button0 != null) {
            button0.setText(charSequence0);
        }
    }

    @Override  // androidx.preference.Preference
    public void a(oij oij0) {
        this.a = (Button)oij0.D(0x7F0B1FEB);  // id:settingslib_button
        this.S(this.c);
        this.J(this.d);
        this.e = this.e == 1 || this.e == 16 || this.e == 17 ? 1 : 0x800003;
        Button button0 = this.a;
        if(button0 != null) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button0.getLayoutParams();
            linearLayout$LayoutParams0.gravity = this.e;
            this.a.setLayoutParams(linearLayout$LayoutParams0);
        }
        this.l(this.b);
        Button button1 = this.a;
        if(button1 != null) {
            boolean z = this.aa();
            button1.setFocusable(z);
            this.a.setClickable(z);
            this.a.setEnabled(this.Z());
        }
        oij0.v = false;
        oij0.w = false;
    }

    public final void k(int v, int v1) {
        this.C = sjs.a(v, v1);
        this.d();
    }

    public final void l(View.OnClickListener view$OnClickListener0) {
        this.b = view$OnClickListener0;
        Button button0 = this.a;
        if(button0 != null) {
            button0.setOnClickListener(view$OnClickListener0);
        }
    }

    @Override  // androidx.preference.Preference
    public final CharSequence t() {
        return this.c;
    }
}

