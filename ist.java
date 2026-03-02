import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

final class ist extends ibsl implements ibtw {
    int a;
    final isx b;
    final ScrollCaptureSession c;
    final Rect d;
    final Consumer e;

    public ist(isx isx0, ScrollCaptureSession scrollCaptureSession0, Rect rect0, Consumer consumer0, ibrl ibrl0) {
        this.b = isx0;
        this.c = scrollCaptureSession0;
        this.d = rect0;
        this.e = consumer0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ist)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ist(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            jlh jlh0 = hmn.e(this.d);
            this.a = 1;
            object0 = this.b.a(this.c, jlh0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        Rect rect0 = hmn.a(((jlh)object0));
        this.e.accept(rect0);
        return ibom.a;
    }
}

