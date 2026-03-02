import android.os.IBinder;
import android.os.IInterface;

final class ctlf extends ibsl implements ibtw {
    int a;
    Object b;
    final ctlh c;
    final icig d;
    final String e;
    final ichm f;

    public ctlf(ichm ichm0, ctlh ctlh0, icig icig0, String s, ibrl ibrl0) {
        this.f = ichm0;
        this.c = ctlh0;
        this.d = icig0;
        this.e = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctlf)this.c(((IBinder)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctlf(this.f, this.c, this.d, this.e, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        alfw alfw0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            IBinder iBinder0 = (IBinder)this.b;
            if(iBinder0 == null) {
                alfw0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
                alfw0 = (iInterface0 instanceof alfw) ? ((alfw)iInterface0) : new alfw(iBinder0);
            }
            alfw0.c(new ctle(this.f));
            ctlc ctlc0 = new ctlc(this.d, this.f, alfw0, this.e, null);
            icbb.b(this.f, null, null, ctlc0, 3);
            ctkz ctkz0 = new ctkz(alfw0, this.e);
            this.a = 1;
            if(ichl.b(this.f, ctkz0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

