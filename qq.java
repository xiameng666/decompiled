import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

public final class qq extends tk {
    public final qs a;

    public qq(qp qp0, List list0) {
        this.a = new qs(this, qp0);
        for(Object object0: list0) {
            this.n(((tk)object0));
        }
        super.B(this.a.g());
    }

    @SafeVarargs
    public qq(qp qp0, tk[] arr_tk) {
        this(qp0, Arrays.asList(arr_tk));
    }

    @SafeVarargs
    public qq(tk[] arr_tk) {
        this(qp.a, arr_tk);
    }

    @Override  // tk
    public final int b() {
        int v = 0;
        for(Object object0: this.a.d) {
            v += ((ss)object0).c;
        }
        return v;
    }

    @Override  // tk
    public final int dx(int v) {
        int v3;
        qs qs0 = this.a;
        qr qr0 = qs0.b(v);
        xc xc0 = qr0.a.e;
        int v1 = qr0.a.b.dx(qr0.b);
        SparseIntArray sparseIntArray0 = xc0.a;
        int v2 = sparseIntArray0.indexOfKey(v1);
        if(v2 >= 0) {
            v3 = sparseIntArray0.valueAt(v2);
        }
        else {
            int v4 = xc0.d.b;
            xc0.d.b = v4 + 1;
            xc0.d.a.put(v4, xc0.c);
            sparseIntArray0.put(v1, v4);
            xc0.b.put(v4, v1);
            v3 = v4;
        }
        qs0.f(qr0);
        return v3;
    }

    @Override  // tk
    public final long dy(int v) {
        qr qr0 = this.a.b(v);
        long v1 = qr0.a.a.a(qr0.a.b.dy(qr0.b));
        this.a.f(qr0);
        return v1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        ss ss0 = (ss)this.a.f.a.get(v);
        if(ss0 == null) {
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + v);
        }
        xc xc0 = ss0.e;
        SparseIntArray sparseIntArray0 = xc0.b;
        int v1 = sparseIntArray0.indexOfKey(v);
        if(v1 < 0) {
            throw new IllegalStateException("requested global type " + v + " does not belong to the adapter:" + xc0.c.b);
        }
        int v2 = sparseIntArray0.valueAt(v1);
        return ss0.b.dz(viewGroup0, v2);
    }

    final void f(tj tj0) {
        super.C(tj0);
    }

    @Override  // tk
    public final void fr(RecyclerView recyclerView0) {
        qs qs0 = this.a;
        List list0 = qs0.b;
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            WeakReference weakReference0 = (WeakReference)list0.get(v);
            if(weakReference0.get() == null) {
                list0.remove(v);
            }
            else if(weakReference0.get() == recyclerView0) {
                list0.remove(v);
                break;
            }
        }
        for(Object object0: qs0.d) {
            ((ss)object0).b.fr(recyclerView0);
        }
    }

    @Override  // tk
    public final void fs(uq uq0) {
        this.a.c(uq0).b.fs(uq0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        qr qr0 = this.a.b(v);
        this.a.c.put(uq0, qr0.a);
        qr0.a.b.p(uq0, qr0.b);
        this.a.f(qr0);
    }

    @Override  // tk
    public final int hD(tk tk0, uq uq0, int v) {
        qs qs0 = this.a;
        ss ss0 = (ss)qs0.c.get(uq0);
        if(ss0 == null) {
            return -1;
        }
        int v1 = v - qs0.a(ss0);
        tk tk1 = ss0.b;
        int v2 = tk1.b();
        if(v1 >= 0 && v1 < v2) {
            return tk1.hD(tk0, uq0, v1);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + v1 + " which is out of bounds for the adapter with size " + v2 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + uq0 + "adapter:" + tk0);
    }

    @Override  // tk
    public final void hE(RecyclerView recyclerView0) {
        qs qs0 = this.a;
        List list0 = qs0.b;
        for(Object object0: list0) {
            if(((WeakReference)object0).get() == recyclerView0) {
                return;
            }
        }
        list0.add(new WeakReference(recyclerView0));
        for(Object object1: qs0.d) {
            ((ss)object1).b.hE(recyclerView0);
        }
    }

    @Override  // tk
    public final void j(uq uq0) {
        this.a.c(uq0).b.j(uq0);
    }

    @Override  // tk
    public final void l(uq uq0) {
        qs qs0 = this.a;
        IdentityHashMap identityHashMap0 = qs0.c;
        ss ss0 = (ss)identityHashMap0.get(uq0);
        if(ss0 == null) {
            throw new IllegalStateException(a.m(qs0, uq0, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        ss0.b.l(uq0);
        identityHashMap0.remove(uq0);
    }

    @Override  // tk
    public final boolean m(uq uq0) {
        qs qs0 = this.a;
        IdentityHashMap identityHashMap0 = qs0.c;
        ss ss0 = (ss)identityHashMap0.get(uq0);
        if(ss0 == null) {
            throw new IllegalStateException(a.m(qs0, uq0, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        identityHashMap0.remove(uq0);
        return ss0.b.m(uq0);
    }

    public final void n(tk tk0) {
        qs qs0 = this.a;
        List list0 = qs0.d;
        int v = list0.size();
        if(v < 0 || v > list0.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + list0.size() + ". Given:" + v);
        }
        if(qs0.g()) {
            kay.b(tk0.c, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        else if(tk0.c) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int v1 = list0.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            if(((ss)list0.get(v2)).b == tk0) {
                break;
            }
        }
        if((v2 == -1 ? null : ((ss)list0.get(v2))) != null) {
            return;
        }
        vr vr0 = qs0.e.a();
        ss ss0 = new ss(tk0, qs0, qs0.f, vr0);
        list0.add(v, ss0);
        for(Object object0: qs0.b) {
            RecyclerView recyclerView0 = (RecyclerView)((WeakReference)object0).get();
            if(recyclerView0 != null) {
                tk0.hE(recyclerView0);
            }
        }
        if(ss0.c > 0) {
            int v3 = qs0.a(ss0);
            qs0.a.w(v3, ss0.c);
        }
        qs0.d();
    }
}

