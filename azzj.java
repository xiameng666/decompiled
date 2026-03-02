import android.content.ContentResolver;
import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.util.Map;

abstract class azzj implements fftv {
    protected final Context a;
    protected final boolean b;
    protected volatile boolean c;

    public azzj(Context context0, boolean z, boolean z1) {
        this.a = context0;
        this.b = z;
        this.c = z1;
    }

    protected abstract String a(String arg1);

    @Override  // fftv
    public final String b(ContentResolver contentResolver0, String s) {
        String s1;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
        try {
            if(this.c) {
                if(!fhcd.h(this.a)) {
                    throw new fftw("DirectBoot");
                }
                this.e();
                return this.a(s);
            }
            s1 = this.a(s);
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        return s1;
    }

    protected abstract Map c(String[] arg1, fftu arg2);

    @Override  // fftv
    public final Map d(ContentResolver contentResolver0, String[] arr_s, fftu fftu0) {
        Map map0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
        try {
            if(this.c) {
                if(!fhcd.h(this.a)) {
                    throw new fftw("DirectBoot");
                }
                this.e();
                return this.c(arr_s, fftu0);
            }
            map0 = this.c(arr_s, fftu0);
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        return map0;
    }

    protected void e() {
        this.c = false;
    }

    @Override  // fftv
    public final boolean f() {
        return this.b;
    }
}

