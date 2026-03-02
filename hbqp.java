public final class hbqp {
    public final String a;
    public final boolean b;
    public final int c;

    public hbqp() {
        throw null;
    }

    public hbqp(String s) {
        this.a = s;
        this.b = true;
        this.c = 1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof hbqp) && this.a.equals(((hbqp)object0).a) && this.b == ((hbqp)object0).b && this.c == ((hbqp)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b ? this.c ^ (v * 1000003 ^ 0x4CF) * 1000003 : this.c ^ (v * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.a + ", enableFirelog=" + this.b + ", firelogEventType=" + this.c + "}";
    }
}

