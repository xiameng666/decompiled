import android.content.Context;
import android.text.TextUtils;

public final class aiaw {
    private static final bboh a;
    private final Context b;

    static {
        aiaw.a = bboh.b("AutofillPreferences", bbcu.cD);
    }

    public aiaw(Context context0) {
        gftb.check(context0);
        this.b = context0;
    }

    public final int a() {
        boolean z = this.k();
        if(this.c() == null) {
            return 0;
        }
        return z ? 1 : 2;
    }

    public final int b() {
        return cjpd.a(this.l(), "autofill_consent_ack_times", 0);
    }

    final String c() {
        return cjpd.c(this.l(), "autofill_certificate_hash", null);
    }

    final String d() {
        return cjpd.c(this.l(), "autofill_package_name", null);
    }

    public final void e() {
        String s = aicl.b(this.b);
        String s1 = aicl.a(this.b);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ((ggtj)aiaw.a.h()).x("denyPermission");
            this.i(s);
            this.g(s1);
            this.j(false);
            return;
        }
        ((ggtj)aiaw.a.h()).x("Current autofill package name or hash is invalid. Clean permission istead of denying.");
        this.m();
    }

    public final void f() {
        String s = aicl.b(this.b);
        String s1 = aicl.a(this.b);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ((ggtj)aiaw.a.h()).x("grantPermission");
            this.i(s);
            this.g(s1);
            this.j(true);
            return;
        }
        ((ggtj)aiaw.a.h()).x("Current autofill package name or hash is invalid. Clean permission istead of granting.");
        this.m();
    }

    final void g(String s) {
        cjpa cjpa0 = this.l().c();
        cjpa0.h("autofill_certificate_hash", s);
        cjpd.g(cjpa0);
    }

    public final void h(int v) {
        cjpa cjpa0 = this.l().c();
        cjpa0.f("autofill_consent_ack_times", v);
        cjpd.g(cjpa0);
    }

    final void i(String s) {
        cjpa cjpa0 = this.l().c();
        cjpa0.h("autofill_package_name", s);
        cjpd.g(cjpa0);
    }

    final void j(boolean z) {
        cjpa cjpa0 = this.l().c();
        cjpa0.e("autofill_permission_state", z);
        cjpd.g(cjpa0);
    }

    public final boolean k() {
        String s = this.d();
        Context context0 = this.b;
        String s1 = aicl.b(context0);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && gfqz.e(s, s1)) {
            String s2 = this.c();
            String s3 = aicl.a(context0);
            if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3) && gfqz.e(s2, s3)) {
                return cjpd.i(this.l(), "autofill_permission_state", false);
            }
        }
        ((ggtj)aiaw.a.h()).x("The stored preference is not current autofill service. Clean permission.");
        this.m();
        return false;
    }

    private final cjpc l() {
        return cjqh.a(this.b, "auth_api_phone", "sms_retriever_shared_pref", 4);
    }

    private final void m() {
        ((ggtj)aiaw.a.h()).x("cleanPermission");
        if(!TextUtils.isEmpty(this.d())) {
            this.h(0);
        }
        this.i(null);
        this.g(null);
        this.j(false);
    }
}

