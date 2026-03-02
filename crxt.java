import android.content.SharedPreferences.Editor;

public final class crxt implements Runnable {
    public final crxu a;
    public final String b;
    public final String c;
    public final String d;

    public crxt(crxu crxu0, String s, String s1, String s2) {
        this.a = crxu0;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public final void run() {
        int v2;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hauw.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hauq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.b.getClass();
        ((hauq)hftv0).c = this.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        this.c.getClass();
        ((hauq)hftv1).d = this.c;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        this.d.getClass();
        ((hauq)hftv2).h = this.d;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        hauq hauq0 = (hauq)hftp1.b_message;
        hauq0.i = hava.a(4);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crxu crxu0 = this.a;
        hauw hauw0 = (hauw)hftp0.b_message;
        hauq hauq1 = (hauq)hftp1.N_build();
        hauq1.getClass();
        hauw0.e = hauq1;
        hauw0.b |= 4;
        hauw hauw1 = (hauw)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)haut.a).v_newBuilder();
        synchronized(crxu0.e.b) {
            int v1 = -1;
            v2 = crxu0.e.c.getInt("local_notification_id", -1);
            SharedPreferences.Editor sharedPreferences$Editor0 = crxu0.e.c.edit();
            if(v2 >= 0) {
                v2 = -1;
            }
            if(v2 != 0x80000000) {
                v1 = v2 - 1;
            }
            sharedPreferences$Editor0.putInt("local_notification_id", v1);
            sharedPreferences$Editor0.commit();
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((haut)hftv3).d = (long)v2;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        hauw1.getClass();
        ((haut)hftv4).c = hauw1;
        ((haut)hftv4).b = 2;
        gsoj gsoj0 = gsoj.h;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        haut haut0 = (haut)hftp2.b_message;
        haut0.e = gsoj0.a();
        crxu0.p(((haut)hftp2.N_build()));
    }
}

