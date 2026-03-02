import java.util.concurrent.Callable;

public final class bpsm implements Callable {
    public final bpso a;
    public final gmcd b;
    public final gmcd c;

    public bpsm(bpso bpso0, gmcd gmcd0, gmcd gmcd1) {
        this.a = bpso0;
        this.b = gmcd0;
        this.c = gmcd1;
    }

    @Override
    public final Object call() {
        int v4;
        int v2;
        fqzl fqzl0 = (fqzl)gmbu.r(this.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgza.a).v_newBuilder();
        boolean z = fqzl0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza0 = (hgza)hftp0.b_message;
        int v = 1;
        hgza0.b |= 1;
        hgza0.e = z;
        int v1 = fqzl0.c;
        if(v1 == 22) {
            fqza fqza0 = (fqza)fqzl0.d;
            if(fqza0.e) {
                if(fqza0.c == 2) {
                    v2 = fqyv.a(((Integer)fqza0.d).intValue());
                    if(v2 == 0) {
                        v2 = 1;
                    }
                }
                else {
                    v2 = 1;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgza)hftp0.b_message).d = (int)(v2 - 1);
                ((hgza)hftp0.b_message).c = 2;
            }
            else if(hsww.a.b().J()) {
                int v3 = fqzl0.c;
                if(((v3 == 22 ? ((fqza)fqzl0.d) : fqza.a).b & 1) != 0) {
                    fqza fqza1 = v3 == 22 ? ((fqza)fqzl0.d) : fqza.a;
                    if(fqza1.c == 4) {
                        v4 = fqyx.a(((Integer)fqza1.d).intValue());
                        if(v4 == 0) {
                            v4 = 1;
                        }
                    }
                    else {
                        v4 = 1;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hgza)hftp0.b_message).d = (int)(v4 - 1);
                    ((hgza)hftp0.b_message).c = 23;
                }
            }
        }
        else {
            fqyt fqyt0 = v1 == 0x1F ? ((fqyt)fqzl0.d) : fqyt.a;
            fqys fqys0 = fqys.b(fqyt0.c) == null ? fqys.a : fqys.b(fqyt0.c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgza)hftp0.b_message).d = (int)fqys0.o;
            ((hgza)hftp0.b_message).c = 3;
        }
        gtas gtas0 = gtas.b(fqzl0.g) == null ? gtas.a : gtas.b(fqzl0.g);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza1 = (hgza)hftp0.b_message;
        hgza1.g = gtas0.a();
        hgza1.b |= 4;
        if((fqzl0.b & 16) != 0) {
            hfwn hfwn0 = bpso.a((fqzl0.i == null ? hfwn.a : fqzl0.i));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgza hgza2 = (hgza)hftp0.b_message;
            hfwn0.getClass();
            hgza2.h = hfwn0;
            hgza2.b |= 8;
        }
        if((fqzl0.b & 8) != 0) {
            hfwn hfwn1 = bpso.a((fqzl0.h == null ? hfwn.a : fqzl0.h));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgza hgza3 = (hgza)hftp0.b_message;
            hfwn1.getClass();
            hgza3.i = hfwn1;
            hgza3.b |= 16;
        }
        boolean z1 = (fqzl0.b & 0x20) != 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza4 = (hgza)hftp0.b_message;
        hgza4.b |= 0x20;
        hgza4.j = z1;
        if((fqzl0.b & 0x40) != 0) {
            hfwn hfwn2 = bpso.a((fqzl0.k == null ? hfwn.a : fqzl0.k));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgza hgza5 = (hgza)hftp0.b_message;
            hfwn2.getClass();
            hgza5.k = hfwn2;
            hgza5.b |= 0x40;
        }
        fqyi fqyi0 = fqyi.b(fqzl0.r) == null ? fqyi.a : fqyi.b(fqzl0.r);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgza)hftp0.b_message).l = fqyi0.aa;
        ((hgza)hftp0.b_message).b |= 0x80;
        if(((fqzl0.t == null ? fqxr.a : fqzl0.t).b & 1) != 0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyz.a).v_newBuilder();
            fqxr fqxr0 = fqzl0.t == null ? fqxr.a : fqzl0.t;
            hfwn hfwn3 = bpso.a((fqxr0.c == null ? hfwn.a : fqxr0.c));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hfwn3.getClass();
            ((hgyz)hftv0).c = hfwn3;
            ((hgyz)hftv0).b |= 1;
            boolean z2 = (fqzl0.t == null ? fqxr.a : fqzl0.t).d;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgyz hgyz0 = (hgyz)hftp1.b_message;
            hgyz0.b |= 2;
            hgyz0.d = z2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgza hgza6 = (hgza)hftp0.b_message;
            hgyz hgyz1 = (hgyz)hftp1.N_build();
            hgyz1.getClass();
            hgza6.m = hgyz1;
            hgza6.b |= 0x100;
        }
        if((fqzl0.b & 0x800) != 0) {
            hfwn hfwn4 = bpso.a((fqzl0.s == null ? hfwn.a : fqzl0.s));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgza hgza7 = (hgza)hftp0.b_message;
            hfwn4.getClass();
            hgza7.n = hfwn4;
            hgza7.b |= 0x200;
        }
        boolean z3 = bpya.a(this.a.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza8 = (hgza)hftp0.b_message;
        hgza8.b |= 2;
        hgza8.f = z3;
        int v5 = fqzl0.l.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza9 = (hgza)hftp0.b_message;
        hgza9.b |= 0x400;
        hgza9.o = v5;
        int v6 = (int)(((Integer)gmbu.r(this.c)));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgza hgza10 = (hgza)hftp0.b_message;
        hgza10.b |= 0x800;
        hgza10.p = v6;
        if((fqzl0.b & 0x2000) != 0) {
            fqzk fqzk0 = fqzl0.u == null ? fqzk.a : fqzl0.u;
            int v7 = fqzi.a(fqzk0.d);
            if(v7 != 0) {
                v = v7;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgza)hftp0.b_message).q = v - 1;
            ((hgza)hftp0.b_message).b |= 0x1000;
            int v8 = fqzk0.e.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hgza)hftv1).b |= 0x2000;
            ((hgza)hftv1).r = v8;
            if((fqzk0.b & 4) != 0) {
                int v9 = fqzk0.f;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgza hgza11 = (hgza)hftp0.b_message;
                hgza11.b |= 0x4000;
                hgza11.s = v9;
            }
            int v10 = fqzk0.g.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((hgza)hftv2).b |= 0x8000;
            ((hgza)hftv2).t = v10;
            if((fqzk0.b & 8) != 0) {
                String s = fqzk0.i;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgza hgza12 = (hgza)hftp0.b_message;
                s.getClass();
                hgza12.b |= 0x20000;
                hgza12.u = s;
            }
            if((fqzk0.b & 16) != 0) {
                boolean z4 = fqzk0.j;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgza hgza13 = (hgza)hftp0.b_message;
                hgza13.b |= 0x40000;
                hgza13.v = z4;
            }
        }
        return (hgza)hftp0.N_build();
    }
}

