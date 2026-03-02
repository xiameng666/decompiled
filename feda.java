import java.util.Set;

public final class feda implements Runnable {
    public final fedp a;

    public feda(fedp fedp0) {
        this.a = fedp0;
    }

    @Override
    public final void run() {
        fedp fedp0 = this.a;
        fedp0.m.lock();
        try {
            ggfp ggfp0 = (ggfp)fedp0.i.get();
            ggfp ggfp1 = fedp0.h.d();
            fecw fecw0 = fedp0.j;
            String s = fedp0.g;
            fecw0.e.lock();
            try {
                Set set0 = fecw0.d(s);
                if(set0.removeAll(ggfp0)) {
                    fecw0.f(s, set0);
                }
            }
            finally {
                fecw0.e.unlock();
            }
            fecw fecw1 = fedp0.j;
            String s1 = fedp0.g;
            fecw1.e.lock();
            try {
                Set set1 = fecw1.d(s1);
                if(set1.addAll(ggfp1)) {
                    fecw1.f(s1, set1);
                }
            }
            finally {
                fecw1.e.unlock();
            }
            ggfp ggfp2 = fedp0.j.a(fedp0.g);
            fedp0.j.g(fedp0.g, ggfp2);
            fedp0.i.set(ggfp1);
        }
        finally {
            fedp0.m.unlock();
        }
    }
}

