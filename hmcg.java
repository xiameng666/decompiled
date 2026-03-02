import java.util.ArrayList;
import java.util.List;

public final class hmcg extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        List list0 = new ArrayList();
        esrk esrk0 = hmgf0.u;
        switch(hmgf0.e() - 1) {
            case 0: {
                goto label_4;
            }
            case 1: {
                goto label_6;
            }
        }
        list0.add(hmhq.c);
        return list0;
    label_4:
        if(esrk0.a.c.isEmpty() || esrk0.a.b.isEmpty()) {
            list0.add(hmhq.c);
            return list0;
        }
        return list0;
    label_6:
        if(esrk0.a.g.isEmpty() || esrk0.a.f.isEmpty()) {
            list0.add(hmhq.c);
            return list0;
        }
        return list0;
    }
}

