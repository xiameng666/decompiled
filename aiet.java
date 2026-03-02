import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import com.google.android.gms.chimera.modules.auth.api.signin.AppContextProvider;
import com.google.android.gms.common.api.Scope;

public final class aiet extends wby implements aieu, cjug {
    public final String a;
    public final bxod b;
    private final Context c;
    private final String d;
    private final cjts e;

    public aiet() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public aiet(Context context0, String s, Scope[] arr_scope, eppt eppt0, cjts cjts0, bxod bxod0) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInService");
        this.c = context0;
        batl.q(s);
        this.d = s;
        this.e = cjts0;
        String s1 = eppt0.g;
        this.a = s1 == null ? bxol.a() : s1;
        this.b = bxod0;
        bxod0.a(bxtq.a(s, arr_scope, eppt0));
        SignInChimeraService.a.d("Log Session ID: " + this.a, new Object[0]);
    }

    @Override  // aieu
    public final void a(aier aier0, GoogleSignInOptions googleSignInOptions0) {
        ccmq.a().a(bbdg.ix);
        aidx aidx0 = new aidx(googleSignInOptions0);
        aidx0.b = this.a;
        GoogleSignInOptions googleSignInOptions1 = aidx0.a();
        AppContextProvider appContextProvider0 = AppContextProvider.c;
        Context context0 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
        bbey bbey0 = new bbey(context0, hyeo.a.b().c(), hyeo.a.b().b(), false, null, null, 0x1005);
        aiez aiez0 = new aiez(aier0, googleSignInOptions1, this.d, bbey0);
        this.e.b(aiez0);
    }

    @Override  // aieu
    public final void b(aier aier0, GoogleSignInOptions googleSignInOptions0) {
        ccmq.a().a(bbdg.iw);
        aifa aifa0 = new aifa(aier0, this.d);
        this.e.b(aifa0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aier aier0 = null;
        switch(v) {
            case 101: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    aier0 = (iInterface0 instanceof aier) ? ((aier)iInterface0) : new aiep(iBinder0);
                }
                GoogleSignInOptions googleSignInOptions0 = (GoogleSignInOptions)wbz.a(parcel0, GoogleSignInOptions.CREATOR);
                aiet.gr(parcel0);
                ccmq.a().a(bbdg.iv);
                aidx aidx0 = new aidx(googleSignInOptions0);
                aidx0.b = this.a;
                GoogleSignInOptions googleSignInOptions1 = aidx0.a();
                aiff aiff0 = new aiff(aier0, this.c, googleSignInOptions1, this.d);
                this.e.b(aiff0);
                break;
            }
            case 102: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    aier0 = (iInterface1 instanceof aier) ? ((aier)iInterface1) : new aiep(iBinder1);
                }
                GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions)wbz.a(parcel0, GoogleSignInOptions.CREATOR);
                aiet.gr(parcel0);
                this.b(aier0, googleSignInOptions2);
                break;
            }
            case 103: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    aier0 = (iInterface2 instanceof aier) ? ((aier)iInterface2) : new aiep(iBinder2);
                }
                GoogleSignInOptions googleSignInOptions3 = (GoogleSignInOptions)wbz.a(parcel0, GoogleSignInOptions.CREATOR);
                aiet.gr(parcel0);
                this.a(aier0, googleSignInOptions3);
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

