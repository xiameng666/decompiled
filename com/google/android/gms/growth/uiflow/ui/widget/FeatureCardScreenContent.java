package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import bvzi;
import bvzj;
import bwcd;
import bwdm;
import bwdz;
import bwea;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zdd;

public final class FeatureCardScreenContent extends ConstraintLayout implements bwcd {
    public FeatureCardScreenContent(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public FeatureCardScreenContent(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public FeatureCardScreenContent(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E0BF8, this);  // layout:uiflow_feature_card_content
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, zdd.d, 0, 0);
        bwea.d(this, new bvzj(typedArray0, this));
        int v1 = typedArray0.getResourceId(1, -1);
        if(v1 != -1) {
            bwdz.g(this, new bvzi(v1, this));
        }
        typedArray0.recycle();
    }

    public FeatureCardScreenContent(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // bwcd
    public final void g(bwdm bwdm0) {
        if(bwdm0.g()) {
            this.findViewById(0x7F0B0CF9).setVisibility(0);  // id:bottom_padding_space
        }
    }
}

