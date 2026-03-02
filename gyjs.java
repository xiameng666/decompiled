import java.util.Arrays;

public final class gyjs {
    public final long a;
    public final long b;

    public gyjs(long v, long v1) {
        boolean z = true;
        batl.b(Long.compare(v, 0L) >= 0);
        batl.b(v1 >= 0L);
        if(v1 > v) {
            z = false;
        }
        batl.b(z);
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof gyjs) && ((gyjs)object0).a == this.a && ((gyjs)object0).b == this.b;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b)});
    }
}

