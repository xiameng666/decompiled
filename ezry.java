import android.content.Context;
import java.util.concurrent.Executor;

public final class ezry {
    public final ezqi a;
    public final cmcg b;
    private static final Object c;
    private static volatile ezry d;
    private final Context e;
    private final frii f;
    private final flam g;
    private final ezqo h;
    private final Executor i;
    private final Executor j;
    private final Object k;
    private volatile cmbm l;

    static {
        ezry.c = new Object();
    }

    private ezry(Context context0) {
        this.k = new Object();
        this.l = null;
        this.e = context0;
        ccsd ccsd0 = hrnt.f() ? new ccsd(new frcc(new frcb(context0))) : new frcc(new frcb(context0));
        frbx frbx0 = new frbx(gged_interceptors.l(ccsd0));
        frij frij0 = new frij();
        frij0.a = new bblp(0x7FFFFFFF, 10);
        frij0.b = frbx0;
        frij0.b(frhu.a);
        hzdj hzdj0 = hzdj.a;
        long v = hzdj0.l().g();
        if(v != 0L) {
            frmr frmr0 = frms.a(context0);
            frmh frmh0 = frmi.f(context0);
            frmh0.b = new bblp(1, 10);
            frmh0.a(fiyq.a(new fgvy(), frmr0.a(), ((int)v)));
            frij0.c(new frmi(frmh0), frmr0);
        }
        this.f = frij0.a();
        this.g = new flam(context0, frbx0);
        this.h = new ezqo(((gful_cronetEngineProvider)new ezrt(context0)), new fiym(), ((gful_cronetEngineProvider)new ezru()), ((gful_cronetEngineProvider)new ezqk()), ((gful_cronetEngineProvider)new ezql()));
        fkqf fkqf0 = new fkqf(new fgvy(), ((int)hzdj0.l().d()));
        this.a = hzdj0.l().U() ? new ezrv(fkqf0) : new ezrw(context0, fkqf0);
        this.i = new bblp(0x7FFFFFFF, 10);
        this.j = new bblp(0x7FFFFFFF, 9);
        ezrq ezrq0 = hzdj0.l().S() ? new ezrq() : new cmaq();
        cmcf cmcf0 = new cmcf(ezmv.a);
        cmbp cmbp0 = cmbp.a("com.google.android.gms.udc.service.UdcContextInitService", "UdcSyncPeriodic", "UdcSyncOneOff", ((gful_cronetEngineProvider)new ezrx(ezrq0)));
        cmcf0.b(ezmv.b, cmbp0);
        this.b = cmcf0.a();
    }

    public static ezqo a(Context context0) {
        return ezry.b(context0).h;
    }

    public static ezry b(Context context0) {
        if(ezry.d == null) {
            Object object0 = ezry.c;
            synchronized(object0) {
                if(ezry.d == null) {
                    ezry.d = new ezry(context0.getApplicationContext());
                }
            }
            return ezry.d;
        }
        return ezry.d;
    }

    public static flam c(Context context0) {
        return ezry.b(context0).g;
    }

    public static flan d(Context context0) {
        flao flao0 = flap.b(ezmk.h);
        flao0.b(ezry.e(context0));
        flap flap0 = flao0.a();
        return new flan(ezry.c(context0), flap0);
    }

    public static frii e(Context context0) {
        return ezry.b(context0).f;
    }

    public static Executor f(Context context0) {
        return ezry.b(context0).i;
    }

    public static cmbm g(Context context0) {
        ezry ezry0 = ezry.b(context0);
        if(ezry0.l == null) {
            synchronized(ezry0.k) {
                if(ezry0.l == null) {
                    ezry ezry1 = ezry.b(ezry0.e);
                    cmcb cmcb0 = new cmcb();
                    cmcb0.c(ezry0.e);
                    cmcb0.f(ezry1.b);
                    cmcb0.a = new ezrs(ezry0.e);
                    cmcb0.b = ezry1.j;
                    cmcb0.d("udc");
                    ezry0.l = cmcb0.a(ezmk.h);
                }
            }
            return ezry0.l;
        }
        return ezry0.l;
    }
}

