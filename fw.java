import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

@Deprecated
public abstract class fw extends pch {
    public final fm a;
    public fz b;
    public du c;
    private final ArrayList e;
    private final ArrayList f;
    private boolean g;

    public fw(fm fm0) {
        this.b = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.c = null;
        this.a = fm0;
    }

    public abstract du b(int arg1);

    @Override  // pch
    public final Object c(ViewGroup viewGroup0, int v) {
        ArrayList arrayList0 = this.f;
        if(arrayList0.size() > v) {
            Object object0 = (du)arrayList0.get(v);
            if(object0 != null) {
                return object0;
            }
        }
        if(this.b == null) {
            this.b = new ca(this.a);
        }
        Object object1 = this.b(v);
        ArrayList arrayList1 = this.e;
        if(arrayList1.size() > v) {
            Fragment.SavedState fragment$SavedState0 = (Fragment.SavedState)arrayList1.get(v);
            if(fragment$SavedState0 != null) {
                ((du)object1).setInitialSavedState(fragment$SavedState0);
            }
        }
        while(arrayList0.size() <= v) {
            arrayList0.add(null);
        }
        ((du)object1).setMenuVisibility(false);
        arrayList0.set(v, object1);
        this.b.t(viewGroup0.getId(), ((du)object1));
        this.b.p(((du)object1), lpf.d);
        return object1;
    }

    @Override  // pch
    public final void d(ViewGroup viewGroup0, int v, Object object0) {
        ArrayList arrayList0;
        if(this.b == null) {
            this.b = new ca(this.a);
        }
        while(true) {
            arrayList0 = this.e;
            if(arrayList0.size() > v) {
                break;
            }
            arrayList0.add(null);
        }
        arrayList0.set(v, (((du)object0).isAdded() ? this.a.d(((du)object0)) : null));
        this.f.set(v, null);
        this.b.o(((du)object0));
        if(((du)object0).equals(this.c)) {
            this.c = null;
        }
    }

    @Override  // pch
    public final void e(Parcelable parcelable0, ClassLoader classLoader0) {
        if(parcelable0 != null) {
            ((Bundle)parcelable0).setClassLoader(classLoader0);
            Parcelable[] arr_parcelable = ((Bundle)parcelable0).getParcelableArray("states");
            ArrayList arrayList0 = this.e;
            arrayList0.clear();
            ArrayList arrayList1 = this.f;
            arrayList1.clear();
            if(arr_parcelable != null) {
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    arrayList0.add(((Fragment.SavedState)arr_parcelable[v]));
                }
            }
            for(Object object0: ((Bundle)parcelable0).keySet()) {
                String s = (String)object0;
                if(s.startsWith("f")) {
                    int v1 = Integer.parseInt(s.substring(1));
                    du du0 = this.a.j(((Bundle)parcelable0), s);
                    if(du0 == null) {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + s);
                    }
                    else {
                        while(arrayList1.size() <= v1) {
                            arrayList1.add(null);
                        }
                        du0.setMenuVisibility(false);
                        arrayList1.set(v1, du0);
                    }
                }
            }
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
            if(!this.g) {
                try {
                    this.g = true;
                    fz0.g();
                    this.g = false;
                }
                catch(Throwable throwable0) {
                    this.g = false;
                    throw throwable0;
                }
            }
            this.b = null;
        }
    }

    @Override  // pch
    public final Parcelable kj() {
        Parcelable parcelable0;
        ArrayList arrayList0 = this.e;
        if(arrayList0.size() > 0) {
            parcelable0 = new Bundle();
            Fragment.SavedState[] arr_fragment$SavedState = new Fragment.SavedState[arrayList0.size()];
            arrayList0.toArray(arr_fragment$SavedState);
            ((Bundle)parcelable0).putParcelableArray("states", arr_fragment$SavedState);
        }
        else {
            parcelable0 = null;
        }
        for(int v = 0; true; ++v) {
            ArrayList arrayList1 = this.f;
            if(v >= arrayList1.size()) {
                break;
            }
            du du0 = (du)arrayList1.get(v);
            if(du0 != null && du0.isAdded()) {
                if(parcelable0 == null) {
                    parcelable0 = new Bundle();
                }
                this.a.Y(((Bundle)parcelable0), "f" + v, du0);
            }
        }
        return parcelable0;
    }
}

