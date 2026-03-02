import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class azzu {
    public static final int a;
    private static final AtomicBoolean b;

    static {
        azzu.b = new AtomicBoolean();
    }

    public static void a(ApplicationInfo applicationInfo0, boolean z) {
        if(z && !azzu.b.compareAndSet(false, true)) {
            return;
        }
        int v = Process.getThreadPriority(Process.myTid());
        try {
            Process.setThreadPriority(0);
            synchronized(azzu.class) {
                azzu.b(applicationInfo0, z);
                hrmq hrmq0 = hrmq.a;
                int v3 = (int)hrmq0.b().a();
                for(Object object0: hrmq0.b().c().b) {
                    String s = (String)object0;
                    int v4 = azzu.d(new File(applicationInfo0.deviceProtectedDataDir, s), v3);
                    if(v4 > 0) {
                        Log.i("DataDirPermsHelper", a.p(v4, s, "Recursive perm reset: DE/", " "));
                    }
                }
                if(z) {
                    for(Object object1: hrmq0.b().b().b) {
                        String s1 = (String)object1;
                        int v5 = azzu.d(new File(applicationInfo0.dataDir, s1), v3);
                        if(v5 > 0) {
                            Log.i("DataDirPermsHelper", a.p(v5, s1, "Recursive perm reset: CE/", " "));
                        }
                    }
                }
            }
        }
        finally {
            Process.setThreadPriority(v);
        }
    }

    public static void b(ApplicationInfo applicationInfo0, boolean z) {
        wzm.h(new File(applicationInfo0.deviceProtectedDataDir));
        if(z) {
            wzm.h(new File(applicationInfo0.dataDir));
        }
    }

    public static void c(ApplicationInfo applicationInfo0) {
        azzu.a(applicationInfo0, true);
    }

    private static int d(File file0, int v) {
        int v1 = 0;
        if(file0.isDirectory() && !wzm.f(file0)) {
            if(v > 0) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    int v2 = 0;
                    while(v1 < arr_file.length) {
                        File file1 = arr_file[v1];
                        if(file1.isFile()) {
                            wzm.i(file1);
                            ++v2;
                        }
                        else if(file1.isDirectory()) {
                            v2 += azzu.d(file1, v - 1);
                        }
                        ++v1;
                    }
                    v1 = v2;
                }
            }
            wzm.h(file0);
            return v1 + 1;
        }
        return 0;
    }
}

