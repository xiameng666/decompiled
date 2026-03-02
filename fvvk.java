import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class fvvk implements Callable {
    public final fvvp a;
    public final Context b;

    public fvvk(fvvp fvvp0, Context context0) {
        this.a = fvvp0;
        this.b = context0;
    }

    @Override
    public final Object call() {
        Object object0;
        FileInputStream fileInputStream1;
        Context context0 = this.b;
        File file0 = fvvp.e(context0, "EARStorage");
        boolean z = file0.exists();
        fvvp fvvp0 = this.a;
        FileInputStream fileInputStream0 = null;
        if(!z) {
            return null;
        }
        try {
            fileInputStream1 = new FileInputStream(file0);
            goto label_11;
        }
        catch(IOException | fvvr exception0) {
            goto label_19;
            try {
            label_11:
                byte[] arr_b = ghjj.g(fileInputStream1);
                byte[] arr_b1 = fvvp0.a.a(arr_b);
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gxel.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                object0 = (gxel)hftv0;
                goto label_28;
            }
            catch(IOException | fvvr exception0) {
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
            fileInputStream0 = fileInputStream1;
            try {
                try {
                label_19:
                    fvvp0.g(context0);
                }
                catch(Exception unused_ex) {
                }
                throw new fvvr(exception0);
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
    label_24:
        fileInputStream0 = fileInputStream1;
    label_25:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_28:
            fileInputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return object0;
    }
}

