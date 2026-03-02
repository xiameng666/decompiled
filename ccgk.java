import java.io.IOException;

public final class ccgk implements glzn {
    public final ccgo a;

    public ccgk(ccgo ccgo0) {
        this.a = ccgo0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        IOException iOException0 = (IOException)object0;
        ccgo.a.j(iOException0, "Failed to read from or write to disk");
        this.a.d.c(0x489);
        throw iOException0;
    }
}

