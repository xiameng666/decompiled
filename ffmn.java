import android.os.Build;
import android.util.Log;

public final class ffmn {
    public static void a(String s, String s1, Object[] arr_object) {
        if(Build.TYPE.equals("user") && !Log.isLoggable(s, 3)) {
            return;
        }
        Log.d(s, String.format(s1, arr_object));
    }

    public static void b(String s, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 6)) {
            Log.e(s, String.format(s1, arr_object));
        }
    }

    public static void c(String s, Throwable throwable0, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 6)) {
            Log.e(s, String.format(s1, arr_object), throwable0);
        }
    }

    public static void d(String s, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 4)) {
            Log.i(s, String.format(s1, arr_object));
        }
    }

    public static void e(String s, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 2)) {
            Log.v(s, String.format(s1, arr_object));
        }
    }

    public static void f(String s, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 5)) {
            Log.w(s, String.format(s1, arr_object));
        }
    }

    public static void g(String s, Throwable throwable0, String s1, Object[] arr_object) {
        if(Log.isLoggable(s, 5)) {
            Log.w(s, String.format(s1, arr_object), throwable0);
        }
    }
}

