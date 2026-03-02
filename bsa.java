final class bsa {
    public final int a;
    public final int b;
    public final jqt c;

    public bsa() {
        throw null;
    }

    public bsa(int v, int v1, jqt jqt0) {
        this.a = v;
        this.b = v1;
        this.c = jqt0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bsa) && this.a == ((bsa)object0).a && this.b == ((bsa)object0).b && this.c.equals(((bsa)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (this.a ^ 1000003) * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}

