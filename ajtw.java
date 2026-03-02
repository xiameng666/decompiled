import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public final class ajtw extends wby implements ajtx {
    final evqp a;

    public ajtw() {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
    }

    public ajtw(ajvf ajvf0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajvf0);
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
    }

    @Override  // ajtx
    public final void a(Status status0, SharedKey[] arr_sharedKey, ApiMetadata apiMetadata0) {
        if(status0.e()) {
            List list0 = Arrays.asList(arr_sharedKey);
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
            SharedKey[] arr_sharedKey = (SharedKey[])parcel0.createTypedArray(SharedKey.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtw.gr(parcel0);
            this.a(status0, arr_sharedKey, apiMetadata0);
            return true;
        }
        return false;
    }
}

