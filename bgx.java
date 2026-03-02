public final class bgx {
    public final int a;
    public final bcf b;

    public bgx() {
        throw null;
    }

    public bgx(int v, bcf bcf0) {
        this.a = v;
        this.b = bcf0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bgx) && this.a == ((bgx)object0).a && this.b.equals(((bgx)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}

