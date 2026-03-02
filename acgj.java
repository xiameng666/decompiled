import com.google.android.gms.appsearch.aidl.AppSearchBatchResultParcel;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acgj extends acji {
    final evqp a;

    public acgj(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjj
    public final void a(AppSearchBatchResultParcel appSearchBatchResultParcel0) {
        acfl acfl0 = appSearchBatchResultParcel0.a();
        this.a.c(acfl0);
    }

    @Override  // acjj
    public final void c(AppSearchResultParcel appSearchResultParcel0) {
        acjx acjx0 = new acjx(appSearchResultParcel0.l.a, appSearchResultParcel0.l.b);
        this.a.a(acjx0);
    }
}

