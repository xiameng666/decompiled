import j..util.Optional;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

public final class fedl implements Runnable {
    public final fedp a;
    public final String b;

    public fedl(fedp fedp0, String s) {
        this.a = fedp0;
        this.b = s;
    }

    @Override
    public final void run() {
        Optional optional0;
        String s1;
        fedp fedp0 = this.a;
        Lock lock0 = fedp0.m;
        lock0.lock();
        try {
            if(fedp0.l.get() && fedp0.f) {
                fecw fecw0 = fedp0.j;
                String s = fedp0.g;
                fecw0.e.lock();
                try {
                    optional0 = Optional.empty();
                    Iterator iterator0 = fecw0.d(s).iterator();
                    while(true) {
                        boolean z = iterator0.hasNext();
                        s1 = this.b;
                        if(!z) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        fdpl fdpl0 = (fdpl)object0;
                        if(fdpl0.b.equals(s1)) {
                            optional0 = Optional.of(fdpl0);
                            break;
                        }
                    }
                    optional0.ifPresent(new fecv(fecw0, s));
                }
                finally {
                    fecw0.e.unlock();
                }
                optional0.ifPresent(new fedf(fedp0, s1));
                goto label_28;
            }
            goto label_30;
        }
        catch(Throwable throwable0) {
            fedp0.m.unlock();
            throw throwable0;
        }
    label_28:
        fedp0.m.unlock();
        return;
    label_30:
        lock0.unlock();
    }
}

