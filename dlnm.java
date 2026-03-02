import com.google.android.gms.audit.LogAuditRecordsRequest;
import j..util.Collection.-EL;
import java.util.List;

public final class dlnm {
    public static final int a;
    private static final bboh b;
    private static final ggfp c;
    private static final ggfp d;
    private final bajt e;
    private final acqj f;
    private final String g;
    private final String h;

    static {
        dlnm.b = bboh.b("Pay", bbcu.cZ);
        dlnm.c = ggfp.L(gqtz.kK, gqtz.jA, gqtz.kI);
        dlnm.d = ggfp.O(gqub.gj, gqub.go, gqub.gr, gqub.gi, gqub.gs, gqub.gn, new gqub[0]);
    }

    public dlnm(acqj acqj0, String s, String s1) {
        this.e = bajt.f("android_id", Long.valueOf(0L));
        this.f = acqj0;
        this.g = s;
        this.h = s1;
    }

    public final evql a(boolean z, gged_interceptors gged0, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grlt.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grlt grlt0 = (grlt)hftp0.b_message;
        grnp grnp0 = (grnp)hftp1.N_build();
        grnp0.getClass();
        grlt0.c = grnp0;
        grlt0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grlt grlt1 = (grlt)hftp0.b_message;
        hfuo hfuo0 = grlt1.d;
        if(!hfuo0.c()) {
            grlt1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, grlt1.d);
        grlt grlt2 = (grlt)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fS;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grku)hftp2.b_message).c = gqub0.mk;
        ((grku)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp4.b_message;
        grlt2.getClass();
        grlz0.c = grlt2;
        grlz0.b = 19;
        grlz grlz1 = (grlz)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grku grku0 = (grku)hftp2.b_message;
        grkv grkv1 = (grkv)hftp3.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        grku grku1 = (grku)hftp2.N_build();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        String s = this.h;
        if(s != null) {
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            grko grko0 = (grko)hftp7.b_message;
            grko0.b = 1;
            grko0.c = s;
            grko grko1 = (grko)hftp7.N_build();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            grkr grkr0 = (grkr)hftp5.b_message;
            grko1.getClass();
            grkr0.c = grko1;
            grkr0.b |= 1;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp6.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        String s1 = Long.toHexString(bapf.b(this.e));
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp8.b_message;
        s1.getClass();
        grkn0.b |= 1;
        grkn0.c = s1;
        grkn grkn1 = (grkn)hftp8.N_build();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grkr grkr2 = (grkr)hftp6.b_message;
        grkn1.getClass();
        grkr2.d = grkn1;
        grkr2.b |= 4;
        return this.n(grku1, grns0, ((grkr)hftp5.N_build()), ((grkr)hftp6.N_build()));
    }

    public final evql b(boolean z, gged_interceptors gged0, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grlu.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grlu grlu0 = (grlu)hftp0.b_message;
        grnp grnp0 = (grnp)hftp1.N_build();
        grnp0.getClass();
        grlu0.c = grnp0;
        grlu0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grlu grlu1 = (grlu)hftp0.b_message;
        hfuo hfuo0 = grlu1.d;
        if(!hfuo0.c()) {
            grlu1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, grlu1.d);
        grlu grlu2 = (grlu)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fT;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grku)hftp2.b_message).c = gqub0.mk;
        ((grku)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp4.b_message;
        grlu2.getClass();
        grlz0.c = grlu2;
        grlz0.b = 14;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grlz grlz1 = (grlz)hftp4.N_build();
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grku grku0 = (grku)hftp2.b_message;
        grkv grkv1 = (grkv)hftp3.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        grku grku1 = (grku)hftp2.N_build();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        String s = this.h;
        if(s != null) {
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            grko grko0 = (grko)hftp7.b_message;
            grko0.b = 1;
            grko0.c = s;
            grko grko1 = (grko)hftp7.N_build();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            grkr grkr0 = (grkr)hftp5.b_message;
            grko1.getClass();
            grkr0.c = grko1;
            grkr0.b |= 1;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp6.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        String s1 = Long.toHexString(bapf.b(this.e));
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp8.b_message;
        s1.getClass();
        grkn0.b |= 1;
        grkn0.c = s1;
        grkn grkn1 = (grkn)hftp8.N_build();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grkr grkr2 = (grkr)hftp6.b_message;
        grkn1.getClass();
        grkr2.d = grkn1;
        grkr2.b |= 4;
        return this.n(grku1, grns0, ((grkr)hftp5.N_build()), ((grkr)hftp6.N_build()));
    }

    public final grkr c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grko.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grko grko0 = (grko)hftp0.b_message;
        this.h.getClass();
        grko0.b = 1;
        grko0.c = this.h;
        grko grko1 = (grko)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp1.b_message;
        grko1.getClass();
        grkr0.c = grko1;
        grkr0.b |= 1;
        return (grkr)hftp1.N_build();
    }

    public final grkr d() {
        grkr grkr0 = this.c();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grkr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)grkr0));
        String s = Long.toHexString(bapf.b(this.e));
        grkn grkn0 = grkn.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkn0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkn grkn1 = (grkn)hftp1.b_message;
        s.getClass();
        grkn1.b |= 1;
        grkn1.c = s;
        grkn grkn2 = (grkn)hftp1.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkr grkr1 = (grkr)hftp2.b_message;
        grkn2.getClass();
        grkr1.d = grkn2;
        grkr1.b |= 4;
        grkn grkn3 = ((grkr)hftp2.N_build()).d;
        if(grkn3 != null) {
            grkn0 = grkn3;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr2 = (grkr)hftp0.b_message;
        grkn0.getClass();
        grkr2.d = grkn0;
        grkr2.b |= 4;
        return (grkr)hftp0.N_build();
    }

    public final byte[] e(grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.gs;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grmq.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = grno.b;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((grnp)hftp3.b_message).c = grno0.d;
        ((grnp)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grmq grmq0 = (grmq)hftp2.b_message;
        grnp grnp0 = (grnp)hftp3.N_build();
        grnp0.getClass();
        grmq0.c = grnp0;
        grmq0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grmq grmq1 = (grmq)hftp2.N_build();
        grmq1.getClass();
        grkv0.u = grmq1;
        grkv0.c |= 0x2000000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv1 = (grkv)hftp1.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.l(((grku)hftp0.N_build()), grns0, false);
    }

    public final byte[] f(boolean z, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grli.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grli grli0 = (grli)hftp0.b_message;
        grnp grnp0 = (grnp)hftp1.N_build();
        grnp0.getClass();
        grli0.c = grnp0;
        grli0.b |= 1;
        grli grli1 = (grli)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fP;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grku)hftp2.b_message).c = gqub0.mk;
        ((grku)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp4.b_message;
        grli1.getClass();
        grlz0.c = grli1;
        grlz0.b = 13;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grlz grlz1 = (grlz)hftp4.N_build();
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grku grku0 = (grku)hftp2.b_message;
        grkv grkv1 = (grkv)hftp3.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.l(((grku)hftp2.N_build()), grns0, false);
    }

    public final byte[] g(boolean z, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grlk.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grlk grlk0 = (grlk)hftp0.b_message;
        grnp grnp0 = (grnp)hftp1.N_build();
        grnp0.getClass();
        grlk0.c = grnp0;
        grlk0.b |= 1;
        grlk grlk1 = (grlk)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fP;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grku)hftp2.b_message).c = gqub0.mk;
        ((grku)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp4.b_message;
        grlk1.getClass();
        grlz0.c = grlk1;
        grlz0.b = 2;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grlz grlz1 = (grlz)hftp4.N_build();
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grku grku0 = (grku)hftp2.b_message;
        grkv grkv1 = (grkv)hftp3.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.k(((grku)hftp2.N_build()), grns0);
    }

    public final byte[] h(boolean z, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fH;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grll.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((grnp)hftp4.b_message).c = grno0.d;
        ((grnp)hftp4.b_message).b |= 1;
        grnp grnp0 = (grnp)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grll grll0 = (grll)hftp3.b_message;
        grnp0.getClass();
        grll0.c = grnp0;
        grll0.b |= 1;
        grll grll1 = (grll)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp2.b_message;
        grll1.getClass();
        grlz0.c = grll1;
        grlz0.b = 15;
        grlz grlz1 = (grlz)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        grkv grkv1 = (grkv)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.l(((grku)hftp0.N_build()), grns0, false);
    }

    public final byte[] i(boolean z, grns grns0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.fE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grlz.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grlg.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((grnp)hftp4.b_message).c = grno0.d;
        ((grnp)hftp4.b_message).b |= 1;
        grnp grnp0 = (grnp)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grlg grlg0 = (grlg)hftp3.b_message;
        grnp0.getClass();
        grlg0.c = grnp0;
        grlg0.b |= 1;
        grlg grlg1 = (grlg)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grlz grlz0 = (grlz)hftp2.b_message;
        grlg1.getClass();
        grlz0.c = grlg1;
        grlz0.b = 16;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grlz grlz1 = (grlz)hftp2.N_build();
        grlz1.getClass();
        grkv0.q = grlz1;
        grkv0.c |= 0x20000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv1 = (grkv)hftp1.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.m(((grku)hftp0.N_build()), grns0, this.d(), this.c());
    }

    public final byte[] j(grns grns0, List list0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.gi;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grmm.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((grnp)hftp3.b_message).c = grno0.d;
        ((grnp)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grmm grmm0 = (grmm)hftp2.b_message;
        grnp grnp0 = (grnp)hftp3.N_build();
        grnp0.getClass();
        grmm0.c = grnp0;
        grmm0.b |= 1;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(list0).map(new dlnl()).collect(ggaf.a);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grmm grmm1 = (grmm)hftp2.b_message;
        hfuf hfuf0 = grmm1.d;
        if(!hfuf0.c()) {
            grmm1.d = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            grmm1.d.i(((grml)object0).l);
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grmm grmm2 = (grmm)hftp2.N_build();
        grmm2.getClass();
        grkv0.r = grmm2;
        grkv0.c |= 0x100000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv1 = (grkv)hftp1.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        return this.k(((grku)hftp0.N_build()), grns0);
    }

    public final byte[] k(grku grku0, grns grns0) {
        return this.l(grku0, grns0, true);
    }

    public final byte[] l(grku grku0, grns grns0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(acqi.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkh grkh0 = (grkh)hftp0.b_message;
        grkh0.b |= 1;
        grkh0.c = hfsf0;
        byte[] arr_b = ((grkh)hftp0.N_build()).toBytesArray();
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        if(grns0 != null) {
            if(!grkf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grkf0).ensureMutable();
            }
            ((grkg)grkf0.b_message).g = grns0;
            ((grkg)grkf0.b_message).b |= 8;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(z) {
            String s = Long.toHexString(bapf.b(this.e));
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grkn grkn0 = (grkn)hftp2.b_message;
            s.getClass();
            grkn0.b |= 1;
            grkn0.c = s;
            grkn grkn1 = (grkn)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkr grkr0 = (grkr)hftp1.b_message;
            grkn1.getClass();
            grkr0.d = grkn1;
            grkr0.b |= 4;
        }
        String s1 = this.h;
        if(s1 != null) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            grko grko0 = (grko)hftp3.b_message;
            grko0.b = 1;
            grko0.c = s1;
            grko grko1 = (grko)hftp3.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp1.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        int v = ((grkr)hftp1.b_message).b;
        if((v & 4) == 0 && (v & 1) == 0) {
            ((ggtj)dlnm.b.i()).x("Generated invalid audit record; record has no Android device ID nor GAIA user.");
            return null;
        }
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grkr grkr2 = (grkr)hftp1.N_build();
        grkr2.getClass();
        grkg1.e = grkr2;
        grkg1.b |= 2;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr grkr3 = (grkr)hftp1.N_build();
        grkr3.getClass();
        grkg2.d = grkr3;
        grkg2.b |= 1;
        acqo acqo0 = new acqo();
        acqo0.c = this.g;
        acqo0.d = arr_b;
        gqub gqub0 = gqub.b(grku0.c) == null ? gqub.a : gqub.b(grku0.c);
        int v1 = 0xF9;
        if(!dlnm.d.contains(gqub0)) {
            v1 = 0x87;
        }
        else if(grns0 != null) {
            gqtz gqtz0 = gqtz.b(grns0.c) == null ? gqtz.a : gqtz.b(grns0.c);
            if(dlnm.c.contains(gqtz0)) {
                v1 = 0xF7;
            }
        }
        acqo0.b = v1;
        acqo0.b(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray());
        acqo0.a = 2;
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        this.f.b(logAuditRecordsRequest0);
        return arr_b;
    }

    public final byte[] m(grku grku0, grns grns0, grkr grkr0, grkr grkr1) {
        gftb.checkTrue(dlnm.o(grkr0) && dlnm.o(grkr1));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(acqi.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkh grkh0 = (grkh)hftp0.b_message;
        grkh0.b |= 1;
        grkh0.c = hfsf0;
        byte[] arr_b = ((grkh)hftp0.N_build()).toBytesArray();
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grkr0.getClass();
        grkg1.d = grkr0;
        grkg1.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr1.getClass();
        grkg2.e = grkr1;
        grkg2.b |= 2;
        if(grns0 != null) {
            if(!grkf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grkf0).ensureMutable();
            }
            ((grkg)grkf0.b_message).g = grns0;
            ((grkg)grkf0.b_message).b |= 8;
        }
        acqo acqo0 = new acqo();
        acqo0.c = this.g;
        acqo0.d = arr_b;
        acqo0.b = 0x87;
        acqo0.b(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray());
        acqo0.a = 2;
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        this.f.b(logAuditRecordsRequest0);
        return arr_b;
    }

    private final evql n(grku grku0, grns grns0, grkr grkr0, grkr grkr1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(acqi.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkh grkh0 = (grkh)hftp0.b_message;
        grkh0.b |= 1;
        grkh0.c = hfsf0;
        byte[] arr_b = ((grkh)hftp0.N_build()).toBytesArray();
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns0.getClass();
        grkg1.g = grns0;
        grkg1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr0.getClass();
        grkg2.d = grkr0;
        grkg2.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg3 = (grkg)grkf0.b_message;
        grkr1.getClass();
        grkg3.e = grkr1;
        grkg3.b |= 2;
        grkg grkg4 = (grkg)((ProtoLiteBuilder)grkf0).N_build();
        acqo acqo0 = new acqo();
        acqo0.c = this.g;
        acqo0.d = arr_b;
        acqo0.b = 0x87;
        acqo0.b(grkg4.toBytesArray());
        acqo0.a = 1;
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        return this.f.b(logAuditRecordsRequest0);
    }

    private static final boolean o(grkr grkr0) {
        return (grkr0.b & 4) != 0 || (grkr0.b & 1) != 0;
    }
}

