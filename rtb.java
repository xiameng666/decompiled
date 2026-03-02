import java.util.Objects;

final class rtb extends ibsl implements ibtw {
    int a;
    final rtm b;
    final ryh c;
    private Object d;

    public rtb(rtm rtm0, ryh ryh0, ibrl ibrl0) {
        this.b = rtm0;
        this.c = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rtb)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rtb(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.d;
                rsz rsz0 = new rsz(this.c);
                rta rta0 = new rta(this.c, null);
                this.d = icih0;
                this.a = 1;
                object0 = this.b.k(this.c, rsz0, rta0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.d;
                ibnx.b(object0);
                break;
            }
            default: {
                try {
                    ibnx.b(object0);
                }
                catch(sbh sbh0) {
                    Objects.toString(this.c);
                    sct.f("OTMBase", "Service exception while observing metadata for " + this.c, sbh0);
                }
                return ibom.a;
            }
        }
        icig icig0 = (icig)object0;
        try {
            this.d = null;
            this.a = 2;
            if(icir.c(icih0, icig0, this) == object1) {
                return object1;
            }
        }
        catch(sbh sbh0) {
            Objects.toString(this.c);
            sct.f("OTMBase", "Service exception while observing metadata for " + this.c, sbh0);
        }
        return ibom.a;
    }
}

