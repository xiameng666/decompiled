import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class bwjd implements HttpClient {
    public bwjf a;
    public HttpParams b;
    private static final HttpVersion c;
    private static final String[] d;
    private bwjb e;
    private String f;

    static {
        bwjd.c = new HttpVersion(1, 1);
        bwjd.d = new String[]{"text/", "application/xml", "application/json"};
    }

    public bwjd(Context context0, String s, bwje bwje0) {
        this(s, true);
        this.b = new bwjj(this);
        this.a = new bwjm(context0, true, bwje0);
    }

    public bwjd(Context context0, String s, boolean z) {
        this(context0, s, z, true);
    }

    public bwjd(Context context0, String s, boolean z, boolean z1) {
        this(s, z);
        this.b = new bwjj(this);
        this.a = new bwjm(context0, z1);
    }

    public bwjd(String s, boolean z) {
        this.f = z ? s + " (" + Build.DEVICE + " " + Build.ID + ")" + "; gzip" : s + " (" + Build.DEVICE + " " + Build.ID + ")";
    }

    public static InputStream a(HttpEntity httpEntity0) {
        InputStream inputStream0 = httpEntity0.getContent();
        if(inputStream0 == null) {
            return null;
        }
        Header header0 = httpEntity0.getContentEncoding();
        if(header0 != null) {
            String s = header0.getValue();
            if(s != null && s.contains("gzip")) {
                return new GZIPInputStream(inputStream0);
            }
        }
        return inputStream0;
    }

    public final HttpResponse b(HttpUriRequest httpUriRequest0, bwjc bwjc0) {
        boolean z1;
        long v;
        if(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("This thread forbids HTTP requests");
        }
        boolean z = httpUriRequest0 instanceof HttpEntityEnclosingRequest;
        if(z) {
            HttpEntity httpEntity0 = ((HttpEntityEnclosingRequest)httpUriRequest0).getEntity();
            if(httpEntity0 == null) {
                v = 0L;
            }
            else if(httpEntity0.isChunked()) {
                v = -1L;
            }
            else {
                v = httpEntity0.getContentLength();
            }
        }
        else {
            v = -1L;
        }
        if(Long.compare(v, 0L) >= 0) {
            httpUriRequest0.addHeader("content-length", Long.toString(v));
        }
        HttpURLConnection httpURLConnection0 = bwjc0.a(httpUriRequest0.getURI().toURL());
        bwjb bwjb0 = this.e;
        if(bwjb0 == null) {
            z1 = z;
        }
        else {
            String s = bwjb0.a;
            int v1 = bwjb0.b;
            if(Log.isLoggable(s, v1)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("curl -X ");
                stringBuilder0.append(httpUriRequest0.getMethod());
                stringBuilder0.append(" ");
                Header[] arr_header = httpUriRequest0.getAllHeaders();
                for(int v2 = 0; v2 < arr_header.length; ++v2) {
                    Header header0 = arr_header[v2];
                    stringBuilder0.append("--header \"");
                    stringBuilder0.append(header0.toString().trim());
                    stringBuilder0.append("\" ");
                }
                stringBuilder0.append("\"");
                stringBuilder0.append(httpURLConnection0.getURL());
                stringBuilder0.append("\"");
                if(z) {
                    HttpEntity httpEntity1 = ((HttpEntityEnclosingRequest)httpUriRequest0).getEntity();
                    if(httpEntity1 == null || !httpEntity1.isRepeatable()) {
                        z1 = z;
                    }
                    else if(httpEntity1.getContentLength() < 0x100000L) {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        httpEntity1.writeTo(byteArrayOutputStream0);
                        Header[] arr_header1 = httpUriRequest0.getHeaders("content-encoding");
                        if(arr_header1 != null) {
                            int v3 = 0;
                            while(v3 < arr_header1.length) {
                                if("gzip".equalsIgnoreCase(arr_header1[v3].getValue())) {
                                    goto label_71;
                                }
                                ++v3;
                            }
                        }
                        Header[] arr_header2 = httpUriRequest0.getHeaders("content-type");
                        if(arr_header2 != null) {
                            int v4 = 0;
                            while(v4 < arr_header2.length) {
                                Header header1 = arr_header2[v4];
                                String[] arr_s = bwjd.d;
                                z1 = z;
                                int v5 = 0;
                                while(v5 < 3) {
                                    String s1 = arr_s[v5];
                                    if(header1.getValue().startsWith(s1)) {
                                        stringBuilder0.append(" --data-ascii \"");
                                        stringBuilder0.append(byteArrayOutputStream0.toString());
                                        stringBuilder0.append("\"");
                                        goto label_81;
                                    }
                                    ++v5;
                                }
                                ++v4;
                                z = z1;
                            }
                        }
                    label_71:
                        z1 = z;
                        stringBuilder0.insert(0, a.a(Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2), "echo \'", "\' | base64 -d > /tmp/$$.bin; "));
                        stringBuilder0.append(" --data-binary @/tmp/$$.bin");
                    }
                    else {
                        z1 = z;
                        stringBuilder0.append(" [TOO MUCH DATA TO INCLUDE]");
                    }
                }
                else {
                    z1 = z;
                }
            label_81:
                Log.println(v1, s, stringBuilder0.toString());
            }
            else {
                z1 = z;
            }
        }
        httpURLConnection0.setRequestMethod(httpUriRequest0.getMethod());
        Header[] arr_header3 = httpUriRequest0.getAllHeaders();
        for(int v6 = 0; v6 < arr_header3.length; ++v6) {
            Header header2 = arr_header3[v6];
            httpURLConnection0.addRequestProperty(header2.getName(), header2.getValue());
        }
        if(httpURLConnection0.getRequestProperty("User-Agent") == null) {
            httpURLConnection0.setRequestProperty("User-Agent", this.f);
        }
        if(z1 && ((HttpEntityEnclosingRequest)httpUriRequest0).getEntity() != null) {
            HttpEntity httpEntity2 = ((HttpEntityEnclosingRequest)httpUriRequest0).getEntity();
            httpURLConnection0.setDoOutput(true);
            if(httpEntity2.isChunked()) {
                httpURLConnection0.setChunkedStreamingMode(0x800);
            }
            else if(httpEntity2.getContentLength() > 0L) {
                httpURLConnection0.setRequestProperty("content-length", Long.toString(httpEntity2.getContentLength()));
            }
            if(httpEntity2.isStreaming()) {
                if(httpEntity2.getContentLength() > 0L) {
                    httpURLConnection0.setFixedLengthStreamingMode(httpEntity2.getContentLength());
                }
                else {
                    httpURLConnection0.setChunkedStreamingMode(0x800);
                }
            }
            Header header3 = httpEntity2.getContentType();
            Header header4 = httpEntity2.getContentEncoding();
            if(header3 != null) {
                httpURLConnection0.setRequestProperty("content-type", header3.getValue());
            }
            if(header4 != null) {
                httpURLConnection0.setRequestProperty("content-encoding", header4.getValue());
            }
            httpEntity2.writeTo(httpURLConnection0.getOutputStream());
        }
        else {
            httpURLConnection0.connect();
        }
        int v7 = httpURLConnection0.getResponseCode();
        if(v7 < 0) {
            throw new IOException("Cannot retrieve a valid HTTP status code from server response");
        }
        bwjf bwjf0 = this.a;
        String s2 = httpURLConnection0.getURL().toString();
        bwjf0.a.a(s2, v7);
        String s3 = httpURLConnection0.getResponseMessage();
        HttpResponse httpResponse0 = new BasicHttpResponse(((ProtocolVersion)bwjd.c), v7, s3);
        String s4 = null;
        String s5 = null;
        for(Object object0: httpURLConnection0.getHeaderFields().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s6 = (String)map$Entry0.getKey();
            if(s6 != null) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    String s7 = (String)object1;
                    if(s6.equalsIgnoreCase("content-type")) {
                        s4 = s7;
                    }
                    else if(s6.equalsIgnoreCase("content-encoding")) {
                        s5 = s7;
                    }
                    httpResponse0.addHeader(((Header)new BasicHeader(s6, s7)));
                }
            }
        }
        InputStream inputStream0 = v7 >= 400 ? httpURLConnection0.getErrorStream() : httpURLConnection0.getInputStream();
        if(inputStream0 != null) {
            InputStreamEntity inputStreamEntity0 = new InputStreamEntity(inputStream0, -1L);
            if(s4 != null) {
                ((AbstractHttpEntity)inputStreamEntity0).setContentType(s4);
            }
            if(s5 != null) {
                ((AbstractHttpEntity)inputStreamEntity0).setContentEncoding(s5);
            }
            httpResponse0.setEntity(((HttpEntity)inputStreamEntity0));
        }
        return httpResponse0;
    }

    public final HttpURLConnection c(URL uRL0, bwjq bwjq0) {
        HttpURLConnection httpURLConnection0 = ((bwjm)this.a).c(uRL0, (bwjq0 == null ? null : bwjq0.a));
        httpURLConnection0.setInstanceFollowRedirects(false);
        return httpURLConnection0;
    }

    public final SSLSocketFactory d() {
        SSLSocketFactory sSLSocketFactory0 = ((bwjm)this.a).e;
        return sSLSocketFactory0 == null ? HttpsURLConnection.getDefaultSSLSocketFactory() : sSLSocketFactory0;
    }

    public final void e(String s, int v) {
        if(s == null) {
            throw new NullPointerException("name");
        }
        this.e = new bwjb(s, v);
    }

    public final Object execute(HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0) {
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) {
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0) {
        return this.execute(httpUriRequest0, responseHandler0, null);
    }

    public final Object execute(HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httpHost0, HttpRequest httpRequest0) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httpHost0, HttpRequest httpRequest0, HttpContext httpContext0) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest0) {
        return this.execute(httpUriRequest0, null);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest0, HttpContext httpContext0) {
        return this.b(httpUriRequest0, new bwji(this));
    }

    public final ClientConnectionManager getConnectionManager() {
        throw new UnsupportedOperationException();
    }

    public final HttpParams getParams() {
        return this.b;
    }
}

