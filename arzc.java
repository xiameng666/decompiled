import android.accounts.Account;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.io.IOException;

public final class arzc {
    public static final aqql a;
    public final aryj b;
    public final aryg c;
    public final aryi d;
    private final aryz e;
    private final aryy f;

    static {
        arzc.a = new aqql(new String[]{"UiPayloadProcessor"});
    }

    public arzc(aryj aryj0, aryz aryz0, aryy aryy0, aryg aryg0, aryi aryi0) {
        this.b = aryj0;
        this.e = aryz0;
        this.f = aryy0;
        this.c = aryg0;
        this.d = aryi0;
    }

    public final void a(aryq aryq0) {
        for(Object object0: aryq0.f) {
            this.e.a(((aryt)object0));
        }
    }

    public final boolean b(aryq aryq0) {
        for(Object object0: aryq0.f) {
            int v = aryv.a(((aryt)object0).c);
            if(v == 0) {
                v = 1;
            }
            if(v - 1 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(aryq aryq0) {
        int v1;
        ProtoLiteBuilder hftp9;
        ProtoLiteBuilder hftp3;
        arzc arzc0;
        hejj hejj0;
        String s = aryq0.h;
        if(gfta.c(s)) {
            arzc0 = this;
            hejj0 = null;
        }
        else {
            try {
                byte[] arr_b = Base64.decode(s, 1);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hejj.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hejj0 = (hejj)hftv0;
                arzc0 = this;
            }
            catch(hfur hfur0) {
                aryy.a.g("Error parsing Chime payload", hfur0, new Object[0]);
                arzc0 = this;
                hejj0 = null;
            }
        }
        aryy aryy0 = arzc0.f;
        if(hejj0 == null) {
            aryy.a.f("Could not create AndroidPayload", new Object[0]);
            aryg aryg0 = aryy0.d;
            String s1 = aryq0.j;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigl.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gigl)hftv1).b |= 1;
            ((gigl)hftv1).c = true;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gigl)hftv2).b |= 4;
            ((gigl)hftv2).e = false;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gigl gigl0 = (gigl)hftp0.b_message;
            s1.getClass();
            gigl0.b |= 8;
            gigl0.f = s1;
            gigl gigl1 = (gigl)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gigl1.getClass();
            ghys0.U = gigl1;
            ghys0.c |= 0x1000000;
            aryg0.a(((ghys)hftp1.N_build()), ghyr.ad);
            return false;
        }
        hejt hejt0 = hejj0.d == null ? hejt.a : hejj0.d;
        hejp hejp0 = hejt0.c == 12 ? ((hejp)hejt0.d) : hejp.a;
        aryr aryr0 = aryq0.i == null ? aryr.a : aryq0.i;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gdkl.a).v_newBuilder();
        if(hejj0.c.isEmpty() && hqiq.a.c().l()) {
            Context context0 = aryy0.b;
            gfsx gfsx0 = aryh.a(aryq0.c, context0.getApplicationContext());
            if(gfsx0.i()) {
                try {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gdkp.a).v_newBuilder();
                    String s2 = acso.e(context0, ((Account)gfsx0.d()).name);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gdkp gdkp0 = (gdkp)hftp4.b_message;
                    s2.getClass();
                    gdkp0.b |= 1;
                    gdkp0.c = s2;
                    hftp3 = hftp4;
                }
                catch(acse | IOException exception0) {
                    aryy.a.g("Error getting obfuscated ID", exception0, new Object[0]);
                    hftp3 = ((ProtoLiteMessage)gdkp.a).v_newBuilder();
                }
            }
            else {
                hftp3 = ((ProtoLiteMessage)gdkp.a).v_newBuilder();
            }
        }
        else {
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gdkp.a).v_newBuilder();
            String s3 = hejj0.c;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gdkp gdkp1 = (gdkp)hftp5.b_message;
            s3.getClass();
            gdkp1.b |= 1;
            gdkp1.c = s3;
            hftp3 = hftp5;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl0 = (gdkl)hftp2.b_message;
        gdkp gdkp2 = (gdkp)hftp3.N_build();
        gdkp2.getClass();
        gdkl0.c = gdkp2;
        gdkl0.b |= 1;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gdkt.a).v_newBuilder();
        String s4 = hejp0.e;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp6.b_message;
        s4.getClass();
        ((gdkt)hftv3).b |= 4;
        ((gdkt)hftv3).e = s4;
        String s5 = hejp0.f;
        if(!hftv3.isImmutable()) {
            hftp6.ensureMutable();
        }
        gdkt gdkt0 = (gdkt)hftp6.b_message;
        s5.getClass();
        gdkt0.b |= 8;
        gdkt0.f = s5;
        String s6 = hvsk.c();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp6.b_message;
        ((gdkt)hftv4).b |= 0x100;
        ((gdkt)hftv4).k = s6;
        if(!hftv4.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp6.b_message;
        ((gdkt)hftv5).b |= 0x2000;
        ((gdkt)hftv5).p = false;
        if(!hftv5.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp6.b_message;
        ((gdkt)hftv6).b |= 0x8000;
        ((gdkt)hftv6).r = false;
        if((hejp0.b & 0x80) != 0) {
            int v = hejl.a(hejp0.h) == 0 ? 1 : hejl.a(hejp0.h);
            if(!hftv6.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt1 = (gdkt)hftp6.b_message;
            gdkt1.b |= 1;
            gdkt1.c = v - 1;
        }
        if(hejp0.g.size() > 0) {
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gdkg.a).v_newBuilder();
            String s7 = ((hejv)hejp0.g.get(0)).b;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            gdkg gdkg0 = (gdkg)hftp7.b_message;
            s7.getClass();
            gdkg0.b |= 1;
            gdkg0.c = s7;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt2 = (gdkt)hftp6.b_message;
            gdkg gdkg1 = (gdkg)hftp7.N_build();
            gdkg1.getClass();
            gdkt2.d = gdkg1;
            gdkt2.b |= 2;
        }
        if(((hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).b & 1) != 0 && (hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).c.length() > 0) {
            String s8 = (hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).c;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt3 = (gdkt)hftp6.b_message;
            s8.getClass();
            gdkt3.b |= 0x20;
            gdkt3.h = s8;
        }
        else {
            String s9 = hejp0.e;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt4 = (gdkt)hftp6.b_message;
            s9.getClass();
            gdkt4.b |= 0x20;
            gdkt4.h = s9;
        }
        if(((hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).b & 2) != 0 && (hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).d.length() > 0) {
            String s10 = (hejp0.c == 7 ? ((hejn)hejp0.d) : hejn.a).d;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt5 = (gdkt)hftp6.b_message;
            s10.getClass();
            gdkt5.b |= 16;
            gdkt5.g = s10;
        }
        else {
            String s11 = hejp0.f;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt6 = (gdkt)hftp6.b_message;
            s11.getClass();
            gdkt6.b |= 16;
            gdkt6.g = s11;
        }
        if((hejp0.b & 0x400) != 0 && (aryr0.b & 1) != 0) {
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gdke.a).v_newBuilder();
            String s12 = (hejp0.i == null ? hejm.a : hejp0.i).b;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp8.b_message;
            s12.getClass();
            ((gdke)hftv7).b |= 1;
            ((gdke)hftv7).c = s12;
            String s13 = aryr0.c;
            if(!hftv7.isImmutable()) {
                hftp8.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp8.b_message;
            s13.getClass();
            ((gdke)hftv8).b |= 2;
            ((gdke)hftv8).d = s13;
            if(!hftv8.isImmutable()) {
                hftp8.ensureMutable();
            }
            gdke gdke0 = (gdke)hftp8.b_message;
            gdke0.b |= 8;
            gdke0.f = "com.google.android.gms.backup.g1.notification.group.id";
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp8.b_message;
            "Back up and restore".getClass();
            ((gdke)hftv9).b |= 16;
            ((gdke)hftv9).g = "Back up and restore";
            if(!hftv9.isImmutable()) {
                hftp8.ensureMutable();
            }
            ((gdke)hftp8.b_message).h = 2;
            ((gdke)hftp8.b_message).b |= 0x20;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gdkt gdkt7 = (gdkt)hftp6.b_message;
            gdke gdke1 = (gdke)hftp8.N_build();
            gdke1.getClass();
            gdkt7.u = gdke1;
            gdkt7.b |= 0x20000;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl1 = (gdkl)hftp2.b_message;
        gdkt gdkt8 = (gdkt)hftp6.N_build();
        gdkt8.getClass();
        gdkl1.f = gdkt8;
        gdkl1.b |= 8;
        String s14 = aryr0.d;
        Context context1 = aryy0.b;
        if(s14 == null) {
            hftp9 = ((ProtoLiteMessage)gdku.a).v_newBuilder();
        }
        else {
            switch(s14) {
                case "open_backup_settings": {
                    hftp9 = ((ProtoLiteMessage)gdku.a).v_newBuilder();
                    ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)gdkj.a).v_newBuilder();
                    Intent intent1 = aqzc.g();
                    fpxr.c(intent1, giah.c);
                    ProtoLiteBuilder hftp14 = aryk.a(intent1);
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    gdkj gdkj2 = (gdkj)hftp13.b_message;
                    gdki gdki1 = (gdki)hftp14.N_build();
                    gdki1.getClass();
                    gdkj2.c = gdki1;
                    gdkj2.b |= 8;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gdku gdku1 = (gdku)hftp9.b_message;
                    gdkj gdkj3 = (gdkj)hftp13.N_build();
                    gdkj3.getClass();
                    gdku1.d = gdkj3;
                    gdku1.b |= 2;
                    break;
                }
                case "open_opt_in_screen": {
                    Intent intent0 = aqzc.c();
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gdku.a).v_newBuilder();
                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gdkj.a).v_newBuilder();
                    ProtoLiteBuilder hftp12 = aryk.a(intent0);
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gdkj gdkj0 = (gdkj)hftp11.b_message;
                    gdki gdki0 = (gdki)hftp12.N_build();
                    gdki0.getClass();
                    gdkj0.c = gdki0;
                    gdkj0.b |= 8;
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    gdku gdku0 = (gdku)hftp10.b_message;
                    gdkj gdkj1 = (gdkj)hftp11.N_build();
                    gdkj1.getClass();
                    gdku0.d = gdkj1;
                    gdku0.b |= 2;
                    hftp9 = hftp10;
                    break;
                }
                default: {
                    hftp9 = ((ProtoLiteMessage)gdku.a).v_newBuilder();
                }
            }
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl2 = (gdkl)hftp2.b_message;
        gdku gdku2 = (gdku)hftp9.N_build();
        gdku2.getClass();
        gdkl2.g = gdku2;
        gdkl2.b |= 16;
        ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)gdkr.a).v_newBuilder();
        String s15 = context1.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        if(!hftp15.b_message.isImmutable()) {
            hftp15.ensureMutable();
        }
        gdkr gdkr0 = (gdkr)hftp15.b_message;
        s15.getClass();
        gdkr0.b |= 2;
        gdkr0.d = s15;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl3 = (gdkl)hftp2.b_message;
        gdkr gdkr1 = (gdkr)hftp15.N_build();
        gdkr1.getClass();
        gdkl3.h = gdkr1;
        gdkl3.b |= 0x20;
        hfuf hfuf0 = hejt0.m;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl4 = (gdkl)hftp2.b_message;
        hfuf hfuf1 = gdkl4.m;
        if(!hfuf1.c()) {
            gdkl4.m = ProtoLiteMessage.C(hfuf1);
        }
        hfrj.E(hfuf0, gdkl4.m);
        if(hqje.a.m().ao()) {
            aryg aryg1 = aryy0.d;
            bayn bayn0 = aryy0.e;
            boolean z = bayn0.z();
            if((hejp0.b & 0x400) == 0) {
                v1 = 0;
            }
            else {
                NotificationChannel notificationChannel0 = bayn0.c((hejp0.i == null ? hejm.a : hejp0.i).b);
                v1 = notificationChannel0 != null && notificationChannel0.getImportance() > 0 ? 1 : 0;
            }
            ProtoLiteBuilder hftp16 = ((ProtoLiteMessage)giem.a).v_newBuilder();
            if(!hftp16.b_message.isImmutable()) {
                hftp16.ensureMutable();
            }
            ProtoLiteMessage hftv10 = hftp16.b_message;
            ((giem)hftv10).c = (z ? 2 : 3) - 1;
            ((giem)hftv10).b |= 1;
            if(!hftv10.isImmutable()) {
                hftp16.ensureMutable();
            }
            ((giem)hftp16.b_message).d = (1 == v1 ? 2 : 3) - 1;
            ((giem)hftp16.b_message).b |= 2;
            giem giem0 = (giem)hftp16.N_build();
            ProtoLiteBuilder hftp17 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp17.b_message.isImmutable()) {
                hftp17.ensureMutable();
            }
            ghys ghys1 = (ghys)hftp17.b_message;
            giem0.getClass();
            ghys1.ab = giem0;
            ghys1.c |= 0x80000000;
            aryg1.a(((ghys)hftp17.N_build()), ghyr.ah);
        }
        ProtoLiteBuilder hftp18 = ((ProtoLiteMessage)gdkh.a).v_newBuilder();
        String s16 = hejt0.e;
        if(!hftp18.b_message.isImmutable()) {
            hftp18.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp18.b_message;
        s16.getClass();
        ((gdkh)hftv11).b |= 1;
        ((gdkh)hftv11).c = s16;
        String s17 = hejt0.f;
        if(!hftv11.isImmutable()) {
            hftp18.ensureMutable();
        }
        ProtoLiteMessage hftv12 = hftp18.b_message;
        s17.getClass();
        ((gdkh)hftv12).b |= 2;
        ((gdkh)hftv12).d = s17;
        long v2 = hejt0.h;
        if(!hftv12.isImmutable()) {
            hftp18.ensureMutable();
        }
        ProtoLiteMessage hftv13 = hftp18.b_message;
        ((gdkh)hftv13).b |= 0x20;
        ((gdkh)hftv13).h = v2;
        ByteString hfsf0 = hejt0.l;
        if(!hftv13.isImmutable()) {
            hftp18.ensureMutable();
        }
        gdkh gdkh0 = (gdkh)hftp18.b_message;
        hfsf0.getClass();
        gdkh0.b |= 0x40;
        gdkh0.i = hfsf0;
        if(hqiq.a.c().m()) {
            String s18 = bsoa.a(context1);
            if(!hftp18.b_message.isImmutable()) {
                hftp18.ensureMutable();
            }
            gdkh gdkh1 = (gdkh)hftp18.b_message;
            gdkh1.b |= 16;
            gdkh1.g = "CHIME_GMSCORE_KEY::REG_ID::" + s18;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gdkl gdkl5 = (gdkl)hftp2.b_message;
        gdkh gdkh2 = (gdkh)hftp18.N_build();
        gdkh2.getClass();
        gdkl5.d = gdkh2;
        gdkl5.b |= 2;
        if(hejt0.j.size() > 0) {
            long v3 = ((hejs)hejt0.j.get(0)).b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gdkl gdkl6 = (gdkl)hftp2.b_message;
            gdkl6.b |= 0x40;
            gdkl6.i = v3;
        }
        if(hqje.B()) {
            ProtoLiteBuilder hftp19 = ((ProtoLiteMessage)gdkf.a).v_newBuilder();
            String s19 = ghjc.e.g().o(aryq0.toBytesArray());
            ProtoLiteBuilder hftp20 = ((ProtoLiteMessage)gdkk.a).v_newBuilder();
            if(!hftp20.b_message.isImmutable()) {
                hftp20.ensureMutable();
            }
            ProtoLiteMessage hftv14 = hftp20.b_message;
            ((gdkk)hftv14).b |= 1;
            ((gdkk)hftv14).c = "EXTRA_NOTIFICATION_RECEIVED_PAYLOAD";
            if(!hftv14.isImmutable()) {
                hftp20.ensureMutable();
            }
            gdkk gdkk0 = (gdkk)hftp20.b_message;
            gdkk0.b |= 2;
            gdkk0.d = s19;
            gdkk gdkk1 = (gdkk)hftp20.N_build();
            ProtoLiteBuilder hftp21 = ((ProtoLiteMessage)gdki.a).v_newBuilder();
            if(!hftp21.b_message.isImmutable()) {
                hftp21.ensureMutable();
            }
            ((gdki)hftp21.b_message).e = 3;
            ((gdki)hftp21.b_message).b |= 4;
            if(!hftp21.b_message.isImmutable()) {
                hftp21.ensureMutable();
            }
            gdki gdki2 = (gdki)hftp21.b_message;
            gdki2.b |= 1;
            gdki2.c = "com.google.android.gms.backup.g1.notifications.GcmBroadcastReceiver";
            if(!hftp21.b_message.isImmutable()) {
                hftp21.ensureMutable();
            }
            gdki gdki3 = (gdki)hftp21.b_message;
            gdkk1.getClass();
            gdki3.b();
            gdki3.f.add(gdkk1);
            if(!hftp21.b_message.isImmutable()) {
                hftp21.ensureMutable();
            }
            gdki gdki4 = (gdki)hftp21.b_message;
            gdki4.b |= 2;
            gdki4.d = "com.google.android.gms.backup.ACTION_NOTIFICATION_ADDED_TO_TRAY";
            gdki gdki5 = (gdki)hftp21.N_build();
            if(!hftp19.b_message.isImmutable()) {
                hftp19.ensureMutable();
            }
            gdkf gdkf0 = (gdkf)hftp19.b_message;
            gdki5.getClass();
            gdkf0.d = gdki5;
            gdkf0.b |= 2;
            gdkf gdkf1 = (gdkf)hftp19.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gdkl gdkl7 = (gdkl)hftp2.b_message;
            gdkf1.getClass();
            gdkl7.j = gdkf1;
            gdkl7.b |= 0x80;
        }
        gdkl gdkl8 = (gdkl)hftp2.N_build();
        aryg aryg2 = aryy0.d;
        long v4 = (long)aryq0.f.size();
        String s20 = aryq0.j;
        ProtoLiteBuilder hftp22 = ((ProtoLiteMessage)gigl.a).v_newBuilder();
        if(!hftp22.b_message.isImmutable()) {
            hftp22.ensureMutable();
        }
        ProtoLiteMessage hftv15 = hftp22.b_message;
        ((gigl)hftv15).b |= 1;
        ((gigl)hftv15).c = true;
        if(!hftv15.isImmutable()) {
            hftp22.ensureMutable();
        }
        ProtoLiteMessage hftv16 = hftp22.b_message;
        ((gigl)hftv16).b |= 2;
        ((gigl)hftv16).d = v4;
        if(!hftv16.isImmutable()) {
            hftp22.ensureMutable();
        }
        ProtoLiteMessage hftv17 = hftp22.b_message;
        ((gigl)hftv17).b |= 4;
        ((gigl)hftv17).e = true;
        if(!hftv17.isImmutable()) {
            hftp22.ensureMutable();
        }
        gigl gigl2 = (gigl)hftp22.b_message;
        s20.getClass();
        gigl2.b |= 8;
        gigl2.f = s20;
        gigl gigl3 = (gigl)hftp22.N_build();
        ProtoLiteBuilder hftp23 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp23.b_message.isImmutable()) {
            hftp23.ensureMutable();
        }
        ghys ghys2 = (ghys)hftp23.b_message;
        gigl3.getClass();
        ghys2.U = gigl3;
        ghys2.c |= 0x1000000;
        aryg2.a(((ghys)hftp23.N_build()), ghyr.ad);
        String s21 = ghjc.e.g().o(gdkl8.toBytesArray());
        aryy0.c.putExtra("gms.gnots.payload", s21);
        Context context2 = context1.getApplicationContext();
        aryy0.c.setClassName(context2, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        aryy.a.h("Sending broadcast to notifications module", new Object[0]);
        context1.sendOrderedBroadcast(aryy0.c, null);
        return true;
    }
}

