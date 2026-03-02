import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class cryp implements Runnable {
    public final cryq a;

    public cryp(cryq cryq0) {
        this.a = cryq0;
    }

    @Override
    public final void run() {
        boolean z1;
        bboh bboh0 = cryq.a;
        bboh0.g(cslm.h()).X("%s: periodicTimerTriggered: workflow: %b. cellular monitor: %b", "BgTaskManager", Boolean.valueOf(hvje.n()), Boolean.valueOf(hvje.h()));
        cryq cryq0 = this.a;
        int v = crxn.a();
        if(cryq.c()) {
            bboh0.g(cslm.h()).B("%s: periodicTimerTriggered: CpidFetch needed", "BgTaskManager");
            cryq0.i(hfyq.c, 7, v);
        }
        long v1 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        hfyq hfyq0 = hfyq.d;
        long v2 = hvjk.d();
        if(v1 - cryq0.d.c.getLong(hfyq0.name() + "_last_try_time", 0L) > v2) {
            bboh0.g(cslm.h()).B("%s: periodicTimerTriggered: GcoreRegister needed", "BgTaskManager");
            cryq0.i(hfyq0, 8, v);
        }
        bboh0.g(cslm.h()).x("anySimNeedsNewConsentText");
        for(Object object0: csli.A(cryq0.c, 2)) {
            hfwn hfwn0 = crvw.c().i(crvw.c().p(((cslv)object0).a));
            if(hfwn0 == null || hfwn0.b > hvjq.b()) {
                bboh0.g(cslm.h()).B("%s: periodicTimerTriggered: ConsentFetch needed", "BgTaskManager");
                cryq0.i(hfyq.e, 9, v);
                break;
            }
        }
        bboh0.g(cslm.h()).B("%s: workFlow: starts", "BgTaskManager");
        boolean z = false;
        if(hvje.n()) {
            int v3 = 3;
            Object object1 = cryq.b;
            __monitor_enter(object1);
            if(cryq.g == 3) {
                z1 = true;
            }
            else {
                cryq.g = 3;
                z1 = false;
            }
            __monitor_exit(object1);
            if(z1) {
                Level level0 = cslm.h();
                cryq.a.g(level0).B("%s: workFlow: already running; aborting.", "BgTaskManager");
                crxn.c().M(5, v);
            }
            else {
                crxn.c().M(3, v);
                if(cryq0.e == null) {
                    crvq crvq0 = new crvq();
                    cryq0.e = new cruv(cryq0.c, crvq0);
                }
                if(cryq0.e(v)) {
                    Level level1 = cslm.h();
                    cryq.a.g(level1).B("%s: workFlow: run GcoreRegister", "BgTaskManager");
                    if(new cryt(cryq0.c, v).a()) {
                        cryq0.h(hfyq.d, 12, v);
                    }
                }
                hfyq hfyq1 = hfyq.e;
                if(!cryq0.d.c(hfyq1)) {
                    v3 = 6;
                }
                else if(hvje.m() && hvje.i()) {
                    v3 = 2;
                }
                crxn.c().N(hfyq1, v3, v);
                bboh bboh1 = cryq.a;
                bboh1.g(cslm.h()).R("%s: shouldRunGetConsentInfo: disqualify: %s", "BgTaskManager", giye.a(v3));
                if(v3 == 2) {
                    bboh1.g(cslm.h()).B("%s: workFlow: run ConsentFetch", "BgTaskManager");
                    cryu cryu0 = new cryu(cryq0.c, v);
                    try {
                        if(((Boolean)evrg.n(evrg.a(new bblp(1, 10), cryu0))).booleanValue()) {
                            goto label_68;
                        }
                    }
                    catch(ExecutionException | InterruptedException exception0) {
                        ((ggtj)cryu.a.g(((exception0 instanceof ExecutionException) ? Level.SEVERE : Level.WARNING)).s(exception0)).B("%s: Exception during background consent fetch", "BgTaskGetConsent");
                    }
                    goto label_69;
                label_68:
                    cryq0.h(hfyq.e, 13, v);
                }
            label_69:
                if(cryq0.f(v)) {
                    Level level2 = cslm.h();
                    cryq.a.g(level2).B("%s: workFlow: run SetConsent", "BgTaskManager");
                    if(new cryz(cryq0.c, v).a()) {
                        cryq0.h(hfyq.f, 15, v);
                    }
                }
                if(cryq0.d(v)) {
                    Level level3 = cslm.h();
                    cryq.a.g(level3).B("%s: workFlow: run CpidRefresh", "BgTaskManager");
                    cryq0.g(v);
                }
                synchronized(cryq.b) {
                    cryq.g = 2;
                }
                z = true;
            }
        }
        else {
            crxn.c().M(4, v);
        }
        Level level4 = cslm.h();
        cryq.a.g(level4).S("%s: periodicTimerTriggered: workflow ran ? %s", "BgTaskManager", z);
    }
}

