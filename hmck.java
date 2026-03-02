import java.util.ArrayList;
import java.util.List;

public final class hmck extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        long v;
        List list0 = new ArrayList();
        try {
            if(hmgf0.e() == 2) {
                byte[] arr_b = ((hmgd)hmgf0).a.e;
                if(arr_b != null) {
                    v = (long)(((int)Integer.valueOf(hmgz.e(arr_b).i(), 16)));
                    goto label_10;
                }
            }
            else {
                v = 0L;
                goto label_10;
            }
            return list0;
        }
        catch(NumberFormatException unused_ex) {
            v = 0L;
            goto label_13;
        }
        try {
        label_10:
            if(hmgf0.e() == 3) {
                hmge hmge0 = (hmge)hmgf0;
                throw null;
            }
            goto label_14;
        }
        catch(NumberFormatException unused_ex) {
        }
    label_13:
        list0.add(hmhq.h);
    label_14:
        if(v < 0L || v > 999L) {
            list0.add(hmhq.h);
        }
        return list0;
    }
}

