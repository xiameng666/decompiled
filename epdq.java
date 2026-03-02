import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import j..util.Objects;

public final class epdq {
    public static final baun a;

    static {
        epdq.a = new baun("SetupServices", new String[]{"UpdateableStringHelper"});
    }

    public static evql a(String s) {
        if(TextUtils.isEmpty(s)) {
            return evrg.d(null);
        }
        evqp evqp0 = new evqp();
        RequestQueue requestQueue0 = bbfw.b();
        epdo epdo0 = new epdo(s, evqp0);
        Objects.requireNonNull(evqp0);
        StringRequest stringRequest0 = new StringRequest(s, epdo0, new epdp(evqp0));
        stringRequest0.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 2.0f));
        requestQueue0.add(stringRequest0);
        epdn epdn0 = new epdn();
        return evqp0.a.c(epdn0);
    }
}

