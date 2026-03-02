import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.Arrays;
import java.util.List;

public final class acqh {
    private final boolean a;
    private final boolean b;

    public acqh() {
        this.a = hovv.a.c().c();
        this.b = hovv.a.c().b();
    }

    public final void a(boolean z, boolean z1, boolean z2, grnz grnz0) {
        if(this.a) {
            grog grog0 = grnz0.e == null ? grog.a : grnz0.e;
            grob grob0 = grog0.b == 1 ? ((grob)grog0.c) : grob.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acra.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acrj.a).v_newBuilder();
            int v = grnz0.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((acrj)hftv0).b |= 0x20;
            ((acrj)hftv0).h = v;
            String s = grob0.g;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s.getClass();
            ((acrj)hftv1).b |= 8;
            ((acrj)hftv1).f = s;
            int v1 = grob0.f;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((acrj)hftv2).b |= 16;
            ((acrj)hftv2).g = v1;
            int v2 = 3;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            ((acrj)hftv3).c = (z ? 2 : 3) - 1;
            ((acrj)hftv3).b |= 1;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((acrj)hftv4).d = (z1 ? 3 : 2) - 1;
            ((acrj)hftv4).b |= 2;
            if(!z2) {
                v2 = 2;
            }
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((acrj)hftp1.b_message).e = v2 - 1;
            ((acrj)hftp1.b_message).b |= 4;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            acra acra0 = (acra)hftp0.b_message;
            acrj acrj0 = (acrj)hftp1.N_build();
            acrj0.getClass();
            acra0.e = acrj0;
            acra0.b |= 4;
            acqh.e(((acra)hftp0.N_build()));
        }
    }

    public final void b(int v) {
        if(!this.b) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acra.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acrc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((acrc)hftp1.b_message).c = v - 1;
        ((acrc)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acra acra0 = (acra)hftp0.b_message;
        acrc acrc0 = (acrc)hftp1.N_build();
        acrc0.getClass();
        acra0.f = acrc0;
        acra0.b |= 8;
        acqh.e(((acra)hftp0.N_build()));
    }

    public static final void c(acqr acqr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acra.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acre.a).v_newBuilder();
        List list0 = Arrays.asList(acqr0.f());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        acre acre0 = (acre)hftp1.b_message;
        hfuo hfuo0 = acre0.b;
        if(!hfuo0.c()) {
            acre0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, acre0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acra acra0 = (acra)hftp0.b_message;
        acre acre1 = (acre)hftp1.N_build();
        acre1.getClass();
        acra0.c = acre1;
        acra0.b |= 1;
        acqh.e(((acra)hftp0.N_build()));
    }

    public static final void d(LogAuditRecordsRequest logAuditRecordsRequest0, grob grob0, long v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acrf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((acrf)hftv0).b |= 1;
        ((acrf)hftv0).c = logAuditRecordsRequest0.d.length;
        int v2 = logAuditRecordsRequest0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((acrf)hftv1).b |= 2;
        ((acrf)hftv1).d = v2;
        String s = grob0.g;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s.getClass();
        ((acrf)hftv2).b |= 4;
        ((acrf)hftv2).e = s;
        int v3 = grob0.f;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((acrf)hftv3).b |= 8;
        ((acrf)hftv3).f = v3;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((acrf)hftv4).b |= 16;
        ((acrf)hftv4).g = v;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        acrf acrf0 = (acrf)hftp0.b_message;
        acrf0.b |= 0x20;
        acrf0.h = v1;
        acrf acrf1 = (acrf)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acra.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        acra acra0 = (acra)hftp1.b_message;
        acrf1.getClass();
        acra0.d = acrf1;
        acra0.b |= 2;
        acqh.e(((acra)hftp1.N_build()));
    }

    private static final void e(acra acra0) {
        cdtk.v().j(((ProtoLiteMessage)acra0));
    }
}

