import android.content.Context;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class cryq {
    public static final bboh a;
    public static final Object b;
    public final Context c;
    public final cslu d;
    public crvr e;
    public final Executor f;
    public static int g;
    private static cryq h;

    static {
        cryq.a = bboh.b("MobileDataPlan", bbcu.ck);
        cryq.g = 2;
        cryq.b = new Object();
    }

    private cryq() {
        this.d = new cslu();
        this.c = AppContextProvider.a();
        this.f = new bblp(1, 10);
    }

    public static cryq a() {
        synchronized(cryq.class) {
            if(cryq.h == null) {
                cryq.h = new cryq();
            }
        }
        return cryq.h;
    }

    public final void b() {
        Level level0 = cslm.h();
        cryq.a.g(level0).x("handleCpidRefreshIfNeeded");
        cryo cryo0 = new cryo(this);
        this.f.execute(cryo0);
    }

    public static boolean c() {
        bboh bboh0 = cryq.a;
        bboh0.g(cslm.h()).x("activeSimNeedsNewCpid");
        boolean z = false;
        if(!csli.B(AppContextProvider.a())) {
            bboh0.g(cslm.h()).B("%s: activeSimNeedsNewCpid: no supported SIM", "BgTaskManager");
            return false;
        }
        String s = csli.g(AppContextProvider.a());
        if("1234567890987654321".equals(s) && !cslm.d().booleanValue()) {
            bboh0.g(cslm.h()).B("%s: activeSimNeedsNewCpid: no ICCID", "BgTaskManager");
            return false;
        }
        if((crvw.c().q(s) == null ? 0L : ((long)crvw.c().q(s))) - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) < hvje.d()) {
            z = true;
        }
        hvje.d();
        return z;
    }

    public final boolean d(int v) {
        int v1;
        if(hvje.p() && crvw.c().v()) {
            crxn.c().O(hhct.bZ, 20, "Local_Cache", "MDP_BgTask");
            v1 = 7;
        }
        else if(cslm.i(this.c)) {
            v1 = 8;
        }
        else if(this.d.c(hfyq.c)) {
            v1 = !hvje.m() || !hvje.a.e().k() ? 3 : 2;
        }
        else {
            v1 = 6;
        }
        crxn.c().N(hfyq.c, v1, v);
        Level level0 = cslm.h();
        cryq.a.g(level0).R("%s: shouldRunCpidFetch: disqualify: %s", "BgTaskManager", giye.a(v1));
        return v1 == 2;
    }

    public final boolean e(int v) {
        int v1;
        hfyq hfyq0 = hfyq.d;
        if(this.d.c(hfyq0)) {
            v1 = !hvje.m() || !hvje.j() || !hvjk.j() || !hvjk.h() ? 3 : 2;
        }
        else {
            v1 = 6;
        }
        crxn.c().N(hfyq0, v1, v);
        Level level0 = cslm.h();
        cryq.a.g(level0).R("%s: shouldRunGCoreRegister: disqualify: %s", "BgTaskManager", giye.a(v1));
        return v1 == 2;
    }

    public final boolean f(int v) {
        int v1;
        hfyq hfyq0 = hfyq.f;
        if(this.d.c(hfyq0)) {
            v1 = !hvje.m() || !hvje.k() ? 3 : 2;
        }
        else {
            v1 = 6;
        }
        crxn.c().N(hfyq0, v1, v);
        return v1 == 2;
    }

    public final void g(int v) {
        boolean z1;
        Level level0 = cslm.h();
        cryq.a.g(level0).B("%s: runBatchTaskCpidRefresh", "BgTaskManager");
        if(hvlb.d() || csli.u(this.c)) {
            cryx cryx0 = new cryx(this.c, v);
            Level level1 = cslm.h();
            cryx.a.g(level1).S("%s: runAndAwaitResult: start. runForQuotaCheck? %s", "BgTaskListCpidEndpoints", true);
            boolean z = false;
            try {
                z1 = ((Boolean)evrg.n(evrg.a(new bblp(1, 10), cryx0))).booleanValue();
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                Level level2 = cslm.h();
                cryx.a.g(level2).B("%s: runAndAwaitResult: failed.", "BgTaskListCpidEndpoints");
                z1 = false;
            }
            Level level3 = cslm.h();
            cryq.a.g(level3).S("%s: runBatchTaskCpidRefresh: quota check? %s", "BgTaskManager", z1);
            this.h(hfyq.b, 10, v);
            if(z1) {
                cryw cryw0 = new cryw(this.c, v);
                Level level4 = cslm.h();
                cryw.a.g(level4).B("%s runAndAwaitResult GetCpidBackgroundTask.", "BgTaskGetCpid:");
                try {
                    z = ((Boolean)evrg.n(evrg.a(new bblp(1, 10), cryw0))).booleanValue();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    a.e(cryw.a.i(), "%s Timed out, interrupted, or failed while performing background CPID fetch.", "BgTaskGetCpid:", exception0);
                }
                bboh bboh0 = cryq.a;
                bboh0.g(cslm.h()).S("%s: runBatchTaskCpidRefresh: cpid fetch? %s", "BgTaskManager", z);
                this.h(hfyq.c, 11, v);
                if(!z) {
                    this.h(hfyq.d, 4, v);
                    return;
                }
                bboh0.g(cslm.h()).x("handleNewCpidFetched");
                crym crym0 = new crym(this, v);
                this.f.execute(crym0);
            }
        }
    }

    public final void h(hfyq hfyq0, int v, int v1) {
        Level level0 = cslm.h();
        cryq.a.g(level0).X("%s: clearTaskDue: %s:%s", "BgTaskManager", hfyq0.name(), hfyp.a(v));
        crxn crxn0 = crxn.c();
        List list0 = Arrays.asList(new hfyq[]{hfyq0});
        gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        giyj giyj0 = (giyj)((ProtoLiteMessage)giyk.a).v_newBuilder();
        if(!giyj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyj0).ensureMutable();
        }
        ((giyk)giyj0.b_message).b = true;
        if(list0 != null) {
            giyj0.a(list0);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        giyl0.c = hfyp.b(v);
        giyk giyk0 = (giyk)((ProtoLiteBuilder)giyj0).N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl1 = (giyl)hftp1.b_message;
        giyk0.getClass();
        giyl1.h = giyk0;
        giyl1.b |= 8;
        giyl giyl2 = (giyl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl2.getClass();
        gizg1.v = giyl2;
        gizg1.b |= 0x800;
        crxn0.e(((gizg)hftp0.N_build()), hhct.bL, Integer.valueOf(v1));
        cslr cslr0 = new cslr(this.d, hfyq0);
        this.d.d.execute(cslr0);
    }

    public final void i(hfyq hfyq0, int v, int v1) {
        giyk giyk0;
        Level level0 = cslm.h();
        cryq.a.g(level0).X("%s: setTaskDue: %s:%s", "BgTaskManager", hfyq0.name(), hfyp.a(v));
        crxn crxn0 = crxn.c();
        List list0 = Arrays.asList(new hfyq[]{hfyq0});
        gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        giyl0.c = hfyp.b(v);
        if(list0 == null) {
            giyk0 = giyk.a;
        }
        else {
            giyj giyj0 = (giyj)((ProtoLiteMessage)giyk.a).v_newBuilder();
            giyj0.a(list0);
            giyk0 = (giyk)((ProtoLiteBuilder)giyj0).N_build();
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl1 = (giyl)hftp1.b_message;
        giyk0.getClass();
        giyl1.h = giyk0;
        giyl1.b |= 8;
        giyl giyl2 = (giyl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl2.getClass();
        gizg1.v = giyl2;
        gizg1.b |= 0x800;
        crxn0.e(((gizg)hftp0.N_build()), hhct.bL, Integer.valueOf(v1));
        csls csls0 = new csls(this.d, hfyq0, v);
        this.d.d.execute(csls0);
    }
}

