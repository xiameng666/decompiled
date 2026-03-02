import java.io.IOException;

public final class fdcc implements Runnable {
    public final fdch a;
    public final evqp b;
    public final String c;

    public fdcc(fdch fdch0, evqp evqp0, String s) {
        this.a = fdch0;
        this.b = evqp0;
        this.c = s;
    }

    @Override
    public final void run() {
        evqp evqp0;
        try {
            evqp0 = this.b;
            evqp0.b(acso.e(this.a.i, this.c));
        }
        catch(acse | IOException exception0) {
            evqp0.a(exception0);
        }
    }
}

