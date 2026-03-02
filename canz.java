import java.util.List;

public final class canz implements evqf {
    public final caod a;
    public final List b;
    public final jqt c;

    public canz(caod caod0, List list0, jqt jqt0) {
        this.a = caod0;
        this.b = list0;
        this.c = jqt0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        List list0 = this.b;
        this.a.e.c(list0.size());
        this.c.b(Boolean.valueOf(true));
        int v = this.a.d.a(list0);
        if(v != list0.size()) {
            ((ggtj)((ggtj)caod.a.i()).ar(5994)).F("Intermediate store ids Addition failed: ids added: %d, ids should have been added: %d", v, list0.size());
            cakj.a().c(53);
        }
    }
}

