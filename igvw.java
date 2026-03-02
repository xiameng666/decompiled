import java.util.Locale;

final class igvw extends igwt {
    public igvw(igvt igvt0, String s) {
        super(igvt0, s, 8);
    }

    @Override  // igwt
    public final String toString() {
        return String.format(Locale.UK, "%1$d bytes", ((short)this.e));
    }
}

