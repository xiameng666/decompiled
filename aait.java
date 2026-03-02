import android.view.View;
import android.view.ViewGroup;
import j..util.Objects;

final class aait extends fw {
    final aaiu e;

    public aait(aaiu aaiu0, fm fm0) {
        Objects.requireNonNull(aaiu0);
        this.e = aaiu0;
        super(fm0);
    }

    @Override  // fw
    public final du b(int v) {
        return aahd.z(new aami(((aaoz)this.e.aj.get(v)).d));
    }

    @Override  // pch
    public final void f(ViewGroup viewGroup0, int v, Object object0) {
        du du0 = this.c;
        if(((du)object0) != du0) {
            if(du0 != null) {
                du0.setMenuVisibility(false);
                if(this.b == null) {
                    this.b = new ca(this.a);
                }
                this.b.p(this.c, lpf.d);
            }
            ((du)object0).setMenuVisibility(true);
            if(this.b == null) {
                this.b = new ca(this.a);
            }
            this.b.p(((du)object0), lpf.e);
            this.c = (du)object0;
        }
        if(hoju.p()) {
            for(int v1 = 0; v1 < viewGroup0.getChildCount(); ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                fhvs fhvs0 = fhwh.c(view0);
                if(fhvs0 != null) {
                    if(!this.h(view0, object0)) {
                        if(fhvs0.h() == 1) {
                            fhvs0.i(2);
                        }
                    }
                    else if(fhvs0.h() == 2) {
                        fhvs0.i(1);
                    }
                }
            }
        }
    }

    @Override  // pch
    public final int j() {
        return this.e.aj.size();
    }

    @Override  // pch
    public final int k(Object object0) {
        return -2;
    }

    @Override  // pch
    public final CharSequence l(int v) {
        return ((aaoz)this.e.aj.get(v)).a;
    }
}

