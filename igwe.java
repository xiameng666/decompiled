import java.util.Locale;

final class igwe extends igwt {
    public igwe(igvt igvt0, String s) {
        super(igvt0, s, 6);
    }

    @Override  // igwt
    public final String toString() {
        return String.format(Locale.UK, "%1$d (%2$d bytes)", ((short)this.e), ((int)(this.e * 4)));
    }
}

