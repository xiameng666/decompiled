import android.content.res.Resources;
import java.text.Collator;

public final class beqd {
    public static final bboh a;
    public static final ggfp b;

    static {
        beqd.a = bboh.b("PasswordCheckupResultFactory", bbcu.cX);
        beqd.b = ggog.c(graz.b, new graz[]{graz.d, graz.c});
    }

    public static bedh a(grax grax0) {
        gged_interceptors gged0 = bedl.a(grax0.c);
        gqmc gqmc0 = new gqmc(null);
        gqmc0.b(gged0);
        gqmc0.e(grax0.f);
        gqmc0.c(grax0.e);
        return new bedh(gqmc0.a(), (grax0.d == null ? hhyo.a : grax0.d));
    }

    public static String b(graz graz0, Resources resources0, int v) {
        switch(graz0.ordinal()) {
            case 1: {
                return resources0.getQuantityString(0x7F130060, v, new Object[]{v});  // plurals:pwm_password_breach_education_title
            }
            case 2: {
                return "Create strong passwords";
            }
            case 3: {
                return "Create unique passwords";
            }
            default: {
                throw new IllegalStateException("Unsupported checkup issue type " + graz0.e);
            }
        }
    }

    public static boolean c(bede bede0) {
        return bede0.c.i() && ((bedh)bede0.c.d()).a.f();
    }

    public static boolean d(bede bede0) {
        return bede0.a == bedd.a;
    }

    public static final gged_interceptors e(gged_interceptors gged0) {
        Collator collator0 = Collator.getInstance(bgmp.b());
        collator0.setStrength(0);
        return ggch.j(gged0).i(new beqa()).o(new beqb(collator0));
    }
}

