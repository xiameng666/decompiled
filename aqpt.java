import android.content.Context;
import android.os.SystemClock;
import j..util.concurrent.ThreadLocalRandom;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public abstract class aqpt {
    private static final baun a;
    private final aqwm b;

    static {
        aqpt.a = aqql.a("PostRequest");
    }

    protected aqpt(aqwm aqwm0) {
        this.b = aqwm0;
    }

    protected abstract Object a(InputStream arg1);

    protected abstract String b();

    public final Object c(Context context0, byte[] arr_b, String s) {
        String s1 = this.b();
        long v = hqje.h();
        int v1 = 0;
        while(((long)v1) < -1L + v) {
            try {
                return this.d(context0, arr_b, s1, s);
            }
            catch(IOException | aqxy exception0) {
                if((exception0 instanceof aqxy)) {
                    switch(((aqxy)exception0).a) {
                        case 500: 
                        case 503: 
                        case 504: {
                            break;
                        }
                        default: {
                            throw exception0;
                        }
                    }
                }
                ++v1;
                SystemClock.sleep(hqje.c() + TimeUnit.SECONDS.toMillis(((long)Math.pow(2.0, v1))) + ThreadLocalRandom.current().nextLong(hqje.b()));
            }
        }
        return this.d(context0, arr_b, s1, s);
    }

    private final Object d(Context context0, byte[] arr_b, String s, String s1) {
        String s2;
        InputStream inputStream1;
        Object object0;
        int v;
        DataOutputStream dataOutputStream0;
        HttpURLConnection httpURLConnection0;
        cjxa cjxa0;
        Closeable closeable0 = null;
        try {
            URL uRL0 = new URL(s);
            cjxa0 = this.b.a(context0, uRL0);
        }
        catch(Throwable throwable0) {
            goto label_46;
        }
        try {
            httpURLConnection0 = cjxa0.a();
            httpURLConnection0.setRequestMethod("POST");
            httpURLConnection0.setRequestProperty("Authorization", "Bearer " + s1);
            httpURLConnection0.setRequestProperty("Content-Type", "application/x-protobuf");
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setDoOutput(true);
            dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
        }
        catch(Throwable throwable1) {
            goto label_43;
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
                    goto label_46;
                }
            }
        }
        try {
            v = httpURLConnection0.getResponseCode();
            if(v == 200) {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                TWR.declareResource(inputStream0);
                if(inputStream0 == null) {
                    TWR.useResource$NT(null);
                    throw new IOException("Missing response body");
                }
                TWR.useResource$NT(inputStream0);
                object0 = this.a(inputStream0);
                goto label_30;
            }
            goto label_32;
        }
        catch(Throwable throwable1) {
            goto label_43;
        }
        try {
        label_30:
            cjxa0.close();
            return object0;
        }
        catch(Throwable throwable0) {
            goto label_46;
        }
        try {
        label_32:
            aqpt.a.j("Http Post Response Code: %d", new Object[]{v});
            inputStream1 = httpURLConnection0.getErrorStream();
        }
        catch(Throwable throwable1) {
            goto label_43;
        }
        try {
            s2 = new String(ghjj.g(inputStream1), StandardCharsets.UTF_8);
            goto label_39;
        }
        catch(Throwable throwable3) {
            try {
                TWR.safeClose$NT(inputStream1, throwable3);
                throw throwable3;
            label_39:
                if(inputStream1 != null) {
                    inputStream1.close();
                }
                throw new aqxy("Server rejected http request: " + s2, v);
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_43:
            TWR.safeClose$NT(cjxa0, throwable1);
            throw throwable1;
        }
        catch(Throwable throwable0) {
        label_46:
            ghjp.b(closeable0);
            throw throwable0;
        }
    }
}

