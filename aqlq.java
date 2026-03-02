import android.content.Context;

public final class aqlq {
    public final aqlk a;
    public final aqly b;

    public aqlq(Context context0, aqlk aqlk0) {
        this.b = aqlq.a(context0);
        this.a = aqlk0;
    }

    public static aqly a(Context context0) {
        aqly aqly0 = new aqly(context0);
        aqly0.setWriteAheadLoggingEnabled(true);
        return aqly0;
    }

    public static void b(String s) {
        batl.c(((boolean)(s.isEmpty() ^ 1)), "applicationName must not be empty string.");
        batl.c(((boolean)(s.contains("/") ^ 1)), "applicationName must not contain slash.");
    }
}

