import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuPresenter.SavedState;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class oo extends mn {
    public ok h;
    public Drawable i;
    public boolean j;
    public int k;
    ol l;
    public oh m;
    public oi n;
    final om o;
    int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private final SparseBooleanArray v;
    private mm w;

    public oo(Context context0) {
        super(context0);
        this.v = new SparseBooleanArray();
        this.o = new om(this);
    }

    @Override  // mn
    public final View b(nd nd0, View view0, ViewGroup viewGroup0) {
        View view1 = nd0.getActionView();
        int v = 0;
        if(view1 == null || nd0.m()) {
            no no0 = (view0 instanceof no) ? ((no)view0) : ((no)this.d.inflate(0x7F0E0006, viewGroup0, false));  // layout:abc_action_menu_item_layout
            no0.f(nd0);
            ((ActionMenuItemView)no0).b = (ActionMenuView)this.f;
            if(this.w == null) {
                this.w = new mm(this);
            }
            ((ActionMenuItemView)no0).c = this.w;
            view1 = (View)no0;
        }
        if(nd0.p) {
            v = 8;
        }
        view1.setVisibility(v);
        ActionMenuView actionMenuView0 = (ActionMenuView)viewGroup0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof or)) {
            view1.setLayoutParams(ActionMenuView.o(viewGroup$LayoutParams0));
        }
        return view1;
    }

    @Override  // mn
    public final void c(Context context0, na na0) {
        this.b = context0;
        LayoutInflater.from(this.b);
        this.c = na0;
        Resources resources0 = context0.getResources();
        if(!this.r) {
            this.q = true;
        }
        this.s = context0.getResources().getDisplayMetrics().widthPixels / 2;
        this.k = lx.a(context0);
        int v = this.s;
        if(this.q) {
            if(this.h == null) {
                ok ok0 = new ok(this, this.a);
                this.h = ok0;
                if(this.j) {
                    ok0.setImageDrawable(this.i);
                    this.i = null;
                    this.j = false;
                }
                this.h.measure(0, 0);
            }
            v -= this.h.getMeasuredWidth();
        }
        else {
            this.h = null;
        }
        this.t = v;
        resources0.getDisplayMetrics();
    }

    @Override  // mn
    public final void d(na na0, boolean z) {
        this.p();
        nm nm0 = this.e;
        if(nm0 != null) {
            nm0.a(na0, z);
        }
    }

    @Override  // nn
    public final Parcelable dA() {
        Parcelable parcelable0 = new ActionMenuPresenter.SavedState();
        parcelable0.a = this.p;
        return parcelable0;
    }

    @Override  // mn
    public final void f(boolean z) {
        int v3;
        ViewGroup viewGroup0 = (ViewGroup)this.f;
        ArrayList arrayList0 = null;
        int v = 0;
        if(viewGroup0 != null) {
            na na0 = this.c;
            if(na0 == null) {
                v3 = 0;
            }
            else {
                na0.m();
                ArrayList arrayList1 = this.c.f();
                int v1 = arrayList1.size();
                v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    nd nd0 = (nd)arrayList1.get(v2);
                    if(nd0.o()) {
                        View view0 = viewGroup0.getChildAt(v3);
                        nd nd1 = (view0 instanceof no) ? ((no)view0).a() : null;
                        View view1 = this.b(nd0, view0, viewGroup0);
                        if(nd0 != nd1) {
                            view1.setPressed(false);
                            view1.jumpDrawablesToCurrentState();
                        }
                        if(view1 != view0) {
                            ViewGroup viewGroup1 = (ViewGroup)view1.getParent();
                            if(viewGroup1 != null) {
                                viewGroup1.removeView(view1);
                            }
                            ((ViewGroup)this.f).addView(view1, v3);
                        }
                        ++v3;
                    }
                }
            }
            while(v3 < viewGroup0.getChildCount()) {
                if(viewGroup0.getChildAt(v3) == this.h) {
                    ++v3;
                }
                else {
                    viewGroup0.removeViewAt(v3);
                }
            }
        }
        ((View)this.f).requestLayout();
        na na1 = this.c;
        if(na1 != null) {
            na1.m();
            ArrayList arrayList2 = na1.d;
            int v4 = arrayList2.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                nd nd2 = (nd)arrayList2.get(v5);
            }
        }
        na na2 = this.c;
        if(na2 != null) {
            arrayList0 = na2.e();
        }
        if(this.q && arrayList0 != null) {
            int v6 = arrayList0.size();
            if(v6 == 1) {
                v = ((nd)arrayList0.get(0)).p ^ 1;
            }
            else if(v6 > 0) {
                v = 1;
            }
            if(v == 0) {
                goto label_70;
            }
            else {
                if(this.h == null) {
                    this.h = new ok(this, this.a);
                }
                ViewGroup viewGroup2 = (ViewGroup)this.h.getParent();
                if(viewGroup2 != this.f) {
                    if(viewGroup2 != null) {
                        viewGroup2.removeView(this.h);
                    }
                    ActionMenuView actionMenuView0 = (ActionMenuView)this.f;
                    ok ok0 = this.h;
                    or or0 = ActionMenuView.n();
                    or0.a = true;
                    actionMenuView0.addView(ok0, or0);
                }
            }
        }
        else {
        label_70:
            ok ok1 = this.h;
            if(ok1 != null) {
                ViewParent viewParent0 = ok1.getParent();
                np np0 = this.f;
                if(viewParent0 == np0) {
                    ((ViewGroup)np0).removeView(this.h);
                }
            }
        }
        ((ActionMenuView)this.f).b = this.q;
    }

    @Override  // mn
    public final boolean g() {
        int v;
        ArrayList arrayList0;
        na na0 = this.c;
        if(na0 == null) {
            arrayList0 = null;
            v = 0;
        }
        else {
            arrayList0 = na0.f();
            v = arrayList0.size();
        }
        int v1 = this.k;
        int v2 = this.t;
        ViewGroup viewGroup0 = (ViewGroup)this.f;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            nd nd0 = (nd)arrayList0.get(v3);
            if(nd0.r()) {
                ++v4;
            }
            else if(nd0.q()) {
                ++v5;
            }
            else {
                z = true;
            }
            if(this.u && nd0.p) {
                v1 = 0;
            }
        }
        if(this.q && (z || v5 + v4 > v1)) {
            --v1;
        }
        int v6 = v1 - v4;
        SparseBooleanArray sparseBooleanArray0 = this.v;
        sparseBooleanArray0.clear();
        int v8 = 0;
        for(int v7 = 0; v7 < v; ++v7) {
            nd nd1 = (nd)arrayList0.get(v7);
            if(nd1.r()) {
                View view0 = this.b(nd1, null, viewGroup0);
                view0.measure(0, 0);
                int v9 = view0.getMeasuredWidth();
                v2 -= v9;
                if(v8 == 0) {
                    v8 = v9;
                }
                int v10 = nd1.b;
                if(v10 != 0) {
                    sparseBooleanArray0.put(v10, true);
                }
                nd1.k(true);
            }
            else if(nd1.q()) {
                int v11 = nd1.b;
                boolean z1 = sparseBooleanArray0.get(v11);
                boolean z2 = (v6 > 0 || z1) && v2 > 0;
                if(z2) {
                    View view1 = this.b(nd1, null, viewGroup0);
                    view1.measure(0, 0);
                    int v12 = view1.getMeasuredWidth();
                    v2 -= v12;
                    if(v8 == 0) {
                        v8 = v12;
                    }
                    z2 = v2 + v8 > 0;
                }
                if(z2 && v11 != 0) {
                    sparseBooleanArray0.put(v11, true);
                }
                else if(z1) {
                    sparseBooleanArray0.put(v11, false);
                    for(int v13 = 0; v13 < v7; ++v13) {
                        nd nd2 = (nd)arrayList0.get(v13);
                        if(nd2.b == v11) {
                            if(nd2.o()) {
                                ++v6;
                            }
                            nd2.k(false);
                        }
                    }
                }
                if(z2) {
                    --v6;
                }
                nd1.k(z2);
            }
            else {
                nd1.k(false);
            }
        }
        return true;
    }

    @Override  // mn
    public final boolean h(nv nv0) {
        boolean z = false;
        if(nv0.hasVisibleItems()) {
            nv nv1 = nv0;
            na na0;
            while((na0 = nv1.l) != this.c) {
                nv1 = (nv)na0;
            }
            nd nd0 = nv1.m;
            ViewGroup viewGroup0 = (ViewGroup)this.f;
            View view0 = null;
            if(viewGroup0 != null) {
                int v = viewGroup0.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = viewGroup0.getChildAt(v1);
                    if((view1 instanceof no) && ((no)view1).a() == nd0) {
                        view0 = view1;
                        break;
                    }
                }
            }
            if(view0 == null) {
                return false;
            }
            this.p = nv0.m.a;
            int v2 = nv0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                MenuItem menuItem0 = nv0.getItem(v3);
                if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            oh oh0 = new oh(this, this.b, nv0, view0);
            this.m = oh0;
            oh0.d(z);
            this.m.f();
            nm nm0 = this.e;
            if(nm0 != null) {
                nm0.b(nv0);
            }
            return true;
        }
        return false;
    }

    public final void k(ActionMenuView actionMenuView0) {
        this.f = actionMenuView0;
        actionMenuView0.a = this.c;
    }

    public final boolean l() {
        oi oi0 = this.n;
        if(oi0 != null) {
            np np0 = this.f;
            if(np0 != null) {
                ((View)np0).removeCallbacks(oi0);
                this.n = null;
                return true;
            }
        }
        ol ol0 = this.l;
        if(ol0 != null) {
            ol0.b();
            return true;
        }
        return false;
    }

    public final boolean m() {
        return this.l != null && this.l.h();
    }

    @Override  // nn
    public final void n(Parcelable parcelable0) {
        if((parcelable0 instanceof ActionMenuPresenter.SavedState)) {
            int v = ((ActionMenuPresenter.SavedState)parcelable0).a;
            if(v > 0) {
                MenuItem menuItem0 = this.c.findItem(v);
                if(menuItem0 != null) {
                    this.h(((nv)menuItem0.getSubMenu()));
                }
            }
        }
    }

    public final boolean o() {
        if(this.q && !this.m() && (this.c != null && this.f != null && this.n == null && !this.c.e().isEmpty())) {
            this.n = new oi(this, new ol(this, this.b, this.c, this.h));
            ((View)this.f).post(this.n);
            return true;
        }
        return false;
    }

    public final void p() {
        this.l();
        this.s();
    }

    public final void q() {
        this.u = true;
    }

    public final void r() {
        this.q = true;
        this.r = true;
    }

    public final void s() {
        oh oh0 = this.m;
        if(oh0 != null) {
            oh0.b();
        }
    }
}

