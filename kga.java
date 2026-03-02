import android.view.WindowInsetsAnimation;

public final class kga {
    public kfz a;

    public kga(WindowInsetsAnimation windowInsetsAnimation0) {
        this.a = new kfz(new WindowInsetsAnimation(0, null, 0L));
        this.a = new kfz(windowInsetsAnimation0);
    }

    public final float a() {
        return this.a.a.getAlpha();
    }

    public final float b() {
        return this.a.a.getInterpolatedFraction();
    }

    public final int c() {
        return this.a.a.getTypeMask();
    }

    public final long d() {
        return this.a.a.getDurationMillis();
    }
}

