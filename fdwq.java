import java.util.Arrays;

public final class fdwq {
    public long a;
    public long b;
    public long c;
    public long d;

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fdwq) ? this.a == ((fdwq)object0).a && this.b == ((fdwq)object0).b && this.c == ((fdwq)object0).c && this.d == ((fdwq)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b), ((long)this.c), ((long)this.d)});
    }
}

