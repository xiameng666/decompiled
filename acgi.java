import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acgi extends acjl {
    final evqp a;

    public acgi(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        acgs acgs0 = appSearchResultParcel0.l;
        if(acgs0.b()) {
            GetSchemaResponse getSchemaResponse0 = (GetSchemaResponse)Objects.requireNonNull(((GetSchemaResponse)acgs0.a()));
            this.a.c(getSchemaResponse0);
            return;
        }
        acjx acjx0 = new acjx(acgs0.a, acgs0.b);
        this.a.a(acjx0);
    }
}

