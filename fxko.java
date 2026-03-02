import j..util.Optional;

public final class fxko implements Runnable {
    public final fxkt a;

    public fxko(fxkt fxkt0) {
        this.a = fxkt0;
    }

    @Override
    public final void run() {
        fxkt fxkt0 = this.a;
        synchronized(fxkt0) {
            fxkt0.d = Optional.empty();
        }
        if(!fxkt0.c || fxkt0.b != fxob.a && !fxkt0.b.b.a.getProvider().equals("cache")) {
            return;
        }
        fxkt0.e();
    }
}

