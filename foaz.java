public final class foaz {
    public final fobb a;
    public final fobb b;
    public final gged_interceptors c;
    private final foav d;

    public foaz() {
        throw null;
    }

    public foaz(fobb fobb0, fobb fobb1, foav foav0, gged_interceptors gged0) {
        this.a = fobb0;
        this.b = fobb1;
        this.d = foav0;
        this.c = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foaz) && this.a.equals(((foaz)object0).a) && this.b.equals(((foaz)object0).b) && this.d.equals(((foaz)object0).d)) {
            return this.c == null ? ((foaz)object0).c == null : ggia.i(this.c, ((foaz)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.d.hashCode();
        return this.c == null ? v * 1000003 : this.c.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "ImageModelLoader{imageRetriever=" + this.a + ", secondaryImageRetriever=" + this.b + ", defaultImageRetriever=" + this.d + ", postProcessors=" + this.c + "}";
    }
}

