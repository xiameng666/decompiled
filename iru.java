import android.view.View;
import android.view.ViewParent;
import java.util.Set;

final class iru extends ibur implements ibtw {
    final irw a;
    final ibtw b;

    public iru(irw irw0, ibtw ibtw0) {
        this.a = irw0;
        this.b = ibtw0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            irw irw0 = this.a;
            ili ili0 = irw0.a;
            Object object2 = ili0.getTag(0x7F0B1730);  // id:inspection_slot_table_set
            Set set0 = ibvh.g(object2) ? ((Set)object2) : null;
            if(set0 == null) {
                ViewParent viewParent0 = ili0.getParent();
                View view0 = (viewParent0 instanceof View) ? ((View)viewParent0) : null;
                Object object3 = view0 == null ? null : view0.getTag(0x7F0B1730);  // id:inspection_slot_table_set
                set0 = ibvh.g(object3) ? ((Set)object3) : null;
            }
            if(set0 != null) {
                set0.add(((goz)object0).f());
                ((goz)object0).r();
            }
            boolean z = ((goz)object0).Z(irw0);
            Object object4 = ((goz)object0).k();
            if(z || object4 == gop.a) {
                object4 = new irr(irw0, null);
                ((goz)object0).R(object4);
            }
            gqe.f(ili0, ((ibtw)object4), ((goz)object0));
            boolean z1 = ((goz)object0).Z(irw0);
            Object object5 = ((goz)object0).k();
            if(z1 || object5 == gop.a) {
                object5 = new irs(irw0, null);
                ((goz)object0).R(object5);
            }
            gqe.f(ili0, ((ibtw)object5), ((goz)object0));
            gpo.a(heb.a.c(set0), gzf.e(0xEF4BDF0F, new irt(irw0, this.b), ((goz)object0)), ((goz)object0), 56);
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

