import java.io.IOException;
import java.util.HashMap;

public final class atmt {
    public final atmu a;
    public aqfo b;
    public int c;
    public final HashMap d;
    public ProtoLiteBuilder e;
    private static final aqql f;

    static {
        atmt.f = new aqql(new String[]{"RestoreRequestProcessor"});
    }

    public atmt(long v, long v1, String[] arr_s, String s, String s1) {
        batl.s(arr_s);
        atmu atmu0 = new atmu(v, v1, s, s1);
        this.a = atmu0;
        if(arr_s.length == 0) {
            this.e = null;
        }
        else {
            ProtoLiteBuilder hftp0 = atmu0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((aqfe)hftp0.b_message).l = hfvv.a;
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                String s2 = arr_s[v2];
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqet.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqet aqet0 = (aqet)hftp1.b_message;
                s2.getClass();
                aqet0.b |= 1;
                aqet0.c = s2;
                aqer aqer0 = aqer.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqet aqet1 = (aqet)hftp1.b_message;
                aqer0.getClass();
                aqet1.d = aqer0;
                aqet1.b |= 4;
                hftp0.cM(((aqet)hftp1.N_build()));
            }
            this.e = hftp0;
        }
        this.b = null;
        this.c = -1;
        this.d = new HashMap();
    }

    public final atms a() {
        String s1;
        arax arax0;
        aqei aqei0;
        if(this.b != null) {
            while(this.c < this.b.f.size()) {
                int v = this.c;
                this.c = v + 1;
                aqfi aqfi0 = (aqfi)this.b.f.get(v);
                String s = (this.b.b & 4) == 0 ? null : this.b.d;
                try {
                    if((aqfi0.b & 16) == 0) {
                        aqei0 = null;
                    }
                    else {
                        aqei aqei1 = aqfi0.i;
                        aqei0 = aqei1 == null ? aqei.a : aqei1;
                    }
                    if(aqei0 == null) {
                        arax0 = null;
                    }
                    else {
                        gftb.b(hkzl.a((aqei0.d == null ? hkzm.a : aqei0.d).c) == 3, "We only support WRAPPED_AES_256_GCM");
                        hfsl hfsl0 = aqei0.c.k();
                        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)arax.a).x_newMutableInstance();
                        try {
                            hfwc hfwc0 = hfvu.a.c(hftv0);
                            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                            hfwc0.g(hftv0);
                        }
                        catch(hfur hfur1) {
                            if(hfur1.b) {
                                hfur1 = new hfur(hfur1);
                            }
                            hfur1.a = hftv0;
                            throw hfur1;
                        }
                        catch(hfwr hfwr0) {
                            hfur hfur2 = hfwr0.a();
                            hfur2.a = hftv0;
                            throw hfur2;
                        }
                        catch(IOException iOException0) {
                            if((iOException0.getCause() instanceof hfur)) {
                                throw (hfur)iOException0.getCause();
                            }
                            hfur hfur3 = new hfur(iOException0);
                            hfur3.a = hftv0;
                            throw hfur3;
                        }
                        catch(RuntimeException runtimeException0) {
                            if((runtimeException0.getCause() instanceof hfur)) {
                                throw (hfur)runtimeException0.getCause();
                            }
                            throw runtimeException0;
                        }
                        try {
                            hfsl0.z(0);
                        }
                        catch(hfur hfur4) {
                            hfur4.a = hftv0;
                            throw hfur4;
                        }
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        arax0 = (arax)hftv0;
                    }
                }
                catch(hfur hfur0) {
                    atmt.f.n("Unable to parse wrapped tertiary key for package, skipping: %s", hfur0, new Object[]{aqfi0.c});
                    continue;
                }
                if(arax0 != null && s == null) {
                    atmt.f.m("Package is encrypted but secondary key is missing, so skipping: %s", new Object[]{aqfi0.c});
                    continue;
                }
                boolean z = s != null && arax0 != null;
                if(z && (aqfi0.b & 4) == 0 || (aqfi0.b & 4) == 0 && aqfi0.e.size() == 0) {
                    atmt.f.h("Skipping app with no doc url or kv pairs: %s", new Object[]{aqfi0.c});
                    continue;
                }
                if(s != null && arax0 == null) {
                    atmt.f.h("Unencrypted package in encrypted set: %s", new Object[]{aqfi0.c});
                }
                if(z) {
                    if((aqfi0.b & 0x20) != 0) {
                        int v2 = aqfi0.j;
                        if(aqeh.a(v2) == 2) {
                            return new atmo(aqfi0.c, aqfi0.k, 2, s, arax0, aqfi0.f);
                        }
                        if(aqeh.a(v2) == 3) {
                            return new atmo(aqfi0.c, aqfi0.k, 1, s, arax0, aqfi0.f);
                        }
                    }
                    switch(aqeh.a(aqfi0.j)) {
                        case 0: 
                        case 1: {
                            s1 = "UNSPECIFIED";
                            break;
                        }
                        case 2: {
                            s1 = "FULL";
                            break;
                        }
                        default: {
                            s1 = "KEY_VALUE";
                        }
                    }
                    throw new IllegalArgumentException("Unknown backup type: " + s1);
                }
                if((aqfi0.b & 4) != 0) {
                    return new atmq(aqfi0.c, aqfi0.k, aqfi0.f);
                }
                String s2 = aqfi0.c;
                int v3 = aqfi0.k;
                HashMap hashMap0 = new HashMap();
                for(int v1 = 0; v1 < aqfi0.e.size(); ++v1) {
                    aqfq aqfq0 = (aqfq)aqfi0.e.get(v1);
                    String s3 = aqfq0.c;
                    if(!s3.startsWith("_tmp_")) {
                        if((aqfq0.b & 2) == 0) {
                            hashMap0.put(s3, null);
                        }
                        else {
                            hashMap0.put(s3, aqfq0.d.toByteArray());
                        }
                    }
                }
                return new atmr(s2, v3, hashMap0);
            }
        }
        return null;
    }
}

