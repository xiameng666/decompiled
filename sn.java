import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;

public class sn implements nr {
    private Context a;
    private ListAdapter b;
    private int c;
    private int d;
    public rl e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    final sm o;
    final Handler p;
    public boolean q;
    public PopupWindow r;
    private int s;
    private boolean t;
    private DataSetObserver u;
    private final sl v;
    private final sk w;
    private final si x;
    private final Rect y;
    private Rect z;

    public sn(Context context0) {
        this(context0, null, 0x7F040804);  // attr:listPopupWindowStyle
    }

    public sn(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public sn(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.c = -2;
        this.f = -2;
        this.s = 1002;
        this.j = 0;
        this.k = 0x7FFFFFFF;
        this.o = new sm(this);
        this.v = new sl(this);
        this.w = new sk(this);
        this.x = new si(this);
        this.y = new Rect();
        this.a = context0;
        this.p = new Handler(context0.getMainLooper());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ku.p, v, v1);
        this.g = typedArray0.getDimensionPixelOffset(0, 0);
        int v2 = typedArray0.getDimensionPixelOffset(1, 0);
        this.d = v2;
        if(v2 != 0) {
            this.t = true;
        }
        typedArray0.recycle();
        pl pl0 = new pl(context0, attributeSet0, v, v1);
        this.r = pl0;
        pl0.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.t ? this.d : 0;
    }

    public final Drawable c() {
        return this.r.getBackground();
    }

    @Override  // nr
    public final ListView dB() {
        return this.e;
    }

    public void e(ListAdapter listAdapter0) {
        DataSetObserver dataSetObserver0 = this.u;
        if(dataSetObserver0 == null) {
            this.u = new sj(this);
        }
        else {
            ListAdapter listAdapter1 = this.b;
            if(listAdapter1 != null) {
                listAdapter1.unregisterDataSetObserver(dataSetObserver0);
            }
        }
        this.b = listAdapter0;
        if(listAdapter0 != null) {
            listAdapter0.registerDataSetObserver(this.u);
        }
        rl rl0 = this.e;
        if(rl0 != null) {
            rl0.setAdapter(this.b);
        }
    }

    public final void f(Drawable drawable0) {
        this.r.setBackgroundDrawable(drawable0);
    }

    public final void g(int v) {
        this.g = v;
    }

    public final void j(int v) {
        this.d = v;
        this.t = true;
    }

    @Override  // nr
    public final void m() {
        this.r.dismiss();
        this.r.setContentView(null);
        this.e = null;
        this.p.removeCallbacks(this.o);
    }

    public final int o() {
        return this.x() ? this.e.getSelectedItemPosition() : -1;
    }

    public rl p(Context context0, boolean z) {
        return new rl(context0, z);
    }

    public final void q() {
        rl rl0 = this.e;
        if(rl0 != null) {
            rl0.a = true;
            rl0.requestLayout();
        }
    }

    public final void r(int v) {
        Drawable drawable0 = this.r.getBackground();
        if(drawable0 != null) {
            drawable0.getPadding(this.y);
            this.f = this.y.left + this.y.right + v;
            return;
        }
        this.f = v;
    }

    public final void s(Rect rect0) {
        this.z = rect0 == null ? null : new Rect(rect0);
    }

    public final void t(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.r.setOnDismissListener(popupWindow$OnDismissListener0);
    }

    public final boolean u() {
        return this.r.getInputMethodMode() == 2;
    }

    @Override  // nr
    public final void v() {
        int v4;
        int v1;
        if(this.e == null) {
            rl rl0 = this.p(this.a, ((boolean)(this.q ^ 1)));
            this.e = rl0;
            rl0.setAdapter(this.b);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new sh(this));
            this.e.setOnScrollListener(this.w);
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.n;
            if(adapterView$OnItemSelectedListener0 != null) {
                this.e.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            this.r.setContentView(this.e);
        }
        else {
            ViewGroup viewGroup0 = (ViewGroup)this.r.getContentView();
        }
        Drawable drawable0 = this.r.getBackground();
        int v = 0;
        if(drawable0 == null) {
            this.y.setEmpty();
            v1 = 0;
        }
        else {
            Rect rect0 = this.y;
            drawable0.getPadding(rect0);
            v1 = rect0.top + rect0.bottom;
            if(!this.t) {
                this.d = -rect0.top;
            }
        }
        boolean z = this.r.getInputMethodMode() == 2;
        int v2 = this.r.getMaxAvailableHeight(this.l, this.d, z);
        if(this.c != -1) {
            int v3 = this.f;
            switch(v3) {
                case -2: {
                    v4 = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.y.left + this.y.right), 0x80000000);
                    break;
                }
                case -1: {
                    v4 = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.y.left + this.y.right), 0x40000000);
                    break;
                }
                default: {
                    v4 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                }
            }
            v2 = this.e.b(v4, v2);
            v1 = v2 <= 0 ? 0 : v1 + (this.e.getPaddingTop() + this.e.getPaddingBottom());
        }
        boolean z1 = this.u();
        this.r.setWindowLayoutType(this.s);
        int v5 = v2 + v1;
        if(!this.r.isShowing()) {
            int v8 = this.f;
            if(v8 == -1) {
                v8 = -1;
            }
            else if(v8 == -2) {
                v8 = this.l.getWidth();
            }
            int v9 = this.c;
            if(v9 == -1) {
                v5 = -1;
            }
            else if(v9 != -2) {
                v5 = v9;
            }
            this.r.setWidth(v8);
            this.r.setHeight(v5);
            this.r.setIsClippedToScreen(true);
            this.r.setOutsideTouchable(true);
            this.r.setTouchInterceptor(this.v);
            if(this.i) {
                this.r.setOverlapAnchor(this.h);
            }
            this.r.setEpicenterBounds(this.z);
            this.r.showAsDropDown(this.l, this.g, this.d, this.j);
            this.e.setSelection(-1);
            if(!this.q || this.e.isInTouchMode()) {
                this.q();
            }
            if(!this.q) {
                this.p.post(this.x);
            }
        }
        else if(this.l.isAttachedToWindow()) {
            int v6 = this.f;
            if(v6 == -1) {
                v6 = -1;
            }
            else if(v6 == -2) {
                v6 = this.l.getWidth();
            }
            int v7 = this.c;
            if(v7 == -1) {
                if(!z1) {
                    v5 = -1;
                }
                if(z1) {
                    this.r.setWidth((this.f == -1 ? -1 : 0));
                    this.r.setHeight(0);
                }
                else {
                    PopupWindow popupWindow0 = this.r;
                    if(this.f == -1) {
                        v = -1;
                    }
                    popupWindow0.setWidth(v);
                    this.r.setHeight(-1);
                }
            }
            else if(v7 != -2) {
                v5 = v7;
            }
            this.r.setOutsideTouchable(true);
            this.r.update(this.l, this.g, this.d, (v6 >= 0 ? v6 : -1), (v5 >= 0 ? v5 : -1));
        }
    }

    public final void w() {
        this.r.setInputMethodMode(2);
    }

    @Override  // nr
    public final boolean x() {
        return this.r.isShowing();
    }

    public final void y() {
        this.q = true;
        this.r.setFocusable(true);
    }
}

