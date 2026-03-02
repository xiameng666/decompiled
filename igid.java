import j..util.Objects;
import java.security.PrivilegedAction;

final class igid implements PrivilegedAction {
    final String a;
    final igie b;

    public igid(igie igie0, String s) {
        this.a = s;
        Objects.requireNonNull(igie0);
        this.b = igie0;
        super();
    }

    @Override
    public final Object run() {
        ClassLoader classLoader0 = this.b.a;
        return classLoader0 == null ? ClassLoader.getSystemResourceAsStream(this.a) : classLoader0.getResourceAsStream(this.a);
    }
}

