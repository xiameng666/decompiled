import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

public final class cryl implements Runnable {
    public final cryq a;

    public cryl(cryq cryq0) {
        this.a = cryq0;
    }

    @Override
    public final void run() {
        bboh bboh0 = cryq.a;
        bboh0.g(cslm.h()).X("%s: moduleInitialized: workflow:%b. cellular monitor:%b", "BgTaskManager", Boolean.valueOf(hvje.n()), Boolean.valueOf(hvje.h()));
        cryq cryq0 = this.a;
        int v = crxn.a();
        if(hvje.n()) {
            ChimeraPeriodicUpdaterService.g(cryq0.c);
        }
        if(hvje.h()) {
            cryj.a(cryq0.c);
        }
        cryq0.i(hfyq.d, 3, v);
        if(cryq.c()) {
            cryq0.i(hfyq.c, 3, v);
            return;
        }
        bboh0.g(cslm.h()).B("%s: moduleInitialized: no active SIM needs CPID", "BgTaskManager");
    }
}

