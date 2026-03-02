import android.graphics.drawable.Drawable;

public final class bdqu implements ibtw {
    public final hfc a;
    public final Drawable b;
    public final int c;
    public final int d;

    public bdqu(hfc hfc0, Drawable drawable0, int v, int v1) {
        this.a = hfc0;
        this.b = drawable0;
        this.c = v;
        this.d = v1;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        bdsa.h(this.a, this.b, ((goz)object0), gsc.a(this.c | 1), this.d);
        return ibom.a;
    }
}

