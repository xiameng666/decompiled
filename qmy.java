import java.util.ArrayList;
import java.util.List;

public final class qmy {
    public final List a;
    public final List b;
    public final List c;

    public qmy(List list0) {
        this.c = list0;
        this.a = new ArrayList(list0.size());
        this.b = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            qnd qnd0 = ((qqq)list0.get(v)).a.d();
            this.a.add(qnd0);
            qmq qmq0 = ((qqq)list0.get(v)).b.a();
            this.b.add(qmq0);
        }
    }
}

