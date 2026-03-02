import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ahmo extends wby implements ahmp {
    final evqp a;

    public ahmo() {
        super("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
    }

    public ahmo(ahpf ahpf0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahpf0);
        super("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
    }

    @Override  // ahmp
    public final void a(Status status0) {
        azzf.b(status0, null, this.a);
    }

    @Override  // ahmp
    public final void b(List list0) {
        azzf.b(new Status(0), list0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = wbz.b(parcel0);
                ahmo.gr(parcel0);
                this.b(arrayList0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ahmo.gr(parcel0);
                this.a(status0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

