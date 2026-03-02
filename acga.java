import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acga extends acjl {
    final evqp a;

    public acga(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        acgs acgs0 = appSearchResultParcel0.l;
        evqp evqp0 = this.a;
        if(acgs0.b()) {
            evqp0.b(((Void)acgs0.a()));
            return;
        }
        evqp0.a(new acjx(acgs0.a, acgs0.b));
    }
}

