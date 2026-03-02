import j..util.Objects;
import java.util.List;

final class abva extends bwzp {
    final String a;
    final bwua b;
    final List c;
    final List d;
    final abve e;

    public abva(abve abve0, gltq gltq0, String s, String s1, bwua bwua0, List list0, List list1) {
        this.a = s1;
        this.b = bwua0;
        this.c = list0;
        this.d = list1;
        Objects.requireNonNull(abve0);
        this.e = abve0;
        super(gltq0, 2, s);
    }

    @Override  // bwzp
    public final Object a() {
        bwmx bwmx0 = this.e.a;
        bwur bwur0 = bwmx0.e();
        String s = this.a;
        if(s == null) {
            bwua bwua1 = this.b;
            gged_interceptors gged0 = bwur0.m(bwua1);
            int v1 = ((ggna)gged0).c;
            for(int v = 0; v < v1; ++v) {
                bwvl bwvl1 = (bwvl)gged0.get(v);
                bwuw bwuw1 = bwur0.j(bwvl1);
                if(bwuw1 != null && bwuw1.k(1)) {
                    if(bwur.F(((bwnq)bwuw1.e()))) {
                        String s2 = ((bwnq)bwuw1.e()).g;
                        this.d.add(s2);
                    }
                    Boolean boolean1 = Boolean.valueOf(bwmx0.L(bwvl1, bwua1));
                    this.c.add(boolean1);
                }
            }
        }
        else {
            bwua bwua0 = this.b;
            bwvl bwvl0 = new bwvl(bwua0.b, s);
            bwuw bwuw0 = bwur0.j(bwvl0);
            if(bwuw0 != null) {
                if(!bwuw0.k(1)) {
                    bwne.i("unregister: cannot %s when previously %s", "set from runtime API", bwuw0.g());
                    this.c.add(Boolean.valueOf(false));
                    return null;
                }
                String s1 = ((bwnq)bwuw0.e()).g;
                this.d.add(s1);
                Boolean boolean0 = Boolean.valueOf(bwmx0.L(bwvl0, bwua0));
                this.c.add(boolean0);
                return null;
            }
        }
        return null;
    }
}

