import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ahnv extends wby implements ahnw {
    final evqp a;

    public ahnv() {
        super("com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
    }

    public ahnv(ahow ahow0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahow0);
        super("com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
    }

    @Override  // ahnw
    public final void a(Status status0, List list0) {
        azzf.b(status0, list0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = wbz.b(parcel0);
            ahnv.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

