public final class tib implements Comparable {
    public final byte a;
    public final byte b;

    public tib(byte b, byte b1) {
        this.a = b;
        this.b = b1;
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a - ((tib)object0).a;
        return v == 0 ? this.b - ((tib)object0).b : v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        return this.a == ((tib)object0).a ? this.b == ((tib)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return (this.a + 427) * 61 + this.b;
    }

    @Override
    public final String toString() {
        String s = tjs.a(this.b);
        return tjs.a(this.a) + s;
    }
}

