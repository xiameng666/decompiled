import java.util.concurrent.Semaphore;

public final class cjhz {
    public final cjif a;
    public final cjie b;

    public cjhz(Semaphore semaphore0) {
        cjif cjif0 = new cjif(semaphore0);
        this.a = cjif0;
        cjie cjie0 = new cjie(cjif0);
        synchronized(cjif0.b) {
            cjif0.c.add(cjie0);
        }
        this.b = cjie0;
    }
}

