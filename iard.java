public final class iard implements Runnable {
    public final iarm a;

    public iard(iarm iarm0) {
        this.a = iarm0;
    }

    @Override
    public final void run() {
        iarm iarm0 = this.a;
        synchronized(iarm0) {
            if(iarm0.y(4)) {
                iarm0.u(iarm0.s, true);
            }
        }
    }
}

