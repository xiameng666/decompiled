import android.view.animation.Interpolator;

final class kzv implements Interpolator {
    final kzx a;

    public kzv(kzx kzx0) {
        this.a = kzx0;
        super();
    }

    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.l.getInterpolation(f);
    }
}

