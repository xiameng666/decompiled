import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class nj implements AdapterView.OnItemClickListener, nn, nr {
    public Rect g;

    protected static int A(ListAdapter listAdapter0, Context context0, int v) {
        int v1 = 0;
        int v2 = listAdapter0.getCount();
        int v3 = 0;
        FrameLayout frameLayout0 = null;
        View view0 = null;
        for(int v4 = 0; v1 < v2; v4 = v5 == v4 ? v4 : v5) {
            int v5 = listAdapter0.getItemViewType(v1);
            if(v5 != v4) {
                view0 = null;
            }
            if(frameLayout0 == null) {
                frameLayout0 = new FrameLayout(context0);
            }
            view0 = listAdapter0.getView(v1, view0, frameLayout0);
            view0.measure(0, 0);
            int v6 = view0.getMeasuredWidth();
            if(v6 >= v) {
                return v;
            }
            if(v6 > v3) {
                v3 = v6;
            }
            ++v1;
        }
        return v3;
    }

    @Override  // nn
    public final int a() {
        return 0;
    }

    @Override  // nn
    public final void c(Context context0, na na0) {
    }

    @Override  // nn
    public final boolean i(nd nd0) {
        return false;
    }

    @Override  // nn
    public final boolean j(nd nd0) {
        return false;
    }

    public abstract void l(na arg1);

    public abstract void o(View arg1);

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = (ListAdapter)adapterView0.getAdapter();
        nj.y(listAdapter0).a.C(((MenuItem)listAdapter0.getItem(v)), this, (this.w() ? 0 : 4));
    }

    public abstract void p(boolean arg1);

    public abstract void q(int arg1);

    public abstract void r(int arg1);

    public abstract void s(PopupWindow.OnDismissListener arg1);

    public abstract void t(boolean arg1);

    public abstract void u(int arg1);

    protected boolean w() {
        return true;
    }

    protected static mx y(ListAdapter listAdapter0) {
        return (listAdapter0 instanceof HeaderViewListAdapter) ? ((mx)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((mx)listAdapter0);
    }

    protected static boolean z(na na0) {
        int v = na0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = na0.getItem(v1);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}

