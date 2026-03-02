import java.io.PrintWriter;
import java.util.Map;
import java.util.Objects;

public final class fvyz implements Runnable {
    public final fvzk a;
    public final PrintWriter b;

    public fvyz(fvzk fvzk0, PrintWriter printWriter0) {
        this.a = fvzk0;
        this.b = printWriter0;
    }

    @Override
    public final void run() {
        icvk icvk0;
        PrintWriter printWriter0 = this.b;
        fvzk fvzk0 = this.a;
        fvzn fvzn0 = fvzk0.b;
        if(huqy_phenotype.u()) {
            printWriter0.println("Bias Db Info:");
            printWriter0.println("enabled: " + fvzn0.h());
            if(fvzn0.h()) {
                Integer integer0 = fvzn0.b(fvzn.b);
                Objects.toString(integer0);
                printWriter0.println("table size: " + integer0);
                Integer integer1 = fvzn0.b(fvzn.c);
                Objects.toString(integer1);
                printWriter0.println("table schema version: " + integer1);
                printWriter0.println("configured size: " + fvzn0.e);
                printWriter0.println("configured version: 5");
            }
        }
        if(fvzn0.h()) {
            synchronized(fvzk0) {
                icvk0 = fvzk0.b();
            }
            if(icvk0 != null) {
                printWriter0.println("Bias: " + icvk0.b);
                printWriter0.println("Accuracy: " + icvk0.c);
            }
            Map map0 = fvzk0.b.c();
            printWriter0.println(a.aj(map0, "Number of populated entries: "));
            synchronized(fvzk0) {
                ObserverRegistry gpyo0 = fvzk0.f;
            }
            if(!map0.isEmpty() && gpyo0 != null) {
                for(Object object0: map0.values()) {
                    long v = System.nanoTime();
                    long v1 = ((icvl)object0).b;
                    int v2 = ((icvl)object0).c;
                    double f = (double)((icvl)object0).d;
                    double f1 = (double)((icvl)object0).e;
                    for(Object object1: gpyo0.a) {
                        ((IFilterObserver)object1).l(v, v1, v2, f, f1);
                    }
                }
            }
        }
    }
}

