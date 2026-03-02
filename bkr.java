import android.util.Size;
import android.view.Surface;

public final class bkr extends bka {
    private final Surface a;

    public bkr(Surface surface0) {
        super(bka.b, 0);
        this.a = surface0;
    }

    public bkr(Surface surface0, Size size0, int v) {
        super(size0, v);
        this.a = surface0;
    }

    @Override  // bka
    public final gmcd a() {
        return bpt.b(this.a);
    }
}

