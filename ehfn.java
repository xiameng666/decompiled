import android.os.Process;
import j..util.Objects;
import java.util.ArrayList;

final class ehfn implements Runnable {
    final ehic a;
    final ehic b;
    final ehfp c;

    public ehfn(ehfp ehfp0, ehic ehic0, ehic ehic1) {
        this.a = ehic0;
        this.b = ehic1;
        Objects.requireNonNull(ehfp0);
        this.c = ehfp0;
        super();
    }

    @Override
    public final void run() {
        ehia ehia0;
        egzp egzp0;
        ehfp ehfp0;
        Process.setThreadPriority(10);
        try {
            try {
                ehfp0 = this.c;
                ehic ehic0 = this.a;
                ehic ehic1 = this.b;
                ArrayList arrayList0 = new ArrayList();
                egiv.R();
                int v = (int)hwzc.a.c().i();
                Integer.valueOf(v).getClass();
                while(true) {
                    egzp0 = ehfp0.c;
                    egzp0.d();
                    ehia0 = ehic0.a();
                    gged_interceptors gged0 = ehia0.a;
                    int v1 = ((ggna)gged0).c;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        arrayList0.add(gged0.get(v2));
                        if(arrayList0.size() >= v) {
                            ehfp0.a(arrayList0, ehic1);
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        ehfp0.a(arrayList0, ehic1);
                    }
                    if(ehia0.c) {
                        break;
                    }
                    ehic1.c(ehia0.b);
                }
                ehic1.b(ehia0.b);
                goto label_41;
            }
            catch(ehfh ehfh0) {
            }
            catch(Exception exception0) {
                goto label_33;
            }
            this.c.c.b(ehfh0.a);
        }
        catch(Throwable throwable0) {
            this.c.c.c(this.c.d);
            ehfp.d(this.c);
            throw throwable0;
        }
        this.c.c.c(this.c.d);
        ehfp.d(this.c);
        return;
        try {
        label_33:
            this.c.c.b(exception0);
        }
        catch(Throwable throwable0) {
            this.c.c.c(this.c.d);
            ehfp.d(this.c);
            throw throwable0;
        }
        this.c.c.c(this.c.d);
        ehfp.d(this.c);
        return;
    label_41:
        egzp0.c(ehfp0.d);
        ehfp.d(ehfp0);
    }
}

