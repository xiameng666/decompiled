import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aui {
    public static final Range a;
    public final awp b;
    public final ibnn c;
    private final ibnn d;
    private final ibnn e;

    static {
        Integer integer0 = (int)120;
        aui.a = new Range(integer0, integer0);
    }

    public aui(awp awp0) {
        this.b = awp0;
        this.d = new ibnz(new auf(this));
        this.c = new ibnz(new aug(this));
        this.e = new ibnz(new auh(this));
    }

    public final List a(Size size0) {
        Range[] arr_range;
        try {
            arr_range = this.b.b().b.a.getHighSpeedVideoFpsRangesFor(size0);
        }
        catch(Throwable throwable0) {
            arr_range = ibnx.a(throwable0);
        }
        if((arr_range instanceof ibnv)) {
            arr_range = null;
        }
        if(arr_range != null) {
            List list0 = ibpo.ar(ibpg.H(arr_range));
            if(list0 != null) {
                return list0;
            }
        }
        return ibps.a;
    }

    public final List b() {
        return (List)this.e.a();
    }

    public final boolean c() {
        return ((Boolean)this.d.a()).booleanValue();
    }

    public final Range[] d(List list0) {
        int v = list0.size();
        if(v > 0 && v < 3 && ibpo.ae(list0).size() == 1) {
            List list1 = this.a(((Size)list0.get(0)));
            if(list1.isEmpty()) {
                list1 = null;
            }
            if(list1 != null) {
                if(list0.size() == 2) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: list1) {
                        if(ibuq.m(((Range)object0).getLower(), ((Range)object0).getUpper())) {
                            arrayList0.add(object0);
                        }
                    }
                    list1 = arrayList0;
                }
                return (Range[])list1.toArray(new Range[0]);
            }
        }
        return null;
    }

    public static final List e(List list0) {
        if(list0.isEmpty()) {
            return ibps.a;
        }
        List list1 = ibpo.at(((Collection)ibpo.R(list0)));
        for(Object object0: ibpo.af(list0, 1)) {
            list1.retainAll(((List)object0));
        }
        return list1;
    }
}

