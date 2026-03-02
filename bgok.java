import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bgok extends wby implements bgol, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bgok() {
        super("com.google.android.gms.credential.manager.zeroparty.internal.IPasswordCheckupService");
    }

    public bgok(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.credential.manager.zeroparty.internal.IPasswordCheckupService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // bgol
    public final void a(bdic bdic0, CredentialManagerInvocationParams credentialManagerInvocationParams0, int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        bgfw bgfw0 = new bgfw(bdic0, credentialManagerInvocationParams0, v, true, azuf0.a());
        this.a.b(bgfw0);
    }

    @Override  // bgol
    public final void b(bdic bdic0, CredentialManagerInvocationParams credentialManagerInvocationParams0, int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        bgfw bgfw0 = new bgfw(bdic0, credentialManagerInvocationParams0, v, false, azuf0.a());
        this.a.b(bgfw0);
    }

    @Override  // bgol
    public final void c(bdhz bdhz0, CredentialManagerInvocationParams credentialManagerInvocationParams0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        bgja bgja0 = new bgja(bdhz0, credentialManagerInvocationParams0, azuf0.a());
        this.a.b(bgja0);
    }

    @Override  // bgol
    public final void d(bdii bdii0, CredentialManagerInvocationParams credentialManagerInvocationParams0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        bgiz bgiz0 = new bgiz(bdii0, credentialManagerInvocationParams0, azuf0.a());
        this.a.b(bgiz0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bdhz bdhz0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.credential.manager.common.IPasswordCheckupResultCallback");
                    bdhz0 = (iInterface0 instanceof bdhz) ? ((bdhz)iInterface0) : new bdhx(iBinder0);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams0 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bgok.gr(parcel0);
                this.c(bdhz0, credentialManagerInvocationParams0, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.credential.manager.common.IStringCallback");
                    bdhz0 = (iInterface1 instanceof bdii) ? ((bdii)iInterface1) : new bdig(iBinder1);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams1 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bgok.gr(parcel0);
                this.d(((bdii)bdhz0), credentialManagerInvocationParams1, apiMetadata1);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
                    bdhz0 = (iInterface2 instanceof bdic) ? ((bdic)iInterface2) : new bdia(iBinder2);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams2 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                int v1 = parcel0.readInt();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bgok.gr(parcel0);
                this.a(((bdic)bdhz0), credentialManagerInvocationParams2, v1, apiMetadata2);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
                    bdhz0 = (iInterface3 instanceof bdic) ? ((bdic)iInterface3) : new bdia(iBinder3);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams3 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                int v2 = parcel0.readInt();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bgok.gr(parcel0);
                this.b(((bdic)bdhz0), credentialManagerInvocationParams3, v2, apiMetadata3);
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

