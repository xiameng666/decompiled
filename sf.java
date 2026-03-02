import android.view.View;
import java.util.List;

public final class sf {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public List l;
    public boolean m;

    public sf() {
        this.a = true;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.l = null;
    }

    public final View a(uf uf0) {
        List list0 = this.l;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((uq)this.l.get(v1)).a;
                ty ty0 = (ty)view0.getLayoutParams();
                if(!ty0.fG() && this.d == ty0.fE()) {
                    this.c(view0);
                    return view0;
                }
            }
            return null;
        }
        View view1 = uf0.c(this.d);
        this.d += this.e;
        return view1;
    }

    public final void b() {
        this.c(null);
    }

    public final void c(View view0) {
        int v = this.l.size();
        int v1 = 0;
        int v2 = 0x7FFFFFFF;
        View view1 = null;
        while(v1 < v) {
            View view2 = ((uq)this.l.get(v1)).a;
            ty ty0 = (ty)view2.getLayoutParams();
            if(view2 != view0 && !ty0.fG()) {
                int v3 = (ty0.fE() - this.d) * this.e;
                if(v3 < 0 || v3 >= v2) {
                    ++v1;
                    continue;
                }
                else if(v3 == 0) {
                    view1 = view2;
                }
                else {
                    view1 = view2;
                    v2 = v3;
                    ++v1;
                    continue;
                }
                break;
            }
            ++v1;
        }
        if(view1 == null) {
            this.d = -1;
            return;
        }
        this.d = ((ty)view1.getLayoutParams()).fE();
    }

    public final boolean d(un un0) {
        return this.d >= 0 && this.d < un0.a();
    }
}

