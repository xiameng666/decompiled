import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class cyrp extends cyqy {
    public final Context a;
    public final Executor b;
    public final AtomicReference d;
    public static final int e;

    static {
        Integer integer0 = (int)0;
        gged_interceptors.o(integer0, integer0, integer0, Integer.valueOf(1));
    }

    public cyrp(Context context0) {
        super(context0, "sass_device_settings.pb", ((MessageLite)cyjs.a));
        this.d = new AtomicReference();
        this.a = context0;
        this.b = new bblp(1, 10);
    }

    public final long a(String s) {
        try {
            return ((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).m;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check getLastOffboardTimestampMillis!");
            return 0L;
        }
    }

    static Uri b(String s) {
        return gxvy.b(("SassDeviceSetting/" + s));
    }

    public final cyjp c(String s) {
        try {
            cyjp cyjp0 = cyjp.b(((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).e);
            return cyjp0 == null ? cyjp.b : cyjp0;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check getDeviceType!");
            return cyjp.b;
        }
    }

    public final cyrc d(String s, Runnable runnable0) {
        cyrc cyrc0 = new cyrc(this.a, s, this, runnable0);
        if(cyrc0.b != null) {
            cyjh.a.g().x("LiveSassDeviceSetting: no need to do init twice");
            return cyrc0;
        }
        cyrc0.b = new cyqz(cyrc0);
        Uri uri0 = cyrp.b(cyrc0.c);
        cyrc0.a.registerContentObserver(uri0, false, cyrc0.b);
        cyrc0.c(false);
        return cyrc0;
    }

    public final gmcd e(String s) {
        cyrh cyrh0 = new cyrh(this, s);
        return this.c.b(cyrh0, this.b);
    }

    public final gmcd f(String s) {
        return glzd.f(this.c.a(), new cyrj(s), this.b);
    }

    public final gmcd g(String s, gfsi gfsi0, boolean z) {
        cyro cyro0 = new cyro(this, s, z, gfsi0);
        gmcd gmcd0 = this.c.b(cyro0, this.b);
        gmcd0.hB(new cyre(this, s), this.b);
        return gmcd0;
    }

    public final gmcd h(String s, boolean z) {
        return this.g(s, new cyri(z), true);
    }

    public static Object i(gmcd gmcd0, Object object0) {
        try {
            return ((glyq)gmcd0).v(hvpg.ak(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to query any settings data!");
            return object0;
        }
    }

    public static Object j(Future future0, String s) {
        try {
            return ((glyq)future0).v(hvpg.ak(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).B("SassDeviceSettingDataStore: Fail to wait future : %s!", s);
            return null;
        }
    }

    public final List k(String s) {
        try {
            return ((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).l;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check getRevertTimestampMillisList!");
            return new ArrayList();
        }
    }

    public final void l(boolean z) {
        AtomicReference atomicReference0 = this.d;
        Boolean boolean0 = (Boolean)atomicReference0.get();
        if(boolean0 == null || boolean0.booleanValue() != z) {
            if(z) {
                cyst.c(this.a);
            }
            else {
                cyst.a(this.a);
            }
        }
        atomicReference0.set(Boolean.valueOf(z));
    }

    public final boolean m(String s) {
        try {
            return ((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).h;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check getEventStreamConnected!");
            return false;
        }
    }

    public final boolean n(String s) {
        try {
            return ((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).k;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check getOnboardNotificationShown!");
            return false;
        }
    }

    public final boolean o() {
        return this.d.get() == null ? ((Boolean)cyrp.i(glzd.f(this.c.a(), new cyrf(this), this.b), Boolean.valueOf(false))).booleanValue() : ((Boolean)this.d.get()).booleanValue();
    }

    public final boolean p(String s) {
        try {
            return ((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).i();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check isDeviceSupportSass!");
            return false;
        }
    }

    public final boolean q(String s) {
        if(!hvpg.bK()) {
            return false;
        }
        try {
            return ((cyjq)((gfsx)((glyq)this.f(s)).v(hvpg.ak(), TimeUnit.MILLISECONDS)).f(cyjq.a)).d;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ((ggtj)cyjh.a.g().s(exception0)).x("SassDeviceSettingDataStore: Fail to check isSassEnabled!");
            return false;
        }
    }
}

