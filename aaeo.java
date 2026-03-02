import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

public class aaeo extends tk {
    private aacg a;
    private aaby e;
    public List g;
    public final aacf h;
    public final Context i;
    public final zem j;

    public aaeo(Context context0, List list0, aacf aacf0, zem zem0) {
        this.g = list0;
        this.h = aacf0;
        this.i = context0;
        this.j = zem0;
    }

    @Override  // tk
    public final int b() {
        return this.g.size();
    }

    @Override  // tk
    public uq dz(ViewGroup viewGroup0, int v) {
        throw null;
    }

    public final void f(aaby aaby0, aacg aacg0) {
        this.e = aaby0;
        this.a = aacg0;
        this.n();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ((aaep)uq0).D(((aaem)this.g.get(v)));
    }

    public final void n() {
        if(this.e != null) {
            if(!this.g.isEmpty() && ((aaem)this.g.get(0)).a() == 1) {
                aaeq aaeq0 = (aaeq)this.g.get(0);
                aaby aaby0 = this.e;
                batl.s(aaby0);
                aaeq0.a = aaby0;
                this.r(0);
                return;
            }
            List list0 = this.g;
            aaby aaby1 = this.e;
            batl.s(aaby1);
            list0.add(0, new aaeq(aaby1, this.a));
            this.s(0);
            return;
        }
        if(!this.g.isEmpty() && ((aaem)this.g.get(0)).a() == 1) {
            this.g.remove(0);
            this.y(0);
        }
    }
}

