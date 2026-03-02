import com.google.android.gms.common.api.Status;

final class aitn extends ibsl implements ibtw {
    int a;
    final aito b;

    public aitn(aito aito0, ibrl ibrl0) {
        this.b = aito0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aitn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aitn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.b.a(this.b.c, this);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                this.b.d.a(Status.b, ((Boolean)object0).booleanValue());
            }
            catch(aisc aisc0) {
                a.ae(aito.a.i(), "Exception during clear restore credential.", aisc0);
                this.b.d.a(aisc0.a, false);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(aisc aisc0) {
                a.ae(aito.a.i(), "Exception during clear restore credential.", aisc0);
                this.b.d.a(aisc0.a, false);
                return ibom.a;
            }
        }
        goto label_9;
    }
}

