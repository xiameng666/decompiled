import android.content.Context;
import android.os.SystemClock;
import j..util.concurrent.ThreadLocalRandom;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public abstract class aqpp {
    private final aqwm a;

    protected aqpp(aqwm aqwm0) {
        this.a = aqwm0;
    }

    protected abstract Object a(InputStream arg1);

    protected abstract String b();

    public final Object c(Context context0, String s, String s1) {
        String s2 = this.b();
        long v = hqje.h();
        int v1 = 0;
        while(((long)v1) < -1L + v) {
            try {
                return this.d(context0, s2, s, s1);
            }
            catch(IOException unused_ex) {
                ++v1;
                SystemClock.sleep(hqje.c() + TimeUnit.SECONDS.toMillis(((long)Math.pow(2.0, v1))) + ThreadLocalRandom.current().nextLong(hqje.b()));
            }
        }
        return this.d(context0, s2, s, s1);
    }

    private final Object d(Context context0, String s, String s1, String s2) {
        String s3;
        InputStream inputStream1;
        Object object0;
        HttpURLConnection httpURLConnection0;
        URL uRL0 = new URL(s);
        cjxa cjxa0 = this.a.a(context0, uRL0);
        try {
            httpURLConnection0 = cjxa0.a();
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.setRequestProperty("Authorization", "Bearer " + s1);
            httpURLConnection0.setRequestProperty("Content-Type", s2);
            httpURLConnection0.setDoInput(true);
            if(httpURLConnection0.getResponseCode() == 200) {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                TWR.declareResource(inputStream0);
                if(inputStream0 == null) {
                    TWR.useResource$NT(null);
                    throw new IOException("HTTP GET is missing response body");
                }
                TWR.useResource$NT(inputStream0);
                object0 = this.a(inputStream0);
                goto label_15;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
    label_15:
        cjxa0.close();
        return object0;
        try {
        label_17:
            inputStream1 = httpURLConnection0.getErrorStream();
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            s3 = new String(ghjj.g(inputStream1), StandardCharsets.UTF_8);
            goto label_23;
        }
        catch(Throwable throwable1) {
            try {
                TWR.safeClose$NT(inputStream1, throwable1);
                throw throwable1;
            label_23:
                if(inputStream1 != null) {
                    inputStream1.close();
                }
                throw new aqxy("Server rejected http request: " + s3, httpURLConnection0.getResponseCode());
            }
            catch(Throwable throwable0) {
            }
        }
    label_27:
        TWR.safeClose$NT(cjxa0, throwable0);
        throw throwable0;
    }
}

