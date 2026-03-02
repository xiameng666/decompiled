import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

final class aitp extends ibsl implements ibtw {
    int a;
    final aitq b;

    public aitp(aitq aitq0, ibrl ibrl0) {
        this.b = aitq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aitp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aitp(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.c.b(this.b.d, this);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                this.b.e.a(Status.b, ((CreateRestoreCredentialResponse)object0));
            }
            catch(aisc aisc0) {
                a.ae(aitq.a.i(), "Exception during create restore credential.", aisc0);
                this.b.e.a(aisc0.a, aitq.b);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(aisc aisc0) {
                a.ae(aitq.a.i(), "Exception during create restore credential.", aisc0);
                this.b.e.a(aisc0.a, aitq.b);
                return ibom.a;
            }
        }
        goto label_9;
    }
}

