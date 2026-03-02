import java.util.concurrent.CancellationException;

final class bumm extends ibsl implements ibtw {
    int a;
    final bumo b;

    public bumm(bumo bumo0, ibrl ibrl0) {
        this.b = bumo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bumm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bumm(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                hivu hivu0 = hivt.a(((ProtoLiteMessage)hivs.a).v_newBuilder());
                hivu0.b();
                hivs hivs0 = hivu0.a();
                this.a = 1;
                object0 = this.b.h.a(hivs0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_12:
                bumi bumi0 = new bumi(((hivx)object0));
                this.b.e.ii(bumi0);
                return ibom.a;
            }
            catch(iapl iapl0) {
                goto label_16;
            }
            catch(iapn iapn0) {
                goto label_20;
            }
            catch(CancellationException cancellationException0) {
                goto label_24;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(iapl iapl0) {
                goto label_16;
            }
            catch(iapn iapn0) {
                goto label_20;
            }
            catch(CancellationException cancellationException0) {
                goto label_24;
            }
        }
        goto label_12;
    label_16:
        bumg bumg0 = new bumg(iapl0);
        this.b.e.ii(bumg0);
        return ibom.a;
    label_20:
        bumg bumg1 = new bumg(iapn0);
        this.b.e.ii(bumg1);
        return ibom.a;
    label_24:
        bumg bumg2 = new bumg(cancellationException0);
        this.b.e.ii(bumg2);
        return ibom.a;
    }
}

