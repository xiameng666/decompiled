package com.google.android.gms.growth.uiflow.ui.widget.media;

import android.content.Context;
import android.util.AttributeSet;
import bwbf;
import com.airbnb.lottie.LottieAnimationView;

public class ScaledLottieAnimationView extends LottieAnimationView {
    public bwbf f;

    public ScaledLottieAnimationView(Context context0) {
        super(context0);
    }

    public ScaledLottieAnimationView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ScaledLottieAnimationView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected final boolean setFrame(int v, int v1, int v2, int v3) {
        if(this.getDrawable() != null) {
            bwbf bwbf0 = this.f;
            if(bwbf0 != null) {
                bwbf0.a();
            }
        }
        return super.setFrame(v, v1, v2, v3);
    }
}

