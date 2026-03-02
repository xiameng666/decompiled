import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajhl extends wby implements ajhm {
    final ajeb a;

    public ajhl() {
        super("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
    }

    public ajhl(ajeb ajeb0) {
        Objects.requireNonNull(ajeb0);
        this.a = ajeb0;
        super("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
    }

    @Override  // ajhm
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajhm
    public final void b(long v, ApiMetadata apiMetadata0) {
        this.a.e(Long.valueOf(v));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                long v1 = parcel0.readLong();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhl.gr(parcel0);
                this.b(v1, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajhl.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

