import java.util.logging.Level;

public final class cryk implements Runnable {
    public final cryq a;
    public final Integer b;

    public cryk(cryq cryq0, Integer integer0) {
        this.a = cryq0;
        this.b = integer0;
    }

    @Override
    public final void run() {
        Level level0 = cslm.h();
        cryq.a.g(level0).B("%s: newConsentStatus", "BgTaskManager");
        int v = this.b == null ? crxn.a() : ((int)this.b);
        cryq cryq0 = this.a;
        hfyq hfyq0 = hfyq.f;
        cryq0.i(hfyq0, 14, v);
        hfyq hfyq1 = hfyq.d;
        cryq0.i(hfyq1, 14, v);
        if(cryq0.f(v) && new cryz(cryq0.c, v).a()) {
            cryq0.h(hfyq0, 15, v);
        }
        if(cryq0.e(v) && new cryt(cryq0.c, v).a()) {
            cryq0.h(hfyq1, 12, v);
        }
    }
}

