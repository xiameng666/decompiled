import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

public final class cqix {
    public static final bboh a;
    public static final Executor b;
    public static final yzx c;
    public static final yzx d;
    public static final yzx e;
    public static final yzx f;
    public static final yzx g;
    public static final cqiv h;
    public static final cqit i;
    public static final cqit j;
    public static final yzx k;
    public static final yzx l;
    public static final yzx m;
    public static final yzx n;
    public static final cqit o;
    public static final cqiw p;
    public static final yzx q;
    public static final yzx r;
    public static final yzx s;
    public static final yzx t;
    public static final yzx u;
    public static final yzx v;
    static final yzy w;

    static {
        cqix.a = bboh.a("MdmPreferences");
        cqix.b = new bblp(0x7FFFFFFF, 10);
        yzy yzy0 = new yzy(null);
        cqix.w = yzy0;
        Long long0 = (long)0L;
        cqix.c = new yzt(yzy0, yzy0, "sitrepTimestampMillis", long0);
        Integer integer0 = (int)0;
        cqix.d = new yzw(yzy0, yzy0, "sitrepGmsCoreVersion", integer0);
        cqix.e = new yzu(yzy0, yzy0, "sitrepGcmRegistrationId", null);
        cqix.f = new yzv(yzy0, yzy0, "sitrepIsDeviceAdmin", null);
        cqix.g = new yzv(yzy0, yzy0, "sitrepLockscreenEnabled", null);
        cqix.h = new cqiv(new yzv(yzy0, yzy0, "locationEnabled", Boolean.valueOf(hxvi.a.e().B())));
        cqix.i = cqit.c(yzy0, "lockMessage");
        cqix.j = cqit.c(yzy0, "lockPhoneNumber");
        cqix.k = new yzw(yzy0, yzy0, "lastSitrepReason", integer0);
        cqix.l = new yzt(yzy0, yzy0, "sitrepRetryEpochTimeMs", long0);
        cqix.m = new yzw(yzy0, yzy0, "sitrepFailureCount", integer0);
        cqix.n = new yzw(yzy0, yzy0, "oneTimeInitializedCount", integer0);
        cqix.o = cqit.c(yzy0, "echoServerTokenLock");
        cqix.p = new cqiw(new yzv(yzy0, yzy0, "qrlEnabled", null));
        Boolean boolean0 = Boolean.valueOf(false);
        cqix.q = new yzv(yzy0, yzy0, "lockScreenReceiverEnabled", boolean0);
        cqix.r = new yzv(yzy0, yzy0, "enableNfcOnUnlock", boolean0);
        cqix.s = new yzv(yzy0, yzy0, "disableSecureNfcOnUnlock", boolean0);
        cqix.t = new yzu(yzy0, yzy0, "qrlCallsMillis", "");
        cqix.u = new yzv(yzy0, yzy0, "lockScreenReceiverQrlEnabled", boolean0);
        cqix.v = new yzv(yzy0, yzy0, "qrlMissingSecurityQuestionDismissed", boolean0);
    }

    public static SharedPreferences a(Context context0) {
        return context0.createDeviceProtectedStorageContext().getSharedPreferences("fmd", 0);
    }

    public static gged_interceptors b() {
        return (gged_interceptors)gfud.e(',').k(((CharSequence)cqix.t.c())).flatMap(new cqir()).map(new cqis()).collect(ggaf.a);
    }
}

