import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aiol extends wby implements aiom {
    final evqp a;

    public aiol() {
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
    }

    public aiol(aipl aipl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aipl0);
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
    }

    @Override  // aiom
    public final void a(Status status0, boolean z) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            aiol.gr(parcel0);
            this.a(status0, z);
            return true;
        }
        return false;
    }
}

