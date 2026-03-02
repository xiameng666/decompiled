import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

final class aitt extends ibsl implements ibtw {
    int a;
    final aitu b;

    public aitt(aitu aitu0, ibrl ibrl0) {
        this.b = aitu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aitt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aitt(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.c.d(this.b.d, this);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                this.b.e.a(Status.b, ((GetRestoreCredentialResponse)object0));
            }
            catch(aisc aisc0) {
                a.ae(aitu.a.i(), "Exception during get restore credential.", aisc0);
                this.b.e.a(aisc0.a, aitu.b);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(aisc aisc0) {
                a.ae(aitu.a.i(), "Exception during get restore credential.", aisc0);
                this.b.e.a(aisc0.a, aitu.b);
                return ibom.a;
            }
        }
        goto label_9;
    }
}

