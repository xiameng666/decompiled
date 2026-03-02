import android.view.ViewGroup;
import com.google.android.gms.appinvite.model.ContactPerson;

public final class acda extends accz {
    private static final Object[] f;
    private final accn g;
    private final int[] h;
    private final int i;

    static {
        acda.f = new Object[]{""};
    }

    public acda(accn accn0, int[] arr_v, int v) {
        this.g = accn0;
        this.h = arr_v;
        this.i = v;
    }

    @Override  // accz
    public final void I(ContactPerson contactPerson0) {
    }

    @Override  // accz
    public final void J(ContactPerson contactPerson0) {
    }

    @Override  // accz
    public final void K(ContactPerson contactPerson0, int v) {
    }

    @Override  // accz
    protected final void M(boolean z) {
        if(z) {
            this.x(0, this.h.length);
            return;
        }
        this.w(0, this.h.length);
    }

    @Override  // accz
    public final void V(boolean z) {
    }

    @Override  // tk
    public final int b() {
        return this.a ? 0 : this.h.length;
    }

    @Override  // tk
    public final int dx(int v) {
        return this.h[v];
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)v;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        accl accl0 = this.g.ay;
        return accl0 == null ? null : accl0.u();
    }

    @Override  // accz
    public final int f() {
        return 1;
    }

    @Override  // android.widget.SectionIndexer
    public final int getPositionForSection(int v) {
        return 0;
    }

    @Override  // android.widget.SectionIndexer
    public final int getSectionForPosition(int v) {
        return 0;
    }

    @Override  // android.widget.SectionIndexer
    public final Object[] getSections() {
        return acda.f;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }

    @Override  // accz
    public final int n(int v) {
        return this.i;
    }
}

