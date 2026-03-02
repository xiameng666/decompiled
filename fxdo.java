import android.content.Context;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import jeb.synthetic.TWR;

public final class fxdo {
    static void a(Context context0, boolean z) {
        huwd.a.n().aT();
        if(!huwd.t()) {
            return;
        }
        fxdo.d(context0, String.format(Locale.US, "event (%b)", Boolean.valueOf(z)));
    }

    static void b(Context context0, String s, fxgt fxgt0) {
        if(!huwd.t()) {
            return;
        }
        fxgt fxgt1 = fxgt0.a(fxen.a(context0), System.currentTimeMillis());
        fxdo.d(context0, String.format(Locale.US, "%s rep:%d thr:%d dt:%d b:%d db:%d", s, ((int)fxgt1.g), ((int)fxgt1.f), ((long)fxgt1.c), ((int)fxgt1.d), ((int)fxgt1.e)));
    }

    private static String c() {
        return new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date()) + ".txt";
    }

    private static void d(Context context0, String s) {
        PrintWriter printWriter0 = null;
        try {
            File file0 = hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "qaccelmonitor")) : new File(context0.getFilesDir(), "qaccelmonitor");
            if(!file0.isDirectory() && !file0.mkdir()) {
                file0 = null;
            }
            if(file0 != null) {
                File file1 = hrnt.i() ? new File(ccsb.a.b(file0, fxdo.c())) : new File(file0, fxdo.c());
                try {
                    printWriter0 = new PrintWriter(new FileWriter(file1, true));
                }
                catch(IOException unused_ex) {
                }
            }
            if(printWriter0 == null) {
                return;
            }
            printWriter0.printf("%s %s\n", new Object[]{new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS", Locale.getDefault()).format(new Date()), s});
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(printWriter0, throwable0);
            throw throwable0;
        }
        printWriter0.close();
    }
}

