public final class cryo implements Runnable {
    public final cryq a;

    public cryo(cryq cryq0) {
        this.a = cryq0;
    }

    @Override
    public final void run() {
        boolean z = cryq.c();
        bboh bboh0 = cryq.a;
        bboh0.g(cslm.h()).S("%s: handleCpidRefreshIfNeeded: needCpid ? %s", "BgTaskManager", z);
        if(!z) {
            return;
        }
        cryq cryq0 = this.a;
        int v = crxn.a();
        cryq0.i(hfyq.c, 4, v);
        cryq0.i(hfyq.d, 11, v);
        if(!cryq0.d(v)) {
            bboh0.g(cslm.h()).B("%s: handleCpidRefreshIfNeeded: fail to run CpidRefresh", "BgTaskManager");
            return;
        }
        cryq0.g(v);
    }
}

