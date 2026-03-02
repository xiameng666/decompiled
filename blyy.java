import j..util.Objects;
import java.net.URL;

public final class blyy {
    public final URL a;

    private blyy(URL uRL0) {
        this.a = uRL0;
    }

    public static blyy a(String s) {
        return new blyy(new URL(s));
    }

    public final String b() {
        return this.a.getHost();
    }

    public final String c() {
        return this.a.getProtocol();
    }

    @Override
    public final boolean equals(Object object0) {
        return Objects.equals(this.a, object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

