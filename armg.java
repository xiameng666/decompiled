import java.util.concurrent.atomic.AtomicBoolean;

public final class armg extends bbln {
    private static final aqql a;
    private final armp b;
    private final armf c;

    static {
        armg.a = new aqql(new String[]{"UsbSenderThread"});
    }

    public armg(armp armp0, armf armf0) {
        super(9);
        this.b = armp0;
        this.c = armf0;
    }

    @Override
    public final void run() {
        try {
            armf armf0 = this.c;
            try {
            alab1:
                while(true) {
                    AtomicBoolean atomicBoolean0 = armf0.c;
                    if(!atomicBoolean0.get()) {
                        break;
                    }
                    armd armd0 = (armd)armf0.b.take();
                    armf0.e(armd0);
                    while(atomicBoolean0.get()) {
                        if(!armf0.g(armd0)) {
                            continue alab1;
                        }
                    }
                    armf0.a(armd0);
                }
                armd armd1 = (armd)armf0.d.getAndSet(null);
                if(armd1 != null) {
                    armf0.e(armd1);
                    while(armf0.g(armd1)) {
                    }
                }
                armf0.d();
            }
            finally {
                armf0.e.shutdownNow();
            }
        }
        catch(InterruptedException unused_ex) {
            armg.a.h("Caught interrupt exception; shutting down.", new Object[0]);
            Thread.currentThread().interrupt();
        }
        finally {
            this.b.u();
        }
    }
}

