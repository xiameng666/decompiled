import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

public final class bnfo extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bnfo() {
        super("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
    }

    public bnfo(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azuf0.h(true);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bnfn bnfn0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks");
                    bnfn0 = (iInterface0 instanceof bnfn) ? ((bnfn)iInterface0) : new bnfn(iBinder0);
                }
                BrowserRegisterRequestParams browserRegisterRequestParams0 = (BrowserRegisterRequestParams)wbz.a(parcel0, BrowserRegisterRequestParams.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bnfo.gr(parcel0);
                bnfx bnfx0 = new bnfx(bnfn0, browserRegisterRequestParams0, this.a(apiMetadata0));
                this.a.b(bnfx0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks");
                    bnfn0 = (iInterface1 instanceof bnfn) ? ((bnfn)iInterface1) : new bnfn(iBinder1);
                }
                BrowserSignRequestParams browserSignRequestParams0 = (BrowserSignRequestParams)wbz.a(parcel0, BrowserSignRequestParams.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bnfo.gr(parcel0);
                bngb bngb0 = new bngb(bnfn0, browserSignRequestParams0, this.a(apiMetadata1));
                this.a.b(bngb0);
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

