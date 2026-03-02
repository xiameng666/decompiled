import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bmnj extends wby implements bmnk, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bmnj() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public bmnj(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        this.c = s1;
        this.a = cjts0;
        this.b = s;
    }

    @Override  // bmnk
    public final void a(bmnh bmnh0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cp);
        azug azug0 = this.c(apiMetadata0);
        blih blih0 = new blih(bmnh0, browserPublicKeyCredentialRequestOptions0, this.b, azug0);
        this.a.b(blih0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azuf0.h(false);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bmnh bmnh0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                    bmnh0 = (iInterface0 instanceof bmnh) ? ((bmnh)iInterface0) : new bmnf(iBinder0);
                }
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0 = (BrowserPublicKeyCredentialCreationOptions)wbz.a(parcel0, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnj.gr(parcel0);
                ccmq.a().a(bbdg.co);
                azug azug0 = this.c(apiMetadata0);
                blie blie0 = new blie(bmnh0, browserPublicKeyCredentialCreationOptions0, this.b, azug0);
                this.a.b(blie0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                    bmnh0 = (iInterface1 instanceof bmnh) ? ((bmnh)iInterface1) : new bmnf(iBinder1);
                }
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0 = (BrowserPublicKeyCredentialRequestOptions)wbz.a(parcel0, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnj.gr(parcel0);
                this.a(bmnh0, browserPublicKeyCredentialRequestOptions0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                    bmnh0 = (iInterface2 instanceof bmfy) ? ((bmfy)iInterface2) : new bmfw(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnj.gr(parcel0);
                ccmq.a().a(bbdg.cq);
                blhz blhz0 = new blhz(((bmfy)bmnh0), this.c(apiMetadata2));
                this.a.b(blhz0);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
                    bmnh0 = (iInterface3 instanceof bmga) ? ((bmga)iInterface3) : new bmga(iBinder3);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnj.gr(parcel0);
                ccmq.a().a(bbdg.cr);
                blib blib0 = new blib(((bmga)bmnh0), s, this.c(apiMetadata3));
                this.a.b(blib0);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                    bmnh0 = (iInterface4 instanceof bmnh) ? ((bmnh)iInterface4) : new bmnf(iBinder4);
                }
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions1 = (BrowserPublicKeyCredentialRequestOptions)wbz.a(parcel0, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnj.gr(parcel0);
                ccmq.a().a(bbdg.cs);
                blii blii0 = new blii(bmnh0, browserPublicKeyCredentialRequestOptions1, this.c(apiMetadata4));
                this.a.b(blii0);
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

