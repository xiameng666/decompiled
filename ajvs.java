import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class ajvs extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final akbo c;
    private final long d;
    private final String e;
    private final byte[] f;

    static {
        ajvs.a = akea.b("CreateRetrievalPacketOperation");
    }

    public ajvs(azxs azxs0, String s, String s1, String s2, byte[] arr_b, String s3, azug azug0) {
        super(0xAC, "CreateRetrievalPacket", azug0);
        this.b = azxs0;
        this.d = SystemClock.elapsedRealtime();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.y;
        akbm0.d = s3;
        this.c = akbm0.a();
        this.e = s2;
        this.f = arr_b;
    }

    private final void b() {
        long v = SystemClock.elapsedRealtime() - this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghsq)hftv0).b |= 1;
        ((ghsq)hftv0).c = 0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp0.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v;
        ghsq ghsq1 = (ghsq)hftp0.N_build();
        akdz.b(this.c, ghsq1);
        this.b.a(Status.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        int v10;
        ProtoLiteBuilder hftp3;
        ajri ajri0;
        Iterator iterator0;
        ArrayList arrayList0;
        grdr grdr1;
        Class class0;
        byte[] arr_b;
        String s;
        akbl akbl0;
        ggtj ggtj0 = (ggtj)ajvs.a.h();
        akbo akbo0 = this.c;
        ggtj0.B("CreateRetrievalPacketOperation: %s", akbo0.e);
        akdz.a(akbo0);
        if(hpvs.c()) {
            try {
                akbl0 = new akbl(akbo0);
                s = this.e;
                arr_b = this.f;
                class0 = akbl.class;
                __monitor_enter(class0);
            }
            catch(akbi akbi0) {
                goto label_176;
            }
            try {
                akbl.a.h("Creating retrieval packet.", new Object[0]);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grdm.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grdl.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grdl grdl0 = (grdl)hftp1.b_message;
                s.getClass();
                grdl0.b |= 1;
                grdl0.c = s;
                grdl grdl1 = (grdl)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grdm grdm0 = (grdm)hftp0.b_message;
                grdl1.getClass();
                grdm0.c = grdl1;
                grdm0.b = 3;
                grdm grdm1 = (grdm)hftp0.N_build();
                try {
                    grds grds0 = akbl0.a().a(grdm1);
                    if(grds0.b == 3) {
                        grdr grdr0 = (grdr)grds0.c;
                    }
                    grdr1 = grds0.b == 3 ? ((grdr)grds0.c) : grdr.a;
                }
                catch(ajqz ajqz0) {
                    int v1 = ajqz0.b - 1;
                    if(ajqz0.b == 0) {
                        throw null;
                    }
                    if(v1 == 6) {
                        akbl0.g.c(akbl0.e.name, ajqz0);
                    }
                    throw new akbi(8, ajqz0);
                }
                arrayList0 = new ArrayList();
                iterator0 = grdr1.b.iterator();
                while(true) {
                label_42:
                    if(!iterator0.hasNext()) {
                        if(!arrayList0.isEmpty()) {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grfs.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            grfs grfs0 = (grfs)hftp2.b_message;
                            hfuo hfuo0 = grfs0.d;
                            if(!hfuo0.c()) {
                                grfs0.d = ProtoLiteMessage.E(hfuo0);
                            }
                            hfrj.E(arrayList0, grfs0.d);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            grfs grfs1 = (grfs)hftp2.b_message;
                            s.getClass();
                            grfs1.b |= 1;
                            grfs1.c = s;
                            grfs grfs2 = (grfs)hftp2.N_build();
                            try {
                                ajri0 = akbl0.a();
                                hftp3 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ((ghsx)hftp3.b_message).c = 15;
                                ((ghsx)hftp3.b_message).b |= 1;
                            }
                            catch(ajqz ajqz1) {
                                goto label_99;
                            }
                            try {
                                ProtoLiteBuilder hftp4 = ajri0.b.g;
                                ProtoLiteMessage hftv0 = hftp4.b_message;
                                int v3 = ((ghth)hftv0).s + 1;
                                if(!hftv0.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ghth ghth0 = (ghth)hftp4.b_message;
                                ghth0.b |= 0x100000;
                                ghth0.s = v3;
                                long v4 = hput.b();
                                Objects.requireNonNull(ajri0.a);
                                ajrd ajrd0 = new ajrd(ajri0.a);
                                ajrf ajrf0 = new ajrf(v4, grfs2);
                                grft grft0 = (grft)ajri0.a.b(ajrd0, ajrf0);
                                int v5 = iaph.a.r;
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ghsx ghsx0 = (ghsx)hftp3.b_message;
                                ghsx0.b |= 2;
                                ghsx0.d = v5;
                                goto label_105;
                            }
                            catch(ajqz ajqz2) {
                                try {
                                    int v6 = ajqz2.a;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ghsx ghsx1 = (ghsx)hftp3.b_message;
                                    ghsx1.b |= 2;
                                    ghsx1.d = v6;
                                    throw ajqz2;
                                }
                                catch(ajqz ajqz1) {
                                }
                            }
                            finally {
                                akdz.c(null, ((ghsx)hftp3.N_build()), ajri0.b.e);
                            }
                        label_99:
                            int v7 = ajqz1.b - 1;
                            if(ajqz1.b == 0) {
                                throw null;
                            }
                            if(v7 == 6 || v7 == 8) {
                                akbl0.g.c(akbl0.e.name, ajqz1);
                            }
                            throw new akbi(8, ajqz1);
                        }
                    label_105:
                        akbl.I(akbl0.d, 3);
                        break;
                    }
                    goto label_111;
                }
            }
            catch(akbi akbi1) {
                goto label_173;
            }
            finally {
                __monitor_exit(class0);
            }
            try {
            }
            catch(akbi akbi0) {
                goto label_176;
            }
            this.b();
            return;
            try {
            label_111:
                Object object0 = iterator0.next();
                grdq grdq0 = (grdq)object0;
                grem grem0 = grdq0.d == null ? grem.a : grdq0.d;
                String s1 = akbl.g(grem0.g);
                try {
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)ajxg.a).v_newBuilder();
                    ByteString hfsf0 = grem0.d;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp5.b_message;
                    hfsf0.getClass();
                    ((ajxg)hftv1).b = hfsf0;
                    long v8 = (long)grem0.h;
                    if(!hftv1.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((ajxg)hftp5.b_message).c = v8;
                    ajxg ajxg0 = (ajxg)hftp5.N_build();
                    akbl0.c.t(akbl0.e.name, s1, ajxg0);
                }
                catch(IOException | acse unused_ex) {
                }
                ajxe ajxe0 = (ajxe)gggq.p(akbl0.k(s1));
                if(ajxe0.c != grem0.h) {
                    goto label_42;
                }
                byte[] arr_b1 = akdy.i(arr_b, akdy.f(akdy.m(grem0.f.toByteArray(), ajxe0.d.toByteArray()), grdq0.b.toByteArray()));
                byte[] arr_b2 = akdy.l(arr_b);
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gren.a).v_newBuilder();
                String s2 = "users/me/retrievalpackets/" + bbmu.c(grdq0.c.toByteArray());
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                gren gren0 = (gren)hftp6.b_message;
                gren0.b |= 1;
                gren0.c = s2;
                ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp6.b_message;
                ((gren)hftv2).b |= 2;
                ((gren)hftv2).d = hfsf1;
                ByteString hfsf2 = grdq0.c;
                if(!hftv2.isImmutable()) {
                    hftp6.ensureMutable();
                }
                gren gren1 = (gren)hftp6.b_message;
                hfsf2.getClass();
                gren1.b |= 4;
                gren1.e = hfsf2;
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)grdv.a).v_newBuilder();
                ByteString hfsf3 = ByteString.copyFrom(arr_b2);
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp7.b_message;
                ((grdv)hftv3).b |= 1;
                ((grdv)hftv3).c = hfsf3;
                if(!hftv3.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ((grdv)hftp7.b_message).d = 1;
                ((grdv)hftp7.b_message).b |= 2;
                grdv grdv0 = (grdv)hftp7.N_build();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                gren gren2 = (gren)hftp6.b_message;
                grdv0.getClass();
                gren2.f = grdv0;
                gren2.b |= 8;
                arrayList0.add(((gren)hftp6.N_build()));
                goto label_42;
            }
            catch(akbi akbi1) {
                try {
                label_173:
                    akbl.I(akbl0.d, akbi1.a);
                    throw akbi1;
                }
                catch(akbi akbi0) {
                }
            }
        label_176:
            int v9 = akbi0.a - 1;
            if(akbi0.a == 0) {
                throw null;
            }
            switch(v9) {
                case 7: {
                    v10 = 7;
                    break;
                }
                case 13: {
                    v10 = 38500;
                    break;
                }
                default: {
                    v10 = 8;
                }
            }
            Status status0 = new Status(v10, "Can\'t create member.");
            long v11 = SystemClock.elapsedRealtime() - this.d;
            akbo akbo1 = this.c;
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v12 = status0.i;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp8.b_message;
            ((ghsq)hftv4).b |= 1;
            ((ghsq)hftv4).c = v12;
            if(!hftv4.isImmutable()) {
                hftp8.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp8.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v11;
            akdz.b(akbo1, ((ghsq)hftp8.N_build()));
            this.b.a(status0);
            return;
        }
        this.b();
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

