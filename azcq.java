import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class azcq extends wby implements azcr {
    final evqp a;

    public azcq() {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    public azcq(ayua ayua0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ayua0);
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    @Override  // azcr
    public final void a(Status status0, int v) {
        this.a.b(Integer.valueOf(v));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            azcq.gr(parcel0);
            this.a(status0, v1);
            return true;
        }
        return false;
    }
}

