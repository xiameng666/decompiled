import android.content.Context;

public final class fxgs extends fxpb {
    static {
        bboh.c("EQMon", bbcu.g, "SetRCL");
    }

    public fxgs(Context context0, ggfp ggfp0, fxnw fxnw0) {
        super(context0, fxnw0, false, ggfp0);
    }

    @Override  // fxpb
    public final int a() {
        Context context0 = this.a;
        if(!fxgs.e(context0)) {
            return 1;
        }
        if(!fxgs.j(context0)) {
            return 3;
        }
        if(cjmf.b(context0, "android.permission.ACCESS_FINE_LOCATION") == -1) {
            return 2;
        }
        if(huwd.B() && bbmn.h(context0, "com.google.android.gms").isEmpty()) {
            return 7;
        }
        return fxgs.i(context0) ? 9 : super.a();
    }

    @Override  // fxpb
    protected final int c() {
        return cjer_LocationSettings.m(this.a) ? 6 : super.c();
    }

    @Override  // fxpb
    public final boolean d(String s) {
        return huwd.B() && s.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
    }

    public static boolean e(Context context0) {
        huwd huwd0 = huwd.a;
        if(huwd0.n().aK()) {
            if(!bbnp.k(context0)) {
                return false;
            }
            if(bbnp.i(context0)) {
                return false;
            }
            return bbnp.j(context0) ? false : huwd0.n().at();
        }
        return huwd0.n().at();
    }
}

