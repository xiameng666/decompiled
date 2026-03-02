import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class fxiy extends fxpb {
    static {
        bboh.c("EAlert", bbcu.g, "SetRCL");
    }

    public fxiy(Context context0, ggfp ggfp0, fxnw fxnw0) {
        super(context0, fxnw0, huqb.u(), ggfp0);
    }

    @Override  // fxpb
    public final int a() {
        int v = 1;
        if(fxmj.g() && huqb.F()) {
            if(!huqj.c() && !huqb.J() && !fxiy.j(this.a)) {
                v = 3;
            }
            else {
                Context context0 = this.a;
                if(cjmf.b(context0, "android.permission.ACCESS_COARSE_LOCATION") == -1) {
                    v = 2;
                }
                else {
                    v = !huqb.a.s().aA() || !fxiy.i(context0) ? super.a() : 9;
                }
            }
        }
        if(v != 0) {
            fxmj.d(this.a, v);
        }
        return v;
    }

    @Override  // fxpb
    protected final int c() {
        int v = this.e();
        if(v != 0) {
            fxmj.d(this.a, v);
        }
        return v;
    }

    @Override  // fxpb
    public final boolean d(String s) {
        return false;
    }

    private final int e() {
        Boolean boolean0;
        try {
            boolean z = true;
            boolean0 = (Boolean)((glyq)fxme.a().c()).v(2L, TimeUnit.SECONDS);
            if(huqb.x()) {
                if(!boolean0.booleanValue() && !((Boolean)((glyq)fxlu.a().b()).v(2L, TimeUnit.SECONDS)).booleanValue()) {
                    z = false;
                }
                return z ? super.c() : 10;
            }
        }
        catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
            return 12;
        }
        return boolean0.booleanValue() ? super.c() : 10;
    }
}

