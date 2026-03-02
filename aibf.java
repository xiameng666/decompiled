import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;

public final class aibf extends ahyh implements cjug {
    private static final baun a;
    private final aicr b;
    private final Context c;
    private final String d;

    static {
        aibf.a = new baun("SmsRetrieverStub");
    }

    public aibf(Context context0, String s) {
        this.c = context0.getApplicationContext();
        this.d = s;
        this.b = new aicr();
    }

    @Override  // ahyi
    public final void a(ahxz ahxz0) {
        baun baun0 = aibf.a;
        baun0.d("checkAutofillPermissionState", new Object[0]);
        try {
            String s = this.d;
            if(aicl.f(s)) {
                baun0.d("checkAutofillPermissionState: caller is an eligible 1P app.", new Object[0]);
            }
            else {
                Context context0 = this.c;
                if(!aicl.e(context0, s)) {
                    aicq aicq0 = aicr.m(s, 10);
                    this.b.k(context0, aicq0);
                    ahxz0.a(new Status(36501), 0);
                    return;
                }
            }
            aicq aicq1 = aicr.m(s, 0);
            this.b.k(this.c, aicq1);
            int v = new aiaw(this.c).a();
            ahxz0.a(Status.b, v);
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }

    @Override  // ahyi
    public final void b(String s, ahyf ahyf0) {
        boolean z;
        baun baun0 = aibf.a;
        baun0.d("checkOngoingSmsRequest", new Object[0]);
        try {
            String s1 = this.d;
            if(aicl.f(s1)) {
                baun0.d("checkOngoingSmsRequest: caller is an eligible 1P app.", new Object[0]);
            }
            else {
                Context context0 = this.c;
                if(!aicl.e(context0, s1)) {
                    aicq aicq0 = aicr.l(s1, 10);
                    this.b.k(context0, aicq0);
                    ahyf0.a(new Status(36501), false);
                    return;
                }
            }
            Context context1 = this.c;
            aicq aicq1 = aicr.l(s1, 0);
            this.b.k(context1, aicq1);
            Status status0 = Status.b;
            gftb.check(s);
            if(aiam.c()) {
                aiac aiac0 = aiam.a(context1, s).d;
                gftb.check(s);
                gftb.check(s);
                ArrayList arrayList0 = aiac0.a.b;
                int v = arrayList0.size();
                int v1 = 0;
                do {
                    z = true;
                    if(v1 >= v) {
                        goto label_30;
                    }
                    boolean z1 = gfqz.e(s, ((aiaq)arrayList0.get(v1)).a);
                    ++v1;
                }
                while(!z1);
                goto label_38;
            label_30:
                gftb.check(s);
                for(Object object0: aiac0.b.c.values()) {
                    gftb.check(s);
                    if(!((ahxv)object0).c.u(s)) {
                        continue;
                    }
                    goto label_38;
                }
            }
            z = false;
        label_38:
            ahyf0.a(status0, z);
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }

    @Override  // ahyi
    public final void c(azxs azxs0) {
        ccmq.a().a(bbdg.iH);
        if(hppk.f()) {
            aibf.a.h("Starting SmsCodeAutofill API. Calling package:%s", new Object[]{this.d});
        }
        else {
            aibf.a.d("startSmsCodeAutofill", new Object[0]);
        }
        try {
            if(hppk.e()) {
                Context context0 = this.c;
                if(!aicz.b(context0)) {
                    aibf.a.d("Return status error, since device doesn\'t have telephony feature", new Object[0]);
                    aicq aicq0 = aicr.p(this.d, 15);
                    this.b.k(context0, aicq0);
                    azxs0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                    return;
                }
            }
            else if(hppk.d() && !aicz.c(this.c)) {
                aibf.a.d("Return status error, since device doesn\'t support messaging", new Object[0]);
                azxs0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                return;
            }
            if(hpqh.c()) {
                aibf.a.d("startSmsCodeAutofill for testing with skipping api caller check.", new Object[0]);
                aian.a(this.c, this.d);
                azxs0.a(Status.b);
                return;
            }
            Context context1 = this.c;
            String s = this.d;
            if(!aicl.e(context1, s)) {
                aicq aicq1 = aicr.p(s, 10);
                this.b.k(context1, aicq1);
                azxs0.a(new Status(36501));
                return;
            }
            switch(new aiaw(context1).a()) {
                case 0: {
                    aicq aicq3 = aicr.p(s, 14);
                    this.b.k(context1, aicq3);
                    azxs0.a(new Status(6, null, bbmq.g(context1, bbmq.j(new Intent("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_CONSENT")), 0x42000000)));
                    return;
                }
                case 1: {
                    aicq aicq4 = aicr.p(s, 0);
                    this.b.k(context1, aicq4);
                    aian.a(context1, s);
                    azxs0.a(Status.b);
                    return;
                }
                default: {
                    aicq aicq2 = aicr.p(s, 11);
                    this.b.k(context1, aicq2);
                    azxs0.a(new Status(36502));
                }
            }
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }

    @Override  // ahyi
    public final void d(azxs azxs0) {
        ccmq.a().a(bbdg.iI);
        if(hppk.f()) {
            aibf.a.h("Starting SmsCodeBrowser API. Calling package:%s", new Object[]{this.d});
        }
        else {
            aibf.a.d("startSmsCodeBrowser", new Object[0]);
        }
        try {
            if(hppk.e()) {
                Context context0 = this.c;
                if(!aicz.b(context0)) {
                    aibf.a.d("Return status error, since device doesn\'t have telephony feature", new Object[0]);
                    aicq aicq0 = aicr.s(this.d, 15);
                    this.b.k(context0, aicq0);
                    azxs0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                    return;
                }
            }
            else if(hppk.d() && !aicz.c(this.c)) {
                aibf.a.d("Return status error, since device doesn\'t support messaging", new Object[0]);
                azxs0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                return;
            }
            if(hpqh.c()) {
                aibf.a.d("startSmsCodeBrowser for testing with skipping api caller check.", new Object[0]);
                aian.b(this.c, this.d);
                azxs0.a(Status.b);
                return;
            }
            Context context1 = this.c;
            String s = this.d;
            if(!aicm.d(context1, s)) {
                aicq aicq1 = aicr.s(s, 10);
                this.b.k(context1, aicq1);
                azxs0.a(new Status(36501));
                return;
            }
            switch(new aiax(context1).a()) {
                case 0: {
                    aicq aicq3 = aicr.s(s, 14);
                    this.b.k(context1, aicq3);
                    azxs0.a(new Status(6, null, bbmq.g(context1, bbmq.j(new Intent("com.google.android.gms.auth.api.phone.ACTION_BROWSER_CONSENT")), 0x42000000)));
                    return;
                }
                case 1: {
                    aicq aicq4 = aicr.s(s, 0);
                    this.b.k(context1, aicq4);
                    aian.b(context1, s);
                    azxs0.a(Status.b);
                    return;
                }
                default: {
                    aicq aicq2 = aicr.s(s, 11);
                    this.b.k(context1, aicq2);
                    azxs0.a(new Status(36502));
                }
            }
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }

    @Override  // ahyi
    public final void e(ahyo ahyo0) {
        String s3;
        bbsq bbsq0;
        aicj aicj0;
        ccmq.a().a(bbdg.iF);
        if(hppk.f()) {
            aibf.a.h("Starting SmsRetriever API. Calling package:%s", new Object[]{this.d});
        }
        else {
            aibf.a.d("startSmsRetriever", new Object[0]);
        }
        if(!hppk.e()) {
            aicr aicr0 = this.b;
            Context context0 = this.c;
            String s = this.d;
            SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
            aiao.d(0, smsRetrieverEvent0);
            if(s != null) {
                aiao.a(s, smsRetrieverEvent0);
            }
            aicr0.k(context0, new aicq(smsRetrieverEvent0, true));
        }
        try {
            try {
                if(hppk.e()) {
                    Context context1 = this.c;
                    if(!aicz.b(context1)) {
                        aibf.a.d("Return status error, since device doesn\'t have telephony feature", new Object[0]);
                        aicq aicq0 = aicr.t(this.d, 15);
                        this.b.k(context1, aicq0);
                        ahyo0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                        return;
                    }
                }
                else if(hppk.d() && !aicz.c(this.c)) {
                    aibf.a.d("Return status error, since device doesn\'t support messaging", new Object[0]);
                    ahyo0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                    return;
                }
                if(hppk.e()) {
                    aicq aicq1 = aicr.t(this.d, 0);
                    this.b.k(this.c, aicq1);
                }
                String s1 = this.d;
                long v = System.currentTimeMillis();
                Context context2 = this.c;
                aicj0 = ahyy.a;
                PackageManager packageManager0 = context2.getPackageManager();
                bbsq0 = bbsr.b(context2);
                String s2 = aicj0.a(bbsq0, s1);
                aicj.a.d("appCode: %s", new Object[]{s2});
                Iterator iterator0 = packageManager0.getInstalledPackages(0x80).iterator();
                while(true) {
                label_38:
                    if(!iterator0.hasNext()) {
                        aiaq aiaq0 = new aiaq(s1, v, new ahxw(new ggoh(s2)));
                        synchronized(aiam.class) {
                            Long long0 = (long)aiaq0.b;
                            aian.a.d("addLegacyRequest. TimeStamp: %d", new Object[]{long0});
                            ahyw ahyw0 = aiam.a(context2, aiaq0.a).d.a;
                            ahyw0.a.d("addRequest. Timestamp: %d", new Object[]{long0});
                            ahyw0.b.add(aiaq0);
                            long v2 = hppt.b();
                            ahyw0.e.a(ahyw0.c, v2);
                        }
                        ahyo0.a(Status.b);
                        return;
                    }
                    Object object0 = iterator0.next();
                    s3 = ((PackageInfo)object0).packageName;
                    if(!s1.equals(s3)) {
                        break;
                    }
                }
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                goto label_62;
            }
            catch(aici aici0) {
                goto label_65;
            }
            catch(aick aick0) {
                goto label_73;
            }
            try {
                String s4 = aicj0.a(bbsq0, s3);
            }
            catch(aick unused_ex) {
                goto label_38;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                goto label_62;
            }
            catch(aici aici0) {
                goto label_65;
            }
            try {
                if(!s2.equals(s4)) {
                    goto label_38;
                }
                aicj.a.d("Found appCode collision with other package name: %s", new Object[]{s3});
                throw new aici();
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            }
            catch(aici aici0) {
                goto label_65;
            }
            catch(aick aick0) {
                goto label_73;
            }
        }
        catch(RemoteException remoteException0) {
            goto label_81;
        }
    label_62:
        aibf.a.g("NameNotFoundException", packageManager$NameNotFoundException0, new Object[0]);
        return;
    label_65:
        aibf.a.g("AppCodeCollisionException", aici0, new Object[0]);
        String s5 = aici0.getMessage();
        this.g(this.c, 3);
        if(s5 == null) {
            s5 = "";
        }
        aibf.h(ahyo0, 13, s5);
        return;
    label_73:
        aibf.a.g("AppSecurityException", aick0, new Object[0]);
        String s6 = aick0.getMessage();
        this.g(this.c, 2);
        if(s6 == null) {
            s6 = "";
        }
        aibf.h(ahyo0, 10, s6);
        return;
    label_81:
        aibf.a.g("RemoteException", remoteException0, new Object[0]);
    }

    @Override  // ahyi
    public final void f(String s, ahyo ahyo0) {
        ghxn ghxn0;
        ccmq.a().a(bbdg.iG);
        if(hppk.f()) {
            aibf.a.h("Starting SmsUserConsent API. Calling package:%s", new Object[]{this.d});
        }
        else {
            aibf.a.d("startWithConsentPrompt", new Object[0]);
        }
        String s1 = this.d;
        synchronized(aiam.class) {
            long v1 = System.currentTimeMillis();
            Long long0 = v1;
            aian.a.d("addConsentRequest. Timestamp: %d", new Object[]{long0});
            ahxr ahxr0 = aiam.a(this.c, s1).d.b;
            ahxr0.a.d("addRequest. Timestamp: %d", new Object[]{long0});
            ahxr0.e(v1);
            String s2 = ahxr.d(s);
            ahxv ahxv0 = ahxr0.c(s2);
            ahxv0.c.v(s1, long0);
            long v2 = ahxr.a();
            ahxr0.f.a(ahxr0.d, v2);
            int v3 = "".equals(s2) ^ 1;
            ahxu ahxu0 = (ahxu)ahxv0.e.remove(s1);
            if(ahxu0 == null) {
                ghxn0 = ghxn.a;
            }
            else {
                switch(ahxu0.b) {
                    case 1: {
                        ghxn0 = ghxn.b;
                        break;
                    }
                    case 2: {
                        ghxn0 = ghxn.c;
                        break;
                    }
                    default: {
                        ghxn0 = ghxn.a;
                    }
                }
            }
            if(hppk.e()) {
                aicq aicq0 = aicr.v(s1, ((boolean)v3), ghxn0, 0);
                ahxr0.e.a(aicq0);
            }
            else {
                aiaa aiaa0 = ahxr0.e;
                SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                aiao.d(4, smsRetrieverEvent0);
                if(ghxn0 != null) {
                    aiao.g(ghxn0.d, smsRetrieverEvent0);
                }
                if(s1 != null) {
                    aiao.a(s1, smsRetrieverEvent0);
                }
                aiao.e(((boolean)v3), smsRetrieverEvent0);
                aiaa0.a(new aicq(smsRetrieverEvent0, true));
            }
        }
        try {
            if(hppk.e()) {
                Context context0 = this.c;
                if(!aicz.b(context0)) {
                    aibf.a.d("Return status error, since device doesn\'t have telephony feature", new Object[0]);
                    int v4 = TextUtils.isEmpty(s) ^ 1;
                    aicq aicq1 = aicr.v(this.d, ((boolean)v4), null, 15);
                    this.b.k(context0, aicq1);
                    ahyo0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                    return;
                }
            }
            else if(hppk.d() && !aicz.c(this.c)) {
                aibf.a.d("Return status error, since device doesn\'t support messaging", new Object[0]);
                ahyo0.a(new Status(17, "Device doesn\'t support the messaging feature"));
                return;
            }
            ahyo0.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }

    final void g(Context context0, int v) {
        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
        aiao.d(3, smsRetrieverEvent0);
        aiao.c(v - 1, smsRetrieverEvent0);
        String s = this.d;
        if(s != null) {
            aiao.a(s, smsRetrieverEvent0);
        }
        aicq aicq0 = new aicq(smsRetrieverEvent0, false);
        this.b.k(context0, aicq0);
    }

    private static final void h(ahyo ahyo0, int v, String s) {
        try {
            ahyo0.a(new Status(v, s));
        }
        catch(RemoteException remoteException0) {
            aibf.a.g("RemoteException", remoteException0, new Object[0]);
        }
    }
}

