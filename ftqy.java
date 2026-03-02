import android.os.IBinder;
import android.os.IInterface;

final class ftqy extends ibsl implements ibtw {
    int a;
    final ftqz b;
    final IBinder c;

    public ftqy(ftqz ftqz0, IBinder iBinder0, ibrl ibrl0) {
        this.b = ftqz0;
        this.c = iBinder0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ftqy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ftqy(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ftqz ftqz0 = this.b;
            IBinder iBinder0 = this.c;
            if(iBinder0 == null) {
                object2 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.libraries.tapandpay.riker.aidl.IRikerIsolatedService");
                object2 = (iInterface0 instanceof ftqs) ? ((ftqs)iInterface0) : new ftqs(iBinder0);
            }
            ibuq.e(object2, "asInterface(...)");
            this.a = 1;
            if(ftqz0.c.a(object2, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

