import org.chromium.net.UrlResponseInfo;

public final class ifzw implements Runnable {
    public final ifzz a;
    public final UrlResponseInfo b;

    public ifzw(ifzz ifzz0, UrlResponseInfo urlResponseInfo0) {
        this.a = ifzz0;
        this.b = urlResponseInfo0;
    }

    @Override
    public final void run() {
        ifzz ifzz0;
        try {
            ifzz0 = this.a;
            ifzz0.a.onCanceled(ifzz0.d, this.b);
        }
        catch(Exception exception0) {
            ifzz0.d.i("onCanceled", exception0);
        }
        ifzz0.c();
        ifzz0.d.r.a();
    }
}

