import j..time.YearMonth;
import j..time.format.DateTimeFormatter;
import java.util.Arrays;

public final class rfz {
    public static final rfy a;
    private final YearMonth b;
    private final Integer c;

    static {
        rfz.a = new rfy();
    }

    public rfz(YearMonth yearMonth0, Integer integer0) {
        ibuq.f(yearMonth0, "yearMonth");
        super();
        this.b = yearMonth0;
        this.c = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rfz)) {
            return false;
        }
        return ibuq.m(this.b, ((rfz)object0).b) ? ibuq.m(this.c, ((rfz)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        String s = DateTimeFormatter.ofPattern("yyyyMM").format(this.b);
        Integer integer0 = this.c;
        if(integer0 != null) {
            String s1 = String.format((s + "%02d"), Arrays.copyOf(new Object[]{integer0}, 1));
            ibuq.e(s1, "format(...)");
            return s1;
        }
        ibuq.c(s);
        return s;
    }
}

