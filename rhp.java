import android.net.Network;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class rhp {
    public final ArrayList a;
    private final boolean b;

    public rhp(boolean z) {
        this.b = z;
        this.a = new ArrayList();
    }

    public final rhu a(rhs rhs0) {
        rhu rhu0;
        String s4;
        int v;
        HttpURLConnection httpURLConnection0;
        String s = "";
        if(this.b) {
            this.a.add(rhs0.toString());
        }
        rib.a(("HttpClient.request url: " + rhs0.a));
        try {
            URL uRL0 = new URL(rhs0.a);
            bkbc bkbc0 = rhs0.g;
            Network network0 = rhs0.f;
            if(network0 != null) {
                httpURLConnection0 = (HttpURLConnection)network0.openConnection(uRL0);
            }
            else if(bkbc0 != null) {
                URLConnection uRLConnection0 = Build.VERSION.SDK_INT >= 34 && bkbc0.a ? clbv.a(bkbc0.b).d(uRL0, -1, 0x9801, ckkp.a, clcb.a) : bbqu.a(uRL0, 0x9801);
                httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            }
            else {
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
            }
            v = 0;
            httpURLConnection0.setInstanceFollowRedirects(false);
            ggqj ggqj0 = rhs0.d.n().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            String s1 = rhs0.b;
            httpURLConnection0.setRequestMethod(s1);
            httpURLConnection0.setConnectTimeout(((int)TimeUnit.SECONDS.toMillis(((long)rhs0.e))));
            httpURLConnection0.setReadTimeout(((int)TimeUnit.SECONDS.toMillis(((long)rhs0.e))));
            if("POST".equals(s1)) {
                httpURLConnection0.setDoOutput(true);
            }
        }
        catch(IOException iOException0) {
            throw new rhb(30, "Configure connection failed!", iOException0);
        }
        rib.a(("HttpClient.request headers (partial): " + httpURLConnection0.getRequestProperties()));
        try {
            if("POST".equals(s1)) {
                DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
                TWR.declareResource(dataOutputStream0);
                TWR.useResource$NT(dataOutputStream0);
                String s2 = rhs0.c.toString().replace("\\/", "/");
                dataOutputStream0.write(s2.getBytes(StandardCharsets.UTF_8));
                rib.a(("HttpClient.request post data: " + s2));
            }
            httpURLConnection0.connect();
            rht rht0 = new rht();
            rht0.b(-1);
            rht0.a("");
            rht0.d(0);
            rht0.d = "";
            rht0.c(ggna.a);
            rht0.f = "";
            String s3 = httpURLConnection0.getHeaderField("Content-Type");
            if(TextUtils.isEmpty(s3)) {
                v = -1;
            }
            else if(s3.contains("xml")) {
                v = 1;
            }
            else if("text/vnd.wap.connectivity".equals(s3)) {
                v = 1;
            }
            else if(!s3.contains("json")) {
                v = -1;
            }
            rht0.b(v);
            try {
                int v2 = httpURLConnection0.getResponseCode();
                rib.a(("HttpClient.response headers: " + httpURLConnection0.getHeaderFields()));
                switch(v2) {
                    case 200: {
                        break;
                    }
                    case 302: {
                        v2 = 302;
                        break;
                    }
                    default: {
                        throw new rhb(0x1F, v2, httpURLConnection0.getHeaderField("Retry-After"), "Invalid connection response: " + v2);
                    }
                }
                rht0.d(v2);
                rht0.d = gfta.b(httpURLConnection0.getResponseMessage());
                rht0.f = gfta.b(httpURLConnection0.getHeaderField("Location"));
            }
            catch(IOException iOException2) {
                throw new rhb(0x1F, "Read response code failed!", iOException2);
            }
            List list0 = (List)httpURLConnection0.getHeaderFields().get("Set-Cookie");
            if(list0 == null) {
                list0 = ggna.a;
            }
            rht0.c(list0);
            try {
                if(httpURLConnection0.getResponseCode() != 302) {
                    InputStream inputStream0 = httpURLConnection0.getInputStream();
                    try {
                        s4 = ric.a(inputStream0);
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(inputStream0, throwable0);
                        throw throwable0;
                    }
                    if(inputStream0 != null) {
                        inputStream0.close();
                    }
                    s = s4;
                }
                rib.a(("HttpClient.response body: " + s));
                rht0.a(s);
            }
            catch(IOException iOException3) {
                throw new rhb(0x20, "Read response body/message failed!", iOException3);
            }
            if(rht0.g != 3) {
                goto label_103;
            }
            String s5 = rht0.b;
            if(s5 == null) {
                goto label_103;
            }
            String s6 = rht0.d;
            if(s6 == null) {
                goto label_103;
            }
            gged_interceptors gged0 = rht0.e;
            if(gged0 == null) {
                goto label_103;
            }
            String s7 = rht0.f;
            if(s7 == null) {
            label_103:
                StringBuilder stringBuilder0 = new StringBuilder();
                if((rht0.g & 1) == 0) {
                    stringBuilder0.append(" contentType");
                }
                if(rht0.b == null) {
                    stringBuilder0.append(" body");
                }
                if((rht0.g & 2) == 0) {
                    stringBuilder0.append(" responseCode");
                }
                if(rht0.d == null) {
                    stringBuilder0.append(" responseMessage");
                }
                if(rht0.e == null) {
                    stringBuilder0.append(" cookies");
                }
                if(rht0.f == null) {
                    stringBuilder0.append(" location");
                }
                throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
            }
            rhu0 = new rhu(rht0.a, s5, rht0.c, s6, gged0, s7);
            if(this.b) {
                this.a.add(rhu0.toString());
            }
        }
        catch(IOException iOException1) {
            throw new rhb(0x1F, "Connection error stream: " + ric.a(httpURLConnection0.getErrorStream()) + " IOException: " + iOException1.toString(), iOException1);
        }
        finally {
            httpURLConnection0.disconnect();
        }
        return rhu0;
    }
}

