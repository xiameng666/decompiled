import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aipb extends wby implements aipc {
    final evqp a;

    public aipb() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    public aipb(aipl aipl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aipl0);
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override  // aipc
    public final void a(Status status0, int v) {
        azzf.b(status0, Integer.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            aipb.gr(parcel0);
            this.a(status0, v1);
            return true;
        }
        return false;
    }
}

