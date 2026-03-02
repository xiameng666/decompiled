import j..util.Optional;

public final class fxev implements Runnable {
    public final fxfj a;
    public final Optional b;

    public fxev(fxfj fxfj0, Optional optional0) {
        this.a = fxfj0;
        this.b = optional0;
    }

    @Override
    public final void run() {
        Optional optional0;
        try {
            optional0 = this.b;
            this.a.a();
            optional0.ifPresent(new fxfb());
        }
        catch(acse | iapl unused_ex) {
            optional0.ifPresent(new fxfc());
        }
    }
}

