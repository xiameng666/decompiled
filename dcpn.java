import android.accounts.Account;
import android.content.Context;
import j..util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

public final class dcpn {
    public cunr a;
    public cunr b;
    public final long c;
    public long d;
    public long e;
    public final dcpo f;
    public String g;
    public gzat h;
    public String i;
    public Account j;
    private static dcpn k;
    private final ScheduledExecutorService l;
    private final Context m;

    public dcpn(Context context0) {
        this.h = gzat.a;
        this.i = null;
        this.c = dcpn.a();
        this.d = dcpn.a();
        this.e = dcpn.a();
        this.l = cuui.f();
        this.f = new dcpo(context0);
        this.m = context0.getApplicationContext();
        this.k(new dcpc(this, context0));
    }

    public static long a() {
        return hvrc.a.b().aG() ? ThreadLocalRandom.current().nextLong(0x7FFFFFFFFFFFFFFFL) + 1L : ((long)(new Random().nextInt(0x7FFFFFFE) + 1));
    }

    public final long b() {
        if(!hvrc.z()) {
            return this.e;
        }
        FutureTask futureTask0 = new FutureTask(new dcpg(this));
        this.k(futureTask0);
        try {
            return (long)(((Long)futureTask0.get()));
        }
        catch(InterruptedException | ExecutionException exception0) {
            Thread.currentThread().interrupt();
            dcvz.a.e().f(exception0).p("Failed to get receiving flow id.", new Object[0]);
            return this.e;
        }
    }

    public final long c() {
        if(!hvrc.z()) {
            return this.d;
        }
        FutureTask futureTask0 = new FutureTask(new dcpf(this));
        this.k(futureTask0);
        try {
            return (long)(((Long)futureTask0.get()));
        }
        catch(InterruptedException | ExecutionException exception0) {
            Thread.currentThread().interrupt();
            dcvz.a.e().f(exception0).p("Failed to get sending flow id.", new Object[0]);
            return this.d;
        }
    }

    public final long d() {
        long v = dcpn.a();
        this.k(new dcpd(this, v));
        return v;
    }

    public final cunr e() {
        if(this.l()) {
            return this.b;
        }
        return this.m() ? this.a : null;
    }

    public static dcpn f(Context context0) {
        synchronized(dcpn.class) {
            if(dcpn.k == null) {
                dcpn.k = new dcpn(context0.getApplicationContext());
            }
        }
        return dcpn.k;
    }

    public final gyqv g(Context context0) {
        if(!hvqz.ab()) {
            return gyqv.a;
        }
        FutureTask futureTask0 = new FutureTask(new dcpe(context0));
        this.k(futureTask0);
        try {
            return (gyqv)futureTask0.get();
        }
        catch(InterruptedException | ExecutionException exception0) {
            Thread.currentThread().interrupt();
            dcvz.a.e().f(exception0).p("Failed to get Metadata from data store.", new Object[0]);
            return gyqv.a;
        }
    }

    public final void h(Context context0, Account account0) {
        this.k(new dcpb(this, account0, context0));
    }

