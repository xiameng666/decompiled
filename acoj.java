import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class acoj extends acou implements cjug {
    private static final baun a;
    private final String b;
    private final Context c;
    private final cjts d;
    private final String e;
    private final ccmg f;

    static {
        acoj.a = bcrh.a("asterism-api-stub");
    }

    public acoj(Context context0, cjts cjts0, String s, String s1) {
        this.b = s1;
        this.c = context0;
        this.d = cjts0;
        this.e = s;
        this.f = new ccmp();
    }

    @Override  // acov
    public final void a(acoy acoy0, GetAsterismConsentRequest getAsterismConsentRequest0, ApiMetadata apiMetadata0) {
        acoj.a.d("getAsterismConsent()", new Object[0]);
        this.f.a(bbdg.ec);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aK);
        azuf0.g(bbdq.G);
        azuf0.d(this.e);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        if(!this.e()) {
            try {
                acoy0.a(new Status(34501), acod.a(getAsterismConsentRequest0.a, 0, "", "", 0), cckf.c(azug0));
            }
            catch(RemoteException remoteException0) {
                acoj.a.n("Remote exception: ", remoteException0, new Object[0]);
            }
            catch(IllegalStateException illegalStateException0) {
                acoj.a.n("Illegal state: ", illegalStateException0, new Object[0]);
            }
            return;
        }
        acol acol0 = new acol(this.c, acoy0, getAsterismConsentRequest0, azug0);
        this.d.b(acol0);
    }

    @Override  // acov
    public final void c(acoy acoy0, ApiMetadata apiMetadata0) {
        acoj.a.d("getIsPnvrConstellationDevice()", new Object[0]);
        this.f.a(bbdg.ef);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aK);
        azuf0.g(bbdq.G);
        azuf0.d(this.e);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        if(!this.e()) {
            try {
                acoy0.d(new Status(34501), false, cckf.c(azug0));
            }
            catch(RemoteException remoteException0) {
                acoj.a.n("Remote exception: ", remoteException0, new Object[0]);
            }
            catch(IllegalStateException illegalStateException0) {
                acoj.a.n("Illegal state: ", illegalStateException0, new Object[0]);
            }
            return;
        }
        acom acom0 = new acom(this.c, acoy0, azug0);
        this.d.b(acom0);
    }

    @Override  // acov
    public final void d(acoy acoy0, SetAsterismConsentRequest setAsterismConsentRequest0, ApiMetadata apiMetadata0) {
        acoj.a.d("setAsterismConsent()", new Object[0]);
        this.f.a(bbdg.ed);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aK);
        azuf0.g(bbdq.G);
        azuf0.d(this.e);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        if(!this.e()) {
            try {
                SetAsterismConsentResponse setAsterismConsentResponse0 = new SetAsterismConsentResponse(setAsterismConsentRequest0.a, "", "");
                acoy0.c(new Status(34501), setAsterismConsentResponse0, cckf.c(azug0));
            }
            catch(RemoteException remoteException0) {
                acoj.a.n("Remote exception: ", remoteException0, new Object[0]);
            }
            return;
        }
        acor acor0 = new acor(this.c, acoy0, setAsterismConsentRequest0, azug0);
        this.d.b(acor0);
    }

    private final boolean e() {
        Context context0 = this.c;
        if(!bbmq.Y(context0)) {
            azql azql0 = azql.c(context0.getApplicationContext());
            String s = this.e;
            if(!azql0.g(s)) {
                acoj.a.d("%s is not a 1P app.", new Object[]{s});
                return false;
            }
            for(Object object0: gfud.e(',').n(hrcv.c())) {
                if(!((String)object0).equals(s)) {
                    continue;
                }
                return true;
            }
            acoj.a.d("%s is not allowed to call this API.", new Object[]{s});
            return false;
        }
        return true;
    }
}

