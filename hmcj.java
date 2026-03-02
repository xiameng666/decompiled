import java.util.ArrayList;
import java.util.List;

public final class hmcj extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        byte[] arr_b;
        List list0 = new ArrayList();
        if(hmgf0.e() == 2) {
            arr_b = ((hmgd)hmgf0).a.a;
            goto label_6;
        }
        if(hmgf0.e() != 3) {
            arr_b = null;
        label_6:
            if(arr_b != null && arr_b.length > 0) {
                try {
                    long v = (long)Long.valueOf(hmgz.e(arr_b).i(), 16);
                    if(v < 0L || v > 0xE8D4A50FFFL) {
                        list0.add(hmhq.h);
                        return list0;
                    }
                }
                catch(NumberFormatException unused_ex) {
                    list0.add(hmhq.h);
                }
            }
            return list0;
        }
        hmge hmge0 = (hmge)hmgf0;
        throw null;
    }
}

