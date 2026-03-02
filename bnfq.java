import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

public final class bnfq extends wby implements IInterface, cjug {
    private final cjts a;
    private final azug b;

    public bnfq() {
        super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public bnfq(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        this.a = cjts0;
        azuf azuf0 = azug.a();
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(s);
        azuf0.c(s1);
        azuf0.h(true);
        this.b = azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bnfp bnfp0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
                    bnfp0 = (iInterface0 instanceof bnfp) ? ((bnfp)iInterface0) : new bnfp(iBinder0);
                }
                RegisterRequestParams registerRequestParams0 = (RegisterRequestParams)wbz.a(parcel0, RegisterRequestParams.CREATOR);
                bnfq.gr(parcel0);
                bnfw bnfw0 = new bnfw(bnfp0, registerRequestParams0, this.b);
                this.a.b(bnfw0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
                    bnfp0 = (iInterface1 instanceof bnfp) ? ((bnfp)iInterface1) : new bnfp(iBinder1);
                }
                SignRequestParams signRequestParams0 = (SignRequestParams)wbz.a(parcel0, SignRequestParams.CREATOR);
                bnfq.gr(parcel0);
                bnga bnga0 = new bnga(bnfp0, signRequestParams0, this.b);
                this.a.b(bnga0);
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

