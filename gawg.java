import java.util.List;

public final class gawg {
    public static gged_interceptors a(List list0, byi byi0) {
        int v = list0.size();
        ggdy ggdy0 = new ggdy();
        for(int v1 = 0; v1 < v; ++v1) {
            hdrl hdrl0 = (hdrl)list0.get(v1);
            hdrl hdrl1 = (hdrl)byi0.d(hdrl0.c);
            if(hdrl1 == null) {
                ggdy0.i(hdrl0);
            }
            else {
                ggdy0.i(hdrl1);
            }
        }
        return ggdy0.h();
    }

    public static hdrl b(long v, List list0) {
        for(Object object0: list0) {
            hdrl hdrl0 = (hdrl)object0;
            if(hdrl0.e == v) {
                return hdrl0;
            }
        }
        return null;
    }
}

