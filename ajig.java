import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajig extends wby implements ajih {
    final ajek a;

    public ajig() {
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
    }

    public ajig(ajek ajek0) {
        Objects.requireNonNull(ajek0);
        this.a = ajek0;
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
    }

    @Override  // ajih
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajih
    public final void b(SignCryptedBlob signCryptedBlob0, ApiMetadata apiMetadata0) {
        this.a.e(signCryptedBlob0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                SignCryptedBlob signCryptedBlob0 = (SignCryptedBlob)wbz.a(parcel0, SignCryptedBlob.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajig.gr(parcel0);
                this.b(signCryptedBlob0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajig.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

