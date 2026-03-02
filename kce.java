import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class kce extends kcu {
    private final Set m;
    private djgk n;

    public kce(Context context0, Executor executor0, kbu kbu0, kde kde0, boolean z) {
        super(context0, executor0, kbu0, kde0, z);
        this.m = new HashSet();
    }

    @Override  // kcu
    protected final int a(kcw kcw0) {
        return kce.l(this.n(), this.h());
    }

    @Override  // kcu
    protected final hjlk b() {
        Objects.requireNonNull(this.e);
        return kbq.b(1, this.n(), this.e, this.k);
    }

    public final int c(kda kda0) {
        int[] arr_v;
        synchronized(this) {
            Log.i("UwbBackend", String.format("Add UWB peer: %s", kda0));
            if(!this.t()) {
                return 2;
            }
            if(kbq.d(this.e.a)) {
                return 2;
            }
            if(this.j(kda0)) {
                return 0;
            }
            kcw kcw0 = this.e;
            int v1 = kcw0.a;
            byte[] arr_b = null;
            if(v1 == 7) {
                arr_v = new int[]{kcw0.c};
                v1 = 7;
            }
            else {
                arr_v = null;
            }
            if(v1 == 7) {
                arr_b = kcw0.e;
            }
            boolean z = this.y(new kda[]{kda0}, arr_v, arr_b);
            djgk djgk0 = this.n;
            if(z) {
                if(djgk0 != null) {
                    this.q(new kca(djgk0, kda0));
                }
                this.m.add(kda0);
            }
            else if(djgk0 != null) {
                this.q(new kcb(djgk0, kda0));
            }
        }
        return 0;
    }

    public final int d(kbx kbx0) {
        int[] arr_v;
        synchronized(this) {
            kda kda0 = kbx0.a;
            Log.i("UwbBackend", String.format("Add UWB peer: %s", kda0));
            if(!this.t()) {
                return 2;
            }
            if(kbq.d(this.e.a)) {
                return 2;
            }
            if(this.j(kda0)) {
                return 0;
            }
            int v1 = this.e.a;
            byte[] arr_b = null;
            if(v1 == 7) {
                arr_v = new int[]{kbx0.b};
                v1 = 7;
            }
            else {
                arr_v = null;
            }
            if(v1 == 7) {
                arr_b = kbx0.c;
            }
            boolean z = this.y(new kda[]{kda0}, arr_v, arr_b);
            djgk djgk0 = this.n;
            if(z) {
                if(djgk0 != null) {
                    this.q(new kcc(djgk0, kda0));
                }
                this.m.add(kda0);
            }
            else if(djgk0 != null) {
                this.q(new kcd(djgk0, kda0));
            }
        }
        return 0;
    }

    public final int e(kda kda0) {
        synchronized(this) {
            Log.i("UwbBackend", String.format("Remove UWB peer: %s", kda0));
            if(!this.t()) {
                Log.w("UwbBackend", "Attempt to remove controlee while session is not active.");
                return 2;
            }
            if(!this.j(kda0)) {
                Log.w("UwbBackend", "Attempt to remove non-existing controlee.");
                return 0;
            }
            if(!this.z(new kda[]{kda0})) {
                return 0;
            }
            djgk djgk0 = this.n;
            if(djgk0 != null) {
                this.q(new kby(djgk0, kda0));
            }
            this.m.remove(kda0);
        }
        return 0;
    }

    public final int f(int v) {
        synchronized(this) {
            if(!this.t()) {
                Log.w("UwbBackend", "Attempt to set block striding while session is not active.");
                return 2;
            }
            if(!this.v(hjma.a(null, null, null, null, Integer.valueOf(v), null, null, null).b())) {
                Log.w("UwbBackend", "Reconfiguring ranging interval failed");
                return 6;
            }
        }
        return 0;
    }

    @Override  // kcu
    public final int g() {
        int v1;
        synchronized(this) {
            v1 = super.g();
            this.m.clear();
            this.n = null;
        }
        return v1;
    }

    public final kdb h() {
        if(this.i.booleanValue()) {
            this.d = new kdb(kcz.c, kcz.d);
        }
        if(this.d == null) {
            int v = new Random().nextInt(((ggna)kcz.f).c);
            kdb kdb0 = new kdb(9, ((int)(((Integer)kcz.f.get(v)))));
            Log.i("UwbBackend", String.format("set complexChannel to %s", kdb0));
            this.d = kdb0;
        }
        return this.d;
    }

    @Override  // kcu
    public final void i(kdd kdd0) {
        synchronized(this) {
            this.m.remove(kdd0.a);
        }
    }

    @Override  // kcu
    protected final boolean j(kda kda0) {
        return this.m.contains(kda0);
    }

    @Override  // kcu
    public final int k(djgk djgk0, ExecutorService executorService0) {
        int v1;
        synchronized(this) {
            Objects.requireNonNull(this.e);
            if(this.d == null) {
                Log.w("UwbBackend", "Need to call getComplexChannel() first");
                return 2;
            }
            if(kbq.d(this.e.a) && this.e.g.size() > 1) {
                Log.w("UwbBackend", String.format("Config ID %d doesn\'t support one-to-many", ((int)this.e.a)));
                return 2;
            }
            if(kda.c(this.n().d())) {
                Log.w("UwbBackend", "Local address is forbidden");
                return 2;
            }
            if(Collection.-EL.stream(this.e.g).anyMatch(new kbz())) {
                Log.w("UwbBackend", "Peer address is forbidden");
                return 2;
            }
            v1 = super.k(djgk0, executorService0);
            if(this.t()) {
                this.m.addAll(this.e.g);
                this.n = djgk0;
            }
        }
        return v1;
    }

    private final boolean y(kda[] arr_kda, int[] arr_v, byte[] arr_b) {
        boolean z1;
        synchronized(this) {
            if(Build.VERSION.SDK_INT < 33) {
                return this.v(kbq.c(this.e.a, 0, arr_kda, arr_v, arr_b, this.k).b());
            }
            z1 = this.s(kbq.a(this.e.a, 0, arr_kda, arr_v, arr_b, this.k).b());
        }
        return z1;
    }

    private final boolean z(kda[] arr_kda) {
        boolean z1;
        synchronized(this) {
            if(Build.VERSION.SDK_INT < 33) {
                return this.v(kbq.c(this.e.a, 1, arr_kda, null, null, this.k).b());
            }
            z1 = this.w(kbq.a(this.e.a, 1, arr_kda, null, null, this.k).b());
        }
        return z1;
    }
}

