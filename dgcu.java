import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dgcu implements ibts {
    public final dgdt a;
    public final dgjp b;

    public dgcu(dgdt dgdt0, dgjp dgjp0) {
        this.a = dgdt0;
        this.b = dgjp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "it");
        dgdi dgdi0 = (dgdi)this.a.a.get(Long.valueOf(((dgji)this.b).a));
        float f = 0.0f;
        if(dgdi0 != null) {
            TransferMetadata transferMetadata0 = dgdi0.f;
            if(transferMetadata0 != null) {
                f = transferMetadata0.b;
            }
        }
        ((dcnn)object0).e(f);
        return ibom.a;
    }
}

