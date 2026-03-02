import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class fz {
    private final eg a;
    private final ClassLoader b;
    public final ArrayList e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public String m;
    public int n;
    public CharSequence o;
    public int p;
    public CharSequence q;
    public ArrayList r;
    public ArrayList s;
    public boolean t;
    ArrayList u;

    public fz(eg eg0, ClassLoader classLoader0) {
        this.e = new ArrayList();
        this.l = true;
        this.t = false;
        this.a = eg0;
        this.b = classLoader0;
    }

    public final void A(boolean z, Runnable runnable0) {
        if(!z) {
            this.y();
        }
        if(this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(runnable0);
    }

    public final void B(int v, int v1, int v2, int v3) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = v3;
    }

    public final void C() {
        this.t = true;
    }

    public final void D(int v, Class class0, Bundle bundle0) {
        this.t(v, this.c(class0, bundle0));
    }

    public final void E(ViewGroup viewGroup0, du du0, String s) {
        du0.O = viewGroup0;
        du0.w = true;
        this.u(viewGroup0.getId(), du0, s);
    }

    public final void F(Class class0, String s) {
        this.v(this.c(class0, null), s);
    }

    public final void G(int v, du du0) {
        this.z(v, du0, null);
    }

    public final void H(int v, Class class0, Bundle bundle0, String s) {
        this.z(v, this.c(class0, bundle0), s);
    }

    public final void I(int v, int v1) {
        this.B(v, v1, 0, 0);
    }

    public abstract int a();

    public abstract int b();

    private final du c(Class class0, Bundle bundle0) {
        eg eg0 = this.a;
        if(eg0 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        if(this.b == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        du du0 = eg0.b(class0.getName());
        if(bundle0 != null) {
            du0.setArguments(bundle0);
        }
        return du0;
    }

    public abstract void f();

    public abstract void g();

    public void h(int v, du du0, String s, int v1) {
        throw null;
    }

    public boolean l() {
        throw null;
    }

    public void m(du du0) {
        throw null;
    }

    public void n(du du0) {
        throw null;
    }

    public void o(du du0) {
        throw null;
    }

    public void p(du du0, lpf lpf0) {
        throw null;
    }

    public void q(du du0) {
        throw null;
    }

    public void r(du du0) {
        throw null;
    }

    public final void s(fy fy0) {
        this.e.add(fy0);
        fy0.d = this.f;
        fy0.e = this.g;
        fy0.f = this.h;
        fy0.g = this.i;
    }

    public final void t(int v, du du0) {
        this.h(v, du0, null, 1);
    }

    public final void u(int v, du du0, String s) {
        this.h(v, du0, s, 1);
    }

    public final void v(du du0, String s) {
        this.h(0, du0, s, 1);
    }

    public final void w(String s) {
        if(!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = s;
    }

    public final void x(du du0) {
        this.s(new fy(7, du0));
    }

    public final void y() {
        if(this.k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.l = false;
    }

    public final void z(int v, du du0, String s) {
        if(v == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.h(v, du0, s, 2);
    }
}

