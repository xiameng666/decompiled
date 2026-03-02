import android.net.Uri.Builder;

final class cbve extends ibsl implements ibtw {
    final Uri.Builder a;
    final cbvg b;

    public cbve(Uri.Builder uri$Builder0, cbvg cbvg0, ibrl ibrl0) {
        this.a = uri$Builder0;
        this.b = cbvg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbve)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbve(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        String s = bbmq.m(this.b.a);
        return this.a.appendQueryParameter("device_id", s);
    }
}

