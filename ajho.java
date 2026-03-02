import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajho extends wby implements ajhp {
    final ajdw a;

    public ajho() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
    }

    public ajho(ajdw ajdw0) {
        Objects.requireNonNull(ajdw0);
        this.a = ajdw0;
        super("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
    }

    @Override  // ajhp
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhp
    public final void b(KeyHandleResult keyHandleResult0, ApiMetadata apiMetadata0) {
        this.a.e(keyHandleResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                KeyHandleResult keyHandleResult0 = (KeyHandleResult)wbz.a(parcel0, KeyHandleResult.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajho.gr(parcel0);
                this.b(keyHandleResult0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajho.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

