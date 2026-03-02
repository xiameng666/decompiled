import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public final class fect implements Callable {
    public final fecw a;

    public fect(fecw fecw0) {
        this.a = fecw0;
    }

    @Override
    public final Object call() {
        Object object0;
        fecw fecw0 = this.a;
        Lock lock0 = fecw0.d;
        lock0.lock();
        if(!fecw0.b.isEmpty()) {
            try {
                object0 = (fexe)((frli)fecw0.b.get()).a().get();
            }
            catch(Throwable throwable0) {
                fecw0.d.unlock();
                throw throwable0;
            }
            fecw0.d.unlock();
            return object0;
        }
        lock0.unlock();
        return fexe.a;
    }
}

