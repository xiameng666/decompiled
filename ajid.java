import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajid extends wby implements ajie {
    final ajej a;

    public ajid() {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
    }

    public ajid(ajej ajej0) {
        Objects.requireNonNull(ajej0);
        this.a = ajej0;
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
    }

    @Override  // ajie
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajie
    public final void b(CryptauthPublicKey cryptauthPublicKey0, ApiMetadata apiMetadata0) {
        this.a.e(cryptauthPublicKey0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                CryptauthPublicKey cryptauthPublicKey0 = (CryptauthPublicKey)wbz.a(parcel0, CryptauthPublicKey.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajid.gr(parcel0);
                this.b(cryptauthPublicKey0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajid.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

