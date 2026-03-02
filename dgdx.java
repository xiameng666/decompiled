import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dgdx implements ibts {
    public final dgeg a;
    public final dgqm b;

    public dgdx(dgeg dgeg0, dgqm dgqm0) {
        this.a = dgeg0;
        this.b = dgqm0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "it");
        dged dged0 = (dged)this.a.a.get(Long.valueOf(((dgqe)this.b).a));
        float f = 0.0f;
        if(dged0 != null) {
            TransferMetadata transferMetadata0 = dged0.d;
            if(transferMetadata0 != null) {
                f = transferMetadata0.b;
            }
        }
        ((dcnn)object0).e(f);
        return ibom.a;
    }
}

