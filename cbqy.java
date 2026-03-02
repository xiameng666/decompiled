import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Collection;
import java.util.List;

public final class cbqy implements lqj {
    public final cbrb a;
    public final View b;

    public cbqy(cbrb cbrb0, View view0) {
        this.a = cbrb0;
        this.b = view0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ibuq.f(((List)object0), "it");
        Object object1 = this.a.y().e.ij();
        ibuq.c(object1);
        List list0 = ibpo.at(((Collection)object1));
        this.a.b.jQ(list0);
        List list1 = ibpo.b(cbpv.a);
        this.a.c.jQ(list1);
        View view0 = this.b.findViewById(0x7F0B1E20);  // id:recycler_view
        ibuq.e(view0, "findViewById(...)");
        RecyclerView recyclerView0 = (RecyclerView)view0;
        recyclerView0.an(new qq(new tk[]{this.a.b, this.a.c}));
        recyclerView0.A(new gagd(this.a.requireContext()));
    }
}

