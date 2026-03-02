import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.HashResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhi extends wby implements ajhj {
    final ajea a;

    public ajhi() {
        super("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
    }

    public ajhi(ajea ajea0) {
        Objects.requireNonNull(ajea0);
        this.a = ajea0;
        super("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
    }

    @Override  // ajhj
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhj
    public final void b(HashResult hashResult0, ApiMetadata apiMetadata0) {
        this.a.e(hashResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                HashResult hashResult0 = (HashResult)wbz.a(parcel0, HashResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhi.gr(parcel0);
                this.b(hashResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhi.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

