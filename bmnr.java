import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bmnr extends wby implements bmns, cjug {
    private final cjts a;
    private final String b;
    private final azug c;

    public bmnr() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public bmnr(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        this.a = cjts0;
        this.b = s;
        azuf azuf0 = azug.a();
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(s);
        azuf0.c(s1);
        azuf0.h(true);
        this.c = azuf0.a();
    }

    @Override  // bmns
    public final void a(bmnp bmnp0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0) {
        ccmq.a().a(bbdg.ct);
        bllx bllx0 = new bllx(bmnp0, publicKeyCredentialCreationOptions0, this.b, this.c);
        this.a.b(bllx0);
    }

    @Override  // bmns
    public final void b(bmnp bmnp0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0) {
        ccmq.a().a(bbdg.cu);
        blma blma0 = new blma(bmnp0, publicKeyCredentialRequestOptions0, this.b, this.c);
        this.a.b(blma0);
    }

    @Override  // bmns
    public final void c(bmfy bmfy0) {
        ccmq.a().a(bbdg.cv);
        bllu bllu0 = new bllu(bmfy0, this.c);
        this.a.b(bllu0);
    }

    @Override  // bmns
    public final void d(bmfy bmfy0, String s, byte[] arr_b) {
        ccmq.a().a(bbdg.cv);
        bllt bllt0 = new bllt(bmfy0, this.b, s, arr_b, this.c);
        this.a.b(bllt0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bmnp bmnp0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                    bmnp0 = (iInterface0 instanceof bmnp) ? ((bmnp)iInterface0) : new bmnn(iBinder0);
                }
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                bmnr.gr(parcel0);
                this.a(bmnp0, publicKeyCredentialCreationOptions0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                    bmnp0 = (iInterface1 instanceof bmnp) ? ((bmnp)iInterface1) : new bmnn(iBinder1);
                }
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                bmnr.gr(parcel0);
                this.b(bmnp0, publicKeyCredentialRequestOptions0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                    bmnp0 = (iInterface2 instanceof bmfy) ? ((bmfy)iInterface2) : new bmfw(iBinder2);
                }
                bmnr.gr(parcel0);
                this.c(((bmfy)bmnp0));
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                    bmnp0 = (iInterface3 instanceof bmfy) ? ((bmfy)iInterface3) : new bmfw(iBinder3);
                }
                String s = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                bmnr.gr(parcel0);
                this.d(((bmfy)bmnp0), s, arr_b);
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

