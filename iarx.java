public final class iarx implements Runnable {
    public final iasc a;

    public iarx(iasc iasc0) {
        this.a = iasc0;
    }

    @Override
    public final void run() {
        iasc iasc0 = this.a;
        iasb iasb0 = iasc0.h;
        if(iasb0 != null) {
            iasc0.d.unregisterReceiver(iasb0);
            iasc0.h = null;
        }
    }
}

