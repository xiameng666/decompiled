import android.util.Base64;
import java.io.ByteArrayInputStream;

public final class fmjj implements glzn {
    public final fmjk a;
    public final hnxy b;

    public fmjj(fmjk fmjk0, hnxy hnxy0) {
        this.a = fmjk0;
        this.b = hnxy0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = Base64.encodeToString(this.b.toBytesArray(), 2);
        String s1 = iadl.g();
        hjjz hjjz0 = new hjjz();
        hjjz0.a = 5L;
        hjka hjka0 = new hjka(hjjz0);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(this.a.a);
        long v = (long)this.a.a.length;
        hjjj hjjj0 = new hjjj(byteArrayInputStream0, v, 4000000);
        hjjc hjjc0 = new hjjc();
        hjjc0.e("X-Goog-Upload-Header-Content-Length", Long.toString(v));
        hjjc0.e("Authorization", "Bearer " + ((fmjf)object0).a);
        fieo fieo0 = ((fmjf)object0).e;
        if(fieo0 == null) {
            return glzd.f(((fmjf)object0).f.a(s1, "POST", hjjc0, hjjj0, s, hjka0).b(), new fmje(), ((fmjf)object0).c);
        }
        String s2 = ((fmjf)object0).a;
        clbc clbc0 = new clbc(null);
        clbc0.c(hvdq.a.c().g());
        clbd clbd0 = new clbd(clbc0);
        ckcq ckcq0 = ckjc.b;
        clcf clcf0 = clcg.a(clbd0, ckcq0);
        claw claw0 = new claw(null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cpts.a).v_newBuilder();
        String s3 = String.valueOf(s2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cpts cpts0 = (cpts)hftp0.b_message;
        hfuo hfuo0 = cpts0.b;
        if(!hfuo0.c()) {
            cpts0.b = ProtoLiteMessage.E(hfuo0);
        }
        cpts0.b.add("Bearer " + s3);
        String s4 = Long.toString(hjjj0.e());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cpts cpts1 = (cpts)hftp0.b_message;
        s4.getClass();
        hfuo hfuo1 = cpts1.c;
        if(!hfuo1.c()) {
            cpts1.c = ProtoLiteMessage.E(hfuo1);
        }
        cpts1.c.add(s4);
        claw0.b(((MessageLite)(((cpts)hftp0.N_build()))), ckjc.c, cptt.a);
        clax clax0 = new clax(claw0);
        return glzd.f(fieo0.a.a(clcf0, "POST", clax0, hjjj0, s, hjka0, -1, 0x4400, ckcq0).b(), new fmje(), ((fmjf)object0).c);
    }
}

