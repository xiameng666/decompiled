import j..time.Duration;
import j..time.Instant;

public final class asra {
    public static final bboh a;

    static {
        asra.a = bboh.b("NotificationBackoffChecker", bbcu.dF);
    }

    public static final boolean a(hfwn hfwn0, Instant instant0, long v) {
        ibuq.f(hfwn0, "firstTaskRunTime");
        ibuq.f(instant0, "currentTime");
        if(((ProtoLiteMessage)hfwn0).isInitialized() && !ibuq.m(hfwn0, hfwo.a(((ProtoLiteMessage)hfwn.a).v_newBuilder()).a())) {
            Instant instant1 = hfyo.d(hfwn0).plus(Duration.ofDays(v));
            ibuq.e(instant1, "plus(...)");
            if(instant0.isBefore(instant1)) {
                ((ggtj)asra.a.h()).B("Not showing notification until %s.", instant1);
                return false;
            }
            return true;
        }
        ((ggtj)asra.a.i()).x("firstTaskRunTime not initialized.");
        return false;
    }
}

