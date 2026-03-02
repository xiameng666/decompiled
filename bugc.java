import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.googleone.escalation.ReportActionRequest;

public final class bugc extends wby implements IInterface, cjug {
    private final cjud a;
    private final bugk b;
    private final String c;
    private final String d;
    private final icck e;

    public bugc() {
        super("com.google.android.gms.googleone.escalation.internal.IEscalationCardService");
    }

    public bugc(cjud cjud0, bugk bugk0, String s, String s1, icck icck0) {
        ibuq.f(cjud0, "dispatcher");
        ibuq.f(s, "callingPackage");
        ibuq.f(icck0, "coroutineScope");
        super("com.google.android.gms.googleone.escalation.internal.IEscalationCardService");
        this.a = cjud0;
        this.b = bugk0;
        this.c = s;
        this.d = s1;
        this.e = icck0;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bV);
        azuf0.g(bbdq.Z);
        azuf0.d(this.c);
        azuf0.c(this.d);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                bugb bugb0 = null;
                if(iBinder0 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs1 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                    azxs0 = azxs1;
                }
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.googleone.escalation.internal.IEscalationCardListener");
                    bugb0 = (iInterface1 instanceof bugb) ? ((bugb)iInterface1) : new bugb(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bugc.gr(parcel0);
                ibuq.f(azxs0, "statusCallback");
                ibuq.f(bugb0, "listener");
                azug azug0 = this.a(apiMetadata0);
                bugp bugp0 = new bugp(this.b, azxs0, bugb0, this.e, azug0);
                this.a.b(bugp0);
                break;
            }
            case 2: {
                ReportActionRequest reportActionRequest0 = (ReportActionRequest)wbz.a(parcel0, ReportActionRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bugc.gr(parcel0);
                azug azug1 = this.a(apiMetadata1);
                bugr bugr0 = new bugr(this.b, reportActionRequest0, this.e, azug1);
                this.a.b(bugr0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

