import java.util.Locale;

final class fxld implements fxnv {
    public final hgud a;
    private final String b;

    public fxld() {
        throw null;
    }

    public fxld(hgud hgud0) {
        this.b = "s";
        this.a = hgud0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxld) && this.b.equals(((fxld)object0).b) && ((ProtoLiteMessage)this.a).equals(((fxld)object0).a);
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() ^ 1000003;
        hgud hgud0 = this.a;
        if(((ProtoLiteMessage)hgud0).isImmutable()) {
            return ((ProtoLiteMessage)hgud0).s() ^ v * 1000003;
        }
        int v1 = hgud0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hgud0).s();
            hgud0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "src: %s data size: %d", this.b, this.a.d.size());
    }
}

