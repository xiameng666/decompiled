import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class wq implements nn {
    na a;
    public nd b;
    final Toolbar c;

    public wq(Toolbar toolbar0) {
        this.c = toolbar0;
        super();
    }

    @Override  // nn
    public final int a() {
        return 0;
    }

    @Override  // nn
    public final void c(Context context0, na na0) {
        na na1 = this.a;
        if(na1 != null) {
            nd nd0 = this.b;
            if(nd0 != null) {
                na1.v(nd0);
            }
        }
        this.a = na0;
    }

    @Override  // nn
    public final void d(na na0, boolean z) {
    }

    @Override  // nn
    public final Parcelable dA() {
        return null;
    }

    @Override  // nn
    public final void e(nm nm0) {
        throw null;
    }

    @Override  // nn
    public final void f(boolean z) {
        if(this.b != null) {
            na na0 = this.a;
            if(na0 != null) {
                int v = na0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a.getItem(v1) == this.b) {
                        return;
                    }
                }
            }
            this.i(this.b);
        }
    }

    @Override  // nn
    public final boolean g() {
        return false;
    }

    @Override  // nn
    public final boolean h(nv nv0) {
        return false;
    }

    @Override  // nn
    public final boolean i(nd nd0) {
        Toolbar toolbar0 = this.c;
        View view0 = toolbar0.f;
        if((view0 instanceof ma)) {
            ((ma)view0).a();
        }
        toolbar0.removeView(toolbar0.f);
        toolbar0.removeView(toolbar0.e);
        toolbar0.f = null;
        ArrayList arrayList0 = toolbar0.p;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            toolbar0.addView(((View)arrayList0.get(v)));
        }
        arrayList0.clear();
        this.b = null;
        toolbar0.requestLayout();
        nd0.h(false);
        toolbar0.H();
        return true;
    }

    @Override  // nn
    public final boolean j(nd nd0) {
        Toolbar toolbar0 = this.c;
        if(toolbar0.e == null) {
            toolbar0.e = new AppCompatImageButton(toolbar0.getContext(), null, 0x7F040D96);  // attr:toolbarNavigationButtonStyle
            toolbar0.e.setImageDrawable(toolbar0.c);
            toolbar0.e.setContentDescription(toolbar0.d);
            wr wr0 = new wr(-2);
            wr0.a = toolbar0.i & 0x70 | 0x800003;
            wr0.b = 2;
            toolbar0.e.setLayoutParams(wr0);
            toolbar0.e.setOnClickListener(new wo(toolbar0));
        }
        ViewParent viewParent0 = toolbar0.e.getParent();
        if(viewParent0 != toolbar0) {
            if((viewParent0 instanceof ViewGroup)) {
                ((ViewGroup)viewParent0).removeView(toolbar0.e);
            }
            toolbar0.addView(toolbar0.e);
        }
        toolbar0.f = nd0.getActionView();
        this.b = nd0;
        ViewParent viewParent1 = toolbar0.f.getParent();
        if(viewParent1 != toolbar0) {
            if((viewParent1 instanceof ViewGroup)) {
                ((ViewGroup)viewParent1).removeView(toolbar0.f);
            }
            wr wr1 = new wr(-2);
            wr1.a = toolbar0.i & 0x70 | 0x800003;
            wr1.b = 2;
            toolbar0.f.setLayoutParams(wr1);
            toolbar0.addView(toolbar0.f);
        }
        int v = toolbar0.getChildCount();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            View view0 = toolbar0.getChildAt(v);
            if(((wr)view0.getLayoutParams()).b != 2 && view0 != toolbar0.a) {
                toolbar0.removeViewAt(v);
                toolbar0.p.add(view0);
            }
        }
        toolbar0.requestLayout();
        nd0.h(true);
        View view1 = toolbar0.f;
        if((view1 instanceof ma)) {
            ((ma)view1).b();
        }
        toolbar0.H();
        return true;
    }

    @Override  // nn
    public final void n(Parcelable parcelable0) {
    }
}

