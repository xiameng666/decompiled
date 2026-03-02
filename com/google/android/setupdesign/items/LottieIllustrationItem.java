package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import gaec;
import gagt;
import gajh;
import gaji;

public class LottieIllustrationItem extends Item {
    private int a;

    LottieIllustrationItem() {
    }

    public LottieIllustrationItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, gagt.m);
        this.a = typedArray0.getResourceId(1, 0);
        typedArray0.recycle();
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        if(view0 != null) {
            view0.setContentDescription(this.j);
            LottieAnimationView lottieAnimationView0 = (LottieAnimationView)view0.findViewById(0x7F0B214D);  // id:sud_item_lottie_illustration
            int v = this.a;
            if(v != 0) {
                lottieAnimationView0.l(v);
            }
            lottieAnimationView0.i();
            if(!gaec.t(view0.getContext())) {
                gaji.b(view0);
            }
            gajh.d(view0);
        }
    }

    @Override  // com.google.android.setupdesign.items.Item
    protected final int d() {
        return 0x7F0E0AB4;  // layout:sud_lottie_illustration_item
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final boolean g() {
        return false;
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final boolean kz() {
        return true;
    }
}

