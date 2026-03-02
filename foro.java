import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.Trace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public final class foro {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    static {
    }

    public static fors a(Context context0, String s) {
        fors fors0;
        try {
            Trace.beginSection(s);
            Object object0 = context0.getSystemService("activity");
            gftb.check(object0);
            List list0 = ((ActivityManager)object0).getRunningAppProcesses();
            fors0 = list0 == null ? new fors(false, ggna.a) : new fors(true, gged_interceptors.i(list0));
        }
        finally {
            Trace.endSection();
        }
        return fors0;
    }

    public static String b() {
        BufferedReader bufferedReader0;
        if(foro.c == null) {
            int v = Process.myPid();
            String s = null;
            if(v > 0) {
                try {
                    s = null;
                    bufferedReader0 = null;
                    bufferedReader0 = new BufferedReader(new FileReader(a.f(v, "/proc/", "/cmdline")));
                    goto label_10;
                }
                catch(IOException unused_ex) {
                    goto label_14;
                }
                catch(Throwable throwable0) {
                }
                goto label_19;
                try {
                label_10:
                    String s1 = bufferedReader0.readLine();
                    gftb.check(s1);
                    s = s1.trim();
                    goto label_22;
                }
                catch(IOException unused_ex) {
                label_14:
                    if(bufferedReader0 != null) {
                        try {
                            bufferedReader0.close();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                    goto label_23;
                }
                catch(Throwable throwable0) {
                    s = bufferedReader0;
                }
            label_19:
                if(s != null) {
                    try {
                        ((BufferedReader)s).close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw throwable0;
                try {
                label_22:
                    bufferedReader0.close();
                }
                catch(IOException unused_ex) {
                }
            }
        label_23:
            if(s != null) {
                foro.c = s;
            }
        }
        return foro.c;
    }

    public static String c(String s, String s1) {
        if(s1 != null && s != null && s1.startsWith(s)) {
            int v = s.length();
            return s1.length() == v ? null : s1.substring(v + 1);
        }
        return s1;
    }

    public static boolean d(Context context0) {
        Object object0 = context0.getSystemService("power");
        gftb.check(object0);
        return ((PowerManager)object0).isInteractive();
    }

    public static boolean e(Context context0, fors fors0) {
        if(!fors0.a) {
            return false;
        }
        for(Object object0: fors0.a()) {
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
            if(activityManager$RunningAppProcessInfo0.importance == 100 && (activityManager$RunningAppProcessInfo0.processName.equals("com.google.android.gms") || activityManager$RunningAppProcessInfo0.processName.startsWith("com.google.android.gms:"))) {
                return true;
            }
        }
        return false;
    }
}

