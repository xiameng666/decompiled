import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.TWR;

public final class dmkp {
    public final void a(String s, File file0, Context context0, int v, String s1, bboh bboh0) {
        File file1 = dmkp.b(context0);
        dmkp.e(file1);
        dmkp.e(file0.getParentFile());
        File file2 = null;
        try {
            file2 = File.createTempFile(file0.getName(), null, file1);
            FileOutputStream fileOutputStream0 = new FileOutputStream(file2);
            try {
                this.c(s, fileOutputStream0, context0, 60L, v, s1);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(fileOutputStream0, throwable1);
                throw throwable1;
            }
            fileOutputStream0.close();
            if(!file2.renameTo(file0)) {
                goto label_18;
            }
            return;
        }
        catch(Throwable throwable0) {
            if(file2 != null) {
                file2.delete();
            }
            throw throwable0;
        }
    label_18:
        file2.delete();
    }

    public static final File b(Context context0) {
        fpjb.f(context0);
        return hrnt.i() ? new File(ccsb.a.b(context0.getCacheDir(), "android_pay_temp_files")) : new File(context0.getCacheDir(), "android_pay_temp_files");
    }

    public final void c(String s, OutputStream outputStream0, Context context0, long v, int v1, String s1) {
        this.d(s, outputStream0, context0, v, v1, null);
    }

    public final void d(String s, OutputStream outputStream0, Context context0, long v, int v1, String s1) {
        batl.k("Can\'t make network request on main thread.");
        clcj clcj0 = clbv.a(context0).e(clcg.f(s, ckmk.b, clbk.a, clbj.a), new dmko(this, outputStream0), clhl.b.b(clhr.b), -1, v1);
        clcj0.n("GET");
        clcj0.j();
        if(s1 != null) {
            clcj0.h(s1);
        }
        try {
            if(((clcp)clcj0.e().a().get(v, TimeUnit.SECONDS)).a.a() == 200) {
                return;
            }
            throw new IOException();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new IOException(exception0);
        }
    }

    private static final void e(File file0) {
        if(file0 != null && (file0.mkdirs() || file0.isDirectory())) {
            return;
        }
        throw new IOException("Failed to create parent directory");
    }
}

