import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public final class ajtz extends wby implements ajua {
    final evqp a;

    public ajtz() {
        super("com.google.android.gms.auth.folsom.internal.IStringListCallback");
    }

    public ajtz(ajvj ajvj0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajvj0);
        super("com.google.android.gms.auth.folsom.internal.IStringListCallback");
    }

    @Override  // ajua
    public final void a(Status status0, String[] arr_s, ApiMetadata apiMetadata0) {
        if(status0.e()) {
            List list0 = Arrays.asList(arr_s);
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
            String[] arr_s = parcel0.createStringArray();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtz.gr(parcel0);
            this.a(status0, arr_s, apiMetadata0);
            return true;
        }
        return false;
    }
}

