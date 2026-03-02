import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class fdwk implements fdwj {
    public final String a;

    public fdwk(String s) {
        this.a = s;
    }

    @Override  // fdwj
    public final fdyj a(ffau ffau0, int v) {
        fdwt fdwt0;
        FileOutputStream fileOutputStream1;
        FileOutputStream fileOutputStream0 = null;
        if(((ffau0.c == null ? ffbx.a : ffau0.c).b & 4) != 0) {
            String s = fdvl.s(ffau0.toBytesArray());
            String s1 = fdvl.s((ffau0.c == null ? ffbx.a : ffau0.c).e.toByteArray());
            File file0 = fdwm.c(this.a, s);
            try {
                fileOutputStream1 = null;
                fileOutputStream1 = new FileOutputStream(file0);
                goto label_10;
            }
            catch(IOException iOException0) {
                goto label_15;
            }
            catch(Throwable throwable0) {
            }
            goto label_22;
            try {
                try {
                label_10:
                    (ffau0.c == null ? ffbx.a : ffau0.c).e.p(fileOutputStream1);
                    fileOutputStream1.close();
                    fdwt0 = new fdwt(s1, file0);
                    goto label_25;
                }
                catch(IOException iOException0) {
                }
            label_15:
                Log.w("wearable", "Error trying to write V0 asset into a file.", iOException0);
                if(fileOutputStream1 != null) {
                    goto label_17;
                }
                fdwt0 = null;
                goto label_26;
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
            try {
            label_17:
                fileOutputStream1.close();
            }
            catch(IOException unused_ex) {
            }
            fdwt0 = null;
            goto label_26;
        label_21:
            fileOutputStream0 = fileOutputStream1;
        label_22:
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
            try {
            label_25:
                fileOutputStream1.close();
            }
            catch(IOException unused_ex) {
            }
        label_26:
            if(fdwt0 == null) {
                Log.w("wearable", "Dropped an incoming message because we failed to convert it to the latest version: " + ffau0.toString());
                return new fdyj(ffau0, null, false, v);
            }
            return new fdyj(ffau0, fdwt0, v);
        }
        return new fdyj(ffau0, null, v);
    }

    @Override  // fdwj
    public final void b() {
    }
}

