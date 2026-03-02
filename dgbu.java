import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dgbu implements ibtw {
    public final dgcp a;
    public final dcnp b;

    public dgbu(dgcp dgcp0, dcnp dcnp0) {
        this.a = dgcp0;
        this.b = dcnp0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ShareTarget shareTarget0 = (ShareTarget)object0;
        TransferMetadata transferMetadata0 = (TransferMetadata)object1;
        ibuq.f(shareTarget0, "shareTarget");
        ibuq.f(transferMetadata0, "transferMetadata");
        dgcc dgcc0 = new dgcc(this.b, shareTarget0, transferMetadata0);
        this.a.i.execute(dgcc0);
        return ibom.a;
    }
}

