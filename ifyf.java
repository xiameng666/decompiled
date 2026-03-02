import android.content.Context;
import android.util.Log;

public final class ifyf {
    private static final String a = "ifyf";
    private static ifye b;

    static {
    }

    public static ifye a(Context context0, ifyb ifyb0) {
        boolean z = true;
        synchronized(ifyf.class) {
            if(ifyf.b == null) {
                if(ifyb0 != ifyb.e && ifyb0 != ifyb.c) {
                    z = false;
                }
                if(ifyg.a(context0).getBoolean("android.net.http.EnableTelemetry", z)) {
                    try {
                        ifyf.b = new igau();
                    }
                    catch(Exception exception0) {
                        Log.e(ifyf.a, "Exception creating an instance of CronetLoggerImpl", exception0);
                    }
                }
            }
            if(ifyf.b == null) {
                ifyf.b = new igai();
            }
        }
        return ifyf.b;
    }
}

