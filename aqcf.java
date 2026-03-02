import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.service.autofill.FillRequest;
import android.view.inputmethod.InlineSuggestionsRequest;

public final class aqcf {
    public static int a() {
        int v = (int)hqal.d();
        return v >= 0 ? v : 3;
    }

    public static CharSequence b(Context context0) {
        return context0.getText(0x7F1503D0);  // string:autofill_generate_strong_password "Suggest strong password"
    }

    public static boolean c() {
        return hqal.i();
    }

    public static boolean d() {
        return bbqa.c() && hqcl.e();
    }

    public static boolean e(FillRequest fillRequest0, ComponentName componentName0) {
        boolean z = hqdj.g();
        InlineSuggestionsRequest inlineSuggestionsRequest0 = fillRequest0.getInlineSuggestionsRequest();
        if(z && (inlineSuggestionsRequest0 != null && ((long)inlineSuggestionsRequest0.getMaxSuggestionCount()) > hqdj.b())) {
            if(!gfta.c(hqdj.d())) {
                String[] arr_s = hqdj.d().split("\\|");
                for(int v = 0; v < arr_s.length; ++v) {
                    if(gfqz.e(arr_s[v], inlineSuggestionsRequest0.getHostPackageName())) {
                        return false;
                    }
                }
            }
            if(!gfta.c(hqdj.e())) {
                String[] arr_s1 = hqdj.e().split("\\|");
                for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                    String s = arr_s1[v1];
                    if(gfqz.e(s, componentName0.getPackageName())) {
                        return false;
                    }
                    if(gfqz.e(s, componentName0.getClassName())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean f() {
        return hqdz.d();
    }

    public static boolean g() {
        return hqec.f();
    }

    public static boolean h() {
        return bbqa.d() && hqei.c();
    }

    public static boolean i() {
        return bbqa.a() && hqbf.a.b().v();
    }

    public static boolean j(Account account0) {
        if(account0 != null && fppj.a(account0.type)) {
            fppj fppj0 = new fppj(account0);
            return htcw.a.b().f(fppj0);
        }
        return false;
    }

    public static boolean k(gfsx gfsx0) {
        return gfsx0.i() ? aqcf.j(((Account)gfsx0.d())) : false;
    }

    public static boolean l(Context context0) {
        return hqal.a.g().H() && bbqa.a() && sku.a(context0);
    }

    public static boolean m(Context context0) {
        return hqal.a.g().I() && bbqa.a() && gaec.t(context0);
    }
}

