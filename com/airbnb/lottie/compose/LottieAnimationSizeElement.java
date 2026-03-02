package com.airbnb.lottie.compose;

import hfb;
import ibuq;
import ihf;
import qod;

public final class LottieAnimationSizeElement extends ihf {
    private final int a;
    private final int b;

    public LottieAnimationSizeElement(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // ihf
    public final hfb d() {
        return new qod(this.a, this.b);
    }

    @Override  // ihf
    public final void e(hfb hfb0) {
        qod qod0 = (qod)hfb0;
        ibuq.f(qod0, "node");
        qod0.a = this.a;
        qod0.b = this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LottieAnimationSizeElement)) {
            return false;
        }
        return this.a == ((LottieAnimationSizeElement)object0).a ? this.b == ((LottieAnimationSizeElement)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "LottieAnimationSizeElement(width=" + this.a + ", height=" + this.b + ")";
    }
}

