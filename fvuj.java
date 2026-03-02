import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public final class fvuj implements Callable {
    public final fvul a;
    public final MessageLite b;

    public fvuj(fvul fvul0, MessageLite hfvm0) {
        this.a = fvul0;
        this.b = hfvm0;
    }

    @Override
    public final Object call() {
        FileOutputStream fileOutputStream0;
        DataOutputStream dataOutputStream1;
        fvul fvul0 = this.a;
        File file0 = fvul0.c();
        byte[] arr_b = fvul0.a.h().b();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MessageLite hfvm0 = this.b;
        DataOutputStream dataOutputStream0 = null;
        try {
            dataOutputStream1 = new DataOutputStream(byteArrayOutputStream0);
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            fvsw.b(arr_b, null).c(dataOutputStream1, hfvm0.toBytesArray());
            goto label_17;
        }
        catch(Throwable throwable0) {
            dataOutputStream0 = dataOutputStream1;
        }
    label_14:
        if(dataOutputStream0 != null) {
            fyba.b(dataOutputStream0);
        }
        throw throwable0;
    label_17:
        fyba.b(dataOutputStream1);
        byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
        try {
            if(!file0.exists()) {
                file0.createNewFile();
            }
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(Throwable throwable1) {
            fyba.b(dataOutputStream0);
            throw throwable1;
        }
        try {
            fileOutputStream0.write(arr_b1);
            fvtq.a(fvul0.a.mH(), fvul0.b, 0, arr_b1.length);
        }
        catch(Throwable throwable1) {
            dataOutputStream0 = fileOutputStream0;
            fyba.b(dataOutputStream0);
            throw throwable1;
        }
        fyba.b(fileOutputStream0);
        return null;
    }
}

