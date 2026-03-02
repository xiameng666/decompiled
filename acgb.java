import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;

final class acgb extends acjl {
    final evqp a;

    public acgb(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjm
    public final void a(AppSearchResultParcel appSearchResultParcel0) {
        acgs acgs0 = appSearchResultParcel0.l;
        if(acgs0.b()) {
            InternalSetSchemaResponse internalSetSchemaResponse0 = (InternalSetSchemaResponse)acgs0.a();
            if(internalSetSchemaResponse0 == null) {
                acjx acjx0 = new acjx(2, "Received null InternalSetSchemaResponse during setSchema call");
                this.a.a(acjx0);
                return;
            }
            if(!internalSetSchemaResponse0.a) {
                acjx acjx1 = new acjx(7, internalSetSchemaResponse0.c);
                this.a.a(acjx1);
                return;
            }
            this.a.c(internalSetSchemaResponse0.b);
            return;
        }
        acjx acjx2 = new acjx(acgs0.a, acgs0.b);
        this.a.a(acjx2);
    }
}

