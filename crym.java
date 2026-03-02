import java.util.logging.Level;

public final class crym implements Runnable {
    public final cryq a;
    public final int b;

    public crym(cryq cryq0, int v) {
        this.a = cryq0;
        this.b = v;
    }

    @Override
    public final void run() {
        Level level0 = cslm.h();
        cryq.a.g(level0).B("%s: newCpidFetched", "BgTaskManager");
        cryq cryq0 = this.a;
        int v = this.b;
        if(cryq0.e(v)) {
            new cryt(cryq0.c, v).a();
        }
        cryq0.h(hfyq.d, 12, v);
    }
}

