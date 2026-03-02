import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class acei extends BaseAdapter {
    private final Context a;
    private int b;
    private acef c;
    public final LayoutInflater m;

    public acei(Context context0) {
        this.b = 0;
        this.b();
        this.c = new aceh(this);
        this.a = context0;
        this.m = LayoutInflater.from(context0);
    }

    protected final int b() {
        int v = this.b;
        this.b = v + 1;
        return v;
    }

    public final void c(acef acef0) {
        this.c = acef0;
        this.notifyDataSetChanged();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.c.a();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.c.b(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        this.c.b(v);
        return (long)v;
    }

    @Override  // android.widget.BaseAdapter
    public final int getItemViewType(int v) {
        return this.c.c();
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.c.d(v, view0, viewGroup0);
    }

    @Override  // android.widget.BaseAdapter
    public final int getViewTypeCount() {
        return this.b;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean hasStableIds() {
        return false;
    }
}

