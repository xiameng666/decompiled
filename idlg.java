import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

final class idlg extends Thread {
    public idlg() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }

    @Override
    public final void run() {
        idlj idlj1;
        while(true) {
            try {
                ReentrantLock reentrantLock0 = idlj.b;
                reentrantLock0.lock();
                try {
                    idlj idlj0 = idlj.f;
                    ibuq.c(idlj0);
                    idlj1 = idlj0.h;
                    if(idlj1 == null) {
                        idlj.c.await(idlj.d, TimeUnit.MILLISECONDS);
                        idlj idlj2 = idlj.f;
                        ibuq.c(idlj2);
                        if(idlj2.h == null && 0L >= idlj.e) {
                            idlj1 = idlj.f;
                            goto label_23;
                        }
                    }
                    else {
                        long v1 = idlj1.c(System.nanoTime());
                        if(v1 <= 0L) {
                            idlj idlj3 = idlj.f;
                            ibuq.c(idlj3);
                            idlj3.h = idlj1.h;
                            idlj1.h = null;
                            idlj1.g = 2;
                            goto label_23;
                        }
                        else {
                            idlj.c.await(v1, TimeUnit.NANOSECONDS);
                        }
                    }
                    idlj1 = null;
                label_23:
                    if(idlj1 == idlj.f) {
                        idlj.f = null;
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                if(idlj1 != null) {
                    idlj1.b();
                }
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

