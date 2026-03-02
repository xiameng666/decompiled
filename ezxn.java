import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Locale;
import java.util.regex.Matcher;

public final class ezxn {
    public static final fagm a;
    public static final fage b;
    public final fagt c;
    public final Object d;
    public final Deque e;
    private final Context f;

    static {
        ezxn.a = new fagm();
        ezxn.b = new ezxm();
    }

    public ezxn(Context context0) {
        this.f = context0;
        fagt fagt0 = (fagt)fagt.a.b();
        this.c = fagt0;
        this.d = new Object();
        this.e = new ArrayDeque(((Collection)fagt0.b(ezxn.a)));
    }

    public final void a(int v) {
        gfsx gfsx1;
        boolean z1;
        gfsx gfsx0;
        String s;
        Iterable iterable0;
        synchronized(this.d) {
            this.e.add(Integer.valueOf(v));
            fagh[] arr_fagh = new fagh[1];
            gged_interceptors gged0 = gged_interceptors.i(this.e);
            arr_fagh[0] = new fagh(ezxn.a, gged0);
            this.c.e(arr_fagh);
        }
        switch(v) {
            case 1: {
                ezxl ezxl0 = (ezxl)ezxl.h.b();
                ezxl0.m();
                ezxl0.j.c(new fagn[]{ezxl.c});
                ezxl0.j.c(new fagn[]{ezxl.d});
                ezxu ezxu0 = (ezxu)ezxu.a.b();
                ezxu0.d();
                ezxu0.b();
                ((ezxq)ezxq.a.b()).a();
                ezxs ezxs0 = (ezxs)ezxs.l.b();
                if(!ezxs0.A()) {
                    fagt fagt0 = ezxs0.n;
                    if(!((String)fagt0.b(ezxs.b)).isEmpty()) {
                        ezxs0.w();
                        baun baun0 = ezxs.a;
                        baun0.h("Resume on reboot feature enabled: %s.", new Object[]{Boolean.valueOf(hwbm.d())});
                        if(((int)(((Integer)fagt0.b(ezxs.f)))) == 0) {
                            baun0.h("Detected no update status with pending OTA. Reset.", new Object[0]);
                            ezxs0.n();
                            ezxs0.h(((boolean)(gfta.c(ezwj.r()) ^ 1)));
                        }
                    }
                    if(ezwn.a().booleanValue()) {
                        ezxs0.G(new bvrd(ezxs0.m));
                    }
                }
                if(hvxz.c()) {
                    ((ezxi)ezxi.b.b()).e();
                }
                break;
            }
            case 2: {
                ((ezxq)ezxq.a.b()).a();
                ((ezxs)ezxs.l.b()).i();
                if(hvxz.c()) {
                    ((ezxi)ezxi.b.b()).d();
                }
                ((ezxu)ezxu.a.b()).b();
                break;
            }
            case 5: {
                fagt fagt1 = ((ezxl)ezxl.h.b()).j;
                fagh[] arr_fagh1 = new fagh[1];
                Long long0 = SystemClock.elapsedRealtime();
                arr_fagh1[0] = new fagh(ezxl.c, long0);
                fagt1.e(arr_fagh1);
                break;
            }
            case 6: {
                fagt fagt2 = ((ezxs)ezxs.l.b()).n;
                fagp fagp0 = ezxs.c;
                if(((long)(((Long)fagt2.b(fagp0)))) == -1L) {
                    fagt2.e(new fagh[]{new fagh(fagp0, System.currentTimeMillis())});
                }
                break;
            }
            case 7: {
                ((ezxl)ezxl.h.b()).f();
                break;
            }
            case 10: {
                ((ezxs)ezxs.l.b()).i();
                break;
            }
            case 12: {
                ezxl ezxl1 = (ezxl)ezxl.h.b();
                fagh[] arr_fagh2 = new fagh[1];
                Long long1 = ezxl1.d();
                arr_fagh2[0] = new fagh(ezxl.e, long1);
                ezxl1.j.e(arr_fagh2);
                break;
            }
            case 13: {
                if(hwcb.f()) {
                    ((ezxl)ezxl.h.b()).j.c(new fagn[]{ezxl.d});
                    ((ezxl)ezxl.h.b()).f();
                }
                if(ezyd.c()) {
                    Context context0 = ((ezyd)ezyd.b.b()).c;
                    Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.update.reminder.UpdateReminderDialogIntentOperation", "com.google.android.gms.update.SCREEN_ON");
                    gftb.check(intent0);
                    context0.startService(intent0);
                }
                break;
            }
            case 14: {
                if(hwcb.f()) {
                    fagt fagt3 = ((ezxl)ezxl.h.b()).j;
                    fagh[] arr_fagh3 = new fagh[1];
                    Long long2 = SystemClock.elapsedRealtime();
                    arr_fagh3[0] = new fagh(ezxl.d, long2);
                    fagt3.e(arr_fagh3);
                }
                break;
            }
            case 100: {
                ((ezyg)ezyg.a.b()).a();
                ezxs ezxs1 = (ezxs)ezxs.l.b();
                ezxs1.w();
                try {
                    ezxs1.g(false);
                }
                catch(IOException iOException0) {
                    ezxs.a.g("Unable to handle install tonight.", iOException0, new Object[0]);
                }
                Context context1 = ezxs1.m;
                int v2 = bbmq.a(context1, "com.google.android.gms.update.OtaSuggestionActivity");
                if(hwbv.a.b().b()) {
                    fagt fagt4 = ezxs1.n;
                    fagl fagl0 = ezxs.f;
                    Integer integer0 = (int)0;
                    if(!((Integer)fagt4.b(fagl0)).equals(integer0) && v2 != 1) {
                        bbmq.G(context1, "com.google.android.gms.update.OtaSuggestionActivity", true);
                    }
                    else if(((Integer)fagt4.b(fagl0)).equals(integer0) && v2 == 1) {
                        bbmq.G(context1, "com.google.android.gms.update.OtaSuggestionActivity", false);
                    }
                }
                else if(v2 == 1) {
                    bbmq.G(context1, "com.google.android.gms.update.OtaSuggestionActivity", false);
                }
                ezyd ezyd0 = (ezyd)ezyd.b.b();
                SystemUpdateStatus systemUpdateStatus0 = ezyd0.e.b();
                if(ezyd.c()) {
                    int v3 = ezwx.b(System.currentTimeMillis() - systemUpdateStatus0.n);
                    boolean z = ezwx.d(systemUpdateStatus0);
                    ezyd.a.h("Dialog phase: %d, Actionable status: %s", new Object[]{v3, Boolean.valueOf(z)});
                    if(v3 > 0 && z) {
                        ezyd0.d.r();
                        ((ezxu)ezxu.a.b()).a();
                        break;
                    }
                    goto label_109;
                }
                else {
                label_109:
                    if(ezyd.c()) {
                        baun baun1 = ezxl.a;
                        baun1.h("Requesting stop screen-on listening", new Object[0]);
                        Intent intent1 = ezye.e().putExtra("command", "stop_listener").putExtra("target_action", "android.intent.action.SCREEN_ON").putExtra("request_id", "reminder");
                        if(ezyd0.d.i.startService(intent1) == null) {
                            baun1.m("Failed to reach system update listener service.", new Object[0]);
                        }
                    }
                }
                ((ezxu)ezxu.a.b()).a();
                break;
            }
            case 101: {
                ezxu ezxu1 = (ezxu)ezxu.a.b();
                SystemUpdateStatus systemUpdateStatus1 = ((ezxs)ezxs.l.b()).b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihk.a).v_newBuilder();
                int v4 = systemUpdateStatus1.d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gihk)hftv0).b |= 2;
                ((gihk)hftv0).c = v4;
                int v5 = systemUpdateStatus1.e;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gihk gihk0 = (gihk)hftp0.b_message;
                gihk0.b |= 4;
                gihk0.d = v5;
                gihk gihk1 = (gihk)hftp0.N_build();
                fabj fabj0 = ezxu1.b;
                ProtoLiteBuilder hftp1 = fabj0.g(4);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gigw gigw0 = (gigw)hftp1.b_message;
                gihk1.getClass();
                gigw0.h = gihk1;
                gigw0.b |= 0x20;
                fabj0.f(((gigw)hftp1.N_build()));
                break;
            }
            case 102: {
                ((ezyg)ezyg.a.b()).a();
                break;
            }
            case 0x70: {
                if(hvxz.c()) {
                    ((ezxi)ezxi.b.b()).e();
                }
                else {
                    ((ezxq)ezxq.a.b()).a();
                    ((ezxs)ezxs.l.b()).i();
                }
                break;
            }
            case 0x74: {
                ((ezyg)ezyg.a.b()).b.sendBroadcast(new Intent("com.google.android.gms.update.SYSTEM_UPDATE_DOWNLOAD_STARTED").setPackage("com.google.android.gms"));
            }
        }
        Intent intent2 = IntentOperation.getStartIntent(this.f, "com.google.android.gms.update.execution.InstallationEventIntentOperation", "com.google.android.gms.update.INSTALLATION_EVENT");
        gftb.check(intent2);
        this.f.startService(intent2);
        ezya ezya0 = (ezya)ezya.d.b();
        SystemUpdateStatus systemUpdateStatus2 = ((ezxs)ezxs.l.b()).b();
        fagt fagt5 = ezya0.h;
        fagl fagl1 = ezya.c;
        int v6 = (int)(((Integer)fagt5.b(fagl1)));
        int v7 = systemUpdateStatus2.c;
        if(v6 == v7) {
            iterable0 = (gged_interceptors)fagt5.b(ezya.b);
        }
        else {
            fagt5.c(new fagn[]{fagl1, ezya.b});
            iterable0 = ggna.a;
        }
        long v8 = systemUpdateStatus2.n;
        if(ezwv.a(ezya0.e, v8).a == 0) {
            if(!systemUpdateStatus2.r.a) {
                switch(v7) {
                    case 2: {
                        if(!((Boolean)ezwo.f(hwae.g, Boolean.class)).booleanValue() && !systemUpdateStatus2.B) {
                            v8 = 0x7FFFFFFFFFFFFFFFL;
                        }
                        break;
                    }
                    case 0x206: {
                        v8 += hvzw.a.c().f();
                        break;
                    }
                    case 0x210: {
                        if(!systemUpdateStatus2.z) {
                            if(ezwj.d().booleanValue()) {
                                v8 = ezwc.c() + ((long)(((Long)ezwo.d(hvzy.y, Long.class))));
                            }
                            else {
                                v8 += (long)(((Long)ezwo.d(hvzy.x, Long.class)));
                            }
                        }
                        else if(systemUpdateStatus2.D.a) {
                            v8 += hvyx.a.b().b();
                        }
                        else {
                            v8 = 0x7FFFFFFFFFFFFFFFL;
                        }
                        break;
                    }
                    case 0x510: {
                        v8 += (hwcb.f() && ((long)ezwj.j()) == 4L ? hwcb.a.e().q() : hwac.a.b().a());
                        break;
                    }
                    case 0x107: 
                    case 274: 
                    case 0x307: 
                    case 0x407: 
                    case 1042: 
                    case 0x512: {
                        v8 += hvzw.a.c().e();
                        break;
                    }
                    case 0x613: {
                        if(((Boolean)ezwo.a(hwcl.i, Boolean.class)).booleanValue()) {
                            v8 += (long)(((Long)ezwo.a(hwcl.b, Long.class)));
                        }
                        else {
                            v8 = 0x7FFFFFFFFFFFFFFFL;
                        }
                        break;
                    }
                    case 0x110: 
                    case 0x70B: {
                        if(systemUpdateStatus2.z) {
                            v8 = 0x7FFFFFFFFFFFFFFFL;
                        }
                        else {
                            v8 += (long)(((Long)ezwo.d(hvzy.t, Long.class)));
                        }
                        break;
                    }
                    case 0x80B: {
                        v8 += (long)(((Long)ezwo.d(hvzy.z, Long.class)));
                        break;
                    }
                    case 0x810: {
                        v8 = hvzq.a.c().e() ? v8 + hvzq.a.c().b() : 0x7FFFFFFFFFFFFFFFL;
                        break;
                    }
                    case 275: 
                    case 1040: 
                    case 0x90B: {
                        v8 += (long)(((Long)ezwo.d(hvzy.w, Long.class)));
                        break;
                    }
                    case 1043: 
                    case 0x710: 
                    case 0xB0B: {
                        v8 += (!hwcb.f() || ((long)ezwj.j()) != 4L ? ((long)(((Long)ezwo.d(hvzy.u, Long.class)))) : hwcb.a.e().p());
                        break;
                    }
                    case 0x60B: 
                    case 0xC0B: {
                        v8 += (long)(((Long)ezwo.d(hvzy.v, Long.class)));
                        break;
                    }
                    default: {
                        v8 = 0x7FFFFFFFFFFFFFFFL;
                    }
                }
                if(v8 > System.currentTimeMillis()) {
                    ezya.a.j("The notification shouldn\'t be shown for status 0x%03X at the current moment (%d ms) for update received at %d ms. Earliest show notify time is %d ms.", new Object[]{((int)systemUpdateStatus2.c), System.currentTimeMillis(), ((long)systemUpdateStatus2.n), v8});
                    ezya0.c();
                    if(v8 == 0x7FFFFFFFFFFFFFFFL) {
                        PendingIntent pendingIntent0 = ezye.a(ezya0.e, 1);
                        ezya0.g.a(pendingIntent0);
                        return;
                    }
                    ezya0.d(v8);
                    return;
                }
                long v9 = System.currentTimeMillis();
                switch(v7) {
                    case 2: {
                        s = "0";
                        break;
                    }
                    case 0x206: {
                        s = (String)ezwo.f(hwae.d, String.class);
                        break;
                    }
                    case 0x210: {
                        s = systemUpdateStatus2.D.a && systemUpdateStatus2.z ? hvyx.a.b().c() : ((String)ezwo.f(hwae.f, String.class));
                        break;
                    }
                    case 0x510: {
                        s = hwac.a.b().c();
                        break;
                    }
                    case 0x107: 
                    case 274: 
                    case 0x307: 
                    case 0x407: 
                    case 1042: 
                    case 0x512: {
                        s = hwac.a.b().b();
                        break;
                    }
                    case 0x613: {
                        s = (String)ezwo.a(hwcl.c, String.class);
                        break;
                    }
                    case 0x110: 
                    case 0x70B: {
                        s = (String)ezwo.f(hwae.a, String.class);
                        break;
                    }
                    case 0x80B: {
                        s = (String)ezwo.f(hwae.h, String.class);
                        break;
                    }
                    case 0x810: {
                        s = hvzq.a.c().c();
                        break;
                    }
                    case 275: 
                    case 1040: 
                    case 0x90B: {
                        s = (String)ezwo.f(hwae.e, String.class);
                        break;
                    }
                    case 1043: 
                    case 0x710: 
                    case 0xB0B: {
                        s = (String)ezwo.f(hwae.b, String.class);
                        break;
                    }
                    case 0x60B: 
                    case 0xC0B: {
                        s = (String)ezwo.f(hwae.c, String.class);
                        break;
                    }
                    default: {
                        throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", ((int)systemUpdateStatus2.c)));
                    }
                }
                if(ezwx.b.matcher(s).matches()) {
                    gfsx0 = gfsx.m(Integer.valueOf(0));
                }
                else if(ezwx.c.matcher(s).matches()) {
                    gfsx0 = gfsx.m(Integer.valueOf(1));
                }
                else if(ezwx.d.matcher(s).matches()) {
                    gfsx0 = gfsx.m(Integer.valueOf(2));
                }
                else {
                    gfsx0 = gfqx.a;
                }
                if(!gfsx0.i()) {
                    ezya.a.f("Unrecognized notification strategy: %s.", new Object[]{s});
                    return;
                }
                int v10 = (int)(((Integer)gfsx0.d()));
                if(v10 == 0) {
                    z1 = true;
                }
                else {
                    if(v10 != 1) {
                        v10 = 2;
                    }
                    Matcher matcher0 = ezwx.e.matcher(s);
                    if(matcher0.matches()) {
                        String s1 = matcher0.group(1);
                        if(s1 == null) {
                            gfsx1 = gfqx.a;
                        }
                        else {
                            try {
                                gfsx1 = gfsx.m(Long.valueOf(Long.parseLong(s1)));
                            }
                            catch(NumberFormatException unused_ex) {
                                gfsx1 = gfqx.a;
                            }
                        }
                    }
                    else {
                        gfsx1 = gfqx.a;
                    }
                    if(!gfsx1.i()) {
                        ezya.a.f("Invalid fixed-delay in notification strategy: %s.", new Object[]{s});
                        return;
                    }
                    long v11 = (long)(((Long)gfsx1.d()));
                    long v12 = ((long)(((Long)gggq.q(iterable0, Long.valueOf(0L))))) + v11;
                    if(v12 > v9) {
                        ezya.a.j("The notification shouldn\'t be shown or cancelled right now for status 0x%03X at the current moment (%d ms) for update received at %d. Earliest re-notify time is %d. ", new Object[]{((int)systemUpdateStatus2.c), v9, ((long)systemUpdateStatus2.n), v12});
                        ezya0.d(v12);
                        return;
                    }
                    ezya0.d(((long)(((Long)gfsx1.d()))) + v9);
                    if(v10 == 2) {
                        ezya0.c();
                    }
                    z1 = false;
                }
                int v13 = systemUpdateStatus2.c;
                if(v13 == 0x70B) {
                    if(ezwn.a().booleanValue() && ezwn.b().booleanValue() && !systemUpdateStatus2.K) {
                        return;
                    }
                    v13 = 0x70B;
                }
                Integer integer1 = v13;
                ezya.a.j("Now notifying for status: 0x%03X", new Object[]{integer1});
                fagt fagt6 = ezya0.h;
                fagh[] arr_fagh4 = {new fagh(ezya.c, integer1), null};
                fagq fagq0 = ezya.b;
                ggdy ggdy0 = new ggdy();
                if(((long)((gged_interceptors)iterable0).size()) >= 10L) {
                    iterable0 = gggq.i(iterable0, 1);
                }
                ggdy0.k(iterable0);
                ggdy0.i(Long.valueOf(v9));
                arr_fagh4[1] = new fagh(fagq0, ggdy0.h());
                fagt6.e(arr_fagh4);
                int v14 = avyq.a(ezya0.e, 0x7F080E08);
                evuh evuh0 = evuh.bl;
                ezya0.f.m(v14, evuh0);
                int v15 = avyq.a(ezya0.e, 0x7F080851);  // drawable:ic_space_error
                ezya0.f.m(v15, evuh0);
                Notification notification0 = ezya0.a(systemUpdateStatus2, z1);
                ezyb ezyb0 = ezya0.i;
                String s2 = notification0.getChannelId();
                if(s2 != null) {
                    bayn bayn0 = ezyb0.a;
                    if(bayn0.c(s2) == null) {
                        bayn0.p(new NotificationChannel(s2, "System update", 2));
                    }
                }
                ezyb0.a.y("com.google.android.gms.update.control.NotificationControl", 1, evuh0, notification0);
                return;
            }
            ezya.a.j("The activity is running. No need to show the notification.", new Object[0]);
            ezya0.c();
            return;
        }
        ezya.a.j("OTA is managed by policy. No need to show the notification.", new Object[0]);
        ezya0.c();
    }
}

