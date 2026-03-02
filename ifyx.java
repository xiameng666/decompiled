import org.chromium.net.UrlResponseInfo;

public final class ifyx implements Runnable {
    public final igac a;
    public final UrlResponseInfo b;

    public ifyx(igac igac0, UrlResponseInfo urlResponseInfo0) {
        this.a = igac0;
        this.b = urlResponseInfo0;
    }

    @Override
    public final void run() {
        ifzy ifzy0 = new ifzy(this.a.b, this.b, this.a.p);
        this.a.b.a(ifzy0, "onRedirectReceived");
    }
}

