import java.net.URI;
import org.chromium.net.UrlResponseInfo;

public final class ifzk implements Runnable {
    public final igac a;
    public final String b;
    public final UrlResponseInfo c;

    public ifzk(igac igac0, String s, UrlResponseInfo urlResponseInfo0) {
        this.a = igac0;
        this.b = s;
        this.c = urlResponseInfo0;
    }

    @Override
    public final void run() {
        this.a.p = URI.create(this.a.m).resolve(this.b).toString();
        this.a.f.add(this.a.p);
        ifyx ifyx0 = new ifyx(this.a, this.c);
        this.a.j(2, 3, ifyx0);
    }
}

