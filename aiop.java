import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aiop extends wby implements aioq {
    final evqp a;

    public aiop() {
        super("com.google.android.gms.auth.blockstore.internal.IGetBlockstoreDataCallback");
    }

    public aiop(aipl aipl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aipl0);
        super("com.google.android.gms.auth.blockstore.internal.IGetBlockstoreDataCallback");
    }

    @Override  // aioq
    public final void a(Status status0, byte[] arr_b) {
        azzf.b(status0, arr_b, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            aiop.gr(parcel0);
            this.a(status0, arr_b);
            return true;
        }
        return false;
    }
}

