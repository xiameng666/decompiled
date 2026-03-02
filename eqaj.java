import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.HashMap;

public final class eqaj extends cuwp {
    final eqam a;
    private final String b;
    private final String c;
    private final boolean d;

    public eqaj(eqam eqam0, String s, String s1, boolean z) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
        this.b = s;
        this.c = s1;
        this.d = z;
    }

    @Override  // cuwp
    public final void b(String s, cuwf cuwf0) {
        evql evql0;
        int v2;
        baun baun0 = eqam.b;
        baun0.d("[AutoConnectWithPairingCodeDiscoveryCallback] Found endpoint: %s", new Object[]{s});
        String s1 = cuwf0.b;
        eqmz eqmz0 = eqmy.a(s1);
        eqmw eqmw0 = eqmz0.a();
        String s2 = eqmw0.e();
        baun0.j("Device name: %s", new Object[]{eqmz0.c()});
        String s3 = this.b;
        if(s3.equals(s2)) {
            baun0.h("Requesting connection to device: %s (%s)", new Object[]{s1, s});
            eqam eqam0 = this.a;
            if(eqam0.q && eqam0.v.getAndSet(true)) {
                baun0.m("Already try to reconnect.", new Object[0]);
                return;
            }
            eqam0.i = s;
            eqmj eqmj0 = eqam0.g;
            if((eqmj0 instanceof eqyf)) {
                erav erav0 = ((eqyf)eqmj0).b;
                eqoe eqoe0 = eqmz0.a().c();
                String s4 = eqmz0.c();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjy.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gjjy)hftv0).c = eqoe0.k;
                ((gjjy)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjjy gjjy0 = (gjjy)hftp0.b_message;
                s4.getClass();
                gjjy0.b |= 2;
                gjjy0.d = s4;
                gjjy gjjy1 = (gjjy)hftp0.N_build();
                ProtoLiteBuilder hftp1 = erav0.o(gjkj.k);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjkn gjkn0 = (gjkn)hftp1.b_message;
                gjjy1.getClass();
                gjkn0.s = gjjy1;
                gjkn0.b |= 0x20000;
                erav0.f(((gjkn)hftp1.N_build()));
                ((eqyf)eqmj0).c.d(eqmz0, true);
            }
            eqam0.k();
            if(eqmw0.g() && !eqam0.q) {
                int v = eqmw0.a();
                batl.s(eqam0.d);
                int v1 = (int)erpp.b("com.google.android.gms", false, eqam0.d.getPackageManager());
                batl.c(v >= 0, "Protocol version must be non-negative");
                HashMap hashMap0 = new HashMap();
                for(Object object0: hyis.a.k().y().b) {
                    String s5 = (String)object0;
                    String[] arr_s = s5.split("=", 2);
                    if(arr_s.length == 2) {
                        try {
                            hashMap0.put(Integer.valueOf(Integer.parseInt(arr_s[0])), Integer.valueOf(Integer.parseInt(arr_s[1])));
                            continue;
                        }
                        catch(NumberFormatException numberFormatException0) {
                            eqxk.a.g("Failed to parse version map element (%s)", numberFormatException0, new Object[]{s5});
                        }
                    }
                    else {
                        eqxk.a.f("Failed to split version map element (%s)", new Object[]{s5});
                    }
                    v2 = -1;
                    goto label_75;
                }
                Integer integer0 = v;
                if(hashMap0.containsKey(integer0)) {
                    Integer integer1 = (Integer)hashMap0.get(integer0);
                    if(integer1 == null) {
                        eqxk.a.f("Failed to unbox GmsCore version for protocol version %d", new Object[]{integer0});
                        v2 = -1;
                    }
                    else {
                        eqxk.a.d("Minimum GmsCore version for protocol version %d is %d", new Object[]{integer0, integer1});
                        v2 = (int)integer1;
                    }
                }
                else {
                    eqxk.a.f("Failed to find minimum GmsCore version for protocol version %d", new Object[]{integer0});
                    v2 = -1;
                }
            label_75:
                int v3 = bbor.b(v1);
                baun baun1 = eqam.b;
                baun1.h("Protocol version %d requires GmsCore %d, found GmsCore %d", new Object[]{v, v2, v3});
                eqmj eqmj1 = eqam0.g;
                if((eqmj1 instanceof eqyf)) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjkg.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((gjkg)hftv1).b |= 1;
                    ((gjkg)hftv1).c = v;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    ((gjkg)hftv2).b |= 4;
                    ((gjkg)hftv2).e = v3;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    erav erav1 = ((eqyf)eqmj1).b;
                    gjkg gjkg0 = (gjkg)hftp2.b_message;
                    gjkg0.b |= 2;
                    gjkg0.d = v2;
                    gjkg gjkg1 = (gjkg)hftp2.N_build();
                    ProtoLiteBuilder hftp3 = erav1.o(gjkj.i);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gjkn gjkn1 = (gjkn)hftp3.b_message;
                    gjkg1.getClass();
                    gjkn1.t = gjkg1;
                    gjkn1.b |= 0x40000;
                    erav1.f(((gjkn)hftp3.N_build()));
                }
                if(v3 == -1) {
                    baun1.m("Could not get current GmsCore version, allowing flow to continue anyways", new Object[0]);
                    goto label_119;
                }
                else if(v2 == -1) {
                    baun1.m("Could not get required protocol version, allow flow to continue anyways...", new Object[0]);
                    goto label_119;
                }
                else if(v3 < v2) {
                    baun1.m("Source GmsCore version does not meet the version requirements", new Object[0]);
                    this.a.i = null;
                    eqmj eqmj2 = this.a.g;
                    if(eqmj2 != null) {
                        eqmj2.d(10805, null);
                    }
                }
                else {
                    goto label_119;
                }
            }
            else {
            label_119:
                eqam eqam1 = this.a;
                eqam1.m = eqmw0.d();
                eqam1.r = eqmw0.b();
                eqam1.s = eqam.m(eqmw0.c());
                eqam1.t = eqmw0.f();
                int v4 = eqmw0.a();
                eqam1.u = v4;
                baun baun2 = eqam.b;
                baun2.d("Target protocol version=%d", new Object[]{v4});
                baun2.d("verificationStyle=%d, preferredUserVerificationMethod=%d, isPinFallbackSupported=%b", new Object[]{((int)eqam1.m.h), ((int)eqam1.r), Boolean.valueOf(eqam1.t)});
                if(this.d) {
                    eqam1.l = new eqak(eqam1, this.c);
                    evql0 = eqam1.g(s, hyig.b(), eqam1.l);
                }
                else {
                    evql0 = eqam1.g(s, hyig.b(), eqam1.x);
                }
                Status status0 = erqf.b(evql0);
                if(!status0.equals(Status.b)) {
                    baun2.m("Request Connection failed: " + status0.toString(), new Object[0]);
                    eqam1.i = null;
                    if(eqam1.g != null) {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp4.b_message;
                        ((eqoc)hftv3).c = 1;
                        ((eqoc)hftv3).b |= 1;
                        int v5 = status0.i;
                        if(!hftv3.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        eqoc eqoc0 = (eqoc)hftp4.b_message;
                        eqoc0.b |= 2;
                        eqoc0.d = v5;
                        eqoc eqoc1 = (eqoc)hftp4.N_build();
                        eqam1.g.d(10584, eqoc1);
                    }
                }
            }
        }
        else {
            baun0.d("Ignoring device with pairing code %s, expected pairing code: %s.", new Object[]{s2, s3});
            eqam eqam2 = this.a;
            if(eqam2.p) {
                eqam2.f.d(eqmz0, false);
            }
        }
    }

    @Override  // cuwp
    public final void c(String s) {
        eqam.b.d("Lost target endpoint: %s", new Object[]{s});
    }
}

