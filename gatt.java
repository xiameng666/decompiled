import android.graphics.Rect;

public final class gatt implements ibnf {
    public final Rect a;

    public gatt(Rect rect0) {
        this.a = rect0;
    }

    @Override  // ibnf
    public final Object get() {
        return this.a;
    }
}

