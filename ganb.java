public final class ganb implements Runnable {
    public final gani a;

    public ganb(gani gani0) {
        this.a = gani0;
    }

    @Override
    public final void run() {
        gani gani0 = this.a;
        int v = gani0.am;
        if(v != -1) {
            gang gang0 = (gang)bzu.a(gani0.ag, v);
            gani0.am = -1;
            if(gang0 != null) {
                gang0.e = 4;
                gang0.b = ganp.h(1);
            }
        }
    }
}

