import android.content.Context;
import android.net.Network;
import android.os.Binder;
import android.os.SystemClock;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

public final class aksq {
    public static gmcd a(hkxq hkxq0, String s, String s1, ByteBuffer byteBuffer0, Context context0, String s2, clck clck0, ckcq ckcq0) {
        return aksq.b(hkxq0, s, s1, byteBuffer0, context0, s2, clck0, ckcq0, null);
    }

    public static gmcd b(hkxq hkxq0, String s, String s1, ByteBuffer byteBuffer0, Context context0, String s2, clck clck0, ckcq ckcq0, bwjq bwjq0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        baft.d(context0, linkedHashMap0, s1, s2, hkxq0);
        baft.c(hkxq0, linkedHashMap0);
        Network network0 = !hoxf.c() || bwjq0 == null ? null : bwjq0.a;
        return acuo.a().a(s, linkedHashMap0, byteBuffer0, clck0, ckcq0, network0);
    }

    public static gmcd c(hkxq hkxq0, String s, ProtoLiteMessage hftv0, Map map0, MessageLite hfvm0, ckcq ckcq0, ckcp ckcp0) {
        baft.c(hkxq0, map0);
        acup acup0 = acuo.a();
        ibuq.f(s, "url");
        ibuq.f(hftv0, "defaultInstance");
        ibuq.f(hfvm0, "uploadData");
        ibuq.f(ckcq0, "collectionDefinition");
        ibuq.f(ckcp0, "collectionDefinitionWithType");
        clbk clbk0 = clbk.a;
        clbj clbj0 = clbj.a;
        clcf clcf0 = clcg.f(s, ckcq0, clbk0, clbj0);
        clda clda0 = ((clbs)acup0.c.mr()).c(clcf0, 2, hftv0, clhl.b.b(clhr.a), acuq.a().a(((String)map0.get("app"))), 0x401);
        clda0.B("POST");
        clda0.z();
        Context context0 = acup0.b;
        if(!hoxf.f()) {
            hfvm0.getClass();
            ckcp0 = new ckcp(ckkp.a, ckdf.a);
        }
        clda0.C(context0, hfvm0, clbk0, ckcp0);
        clcs clcs0 = clbz.a(clbk0, clbj0);
        for(Object object0: map0.entrySet()) {
            clcs0.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        clda0.m(new clct(clcs0));
        return glzd.f(acup.b(clda0), new acum(new acul()), clhl.b.d(clhr.b));
    }

    public static String d(HttpResponse httpResponse0) {
        byte[] arr_b = aksq.h(httpResponse0);
        return arr_b == null ? "" : new String(arr_b, StandardCharsets.UTF_8);
    }

    public static HttpResponse e(hkxq hkxq0, String s, String s1, HttpEntity httpEntity0, Context context0) {
        return aksq.f(hkxq0, s, s1, httpEntity0, context0, null, null);
    }

    public static HttpResponse f(hkxq hkxq0, String s, String s1, HttpEntity httpEntity0, Context context0, String s2, bwjq bwjq0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        baft.d(context0, linkedHashMap0, s1, s2, hkxq0);
        Header header0 = httpEntity0.getContentType();
        if(header0 != null) {
            linkedHashMap0.put(header0.getName(), header0.getValue());
        }
        return aksq.g(hkxq0, s, httpEntity0, linkedHashMap0, bwjq0);
    }

    public static HttpResponse g(hkxq hkxq0, String s, HttpEntity httpEntity0, Map map0, bwjq bwjq0) {
        HttpResponse httpResponse0;
        baft.c(hkxq0, map0);
        aksp aksp0 = (aksp)aksp.a.b();
        HttpPost httpPost0 = new HttpPost(s);
        httpPost0.setEntity(httpEntity0);
        for(Object object0: map0.entrySet()) {
            httpPost0.addHeader(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        Header[] arr_header = ((HttpUriRequest)httpPost0).getHeaders("app");
        String s1 = arr_header.length == 1 ? arr_header[0].getValue() : null;
        bbfj.c(0x401, acuq.a().a(s1));
        try {
            long v1 = Binder.clearCallingIdentity();
            try {
                long v3 = SystemClock.elapsedRealtime();
                bwjh bwjh0 = new bwjh(aksp0.b, bwjq0);
                httpResponse0 = aksp0.b.b(((HttpUriRequest)httpPost0), bwjh0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghpb.a).v_newBuilder();
                String s2 = ((HttpUriRequest)httpPost0).getURI().toString();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghpb ghpb0 = (ghpb)hftp0.b_message;
                s2.getClass();
                ghpb0.b |= 2;
                ghpb0.c = s2;
                long v4 = SystemClock.elapsedRealtime() - v3;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghpb ghpb1 = (ghpb)hftp0.b_message;
                ghpb1.b |= 4;
                ghpb1.d = v4;
                StatusLine statusLine0 = httpResponse0.getStatusLine();
                if(statusLine0 != null) {
                    int v5 = statusLine0.getStatusCode();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghpb ghpb2 = (ghpb)hftp0.b_message;
                    ghpb2.b |= 8;
                    ghpb2.e = v5;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
                ghom ghom0 = ghom.f;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((ghon)hftp1.b_message).e = ghom0.av;
                ((ghon)hftp1.b_message).b |= 1;
                ghpb ghpb3 = (ghpb)hftp0.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghon ghon0 = (ghon)hftp1.b_message;
                ghpb3.getClass();
                ghon0.i = ghpb3;
                ghon0.b |= 0x20;
                cduy.v().c(((ProtoLiteMessage)(((ghon)hftp1.N_build())))).a();
            }
            finally {
                Binder.restoreCallingIdentity(v1);
            }
        }
        finally {
            bbfj.a();
        }
        return httpResponse0;
    }

    public static byte[] h(HttpResponse httpResponse0) {
        InputStream inputStream0 = bwjd.a(httpResponse0.getEntity());
        return inputStream0 == null ? null : bbpb.d(inputStream0);
    }
}

