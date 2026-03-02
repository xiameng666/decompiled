public final class fmic {
    public final fmjm a;
    public final int b;

    public fmic() {
        throw null;
    }

    public fmic(fmjm fmjm0, int v) {
        this.a = fmjm0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmic) && this.a.equals(((fmic)object0).a) && this.b == ((fmic)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ImageDownloadRequestArgs{lighterMediaId=" + this.a + ", downloadRequestType=" + this.b + "}";
    }
}

