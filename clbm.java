import android.util.Log;
import java.io.File;

public abstract class clbm extends clcy {
    private final File a;

    public clbm(File file0) {
        super(((gful_cronetEngineProvider)new clbl(file0)));
        this.a = file0;
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        if(clcq0.a() < 300 && clcq0.a() >= 200) {
            this.j();
            this.h(clcq0);
            return;
        }
        this.c(gfsx.m(clcq0), new clbw(a.aD(((clex)clcq0), "response with error code ")));
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        this.j();
        try {
            File file0 = this.a;
            if(file0.exists()) {
                file0.delete();
            }
        }
        catch(SecurityException securityException0) {
            Log.e("DownloadCallback", "error when trying to clean up the downloaded file", securityException0);
        }
        finally {
            this.g(gfsx0, clbw0);
        }
    }

    public void g(gfsx gfsx0, clbw clbw0) {
    }

    public void h(clcq clcq0) {
    }

    private final void j() {
        bbpb.b(this.i());
    }
}

