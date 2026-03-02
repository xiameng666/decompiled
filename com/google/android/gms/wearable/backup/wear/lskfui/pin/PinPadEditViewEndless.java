package com.google.android.gms.wearable.backup.wear.lskfui.pin;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.icu.text.MessageFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import fcwv;
import fcww;
import gggq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class PinPadEditViewEndless extends FrameLayout {
    public final List a;

    public PinPadEditViewEndless(Context context0) {
        this(context0, null);
    }

    public PinPadEditViewEndless(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PinPadEditViewEndless(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public PinPadEditViewEndless(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new ArrayList();
        this.setMinimumHeight(this.getResources().getDimensionPixelSize(0x7F07168D));  // dimen:wearable_pin_dot_size
        PinPadEditViewEndless.inflate(context0, 0x7F0E07CC, this);  // layout:pin_edit_endless
        this.setFocusable(true);
    }

    public final void a(boolean z) {
        fcwv fcwv0 = (fcwv)gggq.p(this.a);
        this.a.remove(this.a.size() - 1);
        if(z) {
            fcwv0.a();
            fcwv0.d.setStartDelay(0L);
            fcwv0.d.start();
        }
        else {
            fcwv0.a();
            fcwv0.c.setStartDelay(0L);
            fcwv0.c.start();
        }
        this.postDelayed(new fcww(((FrameLayout)this.findViewById(0x7F0B1C95)), fcwv0), (z ? 550L : 0xFAL));  // id:pin_edit
    }

    public final void b() {
        for(int v = 0; true; ++v) {
            List list0 = this.a;
            if(v >= list0.size()) {
                break;
            }
            fcwv fcwv0 = (fcwv)list0.get(v);
            int v1 = list0.size();
            float f = fcwv0.getResources().getDimension(0x7F07168D);  // dimen:wearable_pin_dot_size
            float f1 = fcwv0.getResources().getDimension(0x7F07168C);  // dimen:wearable_pin_dot_margin_horizontal
            AnimatorSet animatorSet0 = new AnimatorSet();
            float f2 = -(((float)v1) * f + ((float)(v1 - 1)) * f1) / 2.0f + ((float)v) * (f1 + f) + f / 2.0f;
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(fcwv0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{fcwv0.f, f2})});
            fcwv0.f = f2;
            objectAnimator0.setInterpolator(fcwv0.a);
            animatorSet0.play(objectAnimator0);
            animatorSet0.setDuration(0xFAL);
            fcwv0.e = animatorSet0;
            fcwv0.e.start();
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("PIN area");
        List list0 = this.a;
        if(!list0.isEmpty()) {
            MessageFormat messageFormat0 = new MessageFormat("{count, plural, =1 { # character} other { # characters} }", Locale.getDefault());
            HashMap hashMap0 = new HashMap();
            hashMap0.put("count", Integer.valueOf(list0.size()));
            stringBuilder0.append(messageFormat0.format(hashMap0));
        }
        accessibilityNodeInfo0.setContentDescription(stringBuilder0);
    }
}