    public final void i(dcox dcox0) {
        switch(dcox0.a() - 1) {
            case 1: {
                this.k(() -> {
                    cunr cunr0 = this.e();
                    int v1 = 1;
                    if(cunr0 == null) {
                        cunf cunf0 = dcvz.a.b();
                        int v2 = gyzw.b(dcox0.a.e);
                        if(v2 != 0) {
                            v1 = v2;
                        }
                        cunf0.h("Failed to log %s, due to clearcutLogger is null.", gyzw.a(v1));
                        return;
                    }
                    if(hvqs.be()) {
                        gysp gysp0 = dcox0.a;
                        int v3 = gyzw.b(gysp0.e) == 0 ? 1 : gyzw.b(gysp0.e);
                        String s = String.format(Locale.US, "Successfully logged %s", gyzw.a(v3));
                        Level level0 = Level.INFO;
                    alab1:
                        switch(v3 - 1) {
                            case 16: {
                                gyrt gyrt0 = gysp0.t == null ? gyrt.a : gysp0.t;
                                gyzg gyzg0 = gyzg.b(gyrt0.e) == null ? gyzg.a : gyzg.b(gyrt0.e);
                                if(gyzg0.ordinal() != 3 && gyzg0.ordinal() != 26 && gyzg0.ordinal() != 28 && gyzg0.ordinal() != 29) {
                                    gyqu gyqu0 = gysp0.W == null ? gyqu.a : gysp0.W;
                                    int v4 = gyzt.b(gyqu0.c) == 0 ? 1 : gyzt.b(gyqu0.c);
                                    s = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                    dcvz.a.b().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                }
                                else {
                                    String s1 = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    level0 = Level.WARNING;
                                    dcvz.a.e().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    s = s1;
                                }
                                break;
                            }
                            case 0x30: {
                                gyqu gyqu1 = gysp0.W == null ? gyqu.a : gysp0.W;
                                int v5 = gyzt.b(gyqu1.c) == 0 ? 1 : gyzt.b(gyqu1.c);
                                s = String.format(Locale.US, "Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                switch(v5 - 1) {
                                    case 2: 
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: 
                                    case 10: {
                                        level0 = Level.WARNING;
                                        dcvz.a.e().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                    default: {
                                        dcvz.a.b().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                dcvz.a.b().h("Successfully logged %s", gyzw.a(v3));
                            }
                        }
                        this.f.a(level0, s);
                    }
                    gysp gysp1 = dcox0.a;
                    int v6 = gyzw.b(gysp1.e);
                    if(v6 != 0) {
                        v1 = v6;
                    }
                    gypl gypl0 = (gypl)cunr0.f(null, ((MessageLite)gysp1)).N_build();
                    if(hvqf.v()) {
                        cczb cczb0 = ((cczf)cunr0.b.a()).l(gypl0);
                        cczb0.c = (int)(v1 - 1);
                        cczb0.e = this.a.d;
                        String s2 = cunr0.e;
                        if(s2 != null) {
                            cczb0.b = s2;
                        }
                        cczb0.a();
                        return;
                    }
                    ayuc ayuc0 = cunr0.a(gypl0);
                    ayuc0.k(v1 - 1);
                    ayuc0.l(this.a.d);
                    ayuc0.d();
                });
                return;
            }
            case 2: {
                this.k(() -> {
                    cunr cunr0 = this.e();
                    int v1 = 1;
                    if(cunr0 == null) {
                        cunf cunf0 = dcvz.a.b();
                        int v2 = gyzw.b(dcox0.a.e);
                        if(v2 != 0) {
                            v1 = v2;
                        }
                        cunf0.h("Failed to log %s, due to clearcutLogger is null.", gyzw.a(v1));
                        return;
                    }
                    if(hvqs.be()) {
                        gysp gysp0 = dcox0.a;
                        int v3 = gyzw.b(gysp0.e) == 0 ? 1 : gyzw.b(gysp0.e);
                        String s = String.format(Locale.US, "Successfully logged %s", gyzw.a(v3));
                        Level level0 = Level.INFO;
                    alab1:
                        switch(v3 - 1) {
                            case 16: {
                                gyrt gyrt0 = gysp0.t == null ? gyrt.a : gysp0.t;
                                gyzg gyzg0 = gyzg.b(gyrt0.e) == null ? gyzg.a : gyzg.b(gyrt0.e);
                                if(gyzg0.ordinal() != 3 && gyzg0.ordinal() != 26 && gyzg0.ordinal() != 28 && gyzg0.ordinal() != 29) {
                                    gyqu gyqu0 = gysp0.W == null ? gyqu.a : gysp0.W;
                                    int v4 = gyzt.b(gyqu0.c) == 0 ? 1 : gyzt.b(gyqu0.c);
                                    s = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                    dcvz.a.b().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                }
                                else {
                                    String s1 = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    level0 = Level.WARNING;
                                    dcvz.a.e().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    s = s1;
                                }
                                break;
                            }
                            case 0x30: {
                                gyqu gyqu1 = gysp0.W == null ? gyqu.a : gysp0.W;
                                int v5 = gyzt.b(gyqu1.c) == 0 ? 1 : gyzt.b(gyqu1.c);
                                s = String.format(Locale.US, "Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                switch(v5 - 1) {
                                    case 2: 
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: 
                                    case 10: {
                                        level0 = Level.WARNING;
                                        dcvz.a.e().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                    default: {
                                        dcvz.a.b().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                dcvz.a.b().h("Successfully logged %s", gyzw.a(v3));
                            }
                        }
                        this.f.a(level0, s);
                    }
                    gysp gysp1 = dcox0.a;
                    int v6 = gyzw.b(gysp1.e);
                    if(v6 != 0) {
                        v1 = v6;
                    }
                    gypl gypl0 = (gypl)cunr0.f(null, ((MessageLite)gysp1)).N_build();
                    if(hvqf.v()) {
                        cczb cczb0 = ((cczf)cunr0.b.a()).l(gypl0);
                        cczb0.c = (int)(v1 - 1);
                        cczb0.e = this.a.e;
                        String s2 = cunr0.e;
                        if(s2 != null) {
                            cczb0.b = s2;
                        }
                        cczb0.a();
                        return;
                    }
                    ayuc ayuc0 = cunr0.a(gypl0);
                    ayuc0.k(v1 - 1);
                    ayuc0.l(this.a.e);
                    ayuc0.d();
                });
                return;
            }
            default: {
                this.k(() -> {
                    cunr cunr0 = this.e();
                    int v1 = 1;
                    if(cunr0 == null) {
                        cunf cunf0 = dcvz.a.b();
                        int v2 = gyzw.b(dcox0.a.e);
                        if(v2 != 0) {
                            v1 = v2;
                        }
                        cunf0.h("Failed to log %s, due to clearcutLogger is null.", gyzw.a(v1));
                        return;
                    }
                    if(hvqs.be()) {
                        gysp gysp0 = dcox0.a;
                        int v3 = gyzw.b(gysp0.e) == 0 ? 1 : gyzw.b(gysp0.e);
                        String s = String.format(Locale.US, "Successfully logged %s", gyzw.a(v3));
                        Level level0 = Level.INFO;
                    alab1:
                        switch(v3 - 1) {
                            case 16: {
                                gyrt gyrt0 = gysp0.t == null ? gyrt.a : gysp0.t;
                                gyzg gyzg0 = gyzg.b(gyrt0.e) == null ? gyzg.a : gyzg.b(gyrt0.e);
                                if(gyzg0.ordinal() != 3 && gyzg0.ordinal() != 26 && gyzg0.ordinal() != 28 && gyzg0.ordinal() != 29) {
                                    gyqu gyqu0 = gysp0.W == null ? gyqu.a : gysp0.W;
                                    int v4 = gyzt.b(gyqu0.c) == 0 ? 1 : gyzt.b(gyqu0.c);
                                    s = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                    dcvz.a.b().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                                }
                                else {
                                    String s1 = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    level0 = Level.WARNING;
                                    dcvz.a.e().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                                    s = s1;
                                }
                                break;
                            }
                            case 0x30: {
                                gyqu gyqu1 = gysp0.W == null ? gyqu.a : gysp0.W;
                                int v5 = gyzt.b(gyqu1.c) == 0 ? 1 : gyzt.b(gyqu1.c);
                                s = String.format(Locale.US, "Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                switch(v5 - 1) {
                                    case 2: 
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: 
                                    case 10: {
                                        level0 = Level.WARNING;
                                        dcvz.a.e().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                    default: {
                                        dcvz.a.b().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                dcvz.a.b().h("Successfully logged %s", gyzw.a(v3));
                            }
                        }
                        this.f.a(level0, s);
                    }
                    gysp gysp1 = dcox0.a;
                    int v6 = gyzw.b(gysp1.e);
                    if(v6 != 0) {
                        v1 = v6;
                    }
                    gypl gypl0 = (gypl)cunr0.f(null, ((MessageLite)gysp1)).N_build();
                    if(hvqf.v()) {
                        cczb cczb0 = ((cczf)cunr0.b.a()).l(gypl0);
                        cczb0.c = (int)(v1 - 1);
                        cczb0.e = this.a.c;
                        String s2 = cunr0.e;
                        if(s2 != null) {
                            cczb0.b = s2;
                        }
                        cczb0.a();
                        return;
                    }
                    ayuc ayuc0 = cunr0.a(gypl0);
                    ayuc0.k(v1 - 1);
                    ayuc0.l(this.a.c);
                    ayuc0.d();
                });
            }
        }
    }

    // Detected as a lambda impl.
    public final void j(dcox dcox0, long v) {
        cunr cunr0 = this.e();
        int v1 = 1;
        if(cunr0 == null) {
            cunf cunf0 = dcvz.a.b();
            int v2 = gyzw.b(dcox0.a.e);
            if(v2 != 0) {
                v1 = v2;
            }
            cunf0.h("Failed to log %s, due to clearcutLogger is null.", gyzw.a(v1));
            return;
        }
        if(hvqs.be()) {
            gysp gysp0 = dcox0.a;
            int v3 = gyzw.b(gysp0.e) == 0 ? 1 : gyzw.b(gysp0.e);
            String s = String.format(Locale.US, "Successfully logged %s", gyzw.a(v3));
            Level level0 = Level.INFO;
        alab1:
            switch(v3 - 1) {
                case 16: {
                    gyrt gyrt0 = gysp0.t == null ? gyrt.a : gysp0.t;
                    gyzg gyzg0 = gyzg.b(gyrt0.e) == null ? gyzg.a : gyzg.b(gyrt0.e);
                    if(gyzg0.ordinal() != 3 && gyzg0.ordinal() != 26 && gyzg0.ordinal() != 28 && gyzg0.ordinal() != 29) {
                        gyqu gyqu0 = gysp0.W == null ? gyqu.a : gysp0.W;
                        int v4 = gyzt.b(gyqu0.c) == 0 ? 1 : gyzt.b(gyqu0.c);
                        s = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                        dcvz.a.b().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzt.a(v4));
                    }
                    else {
                        String s1 = String.format(Locale.US, "Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                        level0 = Level.WARNING;
                        dcvz.a.e().i("Successfully logged %s with result %s", "SEND_ATTACHMENTS_END", gyzg0.name());
                        s = s1;
                    }
                    break;
                }
                case 0x30: {
                    gyqu gyqu1 = gysp0.W == null ? gyqu.a : gysp0.W;
                    int v5 = gyzt.b(gyqu1.c) == 0 ? 1 : gyzt.b(gyqu1.c);
                    s = String.format(Locale.US, "Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                    switch(v5 - 1) {
                        case 2: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: {
                            level0 = Level.WARNING;
                            dcvz.a.e().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                            break alab1;
                        }
                        default: {
                            dcvz.a.b().i("Successfully logged %s with result %s", "ESTABLISH_CONNECTION", gyzt.a(v5));
                            break alab1;
                        }
                    }
                }
                default: {
                    dcvz.a.b().h("Successfully logged %s", gyzw.a(v3));
                }
            }
            this.f.a(level0, s);
        }
        gysp gysp1 = dcox0.a;
        int v6 = gyzw.b(gysp1.e);
        if(v6 != 0) {
            v1 = v6;
        }
        gypl gypl0 = (gypl)cunr0.f(null, ((MessageLite)gysp1)).N_build();
        if(hvqf.v()) {
            cczb cczb0 = ((cczf)cunr0.b.a()).l(gypl0);
            cczb0.c = (int)(v1 - 1);
            cczb0.e = v;
            String s2 = cunr0.e;
            if(s2 != null) {
                cczb0.b = s2;
            }
            cczb0.a();
            return;
        }
        ayuc ayuc0 = cunr0.a(gypl0);
        ayuc0.k(v1 - 1);
        ayuc0.l(v);
        ayuc0.d();
    }

    public final void k(Runnable runnable0) {
        this.l.execute(runnable0);
    }

    public final boolean l() {
        if(this.b != null) {
            Account account0 = this.j;
            if(account0 != null) {
                try {
                    return ((Boolean)((glyq)cjsg.a(this.m, account0)).v(hvog.y(), TimeUnit.SECONDS)).booleanValue();
                }
                catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                    dcvz.a.e().f(exception0).p("Get sWaa consented account error.", new Object[0]);
                }
            }
        }
        return false;
    }

    public final boolean m() {
        try {
            return ((Boolean)((glyq)cjsg.b(this.m)).v(hvog.y(), TimeUnit.SECONDS)).booleanValue();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            dcvz.a.e().f(exception0).p("Get Checkbox consent error.", new Object[0]);
            return false;
        }
    }

    public final void n() {
        this.k(new dcpi(this, dcpn.a()));
    }

    public final void o(int v) {
        this.k(new dcpa(this, v));
    }
}

