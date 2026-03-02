import android.content.Context;
import android.os.Process;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import java.util.HashMap;

public class eqnn {
    private final Context a;
    private final RequestQueue b;
    private final RetryPolicy c;
    private boolean d;

    public eqnn(Context context0, RequestQueue requestQueue0, RetryPolicy retryPolicy0) {
        this.d = false;
        batl.s(context0);
        this.a = context0;
        batl.s(requestQueue0);
        this.b = requestQueue0;
        this.c = retryPolicy0;
        this.d = true;
    }

    protected Request a(Context context0, int v, String s, byte[] arr_b, Object object0, eqnk eqnk0) {
        HashMap hashMap0 = new HashMap();
        eqni.a(context0, hashMap0, "com.google.android.gms");
        return new eqnm(v, s, arr_b, object0, eqnk0, eqnk0, hashMap0, Process.myUid());
    }

    public final gmcd b(String s, byte[] arr_b, Object object0) {
        batl.q(s);
        batl.s(object0);
        gmcd gmcd0 = new eqnk();
        Request request0 = this.a(this.a, 1, s, arr_b, object0, ((eqnk)gmcd0));
        request0.setRetryPolicy(this.c);
        request0.setShouldRetryServerErrors(this.d);
        this.b.add(request0);
        return gmcd0;
    }
}

