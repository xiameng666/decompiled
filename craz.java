import java.util.concurrent.atomic.AtomicBoolean;

public final class craz implements Runnable {
    public final crkt a;
    public final crji b;
    public final AtomicBoolean c;

    public craz(crkt crkt0, crji crji0, AtomicBoolean atomicBoolean0) {
        this.a = crkt0;
        this.b = crji0;
        this.c = atomicBoolean0;
    }

    @Override
    public final void run() {
        if(this.a.c.a) {
            this.b.k.a("ChimeraPackageMeasurementTaskService processed last upload request.");
            synchronized(this.c) {
                this.c.set(true);
                this.c.notify();
            }
        }
    }
}

