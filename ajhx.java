import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhx extends wby implements ajhy {
    final ajed a;

    public ajhx() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
    }

    public ajhx(ajed ajed0) {
        Objects.requireNonNull(ajed0);
        this.a = ajed0;
        super("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
    }

    @Override  // ajhy
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhy
    public final void b(KeyRegistrationResult keyRegistrationResult0, ApiMetadata apiMetadata0) {
        this.a.e(keyRegistrationResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                KeyRegistrationResult keyRegistrationResult0 = (KeyRegistrationResult)wbz.a(parcel0, KeyRegistrationResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhx.gr(parcel0);
                this.b(keyRegistrationResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhx.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

