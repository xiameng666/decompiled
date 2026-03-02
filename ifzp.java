import org.chromium.net.UrlResponseInfo;

public final class ifzp implements Runnable {
    public final ifzz a;
    public final UrlResponseInfo b;

    public ifzp(ifzz ifzz0, UrlResponseInfo urlResponseInfo0) {
        this.a = ifzz0;
        this.b = urlResponseInfo0;
    }

    @Override
    public final void run() {
        ifzz ifzz0;
        try {
            ifzz0 = this.a;
            ifzz0.a.onSucceeded(ifzz0.d, this.b);
        }
        catch(Exception exception0) {
            ifzz0.d.i("onSucceded", exception0);
        }
        ifzz0.c();
        ifzz0.d.r.a();
    }
}

