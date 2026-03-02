import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dgce implements ibtw {
    public final dgcp a;
    public final dcnp b;

    public dgce(dgcp dgcp0, dcnp dcnp0) {
        this.a = dgcp0;
        this.b = dcnp0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ShareTarget shareTarget0 = (ShareTarget)object0;
        TransferMetadata transferMetadata0 = (TransferMetadata)object1;
        ibuq.f(shareTarget0, "shareTargetFromProvider");
        ibuq.f(transferMetadata0, "transferMetadata");
        dgbq dgbq0 = new dgbq(this.b, shareTarget0, transferMetadata0);
        this.a.i.execute(dgbq0);
        return ibom.a;
    }
}

