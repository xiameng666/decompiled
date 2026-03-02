import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import j..util.Objects;

public final class eqxf extends wby implements eqxg {
    final eqvw a;
    final String b;
    final String c;
    final equk d;

    public eqxf() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetStartServiceOnSourceCallbacks");
    }

    public eqxf(equk equk0, eqvw eqvw0, String s, String s1) {
        this.a = eqvw0;
        this.b = s;
        this.c = s1;
        Objects.requireNonNull(equk0);
        this.d = equk0;
        super("com.google.android.gms.smartdevice.quickstart.ITargetStartServiceOnSourceCallbacks");
    }

    @Override  // eqxg
    public final void a(Status status0, StartServiceResponse startServiceResponse0) {
        this.d.e.d(this.a, this.b, this.c, status0, startServiceResponse0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            StartServiceResponse startServiceResponse0 = (StartServiceResponse)wbz.a(parcel0, StartServiceResponse.CREATOR);
            eqxf.gr(parcel0);
            this.a(status0, startServiceResponse0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

