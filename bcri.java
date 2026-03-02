import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.logging.Level;

public final class bcri {
    private static final baun a;
    private final TelephonyManager b;
    private final fprw c;
    private final bcqx d;
    private final gqiv e;

    static {
        bcri.a = bcrh.a("phone_formatting_util");
    }

    public bcri(TelephonyManager telephonyManager0, fprw fprw0, bcqx bcqx0, gqiv gqiv0) {
        this.b = telephonyManager0;
        this.c = fprw0;
        this.d = bcqx0;
        this.e = gqiv0;
    }

    public static bcri a(Context context0) {
        Object object0 = context0.getSystemService("phone");
        gftb.check(object0);
        fprw fprw0 = fprw.b();
        gqig.a(context0);
        gqiv gqiv0 = gqiv.e();
        return new bcri(((TelephonyManager)object0), fprw0, bcqx.a(context0), gqiv0);
    }

    public final String b(String s) {
        int v2;
        int v1;
        if(!TextUtils.isEmpty(s) && s.replaceAll("\\D", "").length() >= 6) {
            String s1 = this.e();
            gftb.check(s1);
            int v = 3;
            if(hrfi.k()) {
                try {
                    gqgf gqgf0 = gqgf.a(s1);
                    gqiv gqiv0 = this.e;
                    if(gqiv0.l(gqgf0)) {
                        v1 = gqiv0.a(gqgf0);
                    }
                    else {
                        gqiv.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getCountryCodeForRegion", "Invalid or missing region code (" + gqgf0.eW + ") provided.");
                        v1 = 0;
                    }
                    gqju gqju0 = gqiv0.f(s, gqgf0);
                    if(v1 <= 0 || gqju0.c != v1) {
                        v = 2;
                    }
                    String s2 = gqiv0.q(gqju0, v);
                    return kaj.a().g(s2, kao.a);
                }
                catch(gqim unused_ex) {
                    bcri.a.f("Exception trying to parse phone number", new Object[0]);
                    return s;
                }
                catch(IllegalStateException unused_ex) {
                    bcri.a.f("Failed to parse phone number.", new Object[0]);
                    return s;
                }
            }
            try {
                fprw fprw0 = this.c;
                if(fprw0.j(s1)) {
                    v2 = fprw0.a(s1);
                }
                else {
                    fprw.a.log(Level.WARNING, a.a(s1, "Invalid or missing region code (", ") provided."));
                    v2 = 0;
                }
                fpsb fpsb0 = fprw0.d(s, s1);
                if(v2 <= 0 || fpsb0.b != v2) {
                    v = 2;
                }
                String s3 = fprw0.l(fpsb0, v);
                return kaj.a().g(s3, kao.a);
            }
            catch(fprv unused_ex) {
                bcri.a.f("Exception trying to parse phone number", new Object[0]);
                return s;
            }
            catch(IllegalStateException unused_ex) {
                bcri.a.f("Failed to parse phone number.", new Object[0]);
                return s;
            }
        }
        return s;
    }

    public static String c() {
        String s = Locale.getDefault().getCountry();
        return TextUtils.isEmpty(s) ? null : s.toUpperCase(Locale.ENGLISH);
    }

    final String d(bcrd bcrd0, String s, String s1) {
        fpsb fpsb0;
        gqju gqju0;
        if(!TextUtils.isEmpty(s)) {
            if(hrfi.k()) {
                try {
                    gqju0 = this.e.f(s, gqgf.a(s1));
                    if(gqju0 == null || !this.e.k(gqju0)) {
                        this.d.g(bcrd0, gmfz.F, gmfx.B, s);
                        bcri.a.d("getParsedPhoneNumberi18n(): %s is not a valid phone number for country: %s", new Object[]{s, s1});
                        gqju0 = null;
                        return gqju0 == null ? null : this.e.q(gqju0, 1);
                    }
                    return gqju0 == null ? null : this.e.q(gqju0, 1);
                }
                catch(gqim | IllegalArgumentException exception0) {
                    this.d.e(bcrd0, gmfz.F, exception0);
                    bcri.a.g("Couldn\'t parse number", exception0, new Object[0]);
                }
                catch(IllegalStateException illegalStateException0) {
                    this.d.e(bcrd0, gmfz.F, illegalStateException0);
                    bcri.a.f("Failed to parse phone number.", new Object[0]);
                }
                gqju0 = null;
                return gqju0 == null ? null : this.e.q(gqju0, 1);
            }
            try {
                fpsb0 = this.c.d(s, s1);
                if(!this.c.i(fpsb0)) {
                    this.d.g(bcrd0, gmfz.F, gmfx.B, s);
                    bcri.a.d("getParsedPhoneNumber(): %s is not a valid phone number for country: %s", new Object[]{s, s1});
                    fpsb0 = null;
                    return fpsb0 == null ? null : this.c.l(fpsb0, 1);
                }
                return fpsb0 == null ? null : this.c.l(fpsb0, 1);
            }
            catch(fprv fprv0) {
                this.d.e(bcrd0, gmfz.F, fprv0);
                bcri.a.g("Couldn\'t parse number", fprv0, new Object[0]);
            }
            catch(IllegalStateException illegalStateException1) {
                this.d.e(bcrd0, gmfz.F, illegalStateException1);
                bcri.a.f("Failed to parse phone number.", new Object[0]);
            }
            fpsb0 = null;
            return fpsb0 == null ? null : this.c.l(fpsb0, 1);
        }
        return null;
    }

    final String e() {
        String s = this.b.getSimCountryIso();
        String s1 = TextUtils.isEmpty(s) ? null : s.toUpperCase(Locale.ENGLISH);
        return s1 == null ? bcri.c() : s1;
    }
}

