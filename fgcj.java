import android.util.Log;

final class fgcj {
    public static void a(RuntimeException runtimeException0, fgcq fgcq0, String s) {
        if(fgcq0.a != abyg.b && fgcq0.a != abyg.c) {
            throw runtimeException0;
        }
        try {
            Log.e("ExceptionUtil", "RuntimeException while safely performing function: " + s, runtimeException0);
        }
        catch(RuntimeException unused_ex) {
        }
    }
}

