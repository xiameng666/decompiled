import android.content.Context;
import android.os.Build.VERSION;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class acbh {
    public static final bboh a;
    private static final String b;

    static {
        acbh.b = String.format("https://firebasedynamiclinks.googleapis.com/v1/getLinkResolution?key=%s", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        acbh.a = bboh.b("FDLResolveApi", bbcu.aK);
    }

    static String a(gpcp gpcp0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("requested_link", gpcp0.c);
            jSONObject0.put("android_package_name", gpcp0.d);
            if(!gpcp0.e.isEmpty()) {
                jSONObject0.put("sdk_version", gpcp0.e);
            }
            if(!gpcp0.f.isEmpty()) {
                jSONObject0.put("os_version", gpcp0.f);
            }
            if(!gpcp0.g.isEmpty()) {
                jSONObject0.put("device_language", gpcp0.g);
            }
            jSONObject0.put("checksum", gpcp0.h);
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
            ((ggtj)acbh.a.i()).B("Building Json failed: %s", jSONException0.getLocalizedMessage());
            return jSONObject0.toString();
        }
    }

    public static final gpco b(String s, String s1, Context context0) {
        clbk clbk0 = clbk.a;
        clbj clbj0 = clbj.a;
        clcf clcf0 = clcg.f(acbh.b, cjxv.b, clbk0, clbj0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        clbs clbs0 = clbv.a(context0);
        List list0 = gfud.h(":").n(hour.d());
        batl.c(((boolean)(list0.isEmpty() ^ 1)), "Symmetric key version array cannot be empty");
        String s2 = (String)list0.get(0);
        String s3 = list0.size() == 2 ? ((String)list0.get(1)) : "";
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gpcp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gpcp)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s1.getClass();
        ((gpcp)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gpcp)hftp0.b_message).e = "25.34.34 (190400-{{cl}}):appinvite";
        String s4 = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gpcp gpcp0 = (gpcp)hftp0.b_message;
        s4.getClass();
        gpcp0.f = s4;
        String s5 = Locale.getDefault().getDisplayLanguage();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s5.getClass();
        ((gpcp)hftv2).b |= 1;
        ((gpcp)hftv2).g = s5;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gpcp gpcp1 = (gpcp)hftp0.b_message;
        s2.getClass();
        gpcp1.h = s2;
        gpcp gpcp2 = (gpcp)hftp0.N_build();
        String s6 = acbh.a(gpcp2);
        byte[] arr_b = ghgc.a.c(s6, StandardCharsets.UTF_8).e();
        String s7 = ghjc.d.o(arr_b);
        if(!Objects.equals(s3, "")) {
            s7 = a.r(s3, s7, ":");
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gpcp2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gpcp2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gpcp)hftp1.b_message).h = s7;
        String s8 = acbh.a(((gpcp)hftp1.N_build()));
        acbg acbg0 = new acbg();
        clcj clcj0 = clbs0.e(clcf0, acbg0, bblp0, -1, 6402);
        clcj0.n("POST");
        String s9 = bbmq.l(context0, s1);
        clcs clcs0 = clbz.a(clbk0, clbj0);
        clcs0.a("Content-Type", "application/json");
        clcs0.a("X-Android-Package", s1);
        clcs0.a("X-Android-Cert", s9);
        clcj0.m(new clct(clcs0));
        clcj0.q(context0, ByteBuffer.wrap(s8.getBytes(StandardCharsets.UTF_8)), clbk0, clbj0);
        try {
            clcp clcp0 = (clcp)clcj0.e().a().get(60L, TimeUnit.SECONDS);
            return acbg0.a;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)acbh.a.i()).B("Rest api call failed: %s", exception0.getLocalizedMessage());
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
    }
}

