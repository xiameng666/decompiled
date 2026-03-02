import android.content.Context;
import android.os.Build;
import j..util.Collection.-EL;
import java.util.Arrays;

public final class aqbq {
    public static int a(gfsx gfsx0, boolean z, Context context0) {
        if(z) {
            return aqbq.g(context0);
        }
        return gfsx0.i() ? aqbq.h(context0, ((aong)gfsx0.d()).c) : 0;
    }

    public static int b(Context context0, boolean z, ggfp ggfp0, gfsx gfsx0) {
        if(z && !ggfp0.isEmpty()) {
            if(ggfp0.size() <= 1) {
                aolo aolo0 = (aolo)Collection.-EL.stream(ggfp0).findFirst().get();
                return !gfsx0.i() || ((aong)gfsx0.d()).c == aolo0 ? aqbq.h(context0, aolo0) : 0;
            }
            return 0;
        }
        return aqbq.h(context0, ((aolo)gfsx0.n().map(new aqbo()).orElse(aolo.a)));
    }

    public static int c(gfsx gfsx0, boolean z, boolean z1) {
        if(z && z1) {
            return 0x7F150407;  // string:autofill_password_manager_title "Google Password Manager"
        }
        if(!gfsx0.i()) {
            return 0;
        }
        switch(((aong)gfsx0.d()).c.ordinal()) {
            case 2: {
                return 0x7F150407;  // string:autofill_password_manager_title "Google Password Manager"
            }
            case 3: {
                return 0x7F15083B;  // string:common_google_pay_icon_with_text_content_description "Google Pay"
            }
            default: {
                return 0;
            }
        }
    }

    public static boolean d(gged_interceptors gged0) {
        gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(gged0).filter(new aqbi()).collect(ggaf.a);
        return gged1.isEmpty() ? Collection.-EL.stream(gged0).filter(new aqbk()).anyMatch(new aqbj()) : Collection.-EL.stream(gged1).anyMatch(new aqbj());
    }

    public static boolean e(amlq amlq0) {
        return Collection.-EL.stream(amlq0.c.v()).anyMatch(new aqbm()) || Collection.-EL.stream(amlq0.d.v()).anyMatch(new aqbn());
    }

    public static boolean f() {
        return Arrays.asList(hqal.a.g().z().split("\\|")).contains(Build.MANUFACTURER);
    }

    private static int g(Context context0) {
        if(aqbq.f()) {
            return 0x7F08047C;  // drawable:google_password_manager_for_samsung_branding
        }
        return apht.b(context0) ? 0x7F0808BB : 0x7F0808BA;  // drawable:lockup_ic_google_password_manager_vertical_logo_text_dark
    }

    private static int h(Context context0, aolo aolo0) {
        switch(aolo0.ordinal()) {
            case 2: {
                return aqbq.g(context0);
            }
            case 3: {
                if(aqbq.f()) {
                    return 0;
                }
                return apht.b(context0) ? 0x7F0804A0 : 0x7F08049D;  // drawable:googlepay_logo_dark
            }
            default: {
                return 0;
            }
        }
    }
}

