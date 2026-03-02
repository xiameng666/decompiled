import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class hmcm extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        List list0 = new ArrayList();
        hmhd hmhd0 = hmgf0.e() == 2 ? new hmhd(((hmgd)hmgf0).a.d) : null;
        if(hmgf0.e() != 3) {
            if(hmhd0 != null) {
                Calendar calendar0 = Calendar.getInstance();
                calendar0.clear();
                int v = hmhd0.a + 2000;
                if(v > 2000) {
                    calendar0.set(1, v);
                    int v1 = hmhd0.c;
                    if(v1 <= 0 || v1 > 12) {
                        list0.add(hmhq.h);
                        return list0;
                    }
                    calendar0.set(2, v1 - 1);
                    int v2 = calendar0.getActualMaximum(5);
                    if(calendar0.getActualMinimum(5) > hmhd0.b || hmhd0.b > v2) {
                        list0.add(hmhq.h);
                        return list0;
                    }
                }
                else {
                    list0.add(hmhq.h);
                }
            }
            return list0;
        }
        hmge hmge0 = (hmge)hmgf0;
        throw null;
    }
}

