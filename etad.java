import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public class etad extends wby implements etae {
    public etad() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
    }

    @Override  // etae
    public void a(Status status0, String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // etae
    public void b(Status status0, PendingIntent pendingIntent0) {
        throw new UnsupportedOperationException();
    }

    @Override  // etae
    public void c(Status status0, String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                String s = parcel0.readString();
                etad.gr(parcel0);
                this.c(status0, s);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                String s1 = parcel0.readString();
                etad.gr(parcel0);
                this.a(status1, s1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                etad.gr(parcel0);
                this.b(status2, pendingIntent0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

