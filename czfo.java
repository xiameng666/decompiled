import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.EndpointIdRotationResultParams;
import j..util.Objects;

public final class czfo extends wby implements czfp {
    final jqt a;

    public czfo() {
        super("com.google.android.gms.nearby.internal.connection.IEndpointIdRotationResultListener");
    }

    public czfo(cvbg cvbg0, jqt jqt0) {
        this.a = jqt0;
        Objects.requireNonNull(cvbg0);
        super("com.google.android.gms.nearby.internal.connection.IEndpointIdRotationResultListener");
    }

    @Override  // czfp
    public final void a(EndpointIdRotationResultParams endpointIdRotationResultParams0) {
        this.a.b(endpointIdRotationResultParams0.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            EndpointIdRotationResultParams endpointIdRotationResultParams0 = (EndpointIdRotationResultParams)wbz.a(parcel0, EndpointIdRotationResultParams.CREATOR);
            czfo.gr(parcel0);
            this.a(endpointIdRotationResultParams0);
            return true;
        }
        return false;
    }
}

