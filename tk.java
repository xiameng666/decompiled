import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import java.util.List;
import jeb.synthetic.FIN;

public abstract class tk {
    public final tl b;
    public boolean c;
    public tj d;

    public tk() {
        this.b = new tl();
        this.c = false;
        this.d = tj.a;
    }

    public final void A(tm tm0) {
        this.b.registerObserver(tm0);
    }

    public final void B(boolean z) {
        if(this.F()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public final void C(tj tj0) {
        this.d = tj0;
        this.b.g();
    }

    public final void D(tm tm0) {
        this.b.unregisterObserver(tm0);
    }

    public final boolean E() {
        switch(this.d.ordinal()) {
            case 1: {
                return this.b() > 0;
            }
            case 2: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public final boolean F() {
        return this.b.h();
    }

    public abstract int b();

    public int dx(int v) {
        return 0;
    }

    public long dy(int v) {
        return -1L;
    }

    public abstract uq dz(ViewGroup arg1, int arg2);

    public void fr(RecyclerView recyclerView0) {
    }

    public void fs(uq uq0) {
    }

    public abstract void h(uq arg1, int arg2);

    public int hD(tk tk0, uq uq0, int v) {
        return tk0 == this ? v : -1;
    }

    public void hE(RecyclerView recyclerView0) {
    }

    public void j(uq uq0) {
    }

    public void l(uq uq0) {
    }

    public boolean m(uq uq0) {
        return false;
    }

    public final uq o(ViewGroup viewGroup0, int v) {
        int v1 = FIN.finallyOpen$NT();
        if(Trace.isEnabled()) {
            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", v));
        }
        uq uq0 = this.dz(viewGroup0, v);
        if(uq0.a.getParent() == null) {
            uq0.f = v;
            FIN.finallyCodeBegin$NT(v1);
            return uq0;
        }
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
    }

    public final void p(uq uq0, int v) {
        boolean z = uq0.r == null;
        if(z) {
            uq0.c = v;
            if(this.c) {
                uq0.e = this.dy(v);
            }
            uq0.m(1, 0x207);
            if(Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", ((int)uq0.f)));
            }
        }
        uq0.r = this;
        this.z(uq0, v, uq0.d());
        if(z) {
            uq0.h();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = uq0.a.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof ty)) {
                ((ty)viewGroup$LayoutParams0).e = true;
            }
            Trace.endSection();
        }
    }

    public final void q() {
        this.b.a();
    }

    public final void r(int v) {
        this.b.c(v, 1);
    }

    public final void s(int v) {
        this.b.e(v, 1);
    }

    public final void t(int v, int v1) {
        this.b.b(v, v1);
    }

    public final void u(int v, int v1) {
        this.b.c(v, v1);
    }

    public final void v(int v, int v1, Object object0) {
        this.b.d(v, v1, object0);
    }

    public final void w(int v, int v1) {
        this.b.e(v, v1);
    }

    public final void x(int v, int v1) {
        this.b.f(v, v1);
    }

    public final void y(int v) {
        this.b.f(v, 1);
    }

    public void z(uq uq0, int v, List list0) {
        this.h(uq0, v);
    }
}

