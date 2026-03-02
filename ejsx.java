import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.recaptchabase.InitRequest;

public final class ejsx extends wby implements IInterface, cjug {
    private final cjts a;
    private final ejra b;
    private final ejqz c;

    public ejsx() {
        super("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
    }

    public ejsx(cjts cjts0, ejra ejra0, ejqz ejqz0) {
        super("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        this.a = cjts0;
        this.b = ejra0;
        this.c = ejqz0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                    object0 = (iInterface0 instanceof ejsw) ? ((ejsw)iInterface0) : new ejsw(iBinder0);
                }
                InitRequest initRequest0 = (InitRequest)wbz.a(parcel0, InitRequest.CREATOR);
                ejsx.gr(parcel0);
                ibuq.f(object0, "callbacks");
                ibuq.f(initRequest0, "initRequest");
                ccmq.a().a(bbdg.qS);
                ejrc ejrc0 = new ejrc(this.b, ((ejsw)object0), initRequest0);
                this.a.b(ejrc0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                    object0 = (iInterface1 instanceof ejsw) ? ((ejsw)iInterface1) : new ejsw(iBinder1);
                }
                ExecuteRequest executeRequest0 = (ExecuteRequest)wbz.a(parcel0, ExecuteRequest.CREATOR);
                ejsx.gr(parcel0);
                ibuq.f(object0, "callbacks");
                ibuq.f(executeRequest0, "executeRequest");
                ccmq.a().a(bbdg.qT);
                ejrb ejrb0 = new ejrb(this.c, ((ejsw)object0), executeRequest0);
                this.a.b(ejrb0);
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

