import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class crnl implements Runnable {
    final crnm a;
    public final crkr b;
    private final URL c;

    public crnl(crnm crnm0, String s, URL uRL0, crkr crkr0) {
        Objects.requireNonNull(crnm0);
        this.a = crnm0;
        super();
        batl.q(s);
        this.c = uRL0;
        this.b = crkr0;
    }

    private final void a(int v, Exception exception0, byte[] arr_b) {
        this.a.aK().f(new crnk(this, v, exception0, arr_b));
    }

    @Override
    public final void run() {
        byte[] arr_b1;
        InputStream inputStream0;
        Throwable throwable1;
        int v;
        IOException iOException1;
        HttpURLConnection httpURLConnection0;
        this.a.ar();
        try {
            URLConnection uRLConnection0 = cjwq.b().a(this.c, "client-measurement");
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            v = 0;
            httpURLConnection0 = null;
            goto label_49;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            v = 0;
            httpURLConnection0 = null;
            goto label_54;
        }
        try {
            v = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException2) {
            iOException1 = iOException2;
            v = 0;
            goto label_49;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            v = 0;
            goto label_54;
        }
        try {
            httpURLConnection0.getHeaderFields();
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                inputStream0 = null;
                inputStream0 = httpURLConnection0.getInputStream();
                byte[] arr_b = new byte[0x400];
                int v1;
                while((v1 = inputStream0.read(arr_b)) > 0) {
                    byteArrayOutputStream0.write(arr_b, 0, v1);
                }
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(Throwable throwable3) {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable3;
            }
            inputStream0.close();
            goto label_58;
        }
        catch(IOException iOException1) {
        label_49:
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.a(v, iOException1, null);
            return;
        }
        catch(Throwable throwable1) {
        }
    label_54:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.a(v, null, null);
        throw throwable1;
    label_58:
        httpURLConnection0.disconnect();
        this.a(v, null, arr_b1);
    }
}

