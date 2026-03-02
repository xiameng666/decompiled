import android.text.TextUtils.TruncateAt;
import java.util.ArrayList;
import java.util.List;

final class bdde {
    public static final List a(List list0, List list1, boolean z) {
        List list2 = ibpo.au(list0, list1);
        List list3 = new ArrayList(ibpo.q(list2, 10));
        for(Object object0: list2) {
            hhyo hhyo0 = (hhyo)((ibns)((ibns)object0).a).b;
            bddg bddg0 = new bddg();
            String s = hhyo0.c;
            ibuq.e(s, "getName(...)");
            hhyc hhyc0 = hhyc.b(hhyo0.d) == null ? hhyc.a : hhyc.b(hhyo0.d);
            ibuq.e(hhyc0, "getElideInfo(...)");
            ibuq.f(hhyc0, "<this>");
            bddk bddk0 = new bddk(s, (hhyc0 == hhyc.b ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END));
            String s1 = ((gqmd)((ibns)((ibns)object0).a).a).k();
            ibuq.e(s1, "getUsername(...)");
            list3.add(new bddj(bddg0, bddk0, s1, ((Boolean)((ibns)object0).b).booleanValue(), z));
        }
        return list3;
    }

    public static List b(List list0, List list1) {
        return bdde.a(list0, list1, true);
    }
}

