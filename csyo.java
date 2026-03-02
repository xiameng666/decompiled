import java.io.IOException;

final class csyo extends ibsl implements ibtw {
    int a;
    final lap b;
    final ctdo c;

    public csyo(lap lap0, ctdo ctdo0, ibrl ibrl0) {
        this.b = lap0;
        this.c = ctdo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((csyo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new csyo(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                icig icig0 = this.b.b();
                this.a = 1;
                object0 = icll.a(icig0, this);
                return object0 == object1 ? object1 : ((ctef)object0);
            }
            catch(IOException iOException0) {
                a.ae(csyp.a.i(), "dataStore.data.first() failed.", iOException0);
                return cteg.a(((ProtoLiteMessage)ctef.a).v_newBuilder()).a();
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                goto label_15;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(IOException iOException0) {
                a.ae(csyp.a.i(), "dataStore.data.first() failed.", iOException0);
                return cteg.a(((ProtoLiteMessage)ctef.a).v_newBuilder()).a();
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                goto label_15;
            }
        }
        return (ctef)object0;
    label_15:
        this.c.b(ctdi.h, ctdh.n);
        if(hvmp.d()) {
            throw unsatisfiedLinkError0;
        }
        a.e(csyp.a.j(), "UnsatisfiedLinkError caught: %s", new foqj(unsatisfiedLinkError0.getClass()), unsatisfiedLinkError0);
        return cteg.a(((ProtoLiteMessage)ctef.a).v_newBuilder()).a();
    }
}

