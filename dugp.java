public final class dugp implements Runnable {
    public final dugz a;

    public dugp(dugz dugz0) {
        this.a = dugz0;
    }

    @Override
    public final void run() {
        dugz dugz0 = this.a;
        if(dugz0.ax != null && dugz0.ax.isShowing()) {
            dugz0.aj.d(dugz0.ax);
            dugz0.aj.h(dugz0.an);
        }
    }
}

