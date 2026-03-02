public final class ehil {
    public final gjhf a;
    public final int b;
    public final int c;

    public ehil() {
        throw null;
    }

    public ehil(int v, gjhf gjhf0, int v1) {
        this.b = v;
        if(gjhf0 == null) {
            throw new NullPointerException("Null mismatchFieldType");
        }
        this.a = gjhf0;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehil) && this.b == ((ehil)object0).b && this.a.equals(((ehil)object0).a) && this.c == ((ehil)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.b ^ 1000003) * 1000003 ^ this.a.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "MismatchDataField{dataFieldType=" + Integer.toString(this.b - 1) + ", mismatchFieldType=" + this.a.toString() + ", versionMismatchType=" + Integer.toString(this.c - 1) + "}";
    }
}

