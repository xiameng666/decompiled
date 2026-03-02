import android.content.Context;
import android.content.ServiceConnection;

final class csze extends ibsl implements ibtw {
    Object a;
    int b;
    final ibtw c;
    final cszf d;
    private Object e;

    public csze(ibtw ibtw0, cszf cszf0, ibrl ibrl0) {
        this.c = ibtw0;
        this.d = cszf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((csze)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new csze(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Throwable throwable0;
        ServiceConnection serviceConnection1;
        bbic bbic2;
        bbic bbic1;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icck icck0 = (icck)this.e;
                cszf cszf0 = this.d;
                bbic bbic0 = bbic.a();
                this.e = bbic0;
                this.a = icck0;
                this.b = 1;
                icbk icbk0 = new icbk(ibsc.c(this), 1);
                icbk0.z();
                cszd cszd0 = new cszd(cszf0, icbk0, bbic0, icck0);
                icbk0.d(new cszc(bbic0, cszf0, cszd0));
                try {
                    Context context0 = cszf0.b;
                    if(!bbic0.d(context0, cszf.a, cszd0, 1)) {
                        bbic0.b(context0, cszd0);
                        icbk0.w(null);
                    }
                }
                catch(SecurityException securityException0) {
                    bbic0.b(cszf0.b, cszd0);
                    icbk0.w(ibnx.a(securityException0));
                }
                object0 = icbk0.k();
                if(object0 == ibrx.a) {
                    ibsi.b(this);
                }
                if(object0 != object1) {
                    bbic1 = bbic0;
                    goto label_33;
                }
                return object1;
            }
            case 1: {
                icck icck1 = (icck)this.a;
                bbic1 = (bbic)this.e;
                ibnx.b(object0);
            label_33:
                if(((ibns)object0) == null) {
                    return null;
                }
                ServiceConnection serviceConnection0 = (ServiceConnection)((ibns)object0).a;
                alfw alfw0 = (alfw)((ibns)object0).b;
                try {
                    this.e = bbic1;
                    this.a = serviceConnection0;
                    this.b = 2;
                    object0 = this.c.a(alfw0, this);
                }
                catch(Throwable throwable1) {
                    bbic2 = bbic1;
                    serviceConnection1 = serviceConnection0;
                    goto label_55;
                }
                if(object0 != object1) {
                    bbic2 = bbic1;
                    serviceConnection1 = serviceConnection0;
                    goto label_63;
                }
                return object1;
            }
            case 2: {
                serviceConnection1 = (ServiceConnection)this.a;
                bbic2 = (bbic)this.e;
                try {
                    ibnx.b(object0);
                    goto label_63;
                }
                catch(Throwable throwable1) {
                }
            label_55:
                cszb cszb0 = new cszb(bbic2, this.d, serviceConnection1, null);
                this.e = throwable1;
                this.a = null;
                this.b = 4;
                if(icbd.a(icey.a, cszb0, this) != object1) {
                    throwable0 = throwable1;
                    throw throwable0;
                }
                return object1;
            label_63:
                cszb cszb1 = new cszb(bbic2, this.d, serviceConnection1, null);
                this.e = object0;
                this.a = null;
                this.b = 3;
                return icbd.a(icey.a, cszb1, this) == object1 ? object1 : object0;
            }
            case 3: {
                Object object2 = this.e;
                ibnx.b(object0);
                return object2;
            }
            default: {
                throwable0 = (Throwable)this.e;
                ibnx.b(object0);
                throw throwable0;
            }
        }
    }
}

