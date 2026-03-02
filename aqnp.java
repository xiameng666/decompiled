import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class aqnp {
    public static final baun a;
    public final aqnl b;
    public final Context c;
    public final clgu d;
    private final gmcg e;

    static {
        aqnp.a = aqql.a("GmsScottyHttpClient");
    }

    public aqnp(Context context0) {
        this.c = context0;
        this.e = new bblp(1, 9);
        this.b = new aqnl(context0, aqxr.a());
        this.d = clgt.b(-1, 1040);
    }

    public final void a(clcf clcf0, File file0) {
        aqno aqno0 = new aqno(this, file0);
        clcj clcj0 = clbv.a(this.c).e(clcf0, aqno0, this.e, -1, 1040);
        clcj0.n("GET");
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/octet-stream");
        clcj0.m(new clax(claw0));
        clcj0.h(this.b.a());
        clcn clcn0 = clcj0.e();
        try {
            clcq clcq0 = ((clcp)clcn0.a().get()).a;
            int v = clcq0.a();
            if(v == 200) {
                return;
            }
            aqnp.a.j("HTTP GET response code: %d", new Object[]{v});
            throw new aqxy("Server rejected HTTP request: " + clcq0.e(), v);
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0.getCause() instanceof clbw)) {
                throw new aqxy("Parse Proto Exception.", 404);
            }
            throw new IOException("Failed to connect", exception0);
        }
    }

    public static final clcf b(hisr hisr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxi.a).v_newBuilder();
        String s = hisr0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxi arxi0 = (arxi)hftp0.b_message;
        s.getClass();
        arxi0.b |= 1;
        arxi0.c = s;
        arxi arxi1 = (arxi)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.k());
        clbc0.b("download/v1");
        clbc0.d(((MessageLite)arxi1), ckat.d, arxj.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arxg.a).v_newBuilder();
        String s1 = hisr0.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxg arxg0 = (arxg)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arxg0.b;
        if(!hfuo0.c()) {
            arxg0.b = ProtoLiteMessage.E(hfuo0);
        }
        arxg0.b.add(s1);
        String s2 = (hisr0.c == null ? hise.a : hisr0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxg arxg1 = (arxg)hftp1.b_message;
        s2.getClass();
        hfuo hfuo1 = arxg1.c;
        if(!hfuo1.c()) {
            arxg1.c = ProtoLiteMessage.E(hfuo1);
        }
        arxg1.c.add(s2);
        hise hise0 = hisr0.c == null ? hise.a : hisr0.c;
        String s3 = (hise0.c == null ? hish.a : hise0.c).b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxg arxg2 = (arxg)hftp1.b_message;
        s3.getClass();
        hfuo hfuo2 = arxg2.d;
        if(!hfuo2.c()) {
            arxg2.d = ProtoLiteMessage.E(hfuo2);
        }
        arxg2.d.add(s3);
        hise hise1 = hisr0.c == null ? hise.a : hisr0.c;
        String s4 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxg arxg3 = (arxg)hftp1.b_message;
        s4.getClass();
        hfuo hfuo3 = arxg3.e;
        if(!hfuo3.c()) {
            arxg3.e = ProtoLiteMessage.E(hfuo3);
        }
        arxg3.e.add(s4);
        arxg arxg4 = (arxg)hftp1.N_build();
        clba clba0 = new clba(null);
        clba0.a("alt", "media");
        clba0.c(((MessageLite)arxg4), ckat.c, arxh.a);
        return clcg.b(clbd0, new cldm(clba0), ckat.b);
    }
}

