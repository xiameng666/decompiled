import com.google.android.gms.appsearch.aidl.AppSearchBatchResultParcel;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import j..util.Objects;
import java.util.Map.Entry;

final class acgk extends acji {
    final evqp a;

    public acgk(acgm acgm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acgm0);
        super();
    }

    @Override  // acjj
    public final void a(AppSearchBatchResultParcel appSearchBatchResultParcel0) {
        acfl acfl0 = appSearchBatchResultParcel0.a();
        acfk acfk0 = new acfk();
        for(Object object0: acfl0.b().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            GenericDocumentParcel genericDocumentParcel0 = (GenericDocumentParcel)map$Entry0.getValue();
            if(genericDocumentParcel0 != null) {
                achh achh0 = new achh(genericDocumentParcel0);
                String s = (String)map$Entry0.getKey();
                Objects.requireNonNull(s);
                acfk0.b();
                acfk0.c(s, new acgs(0, achh0, null));
            }
        }
        for(Object object1: acfl0.a().entrySet()) {
            String s1 = (String)((Map.Entry)object1).getKey();
            int v = ((acgs)((Map.Entry)object1).getValue()).a;
            String s2 = ((acgs)((Map.Entry)object1).getValue()).b;
            Objects.requireNonNull(s1);
            acfk0.b();
            acfk0.c(s1, new acgs(v, null, s2));
        }
        acfl acfl1 = acfk0.a();
        this.a.c(acfl1);
    }

    @Override  // acjj
    public final void c(AppSearchResultParcel appSearchResultParcel0) {
        acjx acjx0 = new acjx(appSearchResultParcel0.l.a, appSearchResultParcel0.l.b);
        this.a.a(acjx0);
    }
}

