import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class fvrf {
    public static final List a;
    public final ArrayList b;
    public final Object c;
    final boolean d;
    boolean e;
    boolean f;
    boolean g;
    public boolean h;
    public int i;
    private boolean j;

    static {
        ArrayList arrayList0 = new ArrayList();
        fvrf.a = arrayList0;
        arrayList0.add(new fvsl(6, 0, 11));
        arrayList0.add(new fvsl(11, 1, 16));
        arrayList0.add(new fvsl(16, 1, 23));
    }

    public fvrf(boolean z) {
        this.b = new ArrayList();
        this.c = new Object();
        this.e = false;
        this.f = true;
        this.g = false;
        this.h = false;
        this.i = 99;
        this.j = false;
        this.d = z;
    }

    public final void a(int v, int v1, boolean z) {
        __monitor_enter(this);
        boolean z1 = true;
        try {
            if(fyaw.a(v, v1) < (z ? 0.2f : 0.6f)) {
                z1 = false;
            }
            this.e = z1;
            this.b();
        }
        finally {
            __monitor_exit(this);
        }
    }

    public final void b() {
        boolean z = this.i() != this.h || (this.j() == 1 ? 1 : 0) != (this.i == 1 ? 1 : 0);
        this.h = this.i();
        this.i = this.j();
        if(z) {
            synchronized(this.c) {
                for(Object object1: this.b) {
                    ((Consumer)object1).accept(this);
                }
                this.h();
            }
        }
    }

    public final void c(boolean z) {
        this.g = z;
        this.b();
    }

    public final void d(boolean z) {
        this.j = z;
        this.b();
    }

    public final void e(boolean z) {
        synchronized(this) {
            this.f = z;
            this.b();
        }
    }

    public final boolean f() {
        return this.g && fvqi.b();
    }

    public final void g() {
        synchronized(this) {
            this.b();
        }
    }

    public final void h() {
        if(this.i == 0) {
            throw null;
        }
        fvqi.a(8);
    }

    private final boolean i() {
        return this.d && this.f() && !this.j && fvqi.a(8);
    }

    private final int j() {
        if(this.i()) {
            if(this.f) {
                return 22;
            }
            return this.e ? 1 : 23;
        }
        return 99;
    }
}

