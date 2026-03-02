import android.os.IBinder;
import android.os.IInterface;

final class ctib extends ibsl implements ibtw {
    int a;
    Object b;
    final ichm c;

    public ctib(ichm ichm0, ibrl ibrl0) {
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctib)this.c(((IBinder)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctib(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ctml ctml0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            IBinder iBinder0 = (IBinder)this.b;
            if(iBinder0 == null) {
                ctml0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastClientService");
                ctml0 = (iInterface0 instanceof ctml) ? ((ctml)iInterface0) : new ctmj(iBinder0);
            }
            ctmt ctmt0 = new ctmt(this.c);
            ctml0.a(ctmt0);
            ctia ctia0 = new ctia(ctml0, ctmt0);
            this.a = 1;
            if(ichl.b(this.c, ctia0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

