import android.accounts.Account;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class ezop implements Runnable {
    public final GcmChimeraBroadcastReceiver a;
    public final Context b;
    public final Intent c;
    public final BroadcastReceiver.PendingResult d;

    public ezop(GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver0, Context context0, Intent intent0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        this.a = gcmChimeraBroadcastReceiver0;
        this.b = context0;
        this.c = intent0;
        this.d = broadcastReceiver$PendingResult0;
    }

    @Override
    public final void run() {
        hfeh hfeh0;
        GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver0 = this.a;
        Context context0 = this.b.getApplicationContext();
        ezqo ezqo0 = (ezqo)gcmChimeraBroadcastReceiver0.e.apply(context0);
        Intent intent0 = this.c;
        if(hzdj.r()) {
            cioq cioq0 = cioq.v();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            hffn hffn0 = hffn.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj0 = (hfgj)hftp0.b_message;
            hffn0.getClass();
            hfgj0.d = hffn0;
            hfgj0.c = 3;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfgc hfgc0 = (hfgc)hftp1.b_message;
            hfgc0.b |= 1;
            hfgc0.c = "com.google.android.gms#udc-facs";
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp0.b_message;
            hfgc hfgc1 = (hfgc)hftp1.N_build();
            hfgc1.getClass();
            hfgj1.f = hfgc1;
            hfgj1.b |= 2;
            cczb cczb0 = cioq0.c(((ProtoLiteMessage)(((hfgj)hftp0.N_build()))));
            cczb0.c = (int)1002;
            cczb0.a();
        }
        else {
            long v = (long)(((Long)ezqo0.c.mr()));
            if(ezqo0.d.a(v)) {
                ayud ayud0 = (ayud)ezqo0.b.mr();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hfgj hfgj2 = (hfgj)hftp2.b_message;
                hfgj2.b |= 1;
                hfgj2.e = (int)v;
                hffn hffn1 = hffn.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hfgj hfgj3 = (hfgj)hftp2.b_message;
                hffn1.getClass();
                hfgj3.d = hffn1;
                hfgj3.c = 3;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hfgc hfgc2 = (hfgc)hftp3.b_message;
                hfgc2.b |= 1;
                hfgc2.c = "com.google.android.gms#udc-facs";
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hfgj hfgj4 = (hfgj)hftp2.b_message;
                hfgc hfgc3 = (hfgc)hftp3.N_build();
                hfgc3.getClass();
                hfgj4.f = hfgc3;
                hfgj4.b |= 2;
                ayuc ayuc0 = ayud0.i(((MessageLite)hftp2.N_build()));
                ayuc0.k(1002);
                ayuc0.d();
            }
        }
        long v1 = gcmChimeraBroadcastReceiver0.g.a();
        try {
            byte[] arr_b = Base64.decode(intent0.getStringExtra("fsc_v1"), 0);
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfeh.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            hfeh0 = (hfeh)hftv0;
        }
        catch(hfur unused_ex) {
            ezqo ezqo1 = (ezqo)gcmChimeraBroadcastReceiver0.e.apply(context0);
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfge.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hfge)hftp4.b_message).c = 2;
            ((hfge)hftp4.b_message).b |= 1;
            ezqo1.b(((hfge)hftp4.N_build()));
            hfeh0 = null;
        }
        if(hfeh0 == null) {
            GcmChimeraBroadcastReceiver.b.j().ar(0x4456).x("Corrupted push notification payload, pinging all accounts...");
            ((flan)gcmChimeraBroadcastReceiver0.c.apply(context0)).b().b(ezmk.b);
        }
        else {
            List list0 = bbmn.h(context0, "com.google.android.gms");
            HashMap hashMap0 = new HashMap();
            ezsz ezsz0 = (ezsz)gcmChimeraBroadcastReceiver0.d.apply(context0);
            for(Object object0: list0) {
                Account account0 = (Account)object0;
                try {
                    hashMap0.put(ezsz0.a(account0), account0);
                }
                catch(acse | IOException exception0) {
                    if(!hzdj.a.l().J()) {
                        continue;
                    }
                    ezqu.b().j().p(((int)hzdj.c())).s(exception0).ar(17490).x("Failed to retrieve obfuscated Gaia id!");
                }
            }
            for(Object object1: hfeh0.b) {
                String s = ((hfeg)object1).b;
                if(hashMap0.containsKey(s)) {
                    Account account1 = (Account)hashMap0.get(s);
                    ((flan)gcmChimeraBroadcastReceiver0.c.apply(context0)).a(account1).b(ezmk.b);
                    ezqo ezqo2 = (ezqo)gcmChimeraBroadcastReceiver0.e.apply(context0);
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfge.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((hfge)hftp5.b_message).c = 1;
                    ((hfge)hftp5.b_message).b |= 1;
                    int v2 = hfeh0.b.size();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hfge hfge0 = (hfge)hftp5.b_message;
                    hfge0.b |= 2;
                    hfge0.d = v2;
                    ezqo2.b(((hfge)hftp5.N_build()));
                }
                else {
                    ezqo ezqo3 = (ezqo)gcmChimeraBroadcastReceiver0.e.apply(context0);
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfge.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((hfge)hftp6.b_message).c = 3;
                    ((hfge)hftp6.b_message).b |= 1;
                    int v3 = hfeh0.b.size();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    hfge hfge1 = (hfge)hftp6.b_message;
                    hfge1.b |= 2;
                    hfge1.d = v3;
                    ezqo3.b(((hfge)hftp6.N_build()));
                }
            }
        }
        try {
            ggtl ggtl0 = GcmChimeraBroadcastReceiver.b;
            ggtl0.h().ar(0x4459).x("Scheduling sync in reaction to push notification...");
            if(((Boolean)((glyq)((fktv)gcmChimeraBroadcastReceiver0.f.apply(context0)).e(ezmv.b)).u()).booleanValue()) {
                ggtl0.h().ar(17500).x("Sync scheduled successfully.");
            }
            else {
                ggtl0.h().ar(0x445A).x("Sync is disabled!");
            }
        }
        catch(ExecutionException | InterruptedException exception1) {
            GcmChimeraBroadcastReceiver.b.j().ar(0x445B).x("Failed to handle GCM push notification!");
            throw new RuntimeException(exception1);
        }
        long v4 = gcmChimeraBroadcastReceiver0.g.a();
        ezqo ezqo4 = (ezqo)gcmChimeraBroadcastReceiver0.e.apply(context0);
        long v5 = v4 - v1;
        if(hzdj.r()) {
            cioq cioq1 = cioq.v();
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hfeu.a).v_newBuilder();
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            hfeu hfeu0 = (hfeu)hftp9.b_message;
            hfeu0.b |= 1;
            hfeu0.c = v5;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            hffn hffn2 = (hffn)hftp8.b_message;
            hfeu hfeu1 = (hfeu)hftp9.N_build();
            hfeu1.getClass();
            hffn2.c = hfeu1;
            hffn2.b = 1;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            hfgj hfgj5 = (hfgj)hftp7.b_message;
            hffn hffn3 = (hffn)hftp8.N_build();
            hffn3.getClass();
            hfgj5.d = hffn3;
            hfgj5.c = 3;
            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp10.b_message.isImmutable()) {
                hftp10.ensureMutable();
            }
            hfgc hfgc4 = (hfgc)hftp10.b_message;
            hfgc4.b |= 1;
            hfgc4.c = "com.google.android.gms#udc-facs";
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            hfgj hfgj6 = (hfgj)hftp7.b_message;
            hfgc hfgc5 = (hfgc)hftp10.N_build();
            hfgc5.getClass();
            hfgj6.f = hfgc5;
            hfgj6.b |= 2;
            cczb cczb1 = cioq1.c(((ProtoLiteMessage)(((hfgj)hftp7.N_build()))));
            cczb1.c = (int)1003;
            cczb1.a();
        }
        else {
            long v6 = (long)(((Long)ezqo4.c.mr()));
            if(ezqo4.d.a(v6)) {
                ayud ayud1 = (ayud)ezqo4.b.mr();
                ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                hfgj hfgj7 = (hfgj)hftp11.b_message;
                hfgj7.b |= 1;
                hfgj7.e = (int)v6;
                ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)hfeu.a).v_newBuilder();
                if(!hftp13.b_message.isImmutable()) {
                    hftp13.ensureMutable();
                }
                hfeu hfeu2 = (hfeu)hftp13.b_message;
                hfeu2.b |= 1;
                hfeu2.c = v5;
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                hffn hffn4 = (hffn)hftp12.b_message;
                hfeu hfeu3 = (hfeu)hftp13.N_build();
                hfeu3.getClass();
                hffn4.c = hfeu3;
                hffn4.b = 1;
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                hfgj hfgj8 = (hfgj)hftp11.b_message;
                hffn hffn5 = (hffn)hftp12.N_build();
                hffn5.getClass();
                hfgj8.d = hffn5;
                hfgj8.c = 3;
                ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                if(!hftp14.b_message.isImmutable()) {
                    hftp14.ensureMutable();
                }
                hfgc hfgc6 = (hfgc)hftp14.b_message;
                hfgc6.b |= 1;
                hfgc6.c = "com.google.android.gms#udc-facs";
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                hfgj hfgj9 = (hfgj)hftp11.b_message;
                hfgc hfgc7 = (hfgc)hftp14.N_build();
                hfgc7.getClass();
                hfgj9.f = hfgc7;
                hfgj9.b |= 2;
                ayuc ayuc1 = ayud1.i(((MessageLite)hftp11.N_build()));
                ayuc1.k(1003);
                ayuc1.d();
            }
        }
        this.d.finish();
        GcmChimeraBroadcastReceiver.b.h().ar(0x4453).x("GCM push notification handled successfully.");
    }
}

