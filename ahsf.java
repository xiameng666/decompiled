import android.os.Parcel;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahsf extends wby implements ahsg {
    final evqp a;

    public ahsf() {
        super("com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback");
    }

    public ahsf(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback");
    }

    @Override  // ahsg
    public final void a(Status status0, ChromeOptions chromeOptions0) {
        azzf.b(status0, gfsx.l(chromeOptions0), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ChromeOptions chromeOptions0 = (ChromeOptions)wbz.a(parcel0, ChromeOptions.CREATOR);
            ahsf.gr(parcel0);
            this.a(status0, chromeOptions0);
            return true;
        }
        return false;
    }
}

