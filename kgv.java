import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class kgv {
    public final kgu a;

    public kgv(Window window0, View view0) {
        ker ker0 = new ker(view0);
        if(Build.VERSION.SDK_INT >= 35) {
            this.a = new kgt(window0, this, ker0);
            return;
        }
        this.a = new kgr(window0, ker0);
    }

    @Deprecated
    public kgv(WindowInsetsController windowInsetsController0) {
        if(Build.VERSION.SDK_INT >= 35) {
            this.a = new kgt(windowInsetsController0, new ker(windowInsetsController0));
            return;
        }
        this.a = new kgr(windowInsetsController0, new ker(windowInsetsController0));
    }

    public final void a(int v) {
        this.a.a(v);
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final void d(int v) {
        this.a.e(v);
    }

    public final boolean e() {
        return this.a.h();
    }

    public final void f() {
        this.a.i();
    }
}

