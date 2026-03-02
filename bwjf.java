import android.content.Context;
import java.net.HttpURLConnection;

public class bwjf {
    public final bwjl a;
    public final bwje b;

    public bwjf(Context context0, bwje bwje0) {
        this.a = new bwjl(context0);
        batl.s(bwje0);
        this.b = bwje0;
    }

    public final void a(HttpURLConnection httpURLConnection0, int v) {
        if(httpURLConnection0 == null) {
            return;
        }
        String s = httpURLConnection0.getURL().toString();
        this.a.a(s, v);
        httpURLConnection0.disconnect();
    }
}

