import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

public final class fnbg implements fnca {
    @Override  // fnca
    public final HttpURLConnection a(String s) {
        return new igbh(new URL(s), babh.a().getCronetEngine());
    }

    @Override  // fnca
    public final void b() {
    }

    @Override  // fnca
    public final void c() {
    }

    @Override  // fnca
    public final void d(HttpURLConnection httpURLConnection0, int v) {
        if((httpURLConnection0 instanceof igbh)) {
            ((igbh)httpURLConnection0).b(v);
            return;
        }
        TrafficStats.setThreadStatsTag(v);
    }

    @Override  // fnca
    public final void e() {
    }
}

