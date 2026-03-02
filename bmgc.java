import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import j..util.Objects;

public final class bmgc extends wby implements bmgd {
    final bmgg a;
    final bmnu b;

    public bmgc() {
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
    }

    public bmgc(bmfn bmfn0, bmgg bmgg0, bmnu bmnu0) {
        this.a = bmgg0;
        this.b = bmnu0;
        Objects.requireNonNull(bmfn0);
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
    }

    @Override  // bmgd
    public final void a() {
        this.a.a();
    }

    @Override  // bmgd
    public final void b(blyu blyu0, int v) {
        this.a.b(blyu0, v);
    }

    @Override  // bmgd
    public final void c(AuthenticatorErrorResponse authenticatorErrorResponse0) {
        this.a.c(authenticatorErrorResponse0);
        bmnu bmnu0 = this.b;
        if(bmnu0 != null && bmnu0.A()) {
            bmnu0.y("Service disconnected on failure");
        }
    }

    @Override  // bmgd
    public final void d(PublicKeyCredential publicKeyCredential0) {
        this.a.e(publicKeyCredential0);
        bmnu bmnu0 = this.b;
        if(bmnu0 != null && bmnu0.A()) {
            bmnu0.y("Service disconnected on success");
        }
    }

    @Override  // bmgd
    public final void e(String s) {
        this.a.f(s);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        blyu blyu0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                bmgc.gr(parcel0);
                this.e(s);
                return true;
            }
            case 2: {
                AuthenticatorErrorResponse authenticatorErrorResponse0 = (AuthenticatorErrorResponse)wbz.a(parcel0, AuthenticatorErrorResponse.CREATOR);
                bmgc.gr(parcel0);
                this.c(authenticatorErrorResponse0);
                return true;
            }
            case 3: {
                PublicKeyCredential publicKeyCredential0 = (PublicKeyCredential)wbz.a(parcel0, PublicKeyCredential.CREATOR);
                bmgc.gr(parcel0);
                this.d(publicKeyCredential0);
                return true;
            }
            case 4: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    blyu0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
                    blyu0 = (iInterface0 instanceof blyu) ? ((blyu)iInterface0) : new blys(iBinder0);
                }
                int v1 = parcel0.readInt();
                bmgc.gr(parcel0);
                this.b(blyu0, v1);
                return true;
            }
            case 5: {
                this.a();
                return true;
            }
            case 6: {
                this.a.d();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

