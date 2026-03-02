import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.view.autofill.AutofillManager;

public final class aicl {
    private static final bboh a;

    static {
        aicl.a = bboh.b("AutofillUtils", bbcu.cD);
    }

    public static String a(Context context0) {
        gftb.check(context0);
        if(aicl.d(context0) && aicl.c(context0)) {
            String s = aicl.b(context0);
            if(s == null) {
                ((ggtj)aicl.a.h()).x("Autofill service package name is null. Ignore getting certificate.");
                return null;
            }
            return aicl.g(context0, s);
        }
        ((ggtj)aicl.a.h()).x("Ignore getting hash since autofill is not supported or enabled.");
        return null;
    }

    public static String b(Context context0) {
        gftb.check(context0);
        if(aicl.d(context0) && aicl.c(context0)) {
            ComponentName componentName0 = ((AutofillManager)context0.getSystemService(AutofillManager.class)).getAutofillServiceComponentName();
            if(componentName0 == null) {
                ((ggtj)aicl.a.h()).x("autofill componentName is null.");
                return null;
            }
            return componentName0.getPackageName();
        }
        ((ggtj)aicl.a.h()).x("Ignore getting package name since autofill is not supported or enabled.");
        return null;
    }

    public static boolean c(Context context0) {
        gftb.check(context0);
        AutofillManager autofillManager0 = (AutofillManager)context0.getSystemService(AutofillManager.class);
        return autofillManager0 != null && autofillManager0.getAutofillServiceComponentName() != null;
    }

    public static boolean d(Context context0) {
        gftb.check(context0);
        AutofillManager autofillManager0 = (AutofillManager)context0.getSystemService(AutofillManager.class);
        return autofillManager0 == null ? false : autofillManager0.isAutofillSupported();
    }

    public static boolean e(Context context0, String s) {
        gftb.check(context0);
        gftb.check(s);
        if(aicl.d(context0) && aicl.c(context0)) {
            String s1 = aicl.b(context0);
            if(TextUtils.isEmpty(s) || TextUtils.isEmpty(s1)) {
                ((ggtj)aicl.a.h()).x("The package name of given package or autofill service is invalid. Ignore the checking.");
            }
            else if(gfqz.e(s, s1)) {
                String s2 = aicl.g(context0, s);
                String s3 = aicl.a(context0);
                if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
                    return gfqz.e(s2, s3);
                }
                ((ggtj)aicl.a.h()).x("The certificate of given package or autofill service is invalid. Ignore the checking.");
                return false;
            }
        }
        return false;
    }

    public static boolean f(String s) {
        gftb.check(s);
        return new barf(s).b() ? hppz.a.b().b().b.contains(s) : false;
    }

    private static String g(Context context0, String s) {
        try {
            return bbmq.v(context0, s, "SHA-256");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggtj)aicl.a.h()).x("Cannot find the package info for given package name.");
            return null;
        }
    }
}

