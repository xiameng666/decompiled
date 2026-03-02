import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;

public final class czez extends wby implements czfa {
    final czfq a;

    public czez() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    public czez(czfq czfq0) {
        this.a = czfq0;
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    @Override  // czfa
    public final void a(OnConnectionResponseParams onConnectionResponseParams0) {
        String s = onConnectionResponseParams0.a;
        int v = onConnectionResponseParams0.b;
        byte[] arr_b = onConnectionResponseParams0.c;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        parcel0.writeInt(v);
        parcel0.writeByteArray(arr_b);
        this.a.jp(1006, parcel0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            OnConnectionResponseParams onConnectionResponseParams0 = (OnConnectionResponseParams)wbz.a(parcel0, OnConnectionResponseParams.CREATOR);
            czez.gr(parcel0);
            this.a(onConnectionResponseParams0);
            return true;
        }
        return false;
    }
}

