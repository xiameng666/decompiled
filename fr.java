import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
public abstract class fr extends pch {
    private final fm a;
    private fz b;
    private du c;
    private boolean e;

    @Deprecated
    public fr(fm fm0) {
        this.b = null;
        this.c = null;
        this.a = fm0;
    }

    public abstract du b(int arg1);

    @Override  // pch
    public final Object c(ViewGroup viewGroup0, int v) {
        if(this.b == null) {
            this.b = new ca(this.a);
        }
        String s = fr.o(viewGroup0.getId(), ((long)v));
        Object object0 = this.a.h(s);
        if(object0 == null) {
            object0 = this.b(v);
            this.b.u(viewGroup0.getId(), ((du)object0), fr.o(viewGroup0.getId(), ((long)v)));
        }
        else {
            this.b.x(((du)object0));
        }
        if(object0 != this.c) {
            ((du)object0).setMenuVisibility(false);
            ((du)object0).setUserVisibleHint(false);
        }
        return object0;
    }

    @Override  // pch
    public final void d(ViewGroup viewGroup0, int v, Object object0) {
        if(this.b == null) {
            this.b = new ca(this.a);
        }
        this.b.m(((du)object0));
        if(((du)object0).equals(this.c)) {
            this.c = null;
        }
    }

    @Override  // pch
    public final void e(Parcelable parcelable0, ClassLoader classLoader0) {
    }

    @Override  // pch
    public final void f(ViewGroup viewGroup0, int v, Object object0) {
        du du0 = this.c;
        if(((du)object0) != du0) {
            if(du0 != null) {
                du0.setMenuVisibility(false);
                this.c.setUserVisibleHint(false);
            }
            ((du)object0).setMenuVisibility(true);
            ((du)object0).setUserVisibleHint(true);
            this.c = (du)object0;
        }
    }

    @Override  // pch
    public final void g(ViewGroup viewGroup0) {
        if(viewGroup0.getId() != -1) {
            return;
        }
        throw new IllegalStateException(a.i(this, "ViewPager with adapter ", " requires a view id"));
    }

    @Override  // pch
    public final boolean h(View view0, Object object0) {
        return ((du)object0).getView() == view0;
    }

    @Override  // pch
    public final void i() {
        fz fz0 = this.b;
        if(fz0 != null) {
            if(!this.e) {
                try {
                    this.e = true;
                    fz0.g();
                    this.e = false;
                }
                catch(Throwable throwable0) {
                    this.e = false;
                    throw throwable0;
                }
            }
            this.b = null;
        }
    }

    @Override  // pch
    public final Parcelable kj() {
        return null;
    }

    private static String o(int v, long v1) {
        return a.n(v1, v, "android:switcher:", ":");
    }
}

