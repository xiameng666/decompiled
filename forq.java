import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import dagger.Reusable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

@Reusable
public final class forq {
    public final foqp a;
    private final Context b;

    public forq(foqp foqp0, Context context0) {
        this.a = foqp0;
        this.b = context0;
    }

    public final idbq a() {
        fors fors0 = foro.a(this.b, "getAndroidProcessStats");
        forp forp0 = new forp(fors0);
        return forq.b(this.a.a(((gful_cronetEngineProvider)forp0)), fors0);
    }

    public static final idbq b(boolean z, fors fors0) {
        gfsx gfsx0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)idbq.a).v_newBuilder();
        long v = Process.getElapsedCpuTime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((idbq)hftv0).b |= 1;
        ((idbq)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        idbq idbq0 = (idbq)hftp0.b_message;
        idbq0.b |= 2;
        idbq0.d = z;
        int v1 = Thread.activeCount();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        idbq idbq1 = (idbq)hftp0.b_message;
        idbq1.b |= 4;
        idbq1.e = v1;
        int v2 = Process.myPid();
        String s = String.format(Locale.US, "/proc/%d/oom_score_adj", v2);
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(s, "r")) {
            gfsx0 = gfsx.l(randomAccessFile0.readLine()).b(new foyw());
        }
        catch(IOException unused_ex) {
            gfsx0 = gfqx.a;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        if(gfsx0.i()) {
            int v4 = (int)(((Integer)gfsx0.d()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            idbq idbq2 = (idbq)hftp0.b_message;
            idbq2.b |= 16;
            idbq2.g = v4;
        }
        gfsx gfsx1 = fors0.a ? ((gfsx)gggq.c(fors0.a(), new form(v2)).b(new forn()).f(gfqx.a)) : gfqx.a;
        if(gfsx1.i()) {
            String s1 = ((ComponentName)gfsx1.d()).flattenToString();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            idbq idbq3 = (idbq)hftp0.b_message;
            s1.getClass();
            idbq3.b |= 0x20;
            idbq3.h = s1;
        }
        return (idbq)hftp0.N_build();
    }
}

