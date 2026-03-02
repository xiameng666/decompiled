import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dcun implements icih {
    final ShareTarget a;
    final dcus b;
    private int c;

    public dcun(ShareTarget shareTarget0, dcus dcus0) {
        this.a = shareTarget0;
        this.b = dcus0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        int v = this.c;
        this.c = v + 1;
        if(v < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        cunf cunf0 = dcvz.a.b();
        ShareTarget shareTarget0 = this.a;
        cunf0.i("[CLOUD_SHARING_PROVIDER]: transfer update for share target [%s]: %s", new Long(shareTarget0.a), ((TransferMetadata)object0));
        if(v != 0) {
            dcnp dcnp3 = this.b.f;
            if(dcnp3 != null) {
                dcnp3.e(shareTarget0, ((TransferMetadata)object0));
            }
        }
        else if(((TransferMetadata)object0).e) {
            dcus dcus0 = this.b;
            dcnp dcnp0 = dcus0.f;
            if(dcnp0 != null) {
                dcnn dcnn0 = new dcnn(0x400);
                dcwr.a(dcnn0);
                dcnp0.e(shareTarget0, dcnn0.a());
            }
            dcnp dcnp1 = dcus0.f;
            if(dcnp1 != null) {
                dcnp1.e(shareTarget0, ((TransferMetadata)object0));
                return ibom.a;
            }
        }
        else {
            dcnp dcnp2 = this.b.f;
            if(dcnp2 != null) {
                dcnn dcnn1 = ((TransferMetadata)object0).a();
                dcwr.a(dcnn1);
                dcnp2.e(shareTarget0, dcnn1.a());
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

