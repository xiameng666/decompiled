import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class beck extends wby implements becl, cjug {
    public final bgft a;
    public final Lazy b;
    public final Context c;
    private final String d;
    private final String e;
    private final cjts f;
    private final ibnn g;

    public beck() {
        super("com.google.android.gms.credential.manager.firstparty.internal.ICredentialManagerService");
    }

    @AssistedInject
    public beck(@Assisted("callingPackage") String s, @Assisted("attributionTag") String s1, bgft bgft0, Lazy lazy0, Context context0, @Assisted cjts cjts0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(lazy0, "smsOtpListenerProvider");
        super("com.google.android.gms.credential.manager.firstparty.internal.ICredentialManagerService");
        this.d = s;
        this.e = s1;
        this.a = bgft0;
        this.b = lazy0;
        this.c = context0;
        this.f = cjts0;
        this.g = new ibnz(new bgff(this));
    }

    @Override  // becl
    public final void a(bdic bdic0, CredentialManagerInvocationParams credentialManagerInvocationParams0, ApiMetadata apiMetadata0) {
        ibuq.f(bdic0, "callback");
        ibuq.f(credentialManagerInvocationParams0, "invocationParams");
        bgfv bgfv0 = new bgfv(bdic0, credentialManagerInvocationParams0, this.e(apiMetadata0));
        this.f.b(bgfv0);
    }

    @Override  // becl
    public final void b(bdif bdif0, String s, ApiMetadata apiMetadata0) {
        ibuq.f(bdif0, "callback");
        ibuq.f(s, "settingName");
        bgfx bgfx0 = new bgfx(this.f(), bdif0, s, this.e(apiMetadata0));
        this.f.b(bgfx0);
    }

    @Override  // becl
    public final void c(bdhv bdhv0, ApiMetadata apiMetadata0) {
        ibuq.f(bdhv0, "callback");
        azug azug0 = this.e(apiMetadata0);
        bgfg bgfg0 = new bgfg(this, bdhv0, null);
        cjul.a(this.f, 0xC4, "isBiometricReauthBeforeAutofillingRequired", azug0, bgfg0);
    }

    @Override  // becl
    public final void d(azxs azxs0, boolean z, ApiMetadata apiMetadata0) {
        ibuq.f(azxs0, "callback");
        azug azug0 = this.e(apiMetadata0);
        bgfi bgfi0 = new bgfi(this, z, azxs0, null);
        cjul.a(this.f, 0xC4, "setIsReauthBeforeAutofillingRequired", azug0, bgfi0);
    }

    private final azug e(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.d);
        azuf0.c(this.e);
        return azuf0.a();
    }

    private final bdyr f() {
        return (bdyr)this.g.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        bdic bdic0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
                    bdic0 = (iInterface0 instanceof bdic) ? ((bdic)iInterface0) : new bdia(iBinder0);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams0 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                this.a(bdic0, credentialManagerInvocationParams0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.credential.manager.common.ISettingsCallback");
                    bdic0 = (iInterface1 instanceof bdif) ? ((bdif)iInterface1) : new bdid(iBinder1);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                this.b(((bdif)bdic0), s, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bdic0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                String s1 = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                ibuq.f(bdic0, "callback");
                ibuq.f(s1, "settingName");
                ibuq.f(arr_b, "settingValue");
                bgfz bgfz0 = new bgfz(this.f(), ((azxs)bdic0), s1, arr_b, this.e(apiMetadata2));
                this.f.b(bgfz0);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.credential.manager.common.IBooleanCallback");
                    bdic0 = (iInterface3 instanceof bdhv) ? ((bdhv)iInterface3) : new bdht(iBinder3);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                this.c(((bdhv)bdic0), apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bdic0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                this.d(((azxs)bdic0), z, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.credential.manager.common.IStringCallback");
                    object0 = (iInterface5 instanceof bdii) ? ((bdii)iInterface5) : new bdig(iBinder5);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                beck.gr(parcel0);
                ibuq.f(object0, "callback");
                azug azug0 = this.e(apiMetadata5);
                bgfh bgfh0 = new bgfh(this, ((bdii)object0), null);
                cjul.a(this.f, 0xC4, "retrieveSmsOtp", azug0, bgfh0);
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

