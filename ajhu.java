import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhu extends wby implements ajhv {
    final ajec a;

    public ajhu() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
    }

    public ajhu(ajec ajec0) {
        Objects.requireNonNull(ajec0);
        this.a = ajec0;
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
    }

    @Override  // ajhv
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhv
    public final void b(KeyInvalidationResult keyInvalidationResult0, ApiMetadata apiMetadata0) {
        this.a.e(keyInvalidationResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                KeyInvalidationResult keyInvalidationResult0 = (KeyInvalidationResult)wbz.a(parcel0, KeyInvalidationResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhu.gr(parcel0);
                this.b(keyInvalidationResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhu.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

