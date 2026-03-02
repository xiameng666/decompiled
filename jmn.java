import android.graphics.Canvas;

final class jmn extends ibur implements ibts {
    final jmw a;
    final ify b;
    final jmw c;

    public jmn(jmw jmw0, ify ify0, jmw jmw1) {
        this.a = jmw0;
        this.b = ify0;
        this.c = jmw1;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hli hli0 = ((hpd)object0).t().b();
        jmw jmw0 = this.a;
        if(jmw0.c.getVisibility() != 8) {
            jmw0.v = true;
            iio iio0 = (this.b.j instanceof ili) ? this.b.j : null;
            if(iio0 != null) {
                Canvas canvas0 = hkj.a(hli0);
                ((ili)iio0).D();
                this.c.draw(canvas0);
            }
            jmw0.v = false;
        }
        return ibom.a;
    }
}

