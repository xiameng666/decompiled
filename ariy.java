import android.os.Bundle;
import j..util.Objects;
import java.util.concurrent.TimeoutException;

final class ariy implements arkj {
    final boolean a;
    final Runnable b;
    final arjx c;
    final arjh d;

    public ariy(arjh arjh0, boolean z, Runnable runnable0, arjx arjx0) {
        this.a = z;
        this.b = runnable0;
        this.c = arjx0;
        Objects.requireNonNull(arjh0);
        this.d = arjh0;
        super();
    }

    @Override  // arkj
    public final void a(Exception exception0) {
        if(!(exception0 instanceof TimeoutException)) {
            arjx arjx0 = this.c;
            if(arjx0.b()) {
                arjh.p.d("Result fetch failed..retrying", new Object[0]);
                arjx0.a(new arix(this, arjx0, this.a, this.b));
                return;
            }
        }
        arjh.p.f("Result fetched failed", new Object[0]);
        this.d.w.a();
        if(!this.a && ((Boolean)this.d.g.mr()).booleanValue() && !this.d.B()) {
            return;
        }
        this.b.run();
    }

    @Override  // arkj
    public final void b(Bundle bundle0) {
        arjh.p.h("Successfully fetched compatible packages.", new Object[0]);
        if(bundle0.getBoolean("p2pdisconnectservice")) {
            this.d.w.a();
        }
        if(!this.a && (((Boolean)this.d.g.mr()).booleanValue() && !this.d.B())) {
            return;
        }
        this.b.run();
    }
}

