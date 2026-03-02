import android.util.Size;

public final class btv {
    public static final btv a;
    public final Size b;
    public final int c;

    static {
        btv.a = new btv();
    }

    private btv() {
        this.b = null;
        this.c = 0;
    }

    public btv(Size size0) {
        this.b = size0;
        this.c = 1;
    }
}

