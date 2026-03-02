import j..util.Objects;

public final class avk implements Runnable {
    public final avp a;
    public final avp b;

    public avk(avp avp0, avp avp1) {
        this.a = avp0;
        this.b = avp1;
    }

    @Override
    public final void run() {
        avp avp0 = this.a;
        synchronized(avp0.b.b) {
            avp0.b.c.remove(avp0);
            avp0.b.d.remove(avp0);
        }
        avp avp1 = this.b;
        avp0.d(avp1);
        if(avp0.f != null) {
            Objects.requireNonNull(avp0.e);
            avp0.e.g(avp1);
            return;
        }
        bcs.d("SyncCaptureSessionBase", a.i(avp0, "[", "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured."));
    }
}

