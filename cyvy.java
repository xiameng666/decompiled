import android.content.Context;

public final class cyvy {
    public final cjpc a;

    public cyvy(Context context0) {
        cjpc cjpc0 = cygf.a(context0);
        super();
        this.a = cjpc0;
    }

    public final boolean a() {
        return this.d() == 2;
    }

    public static boolean b(Context context0) {
        return new cyvy(context0).a();
    }

    public static boolean c(Context context0) {
        return new cyvy(context0).e();
    }

    public final int d() {
        switch(cjpd.c(this.a, "HAS_WATCH_PAIRED", "UNKNOWN")) {
            case "NO": {
                return 3;
            }
            case "UNKNOWN": {
                return 1;
            }
            case "YES": {
                return 2;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public final boolean e() {
        return cjpd.i(this.a, "IS_TRIANGLE_STATE", false);
    }

    public final void f(boolean z) {
        cjpa cjpa0 = this.a.c();
        cjpa0.h("HAS_WATCH_PAIRED", (z ? "YES" : "NO"));
        cygf.b(cjpa0);
    }
}

