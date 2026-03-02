import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.gms.pay.SetSortOrderRequest;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.pay.SortOrderInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class doge extends lh implements dogj, lom, lqj {
    public static final bboh e;
    private static final lp f;
    private final doga g;
    private final Map h;
    private final String i;
    private final lps j;
    private final azts k;

    static {
        doge.e = bboh.b("Pay", bbcu.cZ);
        doge.f = new dogd();
    }

    public doge(doga doga0, lps lps0, azts azts0, String s, Map map0) {
        super(doge.f);
        this.h = map0;
        this.i = s;
        this.k = azts0;
        this.g = doga0;
        this.j = lps0;
    }

    private final doey G(int v) {
        Integer integer0 = v;
        return this.h.containsKey(integer0) ? ((doey)this.h.get(integer0)) : ((doey)this.h.get(Integer.valueOf(-1)));
    }

    @Override  // lh
    public final int b() {
        return this.d().size();
    }

    @Override  // tk
    public final int dx(int v) {
        return ((dohd)this.d().get(v)).b();
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)((dohd)this.d().get(v)).d().hashCode();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        doey doey0 = this.G(v);
        if(doey0 != null) {
            return doey0.a(viewGroup0);
        }
        throw new IllegalStateException("Could not find view binder");
    }

    @Override  // dogj
    public final void f(int v, int v1) {
        this.jQ(doex.a(v, v1, gged_interceptors.i(this.d())));
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        doey doey0 = this.G(((dohd)this.c(v)).b());
        if(doey0 != null) {
            doey0.b(uq0, ((edxb)this.c(v)));
        }
    }

    @Override  // tk
    public final void hE(RecyclerView recyclerView0) {
        this.g.g(this.j, this);
    }

    @Override  // lh
    public final void jQ(List list0) {
        super.jQ((list0 == null ? null : new ArrayList(list0)));
    }

    @Override  // lqj
    public final void jS(Object object0) {
        this.jQ((((dofl)object0) == null ? ggna.a : ((dofl)object0).a));
    }

    @Override  // dogj
    public final void n() {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < this.b(); ++v) {
            SortItem sortItem0 = new SortItem();
            sortItem0.a = ((dohd)this.c(v)).d();
            sortItem0.b = (long)v;
            ggdy0.i(sortItem0);
        }
        SetSortOrderRequest setSortOrderRequest0 = new SetSortOrderRequest();
        SortOrderInfo sortOrderInfo0 = new SortOrderInfo();
        sortOrderInfo0.b = (SortItem[])ggdy0.h().toArray(new SortItem[0]);
        sortOrderInfo0.a = 1;
        setSortOrderRequest0.b = sortOrderInfo0;
        setSortOrderRequest0.a = this.i;
        this.k.bs(setSortOrderRequest0).A(new dogc());
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        this.g.c();
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

