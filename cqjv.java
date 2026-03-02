import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

public class cqjv extends IntentOperation {
    public static Intent a(Context context0, boolean z, hlud hlud0) {
        boolean z1 = cqqa.k(context0);
        boolean z2 = cqqg.a(context0);
        return cqjv.b(context0, z, hlud0, hlud.a, z1, z2);
    }

    public static Intent b(Context context0, boolean z, hlud hlud0, hlud hlud1, boolean z1, boolean z2) {
        boolean z3;
        int v = (int)(((Integer)cqix.d.c()));
        String s = (String)cqix.e.c();
        Boolean boolean0 = (Boolean)cqix.f.c();
        Boolean boolean1 = (Boolean)cqix.g.c();
        String s1 = bsoa.a(context0);
        int v1 = (int)(((Integer)cqix.m.c()));
        bbib bbib0 = new bbib(context0);
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
        long v2 = bbmq.d(context0);
        if(v1 >= 200) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
            hgzp hgzp0 = hgzp.aG;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hgzq)hftv0).c = hgzp0.fh;
            ((hgzq)hftv0).b |= 2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgzq)hftp0.b_message).e = 4;
            ((hgzq)hftp0.b_message).b |= 8;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgzs.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgzs)hftp1.b_message).e = 1;
            ((hgzs)hftp1.b_message).b |= 1;
            String s2 = Long.toString(v2);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgzs hgzs0 = (hgzs)hftp1.b_message;
            s2.getClass();
            hgzs0.c = 2;
            hgzs0.d = s2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgzq hgzq0 = (hgzq)hftp0.b_message;
            hgzs hgzs1 = (hgzs)hftp1.N_build();
            hgzs1.getClass();
            hgzq0.g = hgzs1;
            hgzq0.b |= 0x20;
            cqqn.e(hftp0);
            cqqt.a("Exceeded maximum sitrep attempts; not trying again.", new Object[0]);
            cqjm.b(context0, bbib0);
            return null;
        }
        if(bbmn.h(context0, "com.google.android.gms").isEmpty()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
            hgzp hgzp1 = hgzp.aG;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((hgzq)hftv1).c = hgzp1.fh;
            ((hgzq)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hgzq)hftp2.b_message).e = 5;
            ((hgzq)hftp2.b_message).b |= 8;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgzs.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hgzs)hftp3.b_message).e = 1;
            ((hgzs)hftp3.b_message).b |= 1;
            String s3 = Long.toString(v2);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hgzs hgzs2 = (hgzs)hftp3.b_message;
            s3.getClass();
            hgzs2.c = 2;
            hgzs2.d = s3;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hgzq hgzq1 = (hgzq)hftp2.b_message;
            hgzs hgzs3 = (hgzs)hftp3.N_build();
            hgzs3.getClass();
            hgzq1.g = hgzs3;
            hgzq1.b |= 0x20;
            cqqn.e(hftp2);
            cqqt.a("No Google accounts; deferring server state update.", new Object[0]);
            return null;
        }
        if(intent0 == null) {
            intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
        }
        if(intent0 == null) {
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
            hgzp hgzp2 = hgzp.aG;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp4.b_message;
            ((hgzq)hftv2).c = hgzp2.fh;
            ((hgzq)hftv2).b |= 2;
            if(!hftv2.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hgzq)hftp4.b_message).e = 6;
            ((hgzq)hftp4.b_message).b |= 8;
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hgzs.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ((hgzs)hftp5.b_message).e = 1;
            ((hgzs)hftp5.b_message).b |= 1;
            String s4 = Long.toString(v2);
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hgzs hgzs4 = (hgzs)hftp5.b_message;
            s4.getClass();
            hgzs4.c = 2;
            hgzs4.d = s4;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hgzq hgzq2 = (hgzq)hftp4.b_message;
            hgzs hgzs5 = (hgzs)hftp5.N_build();
            hgzs5.getClass();
            hgzq2.g = hgzs5;
            hgzq2.b |= 0x20;
            cqqn.e(hftp4);
            return null;
        }
        intent0.putExtra("reason", hlud0.p);
        intent0.putExtra("retry_reason", hlud1.p);
        int v3 = bbms.a(context0);
        intent0.putExtra("gms_core_version", v3);
        if(!hlud0.equals(hlud.o)) {
            z3 = z || v3 != v ? true : z;
        }
        else if(!z) {
            z3 = z;
        }
        else {
            z3 = true;
        }
        if(z || !TextUtils.equals(s, s1)) {
            intent0.putExtra("gcm_registration_id", s1);
            z3 = true;
        }
        if(z || boolean0 == null || boolean0.booleanValue() != z1) {
            intent0.putExtra("is_device_admin", z1);
            z3 = true;
        }
        if(!z && boolean1 != null && boolean1.booleanValue() == z2) {
            if(z3) {
                return intent0;
            }
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
            hgzp hgzp3 = hgzp.aH;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((hgzq)hftp6.b_message).c = hgzp3.fh;
            ((hgzq)hftp6.b_message).b |= 2;
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hgzs.a).v_newBuilder();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ((hgzs)hftp7.b_message).e = 1;
            ((hgzs)hftp7.b_message).b |= 1;
            String s5 = Long.toString(v2);
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            hgzs hgzs6 = (hgzs)hftp7.b_message;
            s5.getClass();
            hgzs6.c = 2;
            hgzs6.d = s5;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hgzq hgzq3 = (hgzq)hftp6.b_message;
            hgzs hgzs7 = (hgzs)hftp7.N_build();
            hgzs7.getClass();
            hgzq3.g = hgzs7;
            hgzq3.b |= 0x20;
            cqqn.e(hftp6);
            return null;
        }
        intent0.putExtra("lockscreen_enabled", z2);
        return intent0;
    }

    public static void c() {
        cqix.m.e();
        cqix.d.e();
        cqix.e.e();
        cqix.f.e();
        cqix.g.e();
    }
}

