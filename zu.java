import android.os.Build.VERSION;
import android.window.BackEvent;

public final class zu {
    public final float a;
    public final float b;
    public final int c;
    private final float d;
    private final long e;

    public zu(float f, float f1, float f2, int v, long v1) {
        this.d = f;
        this.a = f1;
        this.b = f2;
        this.c = v;
        this.e = v1;
    }

    public zu(BackEvent backEvent0) {
        ibuq.f(backEvent0, "backEvent");
        long v1;
        ibuq.f(backEvent0, "backEvent");
        float f = backEvent0.getTouchX();
        ibuq.f(backEvent0, "backEvent");
        float f1 = backEvent0.getTouchY();
        ibuq.f(backEvent0, "backEvent");
        float f2 = backEvent0.getProgress();
        ibuq.f(backEvent0, "backEvent");
        int v = backEvent0.getSwipeEdge();
        if(Build.VERSION.SDK_INT >= 36) {
            ibuq.f(backEvent0, "backEvent");
            v1 = backEvent0.getFrameTimeMillis();
        }
        else {
            v1 = 0L;
        }
        this(f, f1, f2, v, v1);
    }

    public zu(nza nza0) {
        this(nza0.a, nza0.b, nza0.c, nza0.d, nza0.e);
    }

    @Override
    public final String toString() {
        return "BackEventCompat{touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + ", frameTimeMillis=" + this.e + '}';
    }
}

