package com.google.android.personalsafety.settings.autolock;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;
import fzjp;
import fzmj;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;
import sku;
import zdd;

public final class DisabledReasonSwitchPreference extends SwitchPreferenceCompat {
    private CharSequence c;
    private Boolean d;
    private fzjp e;

    public DisabledReasonSwitchPreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public DisabledReasonSwitchPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public DisabledReasonSwitchPreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public DisabledReasonSwitchPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, zdd.b, v, v1);
        this.c = typedArray0.getText(0);
        typedArray0.recycle();
    }

    public DisabledReasonSwitchPreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0x7F040C98;  // attr:switchPreferenceCompatStyle
        }
        this(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.preference.Preference
    public final void F() {
        fzjp fzjp0 = this.e;
        if(!this.Z() && fzjp0 != null) {
            fzjp0.a.startActivity(fzjp0.b);
            return;
        }
        super.F();
    }

    @Override  // androidx.preference.SwitchPreferenceCompat
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        if(!this.Z() && this.e != null) {
            oij0.a.setEnabled(true);
        }
        Boolean boolean0 = this.d;
        TextView textView0 = null;
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            View view0 = oij0.D(0x7F0B238E);  // id:two_target_divider
            if(!(view0 instanceof View)) {
                view0 = null;
            }
            if(view0 == null) {
                View view1 = oij0.D(0x1020018);
                if(view1 == null) {
                    view0 = null;
                }
                else {
                    ViewParent viewParent0 = view1.getParent();
                    LinearLayout linearLayout0 = (viewParent0 instanceof LinearLayout) ? ((LinearLayout)viewParent0) : null;
                    if(linearLayout0 == null) {
                        view0 = null;
                    }
                    else {
                        LayoutInflater layoutInflater0 = LayoutInflater.from(linearLayout0.getContext());
                        ibuq.e(this.j, "getContext(...)");
                        View view2 = layoutInflater0.inflate((sku.a(this.j) ? 0x7F0E096B : 0x7F0E07FF), linearLayout0, false);  // layout:settingslib_expressive_two_target_divider
                        linearLayout0.addView(view2, linearLayout0.indexOfChild(view1));
                        view0 = view2;
                    }
                }
            }
            View view3 = oij0.D(0x1020018);
            if(z) {
                if(view0 != null) {
                    view0.setVisibility(0);
                }
                if(view3 != null) {
                    view3.setOnClickListener(new fzmj(oij0));
                }
            }
            else {
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                if(view3 == null) {
                    view3 = null;
                }
                else {
                    view3.setOnClickListener(null);
                }
                if(view3 != null) {
                    view3.setClickable(false);
                }
            }
        }
        View view4 = oij0.D(0x7F0B1164);  // id:disabled_reason
        TextView textView1 = (view4 instanceof TextView) ? ((TextView)view4) : null;
        if(textView1 == null) {
            View view5 = oij0.D(0x1020010);
            ViewParent viewParent1 = view5 == null ? null : view5.getParent();
            RelativeLayout relativeLayout0 = (viewParent1 instanceof RelativeLayout) ? ((RelativeLayout)viewParent1) : null;
            if(relativeLayout0 != null) {
                LayoutInflater.from(relativeLayout0.getContext()).inflate(0x7F0E02E9, relativeLayout0);  // layout:disabled_reason
                View view6 = oij0.D(0x7F0B1164);  // id:disabled_reason
                if((view6 instanceof TextView)) {
                    textView0 = (TextView)view6;
                }
            }
        }
        else {
            textView0 = textView1;
        }
        if(textView0 == null) {
            return;
        }
        if(!this.Z() && !TextUtils.isEmpty(this.c)) {
            textView0.setVisibility(0);
            textView0.setText(new SpannableString(this.c));
            textView0.setMovementMethod(LinkMovementMethod.getInstance());
            textView0.setEnabled(true);
            return;
        }
        textView0.setVisibility(8);
    }

    public final void aj(CharSequence charSequence0) {
        this.c = charSequence0;
        this.d();
    }

    public final void ak(boolean z) {
        if(this.d == null && !z) {
            return;
        }
        this.d = Boolean.valueOf(z);
        this.d();
    }

    public final void al(fzjp fzjp0) {
        this.e = fzjp0;
        this.d();
    }

    @Override  // androidx.preference.TwoStatePreference
    protected final void fo() {
        if(this.d != null && this.d.booleanValue()) {
            return;
        }
        super.fo();
    }
}

