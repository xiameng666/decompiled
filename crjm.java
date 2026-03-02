import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;

final class crjm implements Runnable {
    final crjn a;
    private final URL b;
    private final byte[] c;
    private final crjk d;
    private final String e;
    private final Map f;

    public crjm(crjn crjn0, String s, URL uRL0, byte[] arr_b, Map map0, crjk crjk0) {
        Objects.requireNonNull(crjn0);
        this.a = crjn0;
        super();
        batl.q(s);
        batl.s(uRL0);
        this.b = uRL0;
        this.c = arr_b;
        this.d = crjk0;
        this.e = s;
        this.f = map0;
    }

    @Override
    public final void run() {
        byte[] arr_b3;
        InputStream inputStream0;
        OutputStream outputStream2;
        IOException iOException2;
        OutputStream outputStream1;
        byte[] arr_b1;
        Map map1;
        int v1;
        Map map0;
        int v;
        HttpURLConnection httpURLConnection0;
        crjn crjn0 = this.a;
        crjn0.ar();
        OutputStream outputStream0 = null;
        try {
            crjn0.c(this.e);
            URLConnection uRLConnection0 = cjwq.b().a(this.b, "client-measurement");
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
            v = 0;
            httpURLConnection0 = null;
            map0 = null;
            iOException2 = iOException0;
            outputStream2 = null;
            goto label_97;
        }
        catch(Throwable throwable0) {
            v1 = 0;
            httpURLConnection0 = null;
            map1 = null;
            goto label_65;
        }
        try {
            Map map2 = this.f;
            if(map2 != null) {
                for(Object object0: map2.entrySet()) {
                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
            }
            byte[] arr_b = this.c;
            if(arr_b != null) {
                arr_b1 = crjn0.aw().y(arr_b);
                crjn0.aJ().k.b("Uploading data. size", Integer.valueOf(arr_b1.length));
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setFixedLengthStreamingMode(arr_b1.length);
                httpURLConnection0.connect();
                outputStream1 = httpURLConnection0.getOutputStream();
                goto label_40;
            }
            v = httpURLConnection0.getResponseCode();
            goto label_67;
        }
        catch(IOException iOException0) {
            goto label_57;
        }
        catch(Throwable throwable0) {
            goto label_63;
        }
        try {
        label_40:
            outputStream1.write(arr_b1);
            outputStream1.close();
        }
        catch(IOException iOException1) {
            iOException2 = iOException1;
            outputStream2 = outputStream1;
            v = 0;
            map0 = null;
            goto label_97;
        }
        catch(Throwable throwable0) {
            v1 = 0;
            map1 = null;
            outputStream0 = outputStream1;
            goto label_65;
        }
        try {
            v = httpURLConnection0.getResponseCode();
            goto label_67;
        }
        catch(IOException iOException0) {
        label_57:
            v = 0;
            map0 = null;
            iOException2 = iOException0;
            outputStream2 = null;
            goto label_97;
        }
        catch(Throwable throwable0) {
        label_63:
            v1 = 0;
            map1 = null;
        }
    label_65:
        Throwable throwable1 = throwable0;
        goto label_111;
        try {
        label_67:
            map0 = httpURLConnection0.getHeaderFields();
        }
        catch(IOException iOException3) {
            iOException2 = iOException3;
            outputStream2 = null;
            map0 = null;
            goto label_97;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            map1 = null;
            goto label_110;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = null;
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b2 = new byte[0x400];
            int v2;
            while((v2 = inputStream0.read(arr_b2)) > 0) {
                byteArrayOutputStream0.write(arr_b2, 0, v2);
            }
            arr_b3 = byteArrayOutputStream0.toByteArray();
            goto label_92;
        }
        catch(Throwable throwable3) {
            try {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable3;
            label_92:
                inputStream0.close();
                goto label_121;
            }
            catch(IOException iOException4) {
            }
            catch(Throwable throwable4) {
                goto label_108;
            }
        }
        iOException2 = iOException4;
        outputStream2 = null;
    label_97:
        if(outputStream2 != null) {
            try {
                outputStream2.close();
            }
            catch(IOException iOException5) {
                this.a.aJ().c.c("Error closing HTTP compressed POST connection output stream. appId", crji.a(this.e), iOException5);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        IOException iOException6 = iOException2;
        byte[] arr_b4 = null;
        goto label_124;
    label_108:
        throwable1 = throwable4;
        map1 = map0;
    label_110:
        v1 = v;
    label_111:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException7) {
                this.a.aJ().c.c("Error closing HTTP compressed POST connection output stream. appId", crji.a(this.e), iOException7);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.a.d();
        this.a.aK().f(new crjl(this.e, this.d, v1, null, null, map1));
        throw throwable1;
    label_121:
        httpURLConnection0.disconnect();
        arr_b4 = arr_b3;
        iOException6 = null;
    label_124:
        this.a.d();
        this.a.aK().f(new crjl(this.e, this.d, v, iOException6, arr_b4, map0));
    }
}

