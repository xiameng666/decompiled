import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;
import j..util.Objects;

final class dduk implements azye {
    final ShareTarget a;
    final OnTransferUpdateParams b;

    public dduk(ddul ddul0, ShareTarget shareTarget0, OnTransferUpdateParams onTransferUpdateParams0) {
        this.a = shareTarget0;
        this.b = onTransferUpdateParams0;
        Objects.requireNonNull(ddul0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        ((dcnp)object0).e(this.a, this.b.b);
    }

    @Override  // azye
    public final void b() {
    }
}

