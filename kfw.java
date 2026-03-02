import android.view.WindowInsetsAnimation.Bounds;

public final class kfw {
    public final jxn a;
    public final jxn b;

    public kfw(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
        this.a = jxn.f(windowInsetsAnimation$Bounds0.getLowerBound());
        this.b = jxn.f(windowInsetsAnimation$Bounds0.getUpperBound());
    }

    public kfw(jxn jxn0, jxn jxn1) {
        this.a = jxn0;
        this.b = jxn1;
    }

    @Override
    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }
}

