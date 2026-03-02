import android.graphics.Rect;
import android.view.View;

public abstract class sw {
    protected final tx a;
    public int b;
    final Rect c;

    public sw(tx tx0) {
        this.b = 0x80000000;
        this.c = new Rect();
        this.a = tx0;
    }

    public abstract int a(View arg1);

    public abstract int b(View arg1);

    public abstract int c(View arg1);

    public abstract int d(View arg1);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View arg1);

    public abstract int m(View arg1);

    public abstract void n(int arg1);

    public final int o() {
        return this.b == 0x80000000 ? 0 : this.k() - this.b;
    }

    public static sw p(tx tx0, int v) {
        return v != 0 ? new sv(tx0) : new su(tx0);
    }
}

