import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

public final class ifzr implements Runnable {
    public final ifzz a;
    public final UrlResponseInfo b;
    public final CronetException c;

    public ifzr(ifzz ifzz0, UrlResponseInfo urlResponseInfo0, CronetException cronetException0) {
        this.a = ifzz0;
        this.b = urlResponseInfo0;
        this.c = cronetException0;
    }

    @Override
    public final void run() {
        ifzz ifzz0;
        try {
            ifzz0 = this.a;
            ifzz0.a.onFailed(ifzz0.d, this.b, this.c);
        }
        catch(Exception exception0) {
            ifzz0.d.i("onFailed", exception0);
        }
        ifzz0.c();
        ifzz0.d.r.a();
    }
}

