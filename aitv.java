import com.google.android.gms.common.api.Status;

final class aitv extends ibsl implements ibtw {
    int a;
    final aitw b;

    public aitv(aitw aitw0, ibrl ibrl0) {
        this.b = aitw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aitv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aitv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        aisc aisc1;
        aitv aitv0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            this.a = 1;
            aitv0 = this;
            try {
                object0 = this.b.b.e(this.b.c, this.b.d, this.b.e, this.b.f, aitv0);
                if(object0 == object1) {
                    return object1;
                }
            label_15:
                int v = ((Number)object0).intValue();
                aitv0.b.g.a(Status.b, v);
            }
            catch(aisc aisc2) {
                aisc1 = aisc2;
                a.ae(aitw.a.i(), "Exception during set restore credential private key.", aisc1);
                aitv0.b.g.a(aisc1.a, 0);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
                aitv0 = this;
            }
            catch(aisc aisc0) {
                aisc1 = aisc0;
                aitv0 = this;
                a.ae(aitw.a.i(), "Exception during set restore credential private key.", aisc1);
                aitv0.b.g.a(aisc1.a, 0);
                return ibom.a;
            }
        }
        goto label_15;
    }
}

