import com.google.android.gms.appsearch.SearchResultPage;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acij extends acjl {
    final evqp a;
    final acik b;

    public acij(acik acik0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acik0);
        this.b = acik0;
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        acgs acgs0 = appSearchResultParcel0.l;
        if(acgs0.b()) {
            SearchResultPage searchResultPage0 = (SearchResultPage)Objects.requireNonNull(((SearchResultPage)acgs0.a()));
            this.b.g = searchResultPage0.a;
            this.a.b(searchResultPage0.a());
            return;
        }
        acjx acjx0 = new acjx(acgs0.a, acgs0.b);
        this.a.a(acjx0);
    }
}

