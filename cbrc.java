import android.view.View;
import android.widget.ListView;
import java.util.List;

public final class cbrc implements ibts {
    public final cbrh a;
    public final View b;

    public cbrc(cbrh cbrh0, View view0) {
        this.a = cbrh0;
        this.b = view0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = (List)object0;
        xob xob0 = xoc.b(this.a);
        cbrf cbrf0 = new cbrf();
        ibuq.c(list0);
        zdr zdr0 = new zdr(xob0, 0x7F0E091E, cbrf0, ibpo.at(list0));  // layout:select_parent_item
        zdr0.d = 0x7F080761;  // drawable:ic_logo_avatar_circle
        View view0 = this.b.requireViewById(0x7F0B182D);  // id:list_view
        ibuq.e(view0, "requireViewById(...)");
        ListView listView0 = (ListView)view0;
        listView0.setAdapter(zdr0);
        listView0.setOnItemClickListener(new cbre(this.a, zdr0));
        return ibom.a;
    }
}

