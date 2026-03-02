import android.os.Parcel;
import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajtq extends wby implements ajtr {
    final evqp a;

    public ajtq() {
        super("com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
    }

    public ajtq(ajvm ajvm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajvm0);
        super("com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
    }

    @Override  // ajtr
    public final void a(Status status0, RecoveryResult recoveryResult0, ApiMetadata apiMetadata0) {
        azzf.c(status0, recoveryResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            RecoveryResult recoveryResult0 = (RecoveryResult)wbz.a(parcel0, RecoveryResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtq.gr(parcel0);
            this.a(status0, recoveryResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

