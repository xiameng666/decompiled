import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhf extends wby implements ajhg {
    final ajdz a;

    public ajhf() {
        super("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
    }

    public ajhf(ajdz ajdz0) {
        Objects.requireNonNull(ajdz0);
        this.a = ajdz0;
        super("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
    }

    @Override  // ajhg
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhg
    public final void b(KeyDerivationResult keyDerivationResult0, ApiMetadata apiMetadata0) {
        this.a.e(keyDerivationResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                KeyDerivationResult keyDerivationResult0 = (KeyDerivationResult)wbz.a(parcel0, KeyDerivationResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhf.gr(parcel0);
                this.b(keyDerivationResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhf.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

