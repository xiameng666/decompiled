import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajim extends wby implements ajin {
    final ajer a;

    public ajim() {
        super("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
    }

    public ajim(ajer ajer0) {
        Objects.requireNonNull(ajer0);
        this.a = ajer0;
        super("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
    }

    @Override  // ajin
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajin
    public final void b(PlainText plainText0, ApiMetadata apiMetadata0) {
        this.a.e(plainText0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                PlainText plainText0 = (PlainText)wbz.a(parcel0, PlainText.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajim.gr(parcel0);
                this.b(plainText0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajim.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

