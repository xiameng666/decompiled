import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.StringParams;
import j..util.Objects;

public final class czgh extends wby implements czgi {
    final jqt a;

    public czgh() {
        super("com.google.android.gms.nearby.internal.connection.IStringResultListener");
    }

    public czgh(cuyt cuyt0, jqt jqt0) {
        this.a = jqt0;
        Objects.requireNonNull(cuyt0);
        super("com.google.android.gms.nearby.internal.connection.IStringResultListener");
    }

    @Override  // czgi
    public final void a(StringParams stringParams0) {
        this.a.b(stringParams0.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            StringParams stringParams0 = (StringParams)wbz.a(parcel0, StringParams.CREATOR);
            czgh.gr(parcel0);
            this.a(stringParams0);
            return true;
        }
        return false;
    }
}

