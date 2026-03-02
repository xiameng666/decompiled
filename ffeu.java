import java.util.concurrent.Callable;

public final class ffeu implements Callable {
    public final ffew a;

    public ffeu(ffew ffew0) {
        this.a = ffew0;
    }

    @Override
    public final Object call() {
        ffew ffew0;
        try {
            ffew0 = this.a;
            ffew0.f.await();
            return ffew0.d();
        }
        catch(InterruptedException interruptedException0) {
            ffmn.c("TrustedPeersService", interruptedException0, "Service interrupted waiting for initialization thread to start.", new Object[0]);
            return ffew0.d();
        }
    }
}

