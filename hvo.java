import java.util.List;

public final class hvo {
    public final byi a;
    public final hwh b;
    public boolean c;

    public hvo(byi byi0, hwh hwh0) {
        this.a = byi0;
        this.b = hwh0;
    }

    public final boolean a(long v) {
        List list0 = this.b.a;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(hwd.b(((hwj)object0).a, v)) {
                return ((hwj)object0) == null ? false : ((hwj)object0).h;
            }
        }
        return false;
    }
}

