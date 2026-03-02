import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class acbi {
    public final acbf a;
    public final baqr b;
    public final gdjy c;
    public gdjx d;

    public acbi(acbf acbf0, baqr baqr0, hfta hfta0, MessageLite hfvm0) {
        this.a = acbf0;
        this.b = baqr0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdjy.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gdjv.a).v_newBuilder();
        hftr0.n(hfta0, hfvm0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdjy gdjy0 = (gdjy)hftp0.b_message;
        gdjv gdjv0 = (gdjv)((ProtoLiteBuilder)hftr0).N_build();
        gdjv0.getClass();
        gdjy0.d = gdjv0;
        gdjy0.b |= 2;
        int v = hfta0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdjy gdjy1 = (gdjy)hftp0.b_message;
        gdjy1.b |= 1;
        gdjy1.c = v;
        this.c = (gdjy)hftp0.N_build();
    }

    public final int a() {
        return this.d == null || (this.d.b & 2) == 0 ? 0 : (this.d.d == null ? hebz.a : this.d.d).c;
    }

    public final MessageLite b(hfta hfta0) {
        gdjx gdjx0 = this.d;
        if(gdjx0 != null && (gdjx0.b & 1) != 0) {
            gdjw gdjw0 = gdjx0.c == null ? gdjw.a : gdjx0.c;
            gdjw0.f(hfta0);
            Object object0 = gdjw0.s.k(hfta0.d);
            return object0 == null ? ((MessageLite)hfta0.b) : ((MessageLite)hfta0.d(object0));
        }
        return null;
    }

    public final String c() {
        return this.d == null || (this.d.b & 2) == 0 ? null : (this.d.d == null ? hebz.a : this.d.d).d;
    }

    public final void d() {
        gdjx gdjx0;
        baqr baqr0 = this.b;
        acbf acbf0 = this.a;
        if(hour.e()) {
            throw new acbd(null);
        }
        try {
            String s = baqr0.e;
            bbeo bbeo0 = acbf0.a;
            Context context0 = bbeo0.context;
            String s1 = bbmq.l(context0, s);
            boolean z = hour.a.c().i();
            gdjy gdjy0 = this.c;
            if(z) {
                String s2 = bbeo0.c(bbeo0.c, "/mutateonekey?alt=proto");
                clbk clbk0 = clbk.a;
                clbj clbj0 = clbj.a;
                clcf clcf0 = clcg.f(s2, cjxv.b, clbk0, clbj0);
                bblp bblp0 = new bblp(0x7FFFFFFF, 10);
                HashMap hashMap0 = bbeo0.b(bbeo0.context, baqr0);
                if(!TextUtils.isEmpty(s)) {
                    hashMap0.put("X-Android-Package", s);
                }
                if(!TextUtils.isEmpty(s1)) {
                    hashMap0.put("X-Android-Cert", s1);
                }
                clda clda0 = clbv.a(context0).c(clcf0, 1, ((ProtoLiteMessage)gdjx.a), bblp0, -1, bbeo0.d);
                clda0.B("POST");
                clda0.z();
                clda0.E(context0, gdjy0.getDefaultInstanceForType().n(), clbk0, clbj0);
                clcs clcs0 = clbz.a(clbk0, clbj0);
                clcs0.a("Content-Type", "application/x-protobuf");
                for(Object object0: hashMap0.keySet()) {
                    clcs0.a(((String)object0), ((String)hashMap0.get(((String)object0))));
                }
                clda0.m(new clct(clcs0));
                cldb cldb0 = clda0.t();
                try {
                    gdjx0 = (gdjx)((cldc)cldb0.a().get(60L, TimeUnit.SECONDS)).b;
                }
                catch(Exception exception1) {
                    if((exception1 instanceof InterruptedException)) {
                        Thread.currentThread().interrupt();
                    }
                    cldb0.b();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdjx.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hebz.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((hebz)hftv0).b |= 1;
                    ((hebz)hftv0).c = 0;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hebz.b(((hebz)hftp1.b_message));
                    hebz hebz0 = (hebz)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gdjx gdjx1 = (gdjx)hftp0.b_message;
                    hebz0.getClass();
                    gdjx1.d = hebz0;
                    gdjx1.b |= 2;
                    gdjx0 = (gdjx)hftp0.N_build();
                }
            }
            else {
                byte[] arr_b = gdjy0.toBytesArray();
                gdjx0 = (gdjx)acbf0.a.l("/mutateonekey?alt=proto", arr_b, gdjx.a, s, s1);
            }
        }
        catch(acse | VolleyError exception0) {
            throw new acbd(exception0);
        }
        this.d = gdjx0;
    }

    public final boolean e() {
        return this.d != null && (this.d.b & 2) != 0;
    }
}

