import android.util.Base64;
import java.security.MessageDigest;

public final class atnb implements atmz {
    private static final aqql a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;
    private final clgu d;

    static {
        atnb.a = new aqql(new String[]{"ScottyTransferFactory"});
    }

    public atnb(clgu clgu0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1) {
        this.d = clgu0;
        this.b = gful0;
        this.c = gful1;
    }

    @Override  // atmz
    public final hjjt a(aqfe aqfe0, String s, MessageDigest messageDigest0, gful_cronetEngineProvider gful0, hjiy hjiy0) {
        return this.d(aqfe0, s, messageDigest0, gful0, atnb.c(messageDigest0, gful0), hjiy0);
    }

    @Override  // atmz
    public final hjjt b(aqfe aqfe0, MessageDigest messageDigest0, gful_cronetEngineProvider gful0, hjiy hjiy0) {
        return this.d(aqfe0, null, messageDigest0, gful0, atnb.c(messageDigest0, gful0), hjiy0);
    }

    private static atna c(MessageDigest messageDigest0, gful_cronetEngineProvider gful0) {
        if(gful0 != null) {
            return atna.c;
        }
        return messageDigest0 == null ? atna.a : atna.b;
    }

    private final hjjt d(aqfe aqfe0, String s, MessageDigest messageDigest0, gful_cronetEngineProvider gful0, atna atna0, hjiy hjiy0) {
        clbc clbc0 = new clbc(null);
        hqlt hqlt0 = hqlt.a;
        clbc0.c(hqlt0.o().G());
        clbd clbd0 = new clbd(clbc0);
        ckcq ckcq0 = ckak.b;
        clcf clcf0 = clcg.a(clbd0, ckcq0);
        String s1 = aqfe0.f;
        String s2 = hqlt.E() ? "Bearer " : "GoogleLogin auth=";
        claw claw0 = new claw(null);
        claw0.a("content-type", "application/octet-stream");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqhu.a).v_newBuilder();
        String s3 = String.valueOf(s1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhu aqhu0 = (aqhu)hftp0.b_message;
        hfuo hfuo0 = aqhu0.b;
        if(!hfuo0.c()) {
            aqhu0.b = ProtoLiteMessage.E(hfuo0);
        }
        aqhu0.b.add(s2 + s3);
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqhu aqhu1 = (aqhu)hftp0.b_message;
            hfuo hfuo1 = aqhu1.c;
            if(!hfuo1.c()) {
                aqhu1.c = ProtoLiteMessage.E(hfuo1);
            }
            aqhu1.c.add(s);
        }
        String s4 = atna0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhu aqhu2 = (aqhu)hftp0.b_message;
        s4.getClass();
        hfuo hfuo2 = aqhu2.d;
        if(!hfuo2.c()) {
            aqhu2.d = ProtoLiteMessage.E(hfuo2);
        }
        aqhu2.d.add(s4);
        if(hqlt0.o().R()) {
            String s5 = Integer.toString(0xF1B18AD);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqhu aqhu3 = (aqhu)hftp0.b_message;
            s5.getClass();
            hfuo hfuo3 = aqhu3.e;
            if(!hfuo3.c()) {
                aqhu3.e = ProtoLiteMessage.E(hfuo3);
            }
            aqhu3.e.add(s5);
        }
        claw0.b(((MessageLite)(((aqhu)hftp0.N_build()))), ckak.c, aqfp.a);
        clax clax0 = new clax(claw0);
        hjjz hjjz0 = new hjjz();
        if(messageDigest0 != null) {
            hjjz0.b = messageDigest0;
        }
        if(gful0 != null) {
            hjjz0.c = gfsx.m(gful0);
        }
        hjjz0.a();
        hjka hjka0 = new hjka(hjjz0);
        Object[] arr_object = {clcf0.c()};
        atnb.a.d("Creating transfer to %s", arr_object);
        gftb.check(this.d);
        String s6 = Base64.encodeToString(aqfe0.toBytesArray(), 2);
        int v = (int)(((Integer)this.c.mr()));
        int v1 = (int)(((Integer)this.b.mr()));
        return this.d.a(clcf0, "PUT", clax0, hjiy0, s6, hjka0, v, v1, ckcq0);
    }
}

