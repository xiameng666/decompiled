import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class aat {
    public final Object a;
    public boolean b;
    private final List c;

    public aat(Executor executor0) {
        ibuq.f(executor0, "executor");
        super();
        this.a = new Object();
        this.c = new ArrayList();
    }

    public final void a() {
        synchronized(this.a) {
            this.b = true;
            List list0 = this.c;
            for(Object object1: list0) {
                ((ibth)object1).a();
            }
            list0.clear();
        }
    }

    public final boolean b() {
        synchronized(this.a) {
        }
        return this.b;
    }
}

