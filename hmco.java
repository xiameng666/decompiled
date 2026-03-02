import java.util.ArrayList;
import java.util.List;

public final class hmco extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        List list0 = new ArrayList();
        try {
            if(hmgf0.e() == 2) {
                long v = (long)Long.valueOf(hmgz.e(((hmgd)hmgf0).a.c).i(), 16);
                if(v == 0L || v >= 0xFFFFFFFFL) {
                    list0.add(hmhq.h);
                }
            }
        }
        catch(NumberFormatException unused_ex) {
            list0.add(hmhq.h);
        }
        return list0;
    }
}

