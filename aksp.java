import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class aksp {
    public static final ajck a;
    public final bwjd b;

    static {
        aksp.a = new akso();
    }

    public aksp(Context context0) {
        bwjd bwjd0 = new bwjd(context0, "GoogleAuth/1.4", (azqk.e(context0) ? bwje.a : bwje.b));
        HttpParams httpParams0 = bwjd0.b;
        HttpConnectionParams.setConnectionTimeout(httpParams0, 30000);
        HttpConnectionParams.setSoTimeout(httpParams0, 30000);
        ConnManagerParams.setTimeout(httpParams0, 30000L);
        super();
        this.b = bwjd0;
    }
}

