import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyInfoResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhr extends wby implements ajhs {
    final ajdx a;

    public ajhr() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInfoResultCallback");
    }

    public ajhr(ajdx ajdx0) {
        Objects.requireNonNull(ajdx0);
        this.a = ajdx0;
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInfoResultCallback");
    }

    @Override  // ajhs
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhs
    public final void b(KeyInfoResult keyInfoResult0, ApiMetadata apiMetadata0) {
        this.a.e(keyInfoResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                KeyInfoResult keyInfoResult0 = (KeyInfoResult)wbz.a(parcel0, KeyInfoResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhr.gr(parcel0);
                this.b(keyInfoResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhr.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

