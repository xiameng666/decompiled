import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahtx extends wby implements ahty {
    final evqp a;

    public ahtx() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    public ahtx(ahuo ahuo0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahuo0);
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override  // ahty
    public final void a(Status status0, SavePasswordResult savePasswordResult0) {
        azzf.b(status0, savePasswordResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            SavePasswordResult savePasswordResult0 = (SavePasswordResult)wbz.a(parcel0, SavePasswordResult.CREATOR);
            ahtx.gr(parcel0);
            this.a(status0, savePasswordResult0);
            return true;
        }
        return false;
    }
}

