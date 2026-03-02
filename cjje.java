import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

public final class cjje implements fnca {
    private final cjjd a;
    private final clbs b;

    public cjje(cjjd cjjd0, clbs clbs0) {
        ibuq.f(clbs0, "gmsNetworkEngine");
        super();
        this.a = cjjd0;
        this.b = clbs0;
    }

    @Override  // fnca
    public final HttpURLConnection a(String s) {
        ibuq.f(s, "url");
        URL uRL0 = new URL(s);
        int v = 0;
        int v1 = hrsa.p() ? -1 : 0;
        if(hrsa.p()) {
            v = 0xA03;
        }
        ckcq ckcq0 = this.a.a(s);
        if(ckcq0 == null) {
            ckcq0 = ckkp.a;
        }
        HttpURLConnection httpURLConnection0 = this.b.d(uRL0, v1, v, ckcq0, clcb.a);
        ibuq.e(httpURLConnection0, "openConnection(...)");
        return httpURLConnection0;
    }

    @Override  // fnca
    public final void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override  // fnca
    public final void c() {
        TrafficStats.clearThreadStatsUid();
    }

    @Override  // fnca
    public final void d(HttpURLConnection httpURLConnection0, int v) {
        TrafficStats.setThreadStatsTag(v);
    }

    @Override  // fnca
    public final void e() {
    }
}

