import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import com.octopuscards.aoservice.OctopusServiceParcelable;

public final class hmwd extends wby implements IInterface {
    public final String a;
    public final evqp b;

    public hmwd() {
        super("com.octopuscards.aoservice.IOctopusServiceCallback");
    }

    public hmwd(String s, evqp evqp0) {
        ibuq.f(s, "requestJson");
        super("com.octopuscards.aoservice.IOctopusServiceCallback");
        this.a = s;
        this.b = evqp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hmwd)) {
            return false;
        }
        return ibuq.m(this.a, ((hmwd)object0).a) ? ibuq.m(this.b, ((hmwd)object0).b) : false;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                OctopusServiceParcelable octopusServiceParcelable0 = (OctopusServiceParcelable)wbz.a(parcel0, OctopusServiceParcelable.CREATOR);
                hmwd.gr(parcel0);
                ibuq.f(octopusServiceParcelable0, "response");
                String s = octopusServiceParcelable0.a;
                ibuq.e(s, "getJson(...)");
                fsgi fsgi0 = new fsgi(s);
                this.b.b(fsgi0);
                return true;
            }
            case 2: {
                OctopusServiceParcelable octopusServiceParcelable1 = (OctopusServiceParcelable)wbz.a(parcel0, OctopusServiceParcelable.CREATOR);
                hmwd.gr(parcel0);
                ibuq.f(octopusServiceParcelable1, "response");
                String s1 = octopusServiceParcelable1.a;
                ibuq.e(s1, "getJson(...)");
                fsgh fsgh0 = new fsgh(s1);
                this.b.b(fsgh0);
                return true;
            }
            case 3: {
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                hmwd.gr(parcel0);
                ibuq.f(pendingIntent0, "intent");
                fsgj fsgj0 = new fsgj(pendingIntent0);
                this.b.b(fsgj0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ServiceRequest(requestJson=" + this.a + ", source=" + this.b + ")";
    }
}

