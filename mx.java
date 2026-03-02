import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

public final class mx extends BaseAdapter {
    public final na a;
    public boolean b;
    private int c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public mx(na na0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.c = -1;
        this.d = z;
        this.e = layoutInflater0;
        this.a = na0;
        this.f = v;
        this.b();
    }

    public final nd a(int v) {
        ArrayList arrayList0 = this.d ? this.a.e() : this.a.f();
        if(this.c >= 0 && v >= this.c) {
            ++v;
        }
        return (nd)arrayList0.get(v);
    }

    final void b() {
        na na0 = this.a;
        nd nd0 = na0.i;
        if(nd0 != null) {
            ArrayList arrayList0 = na0.e();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((nd)arrayList0.get(v1)) == nd0) {
                    this.c = v1;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList0 = this.d ? this.a.e() : this.a.f();
        return this.c >= 0 ? arrayList0.size() - 1 : arrayList0.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        int v1 = 0;
        if(view0 == null) {
            view0 = this.e.inflate(this.f, viewGroup0, false);
        }
        int v2 = this.a(v).b;
        int v3 = v - 1 < 0 ? v2 : this.a(v - 1).b;
        boolean z = this.a.y() && v2 != v3;
        ImageView imageView0 = ((ListMenuItemView)view0).b;
        if(imageView0 != null) {
            if(((ListMenuItemView)view0).d || !z) {
                v1 = 8;
            }
            imageView0.setVisibility(v1);
        }
        if(this.b) {
            ((ListMenuItemView)view0).e = true;
            ((ListMenuItemView)view0).c = true;
        }
        ((no)view0).f(this.a(v));
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}

