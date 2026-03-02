import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class mw implements AdapterView.OnItemClickListener, nn {
    Context a;
    public LayoutInflater b;
    na c;
    public ExpandedMenuView d;
    public nm e;
    public mv f;

    public mw(Context context0) {
        this.a = context0;
        this.b = LayoutInflater.from(context0);
    }

    @Override  // nn
    public final int a() {
        return 0;
    }

    @Override  // nn
    public final void c(Context context0, na na0) {
        if(this.a != null) {
            this.a = context0;
            if(this.b == null) {
                this.b = LayoutInflater.from(context0);
            }
        }
        this.c = na0;
        mv mv0 = this.f;
        if(mv0 != null) {
            mv0.notifyDataSetChanged();
        }
    }

    @Override  // nn
    public final void d(na na0, boolean z) {
        nm nm0 = this.e;
        if(nm0 != null) {
            nm0.a(na0, z);
        }
    }

    @Override  // nn
    public final Parcelable dA() {
        if(this.d == null) {
            return null;
        }
        Parcelable parcelable0 = new Bundle();
        SparseArray sparseArray0 = new SparseArray();
        ExpandedMenuView expandedMenuView0 = this.d;
        if(expandedMenuView0 != null) {
            expandedMenuView0.saveHierarchyState(sparseArray0);
        }
        ((Bundle)parcelable0).putSparseParcelableArray("android:menu:list", sparseArray0);
        return parcelable0;
    }

    @Override  // nn
    public final void e(nm nm0) {
        throw null;
    }

    @Override  // nn
    public final void f(boolean z) {
        mv mv0 = this.f;
        if(mv0 != null) {
            mv0.notifyDataSetChanged();
        }
    }

    @Override  // nn
    public final boolean g() {
        return false;
    }

    @Override  // nn
    public final boolean h(nv nv0) {
        if(!nv0.hasVisibleItems()) {
            return false;
        }
        nb nb0 = new nb(nv0);
        na na0 = nb0.a;
        iv iv0 = new iv(na0.a);
        nb0.c = new mw(iv0.getContext());
        nb0.c.e = nb0;
        na0.g(nb0.c);
        iv0.b(nb0.c.k(), nb0);
        View view0 = na0.g;
        if(view0 == null) {
            iv0.e(na0.f);
            iv0.setTitle(na0.e);
        }
        else {
            iv0.d(view0);
        }
        iv0.q(nb0);
        nb0.b = iv0.create();
        nb0.b.setOnDismissListener(nb0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = nb0.b.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        windowManager$LayoutParams0.flags |= 0x20000;
        nb0.b.show();
        nm nm0 = this.e;
        if(nm0 != null) {
            nm0.b(nv0);
        }
        return true;
    }

    @Override  // nn
    public final boolean i(nd nd0) {
        return false;
    }

    @Override  // nn
    public final boolean j(nd nd0) {
        return false;
    }

    public final ListAdapter k() {
        if(this.f == null) {
            this.f = new mv(this);
        }
        return this.f;
    }

    @Override  // nn
    public final void n(Parcelable parcelable0) {
        SparseArray sparseArray0 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:list");
        if(sparseArray0 != null) {
            this.d.restoreHierarchyState(sparseArray0);
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.c.C(this.f.a(v), this, 0);
    }
}

