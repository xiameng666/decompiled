import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

public final class ifzs implements igad {
    public final ifzz a;
    public final UrlResponseInfo b;
    public final ByteBuffer c;

    public ifzs(ifzz ifzz0, UrlResponseInfo urlResponseInfo0, ByteBuffer byteBuffer0) {
        this.a = ifzz0;
        this.b = urlResponseInfo0;
        this.c = byteBuffer0;
    }

    @Override  // igad
    public final void a() {
        ifzz ifzz0 = this.a;
        igac igac0 = ifzz0.d;
        if(igac0.g.compareAndSet(5, 4)) {
            ifzz0.a.onReadCompleted(igac0, this.b, this.c);
        }
    }
}

