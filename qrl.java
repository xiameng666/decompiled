import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

public final class qrl extends qrf {
    private final qlu j;
    private final qrg k;

    public qrl(qkz qkz0, qrj qrj0, qrg qrg0, qkb qkb0) {
        super(qkz0, qrj0);
        this.k = qrg0;
        qlu qlu0 = new qlu(qkz0, this, new qqy("__container", qrj0.a, false), qkb0);
        this.j = qlu0;
        qlu0.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override  // qrf
    public final void c(RectF rectF0, Matrix matrix0, boolean z) {
        super.c(rectF0, matrix0, z);
        this.j.c(rectF0, this.a, z);
    }

    @Override  // qrf
    public final qqj i() {
        qqj qqj0 = super.i();
        return qqj0 == null ? this.k.i() : qqj0;
    }

    @Override  // qrf
    public final qse j() {
        qse qse0 = super.j();
        return qse0 == null ? this.k.j() : qse0;
    }

    @Override  // qrf
    public final void l(Canvas canvas0, Matrix matrix0, int v) {
        this.j.b(canvas0, matrix0, v);
    }

    @Override  // qrf
    public final void n(qpq qpq0, int v, List list0, qpq qpq1) {
        this.j.e(qpq0, v, list0, qpq1);
    }
}

