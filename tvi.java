public final class tvi implements Comparable {
    private final byte a;
    private final byte b;

    public tvi(byte b, byte b1) {
        this.a = b;
        this.b = b1;
    }

    public final byte[] a() {
        return new byte[]{this.a, this.b};
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a - ((tvi)object0).a;
        return v == 0 ? this.b - ((tvi)object0).b : v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        return this.a == ((tvi)object0).a ? this.b == ((tvi)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return (this.a + 427) * 61 + this.b;
    }

    @Override
    public final String toString() {
        String s = twz.a(this.b);
        return twz.a(this.a) + s;
    }
}

