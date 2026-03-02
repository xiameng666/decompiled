import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverCore.SmsAndTimeoutReceiver;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class aian {
    public static final baun a;
    public final aicr b;
    public final WeakReference c;
    public final aiac d;
    public int e;
    private final String f;
    private BroadcastReceiver g;
    private aial h;
    private final aiak i;

    static {
        aian.a = new baun("SmsRetrieverCore");
    }

    public aian(Context context0, String s) {
        this.e = 0;
        aiak aiak0 = new aiak(this);
        this.i = aiak0;
        this.f = s;
        WeakReference weakReference0 = new WeakReference(context0.getApplicationContext());
        this.c = weakReference0;
        this.d = new aiac(aiak0);
        this.b = ((Context)weakReference0.get()) == null ? null : new aicr();
        if(this.g == null) {
            Context context1 = (Context)weakReference0.get();
            if(context1 != null) {
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter0.addAction("com.google.android.gms.auth.api.phone.action.ON_ALARM");
                SmsRetrieverCore.SmsAndTimeoutReceiver smsRetrieverCore$SmsAndTimeoutReceiver0 = new SmsRetrieverCore.SmsAndTimeoutReceiver(s);
                this.g = smsRetrieverCore$SmsAndTimeoutReceiver0;
                jwe.b(context1, smsRetrieverCore$SmsAndTimeoutReceiver0, intentFilter0, 2);
            }
        }
        if(aian.e(s)) {
            Context context2 = (Context)weakReference0.get();
            if(context2 != null) {
                if(this.h == null) {
                    this.h = new aial(context2, s);
                }
                aial aial0 = this.h;
                aian.a.d("Registering rcs message listener", new Object[0]);
                ahzt ahzt0 = new ahzt(aial0.a, aial0);
                aial0.b = ahzt0;
                aial0.a.getContentResolver().registerContentObserver(Uri.parse("content://mms/inbox/"), true, ahzt0);
            }
        }
    }

    public static void a(Context context0, String s) {
        String s2;
        gftb.check(context0);
        gftb.check(s);
        synchronized(aiam.class) {
            long v1 = System.currentTimeMillis();
            aian.a.d("addAutofillRequest. Timestamp: %d", new Object[]{v1});
            aiac aiac0 = aiam.a(context0, s).d;
            gftb.check(s);
            ahxj ahxj0 = aiac0.c;
            gftb.check(s);
            ahxj0.d(v1);
            Context context1 = ahxj0.e.b();
            if(context1 == null) {
            label_55:
                ahxj0.c.v(s, Long.valueOf(v1));
                long v7 = ahxj.b();
                ahxj0.h.a(ahxj0.b, v7);
            }
            else {
                CharSequence charSequence0 = null;
                aiaa aiaa0 = ahxj0.g;
                long v2 = v1 - ahxj.a();
                Cursor cursor0 = cclu.b(context1.getContentResolver(), "content://sms/inbox", ((String[])gggq.A(ahxi.a, String.class)), "date > " + v2, null, "date DESC");
                if(cursor0 == null) {
                label_49:
                    if(cursor0 != null) {
                    label_50:
                        cursor0.close();
                    }
                }
                else {
                    try {
                        if(cursor0.moveToFirst()) {
                            int v3 = cursor0.getColumnIndex("date");
                            int v4 = cursor0.getColumnIndex("address");
                            int v5 = cursor0.getColumnIndex("body");
                            if(v3 >= 0 && v4 >= 0 && v5 >= 0) {
                                ahzp ahzp0 = new ahzp();
                                while(true) {
                                label_25:
                                    String s1 = cursor0.getString(v4);
                                    if(hppk.h() || !aicn.a(context1, s1)) {
                                        gged_interceptors gged0 = ahzp0.a(cursor0.getString(v5));
                                        if(!gged0.isEmpty()) {
                                            s2 = (String)gggq.o(gged0, null);
                                            if(!TextUtils.isEmpty(s2)) {
                                                if(!TextUtils.isEmpty(s2)) {
                                                    long v6 = v1 - cursor0.getLong(v3);
                                                    SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                                                    aiao.d(14, smsRetrieverEvent0);
                                                    aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v6)), smsRetrieverEvent0);
                                                    if(s != null) {
                                                        aiao.a(s, smsRetrieverEvent0);
                                                    }
                                                    aiaa0.a(new aicq(smsRetrieverEvent0, true));
                                                }
                                                goto label_39;
                                            }
                                        }
                                    }
                                    goto label_42;
                                }
                            }
                            else {
                                goto label_44;
                            }
                        }
                        else {
                            goto label_49;
                        }
                        goto label_51;
                    }
                    catch(Throwable throwable0) {
                        goto label_47;
                    }
                label_39:
                    cursor0.close();
                    charSequence0 = s2;
                    goto label_51;
                    try {
                    label_42:
                        if(cursor0.moveToNext()) {
                            goto label_25;
                        }
                        goto label_50;
                    label_44:
                        ((ggtj)ahxj.a.j()).x("Date or address or body column does not exist.");
                        goto label_50;
                    }
                    catch(Throwable throwable0) {
                    label_47:
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
            label_51:
                if(!TextUtils.isEmpty(charSequence0)) {
                    ((ggtj)ahxj.a.h()).x("found an sms code at inbox");
                    ahxj0.g.d(s, ((String)charSequence0));
                    goto label_58;
                }
                goto label_55;
            }
        label_58:
        }
    }

    public static void b(Context context0, String s) {
        String s2;
        gftb.check(context0);
        gftb.check(s);
        synchronized(aiam.class) {
            long v1 = System.currentTimeMillis();
            aian.a.d("addBrowserRequest. Timestamp: %d", new Object[]{v1});
            aiac aiac0 = aiam.a(context0, s).d;
            gftb.check(s);
            ahxm ahxm0 = aiac0.d;
            gftb.check(s);
            ahxm0.b(v1);
            aiak aiak0 = ahxm0.e;
            Context context1 = aiak0.b();
            if(context1 == null) {
            label_58:
                ahxm0.c.v(s, Long.valueOf(v1));
                long v7 = ahxj.b();
                ahxm0.g.a(ahxm0.b, v7);
            }
            else {
                CharSequence charSequence0 = null;
                long v2 = v1 - ahxj.a();
                ContentResolver contentResolver0 = context1.getContentResolver();
                String[] arr_s = (String[])gggq.A(ahxl.b, String.class);
                Cursor cursor0 = contentResolver0.query(ahxl.a, arr_s, "date > " + v2, null, "date DESC");
                if(cursor0 == null) {
                label_51:
                    if(cursor0 != null) {
                    label_52:
                        cursor0.close();
                    }
                }
                else {
                    try {
                        if(cursor0.moveToFirst()) {
                            int v3 = cursor0.getColumnIndex("date");
                            int v4 = cursor0.getColumnIndex("address");
                            int v5 = cursor0.getColumnIndex("body");
                            if(v3 >= 0 && v4 >= 0 && v5 >= 0) {
                                aiat aiat0 = new aiat();
                                while(true) {
                                label_27:
                                    String s1 = cursor0.getString(v4);
                                    if(hppk.h() || !aicn.a(context1, s1)) {
                                        gged_interceptors gged0 = aiat0.a(cursor0.getString(v5));
                                        if(!gged0.isEmpty()) {
                                            s2 = (String)gggq.o(gged0, null);
                                            if(!TextUtils.isEmpty(s2)) {
                                                if(!TextUtils.isEmpty(s2)) {
                                                    long v6 = v1 - cursor0.getLong(v3);
                                                    SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                                                    aiao.d(28, smsRetrieverEvent0);
                                                    aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v6)), smsRetrieverEvent0);
                                                    if(s != null) {
                                                        aiao.a(s, smsRetrieverEvent0);
                                                    }
                                                    aiak0.d(new aicq(smsRetrieverEvent0, true));
                                                }
                                                goto label_41;
                                            }
                                        }
                                    }
                                    goto label_44;
                                }
                            }
                            else {
                                goto label_46;
                            }
                        }
                        else {
                            goto label_51;
                        }
                        goto label_53;
                    }
                    catch(Throwable throwable0) {
                        goto label_49;
                    }
                label_41:
                    cursor0.close();
                    charSequence0 = s2;
                    goto label_53;
                    try {
                    label_44:
                        if(cursor0.moveToNext()) {
                            goto label_27;
                        }
                        goto label_52;
                    label_46:
                        ((ggtj)ahxm.a.j()).x("Date or Address or body column does not exist.");
                        goto label_52;
                    }
                    catch(Throwable throwable0) {
                    label_49:
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
            label_53:
                if(!TextUtils.isEmpty(charSequence0)) {
                    ((ggtj)ahxm.a.h()).x("found an sms code at inbox");
                    Intent intent0 = ahxe.c(s, ((String)charSequence0));
                    ahxm0.e.c(intent0);
                    goto label_61;
                }
                goto label_58;
            }
        label_61:
        }
    }

    public final void c(int v, aiar aiar0) {
        String s6;
        String s5;
        String s4;
        int v5;
        int v4;
        int v3;
        String s2;
        int v2;
        String s;
        long v1 = System.currentTimeMillis();
        aiac aiac0 = this.d;
        ahxj ahxj0 = aiac0.c;
        ahxj0.d(v1);
        if(ahxj0.c.C()) {
            v2 = 0;
        }
        else if(!aiar0.d()) {
            try {
                s = aiar0.b();
            }
            catch(IllegalStateException illegalStateException0) {
                a.ae(ahxj.a.i(), "Can\'t get message body", illegalStateException0);
                v2 = 0;
                goto label_27;
            }
            gged_interceptors gged0 = ahxj0.d.a(s);
            if(gged0.isEmpty()) {
                v2 = 0;
            }
            else {
                String s1 = (String)gggq.o(gged0, null);
                if(TextUtils.isEmpty(s1)) {
                    v2 = 0;
                }
                else {
                    ((ggtj)ahxj.a.h()).x("found an otp code at new incoming messages");
                    ahxj0.c(s1, v1, aiar0.a());
                    v2 = 1;
                }
            }
        }
        else {
            v2 = 0;
        }
    label_27:
        ahxm ahxm0 = aiac0.d;
        ahxm0.b(v1);
        if(ahxm0.c.C()) {
            v3 = 0;
        }
        else if(!aiar0.d()) {
            try {
                s2 = aiar0.b();
            }
            catch(IllegalStateException illegalStateException1) {
                a.ae(ahxm.a.i(), "Can\'t get message body", illegalStateException1);
                v3 = 0;
                goto label_52;
            }
            gged_interceptors gged1 = ahxm0.d.a(s2);
            if(gged1.isEmpty()) {
                v3 = 0;
            }
            else {
                String s3 = (String)gggq.o(gged1, null);
                if(TextUtils.isEmpty(s3)) {
                    v3 = 0;
                }
                else {
                    ((ggtj)ahxm.a.h()).x("found an otp code at new incoming messages");
                    ahxm0.a(s3, v1, aiar0.a());
                    v3 = 1;
                }
            }
        }
        else {
            v3 = 0;
        }
    label_52:
        ahyw ahyw0 = aiac0.a;
        ahyw0.a(v1);
        if(ahyw0.b()) {
            v4 = v2;
            v5 = v3;
            goto label_113;
        }
        else {
            try {
                s4 = aiar0.b();
            }
            catch(IllegalStateException illegalStateException2) {
                v4 = v2;
                v5 = v3;
                ahyw0.a.g("Can\'t get message body", illegalStateException2, new Object[0]);
                goto label_113;
            }
            if(hppt.d()) {
                try {
                    s5 = aiar0.c();
                }
                catch(IllegalStateException illegalStateException3) {
                    ahyw0.a.g("Can\'t get sender address", illegalStateException3, new Object[0]);
                    s5 = null;
                }
            }
            else {
                s5 = null;
            }
            baun baun0 = ahyw0.a;
            baun0.d("received text message", new Object[0]);
            boolean z = false;
            Iterator iterator0 = ahyw0.b.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                aiaq aiaq0 = (aiaq)object0;
                long v6 = aiaq0.b;
                baun0.d("timestamp: %d", new Object[]{((long)aiaq0.b)});
                if(aiaq0.a(s4) == 1) {
                    long v7 = v1 - v6;
                    if(hpph.c()) {
                        if(z) {
                            aicq aicq0 = aicr.i(aiaq0.a, v7);
                            ahyw0.d.a(aicq0);
                        }
                        else {
                            int v8 = aiar0.a();
                            aicq aicq1 = aicr.j(aiaq0.a, v7, v8);
                            ahyw0.d.a(aicq1);
                            ahyw0.d.b(aiaq0.a, s4, v, s5);
                        }
                        iterator0.remove();
                        v2 = v2;
                        v3 = v3;
                        iterator0 = iterator0;
                        z = true;
                        continue;
                    }
                    int v9 = aiar0.a();
                    aicq aicq2 = aicr.j(aiaq0.a, v7, v9);
                    ahyw0.d.a(aicq2);
                    ahyw0.d.b(aiaq0.a, s4, v, s5);
                    iterator0.remove();
                    goto label_137;
                }
                v2 = v2;
                v3 = v3;
                iterator0 = iterator0;
            }
            v4 = v2;
            v5 = v3;
            baun0.h("No matching message is found", new Object[0]);
            if(!hpph.c() || !z) {
            label_113:
                ahxr ahxr0 = aiac0.b;
                ahxr0.e(v1);
                if(ahxr0.f()) {
                label_135:
                    if(v4 == 0 && v5 == 0) {
                        aian.a.h("No matching message is found", new Object[0]);
                    }
                }
                else {
                    try {
                        s6 = aiar0.b();
                    }
                    catch(IllegalStateException illegalStateException4) {
                        ahxr0.a.g("Can\'t get message body", illegalStateException4, new Object[0]);
                        goto label_135;
                    }
                    baun baun1 = ahxr0.a;
                    baun1.d("received text message", new Object[0]);
                    if(ahxr0.b.a(s6).isEmpty()) {
                        goto label_135;
                    }
                    else {
                        baun1.h("Found matched pattern.", new Object[0]);
                        try {
                            String s7 = aiar0.c();
                        }
                        catch(IllegalStateException illegalStateException5) {
                            ahxr0.a.g("Can\'t get sender address", illegalStateException5, new Object[0]);
                            goto label_135;
                        }
                        RequestResult requestResult0 = new RequestResult();
                        requestResult0.a = 1;
                        requestResult0.b = s6;
                        requestResult0.c = v;
                        if(!ahxr0.g(requestResult0, s7, v1, aiar0.a())) {
                            goto label_135;
                        }
                    }
                }
            }
        }
    label_137:
        this.d();
    }

    public final void d() {
        synchronized(aiam.class) {
            if(this.d.a.b() && this.d.b.f() && this.d.c.c.C() && this.d.d.c.C()) {
                Context context0 = (Context)this.c.get();
                if(context0 != null) {
                    BroadcastReceiver broadcastReceiver0 = this.g;
                    if(broadcastReceiver0 != null) {
                        context0.unregisterReceiver(broadcastReceiver0);
                        this.g = null;
                    }
                }
                aial aial0 = this.h;
                if(aial0 != null) {
                    if(aial0.b != null) {
                        aial0.a.getContentResolver().unregisterContentObserver(aial0.b);
                    }
                    this.h = null;
                }
                aiam.b();
            }
        }
    }

    public static boolean e(String s) {
        return hppk.a.c().i() ? true : hppk.a.c().c().b.contains(s);
    }
}

