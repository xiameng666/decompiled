import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gbmd implements pad {
    public final ViewGroup a;
    public int b;
    public boolean c;
    public final bxf d;
    public gasm e;

    public gbmd(ViewGroup viewGroup0) {
        this.d = new bxf();
        this.a = viewGroup0;
    }

    @Override  // pad
    public final void a(pak pak0) {
    }

    @Override  // pad
    public final void b(pak pak0) {
        ArrayList arrayList0 = this.e.b.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gatb)arrayList0.get(v1)).f.D();
        }
    }

    @Override  // pad
    public final void c() {
    }

    @Override  // pad
    public final void d() {
    }

    @Override  // pad
    public final void e(pak pak0) {
        this.h();
    }

    @Override  // pad
    public final void f(pak pak0) {
        pac.a(this, pak0);
    }

    @Override  // pad
    public final void g(pak pak0) {
        pac.b(this, pak0);
    }

    public final void h() {
        this.c = false;
        this.d.clear();
        this.b = 0;
    }

    public final void i(boolean z, List list0) {
        if(this.b == 0) {
            this.d.addAll(list0);
            this.b = 1;
            this.c = z;
        }
    }

    public final boolean j() {
        return this.b == 1 || this.k();
    }

    public final boolean k() {
        return this.b == 2;
    }

    public final hdtk l(View view0, int v) {
        Object object0 = view0.getTag((this.c ? 0x7F0B1075 : 0x7F0B2353));  // id:custom_transition_properties
        if((object0 instanceof hdtl)) {
            for(Object object1: ((hdtl)object0).b) {
                hdtk hdtk0 = (hdtk)object1;
                if((hdtk0.d.size() <= 0 || !Collections.disjoint(hdtk0.d, this.d)) && (v == 0 || (hdtk0.b & 2) == 0 || (hdtj.a(hdtk0.e) == 0 ? 1 : hdtj.a(hdtk0.e)) == v)) {
                    return hdtk0;
                }
            }
        }
        return null;
    }

    public final hdzs m(View view0, int v) {
        hdtk hdtk0 = this.l(view0, v);
        if(hdtk0 != null) {
            int v1 = hdtk0.c;
            if(this.c) {
                bzt bzt0 = this.e.f;
                return bzt0 == null ? null : ((hdzs)bzu.a(bzt0, v1));
            }
            bzt bzt1 = this.e.e;
            return bzt1 == null ? null : ((hdzs)bzu.a(bzt1, v1));
        }
        return null;
    }
}

