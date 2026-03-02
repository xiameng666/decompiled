import android.util.Log;
import j..util.Objects;

abstract class fdrc implements Runnable {
    private final boolean a;
    public fdro g;
    public boolean h;
    final fdri i;

    protected fdrc(fdri fdri0) {
        this(fdri0, true);
    }

    protected fdrc(fdri fdri0, boolean z) {
        Objects.requireNonNull(fdri0);
        this.i = fdri0;
        super();
        this.a = z;
    }

    protected abstract void a();

    protected final void b() {
        for(Object object0: this.i.d.d()) {
            fdro fdro0 = (fdro)object0;
            try {
                fdro0.d();
            }
            catch(RuntimeException runtimeException0) {
                Log.e("ChannelManager", "Error while cleaning up channel " + fdro0.a.toString(), runtimeException0);
            }
        }
        this.i.d.a.clear();
        ((ffdm)this.i.b).a.clear();
    }

    protected final void c(fdrq fdrq0) {
        fdro fdro0 = (fdro)this.i.d.c(fdrq0);
        if(fdro0 != null) {
            fdro0.d();
        }
    }

    @Override
    public final void run() {
        if(!this.a || this.i.g.get()) {
            try {
                try {
                    this.h = true;
                    this.a();
                }
                catch(RuntimeException runtimeException0) {
                    Log.w("ChannelManager", "Uncaught exception.", runtimeException0);
                    fdro fdro0 = this.g;
                    if(fdro0 != null) {
                        fdro0.d();
                        this.i.d.c(this.g.a);
                        this.g = null;
                    }
                }
            }
            catch(Throwable throwable0) {
                if(this.h) {
                    fdri fdri0 = this.i;
                    if(fdri0.g.get() && fdri0.b.g()) {
                        fdri0.a.removeCallbacks(fdri0.h);
                        fdri0.a.post(fdri0.h);
                    }
                }
                throw throwable0;
            }
            if(this.h) {
                fdri fdri1 = this.i;
                if(fdri1.g.get() && fdri1.b.g()) {
                    fdri1.a.removeCallbacks(fdri1.h);
                    fdri1.a.post(fdri1.h);
                }
            }
        }
    }
}

