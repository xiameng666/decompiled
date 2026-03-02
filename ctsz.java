import android.os.IBinder;

final class ctsz extends ibsl implements ibtw {
    int a;
    final cttb b;
    final IBinder c;
    final byte[] d;

    public ctsz(cttb cttb0, IBinder iBinder0, byte[] arr_b, ibrl ibrl0) {
        this.b = cttb0;
        this.c = iBinder0;
        this.d = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctsz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctsz(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.f.b(this.c.toString(), this.d) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

