import java.util.ArrayList;
import java.util.List;

public final class hmcl extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        List list0 = new ArrayList();
        int v = 0;
        try {
            if(hmgf0.e() == 2) {
                v = (int)Integer.valueOf(hmgz.e(((hmgd)hmgf0).a.b).i(), 16);
            }
            if(hmgf0.e() == 3) {
                hmge hmge0 = (hmge)hmgf0;
                throw null;
            }
        }
        catch(NumberFormatException unused_ex) {
            list0.add(hmhq.h);
        }
        if(v > 999 || v < 0) {
            list0.add(hmhq.h);
        }
        return list0;
    }
}

