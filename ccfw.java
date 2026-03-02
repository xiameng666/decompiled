import java.util.List;

public final class ccfw implements gftc {
    public final String a;
    public final List b;

    public ccfw(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return !(((fnan)object0).c == 13 ? ((fnah)((fnan)object0).d) : fnah.a).c.equals(this.a) || (((fnan)object0).c == 13 ? ((fnah)((fnan)object0).d) : fnah.a).h.isEmpty() ? false : (((fnan)object0).c == 13 ? ((fnah)((fnan)object0).d) : fnah.a).h.equals(this.b);
    }
}

