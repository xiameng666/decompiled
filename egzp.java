import java.util.HashSet;
import java.util.Set;
import jeb.synthetic.FIN;

public final class egzp {
    public Exception a;
    public final ehim b;
    private final Object c;
    private final Set d;

    public egzp(ehim ehim0) {
        this.c = new Object();
        this.d = new HashSet();
        this.b = ehim0;
        this.a(Thread.currentThread());
    }

    public final void a(Thread thread0) {
        synchronized(this.c) {
            if(!this.f() && thread0 != null) {
                Set set0 = this.d;
                if(!set0.contains(thread0)) {
                    set0.add(thread0);
                }
            }
        }
    }

    public final void b(Exception exception0) {
        batl.s(exception0);
        synchronized(this.c) {
            if(!this.f()) {
                this.a = exception0;
                Set set0 = this.d;
                if(!set0.isEmpty()) {
                    for(Object object1: set0) {
                        ((Thread)object1).interrupt();
                    }
                    set0.clear();
                }
            }
        }
    }

    public final void c(Thread thread0) {
        synchronized(this.c) {
            if(thread0 != null) {
                boolean z = !this.d.remove(thread0);
            }
        }
    }

    public final void d() {
        Object object0 = this.c;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(!this.f()) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new ehfh(this.a);
    }

    public static final void e(Thread thread0) {
    }

    private final boolean f() {
        return this.a != null;
    }
}

