import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhc extends wby implements ajhd {
    final ajdy a;

    public ajhc() {
        super("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
    }

    public ajhc(ajdy ajdy0) {
        Objects.requireNonNull(ajdy0);
        this.a = ajdy0;
        super("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
    }

    @Override  // ajhd
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhd
    public final void b(boolean z, ApiMetadata apiMetadata0) {
        this.a.e(Boolean.valueOf(z));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhc.gr(parcel0);
                this.b(z, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhc.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

