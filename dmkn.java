import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

public final class dmkn {
    private final Context a;
    private final dmkl b;

    public dmkn(Context context0, dmkl dmkl0) {
        this.a = context0;
        this.b = dmkl0;
    }

    public final hjqi a(hjqb hjqb0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjqi.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjqc.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hjpz.a).v_newBuilder();
        Context context0 = this.a;
        long v = bbmq.d(context0);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hjpz)hftp2.b_message).c = v;
        int v1 = Build.VERSION.SDK_INT;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hjpz)hftp2.b_message).d = v1;
        dmkl dmkl0 = this.b;
        int v2 = dmkl0.m() ? 3 : 4;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hjpz hjpz0 = (hjpz)hftp2.b_message;
        hjpz0.e = hjxb.a(v2);
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hjqe.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((hjqe)hftv0).b = 0xF1B18AD;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hjqe)hftp3.b_message).c = true;
        hjqe hjqe0 = (hjqe)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hjpz hjpz1 = (hjpz)hftp2.b_message;
        hjqe0.getClass();
        hjpz1.g = hjqe0;
        hjpz1.b |= 2;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hjql.a).v_newBuilder();
        hjxa hjxa0 = dmkl0.a();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hjql hjql0 = (hjql)hftp4.b_message;
        hjql0.b = hjxa0.a();
        hjql hjql1 = (hjql)hftp4.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hjpz hjpz2 = (hjpz)hftp2.b_message;
        hjql1.getClass();
        hjpz2.f = hjql1;
        hjpz2.b |= 1;
        hjpz hjpz3 = (hjpz)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjqc hjqc0 = (hjqc)hftp1.b_message;
        hjpz3.getClass();
        hjqc0.c = hjpz3;
        hjqc0.b = 1;
        String s = dmkl0.c();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjqc hjqc1 = (hjqc)hftp1.b_message;
        s.getClass();
        hjqc1.d = s;
        hjqc hjqc2 = (hjqc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi0 = (hjqi)hftp0.b_message;
        hjqc2.getClass();
        hjqi0.f = hjqc2;
        hjqi0.b |= 0x20;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hjqf.a).v_newBuilder();
        try {
            int v3 = bbms.b(context0, "com.google.android.apps.walletnfcrel");
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ((hjqf)hftp5.b_message).c = v3;
            z8 = true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            z8 = false;
        }
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((hjqf)hftp5.b_message).b = z8;
        hjqf hjqf0 = (hjqf)hftp5.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi1 = (hjqi)hftp0.b_message;
        hjqf0.getClass();
        hjqi1.c = hjqf0;
        hjqi1.b |= 2;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hjqg.a).v_newBuilder();
        try {
            int v4 = bbms.b(this.a, "com.google.android.apps.nbu.paisa");
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp6.b_message;
            ((hjqg)hftv1).c = v4;
            if(!hftv1.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((hjqg)hftp6.b_message).b = true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((hjqg)hftp6.b_message).b = false;
        }
        hjqg hjqg0 = (hjqg)hftp6.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        hjqg0.getClass();
        ((hjqi)hftv2).e = hjqg0;
        ((hjqi)hftv2).b |= 16;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi2 = (hjqi)hftp0.b_message;
        hjqb0.getClass();
        hjqi2.d = hjqb0;
        hjqi2.b |= 4;
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hjqm.a).v_newBuilder();
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp7.b_message;
        ((hjqm)hftv3).c = z1;
        if(!hftv3.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp7.b_message;
        ((hjqm)hftv4).b = z;
        if(!hftv4.isImmutable()) {
            hftp7.ensureMutable();
        }
        ((hjqm)hftp7.b_message).d = z2;
        hjqm hjqm0 = (hjqm)hftp7.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi3 = (hjqi)hftp0.b_message;
        hjqm0.getClass();
        hjqi3.g = hjqm0;
        hjqi3.b |= 0x40;
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hjqj.a).v_newBuilder();
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        ((hjqj)hftp8.b_message).b = z3;
        hjqj hjqj0 = (hjqj)hftp8.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi4 = (hjqi)hftp0.b_message;
        hjqj0.getClass();
        hjqi4.h = hjqj0;
        hjqi4.b |= 0x100;
        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hjqd.a).v_newBuilder();
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp9.b_message;
        ((hjqd)hftv5).b = z5;
        if(!hftv5.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp9.b_message;
        ((hjqd)hftv6).c = z4;
        if(!hftv6.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp9.b_message;
        ((hjqd)hftv7).d = z5;
        if(!hftv7.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp9.b_message;
        ((hjqd)hftv8).e = z6;
        if(!hftv8.isImmutable()) {
            hftp9.ensureMutable();
        }
        ((hjqd)hftp9.b_message).f = z7;
        hjqd hjqd0 = (hjqd)hftp9.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjqi hjqi5 = (hjqi)hftp0.b_message;
        hjqd0.getClass();
        hjqi5.i = hjqd0;
        hjqi5.b |= 0x200;
        return (hjqi)hftp0.N_build();
    }
}

