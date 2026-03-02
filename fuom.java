import android.view.View;

public final class fuom implements ibts {
    public final View a;
    public final int b;

    public fuom(View view0, int v) {
        this.a = view0;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jxn jxn0 = (jxn)object0;
        ibuq.f(jxn0, "insets");
        funy.e(this.a, null, Integer.valueOf(jxn0.e + this.b), 7);
        return ibom.a;
    }
}

