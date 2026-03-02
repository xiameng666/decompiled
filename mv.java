import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class mv extends BaseAdapter {
    final mw a;
    private int b;

    public mv(mw mw0) {
        this.a = mw0;
        super();
        this.b = -1;
        this.b();
    }

    public final nd a(int v) {
        ArrayList arrayList0 = this.a.c.e();
        if(this.b >= 0 && v >= this.b) {
            ++v;
        }
        return (nd)arrayList0.get(v);
    }

    final void b() {
        na na0 = this.a.c;
        nd nd0 = na0.i;
        if(nd0 != null) {
            ArrayList arrayList0 = na0.e();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((nd)arrayList0.get(v1)) == nd0) {
                    this.b = v1;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        int v = this.a.c.e().size();
        return this.b >= 0 ? v - 1 : v;
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
        if(view0 == null) {
            view0 = this.a.b.inflate(0x7F0E0014, viewGroup0, false);  // layout:abc_list_menu_item_layout
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

