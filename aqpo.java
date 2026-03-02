import android.content.Context;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import jeb.synthetic.TWR;

public abstract class aqpo {
    private static final baun a;
    private final aqwm b;

    static {
        aqpo.a = aqql.a("PostRequest");
    }

    protected aqpo(aqwm aqwm0) {
        this.b = aqwm0;
    }

    protected abstract String a();

    public final void b(Context context0, byte[] arr_b, String s) {
        DataOutputStream dataOutputStream0;
        HttpURLConnection httpURLConnection0;
        cjxa cjxa0;
        String s1 = this.a();
        Closeable closeable0 = null;
        try {
            URL uRL0 = new URL(s1);
            cjxa0 = this.b.a(context0, uRL0);
        }
        catch(Throwable throwable0) {
            goto label_39;
        }
        try {
            httpURLConnection0 = cjxa0.a();
            httpURLConnection0.setRequestMethod("DELETE");
            httpURLConnection0.setRequestProperty("Authorization", "Bearer " + s);
            httpURLConnection0.setRequestProperty("Content-Type", "application/x-protobuf");
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setDoOutput(true);
            dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
        }
        catch(Throwable throwable1) {
            goto label_34;
        }
        try {
            dataOutputStream0.write(arr_b);
            dataOutputStream0.flush();
            dataOutputStream0.close();
        }
        catch(Throwable throwable1) {
            try {
                closeable0 = dataOutputStream0;
                cjxa0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable1.addSuppressed(throwable2);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                    goto label_39;
                }
            }
        }
        try(InputStream inputStream0 = httpURLConnection0.getInputStream()) {
            int v = httpURLConnection0.getResponseCode();
            aqpo.a.j("Http Response Code: %d", new Object[]{v});
            if(v != 200) {
                throw new aqxy(a.v(new String(ghjj.g(httpURLConnection0.getErrorStream()), StandardCharsets.UTF_8), "Server rejected http request: "), v);
            }
            if(inputStream0 == null) {
                TWR.useResource$NT(null);
                throw new IOException("Missing response body");
            }
            goto label_36;
        }
        catch(Throwable throwable1) {
            try {
            label_34:
                TWR.safeClose$NT(cjxa0, throwable1);
                throw throwable1;
            label_36:
                cjxa0.close();
                return;
            }
            catch(Throwable throwable0) {
            }
        }
    label_39:
        bbpb.b(closeable0);
        throw throwable0;
    }
}

