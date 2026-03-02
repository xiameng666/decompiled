import java.util.ArrayList;
import java.util.List;

public final class hmce extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        List list0 = new ArrayList();
        if(hmgf0.e() == 1) {
            hmgc hmgc0 = (hmgc)hmgf0;
            hmdi hmdi0 = hmgc0.e;
            hmgs hmgs0 = hmgc.a;
            if(hmgs0 != null) {
                hmbb hmbb0 = this.a;
                hmbb0.e();
                try {
                    Long long0 = (Long)hmdi0.b().a;
                    String s = (String)hmdi0.j().a;
                    boolean z = ((hmft)hmgc0.i).a;
                    if(((long)(((Long)hmgs0.a.a))) != ((long)long0) || (!((String)hmgs0.b.a).equals(s) || hmgs0.c != z)) {
                        hmbb0.a("Second tap values: amount %s, currencyCode %s, isAlternateAid %s", new Object[]{long0, s, Boolean.valueOf(z)});
                        goto label_13;
                    }
                    return list0;
                }
                catch(hmdp unused_ex) {
                }
            label_13:
                list0.add(hmhq.a);
            }
        }
        return list0;
    }
}

