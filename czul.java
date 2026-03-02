import java.io.IOException;

public final class czul implements Runnable {
    public final czum a;
    public final IOException b;

    public czul(czum czum0, IOException iOException0) {
        this.a = czum0;
        this.b = iOException0;
    }

    @Override
    public final void run() {
        czkq.a.e().f(this.b).h("PhysicalBleSocket connected to %s encountered an error with its internal Weave socket.", this.a.a.b);
    }
}

