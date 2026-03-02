import android.os.Parcel;
import com.google.android.gms.appset.AppSetInfoParcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class acmd extends wby implements acme {
    final evqp a;

    public acmd() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public acmd(acmk acmk0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(acmk0);
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override  // acme
    public final void a(Status status0, AppSetInfoParcel appSetInfoParcel0) {
        azzf.b(status0, (appSetInfoParcel0 == null ? null : new ackp(appSetInfoParcel0.a, appSetInfoParcel0.b)), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            AppSetInfoParcel appSetInfoParcel0 = (AppSetInfoParcel)wbz.a(parcel0, AppSetInfoParcel.CREATOR);
            acmd.gr(parcel0);
            this.a(status0, appSetInfoParcel0);
            return true;
        }
        return false;
    }
}

