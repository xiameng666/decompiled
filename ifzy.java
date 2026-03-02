import org.chromium.net.UrlResponseInfo;

public final class ifzy implements igad {
    public final ifzz a;
    public final UrlResponseInfo b;
    public final String c;

    public ifzy(ifzz ifzz0, UrlResponseInfo urlResponseInfo0, String s) {
        this.a = ifzz0;
        this.b = urlResponseInfo0;
        this.c = s;
    }

    @Override  // igad
    public final void a() {
        this.a.a.onRedirectReceived(this.a.d, this.b, this.c);
    }
}

