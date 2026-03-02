import android.os.Parcel;
import com.google.android.gms.auth.folsom.ProductKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public final class ajtn extends wby implements ajto {
    final evqp a;

    public ajtn() {
        super("com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
    }

    public ajtn(ajvg ajvg0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajvg0);
        super("com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
    }

    @Override  // ajto
    public final void a(Status status0, ProductKey[] arr_productKey, ApiMetadata apiMetadata0) {
        if(status0.e()) {
            List list0 = Arrays.asList(arr_productKey);
            this.a.b(list0);
            return;
        }
        aztb aztb0 = baqb.a(status0);
        this.a.a(aztb0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ProductKey[] arr_productKey = (ProductKey[])parcel0.createTypedArray(ProductKey.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtn.gr(parcel0);
            this.a(status0, arr_productKey, apiMetadata0);
            return true;
        }
        return false;
    }
}

