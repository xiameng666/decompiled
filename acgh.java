import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acgh extends acjl {
    final evqp a;
    final acgm b;

    public acgh(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        this.b = acgm0;
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        acgs acgs0 = appSearchResultParcel0.l;
        if(acgs0.b()) {
            this.a.c(this.b);
            return;
        }
        acjx acjx0 = new acjx(acgs0.a, acgs0.b);
        this.a.a(acjx0);
    }
}

