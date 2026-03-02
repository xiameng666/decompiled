import java.util.Arrays;
import java.util.List;

public class igwl extends igvx {
    public int e;

    public igwl(igvt igvt0) {
        this(igvt0, "HalfDayOfWeek", Arrays.asList(new String[]{"Monday first period", "Monday second period", "Tuesday first period", "Tuesday second period", "Wednesday first period", "Wednesday second period", "Thursday first period", "Thursday second period", "Friday first period", "Friday second period", "Saturday first period", "Saturday second period", "Sunday first period", "Sunday second period", "Special day first period", "Special day second period"}));
    }

    public igwl(igvt igvt0, String s, List list0) {
        super(igvt0, s);
        int v = list0.size();
        if(v <= 0) {
            throw new Exception("Must supply a list of field names");
        }
        igvv igvv0 = igvt0.e();
        for(Object object0: list0) {
            this.e(new igwr(igvt0, ((String)object0)));
        }
        igvt0.g(igvv0);
        this.e = igvt0.c(v);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (int)this.e;
    }

    @Override  // igvx
    public final String toString() {
        String s = Integer.toBinaryString(this.e);
        return "b" + new String(new char[(this.c.c - s.length() >= 0 ? this.c.c - s.length() : 0)]).replace("\u0000", "0") + s;
    }
}

