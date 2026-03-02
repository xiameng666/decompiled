import android.content.Context;
import com.google.android.gms.wearable.AppTheme;
import java.util.concurrent.atomic.AtomicReference;

public final class fcfw {
    public static final AtomicReference a;
    final ayux b;
    final ayux c;
    final ayux d;
    final ayux e;
    final ayux f;
    public final frli g;

    static {
        fcfw.a = new AtomicReference();
    }

    public fcfw(frli frli0) {
        fdob fdob0 = fdob.b();
        this.b = fdob0.a(fdnu.a);
        this.c = fdob0.a(fdnu.b);
        this.d = fdob0.a(fdnu.c);
        this.e = fdob0.a(fdnu.d);
        this.f = fdob0.a(fdnu.e);
        this.g = frli0;
    }

    public static AppTheme a(fesl fesl0) {
        fcdy fcdy0 = new fcdy();
        fcdy0.a(fesl0.e);
        fcdy0.d(fesl0.d);
        fcdy0.c(fesl0.c);
        fcdy0.b(fesl0.f);
        fcdy0.a.e = fesh.a(fcfw.e(fesl0.g));
        fczo.j(fcdy0);
        return fcdy0.a;
    }

    public static fesl b(AppTheme appTheme0) {
        fesj fesj0;
        fesi fesi0;
        fesg fesg0;
        if(appTheme0.a < 0 || appTheme0.a > 3) {
            appTheme0.a = 0;
        }
        if(appTheme0.b < 0 || appTheme0.b > 2) {
            appTheme0.b = 0;
        }
        if(appTheme0.c < 0 || appTheme0.c > 2) {
            appTheme0.c = 0;
        }
        if(appTheme0.d < 0 || appTheme0.d > 3) {
            appTheme0.d = 0;
        }
        if(appTheme0.e < 0 || appTheme0.e > 1) {
            appTheme0.e = 0;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesl.a).v_newBuilder();
        fesk fesk0 = null;
        switch(appTheme0.a()) {
            case 0: {
                fesg0 = fesg.a;
                break;
            }
            case 1: {
                fesg0 = fesg.b;
                break;
            }
            case 2: {
                fesg0 = fesg.c;
                break;
            }
            case 3: {
                fesg0 = fesg.d;
                break;
            }
            default: {
                fesg0 = null;
            }
        }
        batl.s(fesg0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesl fesl0 = (fesl)hftp0.b_message;
        fesl0.e = fesg0.a();
        fesl0.b |= 4;
        switch(appTheme0.b()) {
            case 0: {
                fesi0 = fesi.a;
                break;
            }
            case 1: {
                fesi0 = fesi.b;
                break;
            }
            case 2: {
                fesi0 = fesi.c;
                break;
            }
            default: {
                fesi0 = null;
            }
        }
        batl.s(fesi0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesl fesl1 = (fesl)hftp0.b_message;
        fesl1.f = fesi0.a();
        fesl1.b |= 8;
        switch(appTheme0.c()) {
            case 0: {
                fesj0 = fesj.a;
                break;
            }
            case 1: {
                fesj0 = fesj.b;
                break;
            }
            case 2: {
                fesj0 = fesj.c;
                break;
            }
            default: {
                fesj0 = null;
            }
        }
        batl.s(fesj0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesl fesl2 = (fesl)hftp0.b_message;
        fesl2.c = fesj0.a();
        fesl2.b |= 1;
        switch(appTheme0.d()) {
            case 0: {
                fesk0 = fesk.a;
                break;
            }
            case 1: {
                fesk0 = fesk.b;
                break;
            }
            case 2: {
                fesk0 = fesk.c;
                break;
            }
            case 3: {
                fesk0 = fesk.d;
            }
        }
        batl.s(fesk0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesl fesl3 = (fesl)hftp0.b_message;
        fesl3.d = fesk0.a();
        fesl3.b |= 2;
        int v = fcfw.e(appTheme0.e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fesl)hftp0.b_message).g = v - 2;
        ((fesl)hftp0.b_message).b |= 16;
        return (fesl)hftp0.N_build();
    }

    public static String c(fdpl fdpl0) {
        return String.format("%s:%s", fdpl0.c, fdpl0.d);
    }

    public static void d(Context context0) {
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("wearable");
        frce0.e("app_theme.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fesy.a));
        frif frif0 = frie0.a();
        AtomicReference atomicReference0 = fcfw.a;
        fcfw fcfw0 = new fcfw(cjtb.a.a(frif0));
        do {
            if(atomicReference0.compareAndSet(null, fcfw0)) {
                return;
            }
        }
        while(atomicReference0.get() == null);
        throw new IllegalStateException("ExperienceService singleton can only be set once.");
    }

    private static int e(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return hzxi.c() ? 3 : 2;
            }
            default: {
                return 2;
            }
        }
    }
}

