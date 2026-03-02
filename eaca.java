import android.content.Context;
import android.content.Intent;

public final class eaca {
    public static final bboh a;
    public final dokz b;
    public final acp c;
    private final boolean d;

    static {
        eaca.a = bboh.b("Pay", bbcu.cZ);
    }

    public eaca(dokz dokz0, boolean z) {
        this.b = dokz0;
        this.d = z;
        this.c = dokz0.registerForActivityResult(new adt(), new eabo(this));
    }

    public static Intent a(eagu eagu0, Context context0, gfsx gfsx0, boolean z) {
        if(!eagu0.n && eagu0.e.size() > 1) {
            return dlnf.I(context0, eagu0, gfsx0, z);
        }
        if(z) {
            return dlnf.ah(context0, eagu0, gfsx0, true);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dzaz.a).v_newBuilder();
        dzbc dzbc0 = dzbc.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dzaz dzaz0 = (dzaz)hftp0.b_message;
        dzaz0.c = dzbc0.a();
        return dlnf.aR(context0, ((dzaz)hftp0.N_build()), gfsx0, gfsx.m(eagu0));
    }

    public static Intent b(eagu eagu0, Context context0, gfsx gfsx0, boolean z) {
        switch((eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)).ordinal()) {
            case 3: {
                return eaca.c(eagu0, context0, 1, gfsx0, z);
            }
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                return eaca.c(eagu0, context0, 2, gfsx0, z);
            }
            default: {
                return eaca.c(eagu0, context0, 0, gfsx0, z);
            }
        }
    }

    public static Intent c(eagu eagu0, Context context0, int v, gfsx gfsx0, boolean z) {
        Intent intent0 = dlnf.aE(context0, dypl.a((dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c))).a, v, gfsx0, z);
        dzpw.e(eagu0, intent0);
        return intent0;
    }

    public final void d(int v, Intent intent0) {
        xob xob0 = this.b.an();
        if(xob0 != null && !xob0.isFinishing()) {
            if(intent0 == null) {
                xob0.setResult(v);
            }
            else {
                xob0.setResult(v, intent0);
            }
            xob0.finish();
        }
    }

    public final void e() {
        this.d(-1, null);
    }

    public final void f(eabu eabu0, eagu eagu0) {
        Context context0 = this.b.requireContext();
        eabu0.a = gfsx.k(dzau.j(this.b.getArguments()));
        eabu0.b = this.d;
        eabu0.b(eagu0);
        gfsx gfsx0 = eabu0.a(eagu0, context0);
        if(!gfsx0.i()) {
            this.e();
            return;
        }
        Object object0 = gfsx0.d();
        this.c.b(object0);
    }
}

