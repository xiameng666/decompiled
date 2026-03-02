import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import com.google.android.gms.constellation.verifier.SmsSender.SmsPendingIntentReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class bcrx implements bcsg {
    public int a;
    public int b;
    public int c;
    private final baun d;
    private final hofs e;
    private final bbxx f;
    private final bcsf g;
    private final bcrd h;
    private long i;
    private final bcsi j;

    public bcrx(hofs hofs0, bbxx bbxx0, bcrd bcrd0) {
        bcsf bcsf0 = new bcsf();
        super();
        this.d = bcrh.a("mo_verifier");
        this.c = 2;
        this.a = 0;
        this.b = 0;
        this.i = 0L;
        this.e = hofs0;
        this.f = bbxx0;
        this.g = bcsf0;
        this.h = bcrd0;
        this.j = new bcsi(bcqx.a(AppContextProvider.a()));
    }

    @Override  // bcsg
    public final hofs a() {
        baun baun0 = this.d;
        baun0.h("do verification", new Object[0]);
        if(hrfs.i() && this.c != 2) {
            bbxx bbxx0 = this.f;
            bcrd bcrd0 = this.h;
            hofs hofs0 = this.e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hobv.a).v_newBuilder();
            int v = this.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hobv hobv0 = (hobv)hftp1.b_message;
            hobv0.b = hobu.a(v);
            long v1 = (long)this.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hobv)hftv0).c = v1;
            long v2 = (long)this.b;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hobv)hftp1.b_message).d = v2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hobo hobo0 = (hobo)hftp0.b_message;
            hobv hobv1 = (hobv)hftp1.N_build();
            hobv1.getClass();
            hobo0.c = hobv1;
            hobo0.b = 3;
            return bbxx0.j(bcrd0, hofs0, ((hobo)hftp0.N_build()));
        }
        hofs hofs1 = this.e;
        hoer hoer0 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        hogd hogd0 = hobj0.g == null ? hogd.a : hobj0.g;
        long v3 = bcql.a((hogd0.c == null ? hfwn.a : hogd0.c));
        hoer hoer1 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
        hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
        hogd hogd1 = hobj1.g == null ? hogd.a : hobj1.g;
        long v4 = v3 - bcql.a((hogd1.d == null ? hfwn.a : hogd1.d));
        bcrg.e();
        hoer hoer2 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
        hobj hobj2 = hoer2.c == null ? hobj.a : hoer2.c;
        List list0 = bcrg.b((hobj2.c == 3 ? ((hobt)hobj2.d) : hobt.a).f);
        if(list0.isEmpty()) {
            bcrg.e();
            list0 = bcrg.b(hrfs.a.e().o());
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(((long)(((Long)object0))) <= v4) {
                arrayList0.add(((Long)object0));
                v4 -= (long)(((Long)object0));
                continue;
            }
            else {
                arrayList0.add(Long.valueOf(v4));
                v4 = 0L;
            }
            break;
        }
        if(v4 > 0L) {
            arrayList0.add(Long.valueOf(v4));
        }
        baun0.j("sleep intervals " + arrayList0.toString(), new Object[0]);
        hofs hofs2 = null;
        int v5 = 0;
        while(v5 < arrayList0.size()) {
            try {
                baun0.h("sleep " + arrayList0.get(v5) + " ms", new Object[0]);
                Thread.sleep(((Long)arrayList0.get(v5)).longValue());
            }
            catch(InterruptedException interruptedException0) {
                throw new bcrc("Mo verification fails", gmfx.aA, false, interruptedException0);
            }
            baun0.j(a.f(v5, "ping ", " time"), new Object[0]);
            bbxx bbxx1 = this.f;
            bcrd bcrd1 = this.h;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hobv.a).v_newBuilder();
            int v6 = this.c;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hobv hobv2 = (hobv)hftp3.b_message;
            hobv2.b = hobu.a(v6);
            long v7 = (long)this.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            ((hobv)hftv1).c = v7;
            long v8 = (long)this.b;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hobv)hftp3.b_message).d = v8;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hobo hobo1 = (hobo)hftp2.b_message;
            hobv hobv3 = (hobv)hftp3.N_build();
            hobv3.getClass();
            hobo1.c = hobv3;
            hobo1.b = 3;
            hofs2 = bbxx1.j(bcrd1, hofs1, ((hobo)hftp2.N_build()));
            if(hrel.c() && hofs2 != null) {
                bcrg.e();
                if(bcrg.d(hofs2)) {
                    this.j.f(bcrd1, 3, System.currentTimeMillis() - this.i);
                }
            }
            boolean z = bcrx.f(this.c);
            bcrg.e();
            if(bcrg.c(hofs2)) {
                hoer hoer3 = hofs2.c == 4 ? ((hoer)hofs2.d) : hoer.a;
                hobj hobj3 = hoer3.c == null ? hobj.a : hoer3.c;
                String s = (hobj3.e == null ? hobk.a : hobj3.e).b;
                hoer hoer4 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                hobj hobj4 = hoer4.c == null ? hobj.a : hoer4.c;
                if(s.equals((hobj4.e == null ? hobk.a : hobj4.e).b) && !bcrx.f(this.c)) {
                    ++v5;
                    continue;
                }
            }
            if(z) {
                this.e(gmfx.cp, "failed to send sms");
            }
            return hofs2;
        }
        this.j.a(this.h, this.e, gmfz.o);
        return hofs2;
    }

    @Override  // bcsg
    public final hofs b() {
        return this.e;
    }

    @Override  // bcsg
    public final String c() {
        hoer hoer0 = this.e.c == 4 ? ((hoer)this.e.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return (hobj0.e == null ? hobk.a : hobj0.e).b;
    }

    @Override  // bcsg
    public final void d() {
        boolean z;
        SmsManager smsManager1;
        this.i = System.currentTimeMillis();
        if(hrel.c()) {
            this.j.e(this.h, 3);
        }
        baun baun0 = this.d;
        baun0.h("send message", new Object[0]);
        if(jwe.a(AppContextProvider.a(), "android.permission.SEND_SMS") == 0) {
            hofs hofs0 = this.e;
            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            String s = (hobj0.c == 3 ? ((hobt)hobj0.d) : hobt.a).d;
            if(s.isEmpty()) {
                this.e(gmfx.co, "empty opt message");
                baun0.f("MO verification is halted because an unexpected empty OPT message is obtained from pending verification", new Object[0]);
                return;
            }
            Context context0 = AppContextProvider.a();
            if(hrfs.i()) {
                hoft hoft0 = hofs0.e == null ? hoft.a : hofs0.e;
                hofa hofa0 = hoft0.b == 1 ? ((hofa)hoft0.c) : hofa.a;
                int v = (hofa0.d == null ? hofd.a : hofa0.d).c;
                if(SubscriptionManager.from(context0).isActiveSubscriptionId(v)) {
                    SmsManager smsManager0 = bbhx.b(context0, v);
                    if(smsManager0 == null) {
                        this.c = 6;
                        this.e(gmfx.X, String.valueOf(this.b));
                        this.j.c(this.h, hofs0, gmfz.p, gmfx.X, String.valueOf(this.b));
                        return;
                    }
                    smsManager1 = smsManager0;
                    goto label_67;
                }
                this.c = 5;
                this.e(gmfx.Y, String.valueOf(this.b));
                this.j.c(this.h, hofs0, gmfz.p, gmfx.Y, String.valueOf(this.b));
                return;
            }
            else {
                bcrd bcrd0 = this.h;
                HashMap hashMap0 = new HashMap();
                if(SubscriptionManager.from(context0).getActiveSubscriptionInfoCount() > 1) {
                    for(Object object0: SubscriptionManager.from(context0).getActiveSubscriptionInfoList()) {
                        SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object0;
                        if(subscriptionInfo0 != null) {
                            hashMap0.put(bcrm.s(bcrd0, subscriptionInfo0).k(), bbhx.b(context0, subscriptionInfo0.getSubscriptionId()));
                        }
                    }
                    z = true;
                }
                else {
                    z = false;
                }
                if(hashMap0.isEmpty()) {
                    if(z) {
                        this.j.a(bcrd0, hofs0, gmfz.bJ);
                    }
                    hashMap0.put(((TelephonyManager)context0.getSystemService("phone")).getSubscriberId(), bbhx.a(context0));
                }
                SmsManager smsManager2 = null;
                if(hashMap0.size() > 1) {
                    hoft hoft1 = hofs0.e == null ? hoft.a : hofs0.e;
                    hofa hofa1 = hoft1.b == 1 ? ((hofa)hoft1.c) : hofa.a;
                    for(Object object1: (hofa1.c == null ? hofc.a : hofa1.c).b) {
                        String s1 = (String)object1;
                        if(hashMap0.containsKey(s1)) {
                            smsManager2 = (SmsManager)hashMap0.get(s1);
                            break;
                        }
                    }
                }
                if(smsManager2 == null) {
                    this.j.a(bcrd0, hofs0, gmfz.bM);
                    smsManager1 = bbhx.a(context0);
                }
                else {
                    this.j.a(bcrd0, hofs0, gmfz.bL);
                    smsManager1 = smsManager2;
                }
            }
        label_67:
            bcrw bcrw0 = new bcrw(this);
            int v1 = hofs0.c;
            hoer hoer1 = v1 == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
            String s2 = (hobj1.c == 3 ? ((hobt)hobj1.d) : hobt.a).c;
            hoer hoer2 = v1 == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj2 = hoer2.c == null ? hobj.a : hoer2.c;
            if(((hobj2.c == 3 ? ((hobt)hobj2.d) : hobt.a).b & 1) != 0) {
                hofs hofs1 = this.e;
                hoer hoer3 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                hobj hobj3 = hoer3.c == null ? hobj.a : hoer3.c;
                hobt hobt0 = hobj3.c == 3 ? ((hobt)hobj3.d) : hobt.a;
                int v2 = (short)(hobt0.e == null ? hobp.a : hobt0.e).b;
                this.d.h("Sending data sms", new Object[0]);
                bcsf bcsf0 = this.g;
                bcrd bcrd1 = this.h;
                String s3 = UUID.randomUUID().toString();
                SmsSender.SmsPendingIntentReceiver smsSender$SmsPendingIntentReceiver0 = new SmsSender.SmsPendingIntentReceiver(bcsf0, bcrd1, hofs1, true, bcrw0, s2, s3);
                IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.constellation.BINARY_SMS_SENT");
                jwe.b(bcsf0.b, smsSender$SmsPendingIntentReceiver0, intentFilter0, 4);
                Intent intent0 = new Intent("com.google.android.gms.constellation.BINARY_SMS_SENT").setPackage("com.google.android.gms");
                intent0.putExtra("SESSION_ID", bcrd1.a);
                intent0.putExtra("MESSAGE_ID", s3);
                PendingIntent pendingIntent0 = PendingIntent.getBroadcast(bcsf0.b, 0, intent0, 0x42000000);
                try {
                    smsManager1.sendDataMessage(s2, null, ((short)v2), s.getBytes(), pendingIntent0, null);
                    bcqx.a(bcsf0.b).u(bcrd1, gmfz.t, s3);
                }
                catch(SecurityException securityException0) {
                    bcsf.a.g("Error sending SMS.", securityException0, new Object[0]);
                    bcqx.a(bcsf0.b).l(bcrd1, hofs1, gmfz.p, gmfx.aD, "");
                }
                return;
            }
            baun0.h("Sending visible sms", new Object[0]);
            bcsf bcsf1 = this.g;
            String s4 = UUID.randomUUID().toString();
            SmsSender.SmsPendingIntentReceiver smsSender$SmsPendingIntentReceiver1 = new SmsSender.SmsPendingIntentReceiver(bcsf1, this.h, hofs0, false, bcrw0, s2, s4);
            bcrd bcrd2 = this.h;
            IntentFilter intentFilter1 = new IntentFilter("com.google.android.gms.constellation.VISIBLE_SMS_SENT");
            Context context1 = bcsf1.b;
            jwe.b(context1, smsSender$SmsPendingIntentReceiver1, intentFilter1, 4);
            Intent intent1 = new Intent("com.google.android.gms.constellation.VISIBLE_SMS_SENT").setPackage("com.google.android.gms");
            intent1.putExtra("SESSION_ID", bcrd2.a);
            intent1.putExtra("MESSAGE_ID", s4);
            PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context1, 0, intent1, 0x42000000);
            try {
                hrfs hrfs0 = hrfs.a;
                if(!hrfs0.e().x()) {
                    bcsf.a.d("Can\'t send non persistent SMS, device is not allowed to", new Object[0]);
                    goto label_120;
                }
                else if(!hrfs0.e().D()) {
                    if(jwe.a(context1, "android.permission.MODIFY_PHONE_STATE") == 0) {
                        bcsf.a.d("Can\'t send non persistent SMS, doesn\'t have MODIFY_PHONE_STATE permission ContextCompat", new Object[0]);
                    label_120:
                        bcsf.a.d("Sending persistent SMS", new Object[0]);
                        bcqx.a(context1).v(bcrd2, hofs0, gmfz.r);
                        smsManager1.sendTextMessage(s2, null, s, pendingIntent1, null);
                    }
                    else {
                    label_124:
                        bcsf.a.d("Sending non-persistent SMS", new Object[0]);
                        bcqx.a(context1).v(bcrd2, hofs0, gmfz.s);
                        smsManager1.sendTextMessageWithoutPersisting(s2, null, s, pendingIntent1, null);
                    }
                }
                else if(context1.getPackageManager().checkPermission("android.permission.MODIFY_PHONE_STATE", "com.google.android.gms") != 0) {
                    bcsf.a.d("Can\'t send non persistent SMS, doesn\'t have MODIFY_PHONE_STATE permission", new Object[0]);
                    goto label_120;
                }
                else {
                    goto label_124;
                }
                bcqx.a(context1).u(bcrd2, gmfz.t, s4);
            }
            catch(SecurityException securityException1) {
                bcsf.a.g("Error sending SMS.", securityException1, new Object[0]);
                bcqx.a(bcsf1.b).l(bcrd2, hofs0, gmfz.p, gmfx.aD, "");
            }
            return;
        }
        this.e(gmfx.cn, "no sms permission");
    }

    private final void e(gmfx gmfx0, String s) {
        if(hrel.c()) {
            this.j.d(this.h, 3, gmfx0, s);
        }
    }

    private static final boolean f(int v) {
        return v == 4 || v == 5 || v == 6;
    }
}

