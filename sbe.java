import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;

public final class sbe implements IInterface, rof, sah {
    public final ruq a;
    private final roe b;

    public sbe(rof rof0, ruq ruq0) {
        ibuq.f(ruq0, "service");
        super();
        this.b = (roe)rof0;
        this.a = ruq0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a.asBinder();
    }

    @Override  // sag
    public final Object b(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        Object object0 = sce.a(new sat(this, ryh0, persistableBundle0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // rof
    public final String fa() {
        return this.b.a;
    }

    @Override  // sag
    public final Object ff(ryh ryh0, ibrl ibrl0) {
        sau sau0;
        if((ibrl0 instanceof sau)) {
            sau0 = (sau)ibrl0;
            int v = sau0.c;
            if((v & 0x80000000) == 0) {
                sau0 = new sau(this, ibrl0);
            }
            else {
                sau0.c = v - 0x80000000;
            }
        }
        else {
            sau0 = new sau(this, ibrl0);
        }
        Object object0 = sau0.a;
        Object object1 = ibrx.a;
        switch(sau0.c) {
            case 0: {
                ibnx.b(object0);
                sas sas0 = new sas(this, ryh0);
                sau0.d = ryh0;
                sau0.c = 1;
                object0 = sce.a(sas0, sau0);
                if(object0 != object1) {
                    sau0.d = ryh0;
                    sau0.c = 2;
                    object0 = sbz.b(((rzz)object0), sau0);
                    return object0 != object1 ? ((rxp)ruj.d(((PersistableBundle)object0)).k(ryh0)) : object1;
                }
                return object1;
            }
            case 1: {
                ryh0 = sau0.d;
                ibnx.b(object0);
                sau0.d = ryh0;
                sau0.c = 2;
                object0 = sbz.b(((rzz)object0), sau0);
                return object0 != object1 ? ((rxp)ruj.d(((PersistableBundle)object0)).k(ryh0)) : object1;
            }
            case 2: {
                ryh ryh1 = sau0.d;
                ibnx.b(object0);
                return (rxp)ruj.d(((PersistableBundle)object0)).k(ryh1);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // sag
    public final icig fg(ryh ryh0) {
        ibuq.f(ryh0, "token");
        return new sba(new sax(new ichv(new sbd(this, ryh0, null))));
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override  // rof
    public final String l() {
        throw null;
    }
}

