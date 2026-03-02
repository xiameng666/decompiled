import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class auhy implements Comparable {
    public final auah a;
    public boolean b;
    public final String c;
    private final Set d;
    private final long e;

    public auhy(auah auah0, gkfz gkfz0, boolean z, long v, String s) {
        this.a = auah0;
        this.b = z;
        this.e = v;
        this.c = s;
        HashSet hashSet0 = new HashSet();
        this.d = hashSet0;
        if(gkfz0 != null) {
            hashSet0.add(gkfz0);
        }
    }

    final int a() {
        Set set0 = this.d;
        if(set0.isEmpty()) {
            return 6;
        }
        int v = 6;
        for(Object object0: set0) {
            int v1 = ((gkfz)object0).ordinal();
            int v2 = 5;
            if(v1 != 1) {
                switch(v1) {
                    case 2: {
                        v2 = 0;
                        break;
                    }
                    case 5: {
                        v2 = 4;
                        break;
                    }
                    case 7: {
                        v2 = 2;
                        break;
                    }
                    case 9: {
                        v2 = 3;
                        break;
                    }
                    case 10: {
                        v2 = 1;
                        break;
                    }
                    default: {
                        v2 = 6;
                    }
                }
            }
            v = Math.min(v, v2);
        }
        return v;
    }

    public final Set b() {
        return new HashSet(this.d);
    }

    public final void c(auhy auhy0) {
        this.b |= auhy0.b;
        Set set0 = auhy0.b();
        this.d.addAll(set0);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a() - ((auhy)object0).a();
        return v == 0 ? Long.compare(this.e, ((auhy)object0).e) : v;
    }

    public final boolean d() {
        return this.a.c == null ? false : this.a() <= 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof auhy) ? bata.b(this.a, ((auhy)object0).a) && bata.b(this.d, ((auhy)object0).d) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((auhy)object0).b)) && bata.b(Long.valueOf(this.e), Long.valueOf(((auhy)object0).e)) && bata.b(this.c, ((auhy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, Boolean.valueOf(this.b), ((long)this.e), this.c});
    }

    @Override
    public final String toString() {
        Set set0 = this.d;
        if(set0.isEmpty()) {
            return String.format(Locale.ROOT, "TcpProbingOperation {%s, reasons=%s, originalDeviceId=%s, timestamp=%d, shouldRequestRat=%b}", this.a, "0", this.c, ((long)this.e), Boolean.valueOf(this.b));
        }
        String s = "";
        for(Object object0: set0) {
            s = s + ((gkfz)object0).l + "/";
        }
        return String.format(Locale.ROOT, "TcpProbingOperation {%s, reasons=%s, originalDeviceId=%s, timestamp=%d, shouldRequestRat=%b}", this.a, s, this.c, ((long)this.e), Boolean.valueOf(this.b));
    }
}

