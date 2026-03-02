import android.content.Context;
import android.text.TextUtils;

public final class aiax {
    private static final bboh a;
    private final Context b;

    static {
        aiax.a = bboh.a("BrowserPreferences");
    }

    public aiax(Context context0) {
        gftb.check(context0);
        this.b = context0;
    }

    public final int a() {
        boolean z = this.h();
        if(this.b() == null) {
            return 0;
        }
        return z ? 1 : 2;
    }

    final String b() {
        return cjpd.c(this.i(), "browser_certificate_hash", null);
    }

    public final void c() {
        String s = aicm.b(this.b);
        String s1 = aicm.a(this.b);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ((ggtj)aiax.a.h()).x("denyPermission");
            this.f(s);
            this.e(s1);
            this.g(false);
            return;
        }
        ((ggtj)aiax.a.h()).x("Current browser package name or hash is invalid. Clean permission istead of denying.");
        this.j();
    }

    public final void d() {
        String s = aicm.b(this.b);
        String s1 = aicm.a(this.b);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ((ggtj)aiax.a.h()).x("grantPermission");
            this.f(s);
            this.e(s1);
            this.g(true);
            return;
        }
        ((ggtj)aiax.a.h()).x("Current browser package name or hash is invalid. Clean permission istead of granting.");
        this.j();
    }

    final void e(String s) {
        cjpa cjpa0 = this.i().c();
        cjpa0.h("browser_certificate_hash", s);
        cjpd.g(cjpa0);
    }

    final void f(String s) {
        cjpa cjpa0 = this.i().c();
        cjpa0.h("browser_package_name", s);
        cjpd.g(cjpa0);
    }

    final void g(boolean z) {
        cjpa cjpa0 = this.i().c();
        cjpa0.e("browser_permission_state", z);
        cjpd.g(cjpa0);
    }

    public final boolean h() {
        String s = cjpd.c(this.i(), "browser_package_name", null);
        Context context0 = this.b;
        String s1 = aicm.b(context0);
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && gfqz.e(s, s1)) {
            String s2 = this.b();
            String s3 = aicm.a(context0);
            if(TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) || !gfqz.e(s2, s3)) {
                goto label_7;
            }
            return cjpd.i(this.i(), "browser_permission_state", false);
        }
    label_7:
        String s4 = aicm.b(context0);
        if(!TextUtils.isEmpty(s4) && !s4.equals("android") && new barf(s4).b() && hpqd.a.b().a().b.contains(s4)) {
            this.d();
            return cjpd.i(this.i(), "browser_permission_state", false);
        }
        this.j();
        return false;
    }

    private final cjpc i() {
        return cjqh.a(this.b, "auth_api_phone", "sms_retriever_shared_pref", 4);
    }

    private final void j() {
        ((ggtj)aiax.a.h()).x("cleanPermission");
        this.f(null);
        this.e(null);
        this.g(false);
    }
}

