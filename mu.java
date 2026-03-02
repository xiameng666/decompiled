import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class mu extends nj implements View.OnKeyListener, PopupWindow.OnDismissListener, nn {
    private PopupWindow.OnDismissListener A;
    public final Handler a;
    public final List b;
    final ViewTreeObserver.OnGlobalLayoutListener c;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final List m;
    private final View.OnAttachStateChangeListener n;
    private final so o;
    private int p;
    private int q;
    private View r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private nm z;

    public mu(Context context0, View view0, int v, int v1, boolean z) {
        this.m = new ArrayList();
        this.b = new ArrayList();
        this.c = new mp(this);
        this.n = new mq(this);
        this.o = new ms(this);
        this.p = 0;
        this.q = 0;
        this.h = context0;
        this.r = view0;
        this.j = v;
        this.k = v1;
        this.l = z;
        this.x = false;
        this.s = this.B();
        Resources resources0 = context0.getResources();
        this.i = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(0x7F07001B));  // dimen:abc_config_prefDialogWidth
        this.a = new Handler();
    }

    private final int B() {
        return this.r.getLayoutDirection() == 1 ? 0 : 1;
    }

    private final void C(na na0) {
        int v7;
        View view0;
        mx mx1;
        int v3;
        mt mt0;
        Context context0 = this.h;
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        mx mx0 = new mx(na0, layoutInflater0, this.l, 0x7F0E000F);  // layout:abc_cascading_menu_item_layout
        if(!this.x() && this.x) {
            mx0.b = true;
        }
        else if(this.x()) {
            mx0.b = nj.z(na0);
        }
        int v = mu.A(mx0, context0, this.i);
        sq sq0 = new sq(context0, this.j, this.k);
        sq0.a = this.o;
        sq0.m = this;
        sq0.t(this);
        sq0.l = this.r;
        sq0.j = this.q;
        sq0.y();
        sq0.w();
        sq0.e(mx0);
        sq0.r(v);
        sq0.j = this.q;
        List list0 = this.b;
        if(list0.size() > 0) {
            mt0 = (mt)list0.get(list0.size() - 1);
            na na1 = mt0.b;
            int v1 = na1.size();
            for(int v2 = 0; true; ++v2) {
                MenuItem menuItem0 = null;
                if(v2 >= v1) {
                    break;
                }
                MenuItem menuItem1 = na1.getItem(v2);
                if(menuItem1.hasSubMenu() && na0 == menuItem1.getSubMenu()) {
                    menuItem0 = menuItem1;
                    break;
                }
            }
            if(menuItem0 == null) {
                view0 = null;
            }
            else {
                ListView listView0 = mt0.a();
                ListAdapter listAdapter0 = listView0.getAdapter();
                if((listAdapter0 instanceof HeaderViewListAdapter)) {
                    v3 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    mx1 = (mx)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    mx1 = (mx)listAdapter0;
                    v3 = 0;
                }
                int v4 = mx1.getCount();
                int v5;
                for(v5 = 0; true; ++v5) {
                    if(v5 >= v4) {
                        v5 = -1;
                        break;
                    }
                    if(menuItem0 == mx1.a(v5)) {
                        break;
                    }
                }
                if(v5 == -1) {
                    view0 = null;
                }
                else {
                    int v6 = v5 + v3 - listView0.getFirstVisiblePosition();
                    view0 = v6 >= 0 && v6 < listView0.getChildCount() ? listView0.getChildAt(v6) : null;
                }
            }
        }
        else {
            mt0 = null;
            view0 = null;
        }
        if(view0 == null) {
            if(this.t) {
                sq0.g = this.v;
            }
            if(this.u) {
                sq0.j(this.w);
            }
            sq0.s(this.g);
        }
        else {
            sq0.r.setTouchModal(false);
            sq0.r.setEnterTransition(null);
            ListView listView1 = ((mt)list0.get(list0.size() - 1)).a();
            int[] arr_v = new int[2];
            listView1.getLocationOnScreen(arr_v);
            Rect rect0 = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect0);
            if(this.s != 1) {
                v7 = arr_v[0] - v >= 0 ? 0 : 1;
            }
            else if(arr_v[0] + listView1.getWidth() + v <= rect0.right) {
                v7 = 1;
            }
            else {
                v7 = 0;
            }
            this.s = v7;
            sq0.l = view0;
            if((this.q & 5) != 5) {
                v = v7 == 0 ? -v : view0.getWidth();
            }
            else if(v7 == 0) {
                v = -view0.getWidth();
            }
            sq0.g = v;
            sq0.i = true;
            sq0.h = true;
            sq0.j(0);
        }
        list0.add(new mt(sq0, na0, this.s));
        sq0.v();
        rl rl0 = sq0.e;
        rl0.setOnKeyListener(this);
        if(mt0 == null && this.y && na0.e != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(0x7F0E0016, rl0, false);  // layout:abc_popup_menu_header_item_layout
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(na0.e);
            rl0.addHeaderView(frameLayout0, null, false);
            sq0.v();
        }
    }

    @Override  // nn
    public final void d(na na0, boolean z) {
        List list0 = this.b;
        int v = list0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(na0 == ((mt)list0.get(v1)).b) {
                break;
            }
        }
        if(v1 >= 0) {
            if(v1 + 1 < list0.size()) {
                ((mt)list0.get(v1 + 1)).b.i(false);
            }
            mt mt0 = (mt)list0.remove(v1);
            mt0.b.o(this);
            if(this.f) {
                mt0.a.r.setExitTransition(null);
                mt0.a.r.setAnimationStyle(0);
            }
            mt0.a.m();
            int v2 = list0.size();
            this.s = v2 > 0 ? ((mt)list0.get(v2 - 1)).c : this.B();
            if(v2 == 0) {
                this.m();
                nm nm0 = this.z;
                if(nm0 != null) {
                    nm0.a(na0, true);
                }
                ViewTreeObserver viewTreeObserver0 = this.e;
                if(viewTreeObserver0 != null) {
                    if(viewTreeObserver0.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.n);
                this.A.onDismiss();
                return;
            }
            if(z) {
                ((mt)list0.get(0)).b.i(false);
            }
        }
    }

    @Override  // nn
    public final Parcelable dA() {
        return null;
    }

    @Override  // nr
    public final ListView dB() {
        return this.b.isEmpty() ? null : ((mt)this.b.get(this.b.size() - 1)).a();
    }

    @Override  // nn
    public final void e(nm nm0) {
        this.z = nm0;
    }

    @Override  // nn
    public final void f(boolean z) {
        for(Object object0: this.b) {
            mu.y(((mt)object0).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override  // nn
    public final boolean g() {
        return false;
    }

    @Override  // nn
    public final boolean h(nv nv0) {
        for(Object object0: this.b) {
            mt mt0 = (mt)object0;
            if(nv0 == mt0.b) {
                mt0.a().requestFocus();
                return true;
            }
        }
        if(nv0.hasVisibleItems()) {
            this.l(nv0);
            nm nm0 = this.z;
            if(nm0 != null) {
                nm0.b(nv0);
            }
            return true;
        }
        return false;
    }

    @Override  // nj
    public final void l(na na0) {
        na0.h(this, this.h);
        if(this.x()) {
            this.C(na0);
            return;
        }
        this.m.add(na0);
    }

    @Override  // nr
    public final void m() {
        List list0 = this.b;
        int v = list0.size();
        if(v > 0) {
            mt[] arr_mt = (mt[])list0.toArray(new mt[v]);
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                sq sq0 = arr_mt[v].a;
                if(sq0.x()) {
                    sq0.m();
                }
            }
        }
    }

    @Override  // nn
    public final void n(Parcelable parcelable0) {
    }

    @Override  // nj
    public final void o(View view0) {
        if(this.r != view0) {
            this.r = view0;
            this.q = Gravity.getAbsoluteGravity(this.p, view0.getLayoutDirection());
        }
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        mt mt0;
        List list0 = this.b;
        int v = list0.size();
        for(int v1 = 0; true; ++v1) {
            mt0 = null;
            if(v1 >= v) {
                break;
            }
            mt mt1 = (mt)list0.get(v1);
            if(!mt1.a.x()) {
                mt0 = mt1;
                break;
            }
        }
        if(mt0 != null) {
            mt0.b.i(false);
        }
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.m();
            return true;
        }
        return false;
    }

    @Override  // nj
    public final void p(boolean z) {
        this.x = z;
    }

    @Override  // nj
    public final void q(int v) {
        if(this.p != v) {
            this.p = v;
            this.q = Gravity.getAbsoluteGravity(v, this.r.getLayoutDirection());
        }
    }

    @Override  // nj
    public final void r(int v) {
        this.t = true;
        this.v = v;
    }

    @Override  // nj
    public final void s(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.A = popupWindow$OnDismissListener0;
    }

    @Override  // nj
    public final void t(boolean z) {
        this.y = z;
    }

    @Override  // nj
    public final void u(int v) {
        this.u = true;
        this.w = v;
    }

    @Override  // nr
    public final void v() {
        if(!this.x()) {
            List list0 = this.m;
            for(Object object0: list0) {
                this.C(((na)object0));
            }
            list0.clear();
            View view0 = this.r;
            this.d = view0;
            if(view0 != null) {
                ViewTreeObserver viewTreeObserver0 = this.e;
                ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
                this.e = viewTreeObserver1;
                if(viewTreeObserver0 == null) {
                    viewTreeObserver1.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.n);
            }
        }
    }

    @Override  // nj
    protected final boolean w() {
        return false;
    }

    @Override  // nr
    public final boolean x() {
        return this.b.size() > 0 && ((mt)this.b.get(0)).a.x();
    }
}

