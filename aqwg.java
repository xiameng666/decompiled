import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public final class aqwg {
    public final String a;
    public final HashMap b;
    public boolean c;

    public aqwg(long v) {
        this.b = new HashMap();
        this.c = false;
        this.a = "_tmp_" + Long.toString(v % 0x10000L, 16);
    }

    public final aqwf a(String s) {
        HashMap hashMap0 = this.b;
        aqwf aqwf0 = (aqwf)hashMap0.get(s);
        if(aqwf0 == null) {
            aqwf0 = new aqwf();
            hashMap0.put(s, aqwf0);
        }
        return aqwf0;
    }

    public static void b(aqfo aqfo0) {
        if((aqfo0.b & 2) == 0) {
            throw new IOException("Incomplete response");
        }
        int v = aqfn.b(aqfo0.c) == 0 ? 1 : aqfn.b(aqfo0.c);
        if(v != 1) {
            throw new aqxv("Server failed authorization.", v);
        }
        for(Object object0: aqfo0.f) {
            aqfi aqfi0 = (aqfi)object0;
            if((aqfi0.b & 8) != 0) {
                int v1 = aqfn.b(aqfi0.g) == 0 ? 1 : aqfn.b(aqfi0.g);
                if(v1 == 1 || v1 == 4) {
                    continue;
                }
                StringBuilder stringBuilder0 = new StringBuilder("server error in app ");
                stringBuilder0.append(aqfi0.c);
                stringBuilder0.append(": code ");
                stringBuilder0.append(aqfn.a(v1));
                for(Object object1: aqfi0.h) {
                    stringBuilder0.append(": ");
                    stringBuilder0.append(((String)object1));
                }
                switch(v1) {
                    case 2: {
                        throw new aqyg();
                    }
                    case 7: {
                        throw new aqyn(stringBuilder0.toString());
                    }
                    case 8: {
                        throw new aqye(stringBuilder0.toString());
                    }
                    default: {
                        if(!hqmi.d()) {
                            throw new IOException(stringBuilder0.toString());
                        }
                        if(v1 == 10) {
                            throw new aqym();
                        }
                        if(!hqmu.a.b().a()) {
                            continue;
                        }
                        throw new IOException(stringBuilder0.toString());
                    }
                }
            }
            throw new IOException("Incomplete response application");
        }
    }

    public final ProtoLiteBuilder c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp0.b_message;
        aqfe0.b |= 0x40;
        aqfe0.h = 2;
        for(Object object0: this.b.entrySet()) {
            aqwf aqwf0 = (aqwf)((Map.Entry)object0).getValue();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqet.a).v_newBuilder();
            String s = (String)((Map.Entry)object0).getKey();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqet aqet0 = (aqet)hftp1.b_message;
            s.getClass();
            aqet0.b |= 1;
            aqet0.c = s;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aqeq.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            aqeq aqeq0 = (aqeq)hftp2.b_message;
            aqeq0.b |= 1;
            aqeq0.c = "_tmp_";
            aqeq aqeq1 = (aqeq)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqet aqet1 = (aqet)hftp1.b_message;
            aqeq1.getClass();
            aqet1.b();
            aqet1.f.add(aqeq1);
            hftp0.dj(hftp1);
            aqwf0.a.clear();
            aqwf0.b.clear();
            aqwf0.c.clear();
        }
        return hftp0;
    }
}

