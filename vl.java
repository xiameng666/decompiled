import android.view.View;

public abstract class vl extends tr {
    boolean k;

    public vl() {
        this.k = true;
    }

    public abstract boolean e(uq arg1);

    public abstract boolean f(uq arg1, uq arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract boolean g(uq arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void j(uq arg1);

    @Override  // tr
    public boolean n(uq uq0, tq tq0, tq tq1) {
        if(tq0 != null) {
            int v = tq0.a;
            int v1 = tq1.a;
            return v == v1 && tq0.b == tq1.b ? this.e(uq0) : this.g(uq0, v, tq0.b, v1, tq1.b);
        }
        return this.e(uq0);
    }

    @Override  // tr
    public boolean o(uq uq0, uq uq1, tq tq0, tq tq1) {
        int v = tq0.a;
        int v1 = tq0.b;
        return uq1.A() ? this.f(uq0, uq1, v, v1, tq0.a, tq0.b) : this.f(uq0, uq1, v, v1, tq1.a, tq1.b);
    }

    @Override  // tr
    public final boolean p(uq uq0, tq tq0, tq tq1) {
        int v = tq0.a;
        int v1 = tq0.b;
        View view0 = uq0.a;
        int v2 = tq1 == null ? view0.getLeft() : tq1.a;
        int v3 = tq1 == null ? view0.getTop() : tq1.b;
        if(!uq0.v() && (v != v2 || v1 != v3)) {
            view0.layout(v2, v3, view0.getWidth() + v2, view0.getHeight() + v3);
            return this.g(uq0, v, v1, v2, v3);
        }
        this.j(uq0);
        return true;
    }

    @Override  // tr
    public boolean q(uq uq0, tq tq0, tq tq1) {
        int v = tq0.a;
        int v1 = tq1.a;
        if(v == v1 && tq0.b == tq1.b) {
            this.l(uq0);
            return false;
        }
        return this.g(uq0, v, tq0.b, v1, tq1.b);
    }

    @Override  // tr
    public final boolean r(uq uq0) {
        return !this.k || uq0.t();
    }

    public final void u() {
        this.k = false;
    }
}

