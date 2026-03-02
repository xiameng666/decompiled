import android.app.Activity;
import android.os.Looper;
import dagger.internal.InstanceFactory;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ibnh
public final class fokb implements fora, Executor {
    public final gmch a;
    private final forb b;
    private final ConcurrentLinkedQueue c;
    private volatile boolean d;
    private final ibnf e;
    private final AtomicBoolean f;

    public fokb(gmch gmch0, forb forb0, ibnf ibnf0) {
        this.c = new ConcurrentLinkedQueue();
        this.d = false;
        this.f = new AtomicBoolean();
        this.a = gmch0;
        this.b = forb0;
        this.e = ibnf0;
        if(forb0.a.a.b.get() > 0) {
            this.k();
            return;
        }
        forb0.a(this);
    }

    @Override  // fora
    public final void a(Activity activity0) {
    }

    @Override  // fora
    public final void b(Activity activity0) {
    }

    @Override  // fora
    public final void c(Activity activity0) {
        this.b.b(this);
        this.k();
    }

    @Override  // fora
    public final void d(Activity activity0) {
    }

    @Override  // fora
    public final void e(Activity activity0) {
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.d) {
            this.a.execute(runnable0);
            return;
        }
        this.c.add(runnable0);
        if(this.d) {
            this.j();
            return;
        }
        if(!this.f.getAndSet(true)) {
            if(((Boolean)((gfsx)((InstanceFactory)this.e).a).f(Boolean.valueOf(false))).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new fojy(this));
                return;
            }
            fojz fojz0 = new fojz(this);
            this.a.h(fojz0, 7000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override  // fora
    public final void f(int v) {
    }

    public final void g() {
        this.d = true;
        this.j();
    }

    @Override  // fora
    public final void h() {
    }

    @Override  // fora
    public final void i() {
    }

    private final void j() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.c.poll()) != null) {
            this.a.execute(runnable0);
        }
    }

    private final void k() {
        foka foka0 = new foka(this);
        this.a.h(foka0, 3000L, TimeUnit.MILLISECONDS);
    }
}

