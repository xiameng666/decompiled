package j$.util;

import java.util.NoSuchElementException;

public final class OptionalLong {
    public final boolean a;
    public final long b;
    public static final OptionalLong c;

    static {
        OptionalLong.c = new OptionalLong();
    }

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public OptionalLong(long v) {
        this.a = true;
        this.b = v;
    }

    public static OptionalLong empty() {
        return OptionalLong.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this != object0) {
            if((object0 instanceof OptionalLong)) {
                boolean z = ((OptionalLong)object0).a;
                return !this.a || !z ? this.a == z : this.b == ((OptionalLong)object0).b;
            }
            return false;
        }
        return true;
    }

    public long getAsLong() {
        if(this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    @Override
    public final int hashCode() {
        return this.a ? ((int)(this.b ^ this.b >>> 0x20)) : 0;
    }

    public boolean isEmpty() {
        return this.a ^ 1;
    }

    public static OptionalLong of(long v) {
        return new OptionalLong(v);
    }

    public long orElse(long v) {
        return this.a ? this.b : v;
    }

    @Override
    public final String toString() {
        return this.a ? "OptionalLong[" + this.b + "]" : "OptionalLong.empty";
    }
}

