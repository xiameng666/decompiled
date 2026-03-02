import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.SystemClock;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class flvc implements ibjx {
    final gmcu a;
    final UUID b;
    final AccountContext c;
    final flvd d;
    final flfu e;
    final flyz f;
    public ibjp g;

    public flvc(flvd flvd0, gmcu gmcu0, flfu flfu0, flyz flyz0, UUID uUID0, AccountContext accountContext0) {
        this.a = gmcu0;
        this.e = flfu0;
        this.f = flyz0;
        this.b = uUID0;
        this.c = accountContext0;
        Objects.requireNonNull(flvd0);
        this.d = flvd0;
        super();
    }

    @Override  // ibkd
    public final void a() {
        flfv flfv0 = this.e.a;
        flbj.a("MsgReceiver", "BindV2 stream onCompleted for " + ((.AutoValue_ContactId)flfv0.b.c().f()).a);
        flfv0.i();
        flcz.a();
        List list0 = ((ActivityManager)flfv0.c.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(!activityManager$RunningAppProcessInfo0.processName.contains("com.google.android.gms")) {
                    continue;
                }
                else if(activityManager$RunningAppProcessInfo0.importance == 100 || activityManager$RunningAppProcessInfo0.importance == 200) {
                    flfv0.b();
                }
                break;
            }
        }
        flfv0.i.a();
        this.g = null;
    }

    @Override  // ibkd
    public final void b(Throwable throwable0) {
        long v = 0L;
        try {
            gmcu gmcu0 = this.a;
            if(gmcu0.isDone()) {
                v = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((long)(((Long)gmcu0.u()))));
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            flbj.b("Backend", "Unexpected exception", exception0);
        }
        flfv flfv0 = this.e.a;
        flfv0.i();
        iapk iapk0 = iapk.d(throwable0);
        if(iapk0 != null && iaph.b.equals(iapk0.t)) {
            flbj.b("MsgReceiver", "BindV2 stream CANCELLED for " + ((.AutoValue_ContactId)flfv0.b.c().f()).a, throwable0);
        }
        else {
            flbj.d("MsgReceiver", "BindV2 stream error for " + ((.AutoValue_ContactId)flfv0.b.c().f()).a, throwable0);
            fldb fldb0 = flfv0.i;
            gmcg gmcg0 = flfv0.e;
            if(iaea.a.g().m() && flct.a(flfv0.c) && iaph.o.equals(iapk0.t) && fldb0.b > 0) {
                int v1 = fldb0.a.nextInt(flra.c.h);
                int v2 = (fldb0.b == 3 ? ((int)flra.c.f) : ((int)(flra.c.g * ((double)fldb0.c)))) + v1;
                fldb0.c = v2;
                --fldb0.b;
                Objects.requireNonNull(flfv0);
                fldb0.d = flcq.a(v2, ((gful_cronetEngineProvider)new flda(flfv0)), gmcg0);
            }
            else {
                flfv0.g.a(4);
            }
        }
        int v3 = iapk.d(throwable0).t.r;
        flvd flvd0 = this.d;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.f.a.c().f());
        fmai0.o(this.f.a.d().toStringUtf8());
        fmai0.p(this.b.toString());
        fmai0.j(11);
        fmai0.m(Integer.valueOf(v3));
        fmai0.f(5);
        fmai0.e(v);
        fmaj fmaj0 = fmai0.a();
        flvd0.c.b(fmaj0);
        this.g = null;
        if(flvt.b().c(throwable0) == 6) {
            flbj.f("Backend", "Registration was not found for streaming RPC. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
            flvd0.g.e(this.c.c().f());
        }
    }

    @Override  // ibkd
    public final void c(Object object0) {
        String s;
        flkr flkr0;
        flkq flkq0 = new flkq(null);
        int v = ((hnwl)(((MessageLite)object0))).b;
        if(v == 2) {
            hnwb hnwb0 = (hnwb)((hnwl)(((MessageLite)object0))).c;
            flsl flsl0 = flsl.a(this.f.b);
            gfsx gfsx0 = flxc.d(hnwb0, this.f.a, this.f.b, this.f.c, flsl0);
            Objects.requireNonNull(flkq0);
            gfsx0.b(new flyw(flkq0));
            gfsx gfsx1 = flxc.b((((hnwl)(((MessageLite)object0))).b == 2 ? ((hnwb)((hnwl)(((MessageLite)object0))).c) : hnwb.a));
            Objects.requireNonNull(flkq0);
            gfsx1.b(new flyx(flkq0));
        }
        else if(v != 3 && v != 4 && v != 5) {
            flbj.a("ReceiveMessagesHdlr", "non-InboxMessage received" + ((hnwl)(((MessageLite)object0))));
        }
        flkr0 = flkq0.a();
        flfu flfu0 = this.e;
        flbo.b();
        gfsx gfsx2 = flkr0.b;
        long v1 = 0L;
        if(gfsx2.i()) {
            long v2 = iacz.a.c().a();
            if(v2 > 0L) {
                flfv flfv0 = flfu0.a;
                synchronized(flfv0) {
                    Set set0 = flfv0.k;
                    if(set0.isEmpty()) {
                        Objects.requireNonNull(flfv0);
                        flft flft0 = new flft(flfv0);
                        flfv0.p.postDelayed(flft0, v2);
                    }
                    set0.add(gfsx2.d());
                }
            }
            else {
                List list0 = Collections.singletonList(flkr0.b.d());
                flfu0.a.a(list0);
            }
        }
        gfsx gfsx3 = flkr0.a;
        if(gfsx3.i()) {
            flub flub0 = (flub)gfsx3.d();
            flfu0.a.h(flub0);
            List list1 = Arrays.asList(new flub[]{((flub)gfsx3.d())});
            flfu0.a.l(list1);
        }
        flfu0.a.i.a();
        try {
            gmcu gmcu0 = this.a;
            if(gmcu0.isDone()) {
                v1 = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((long)(((Long)gmcu0.u()))));
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            flbj.b("Backend", "Unexpected exception", exception0);
        }
        flyz flyz0 = this.f;
        flvd flvd0 = this.d;
        gfsx gfsx4 = flkr0.a;
        if(gfsx4.i()) {
            switch(((flub)gfsx4.d()).h() - 1) {
                case 0: {
                    s = ((flub)gfsx4.d()).g().a;
                    break;
                }
                case 1: {
                    s = ((flub)gfsx4.d()).b().a;
                    break;
                }
                case 2: {
                    s = ((flub)gfsx4.d()).c().b;
                    break;
                }
                case 3: {
                    s = ((flub)gfsx4.d()).e().a;
                    break;
                }
                case 4: {
                    ConversationId conversationId0 = ((flub)gfsx4.d()).f();
                    if(conversationId0 == null) {
                        flbj.c("ReceiveMessagesHdlr", "Cloud update message without conversationId");
                        return;
                    }
                    s = conversationId0.toString();
                    break;
                }
                default: {
                    flbj.c("ReceiveMessagesHdlr", "Unknown message type");
                    return;
                }
            }
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(flyz0.a.c().f());
            fmai0.o(flyz0.a.d().toStringUtf8());
            fmai0.p(s);
            fmai0.j(11);
            fmai0.f(4);
            fmai0.e(v1);
            fmaj fmaj0 = fmai0.a();
            flvd0.c.b(fmaj0);
        }
    }

    @Override  // ibjx
    public final void d(ibjp ibjp0) {
        Long long0 = SystemClock.elapsedRealtime();
        this.a.q(long0);
        this.g = ibjp0;
        this.e.b = new flvb(this);
    }
}

