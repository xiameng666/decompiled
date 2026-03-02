import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class fvuk implements Callable {
    public final fvul a;
    public final Parser b;
    public final MessageLite c;

    public fvuk(fvul fvul0, Parser hfvs0, MessageLite hfvm0) {
        this.a = fvul0;
        this.b = hfvs0;
        this.c = hfvm0;
    }

    @Override
    public final Object call() {
        byte[] arr_b;
        DataInputStream dataInputStream1;
        try {
            Parser hfvs0 = this.b;
            File file0 = this.a.c();
            fvwz fvwz0 = this.a.a.mH();
            int v = (int)file0.length();
            fvtq.a(fvwz0, this.a.b, 1, v);
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            DataInputStream dataInputStream0 = null;
            fvsw fvsw0 = fvsw.b(this.a.a.h().b(), null);
            try {
                dataInputStream1 = new DataInputStream(fileInputStream0);
            }
            catch(Throwable throwable0) {
                fyba.b(dataInputStream0);
                fyba.b(fileInputStream0);
                throw throwable0;
            }
            try {
                arr_b = fvsw0.a(dataInputStream1).b;
            }
            catch(Throwable throwable0) {
                dataInputStream0 = dataInputStream1;
                fyba.b(dataInputStream0);
                fyba.b(fileInputStream0);
                throw throwable0;
            }
            fyba.b(dataInputStream1);
            fyba.b(fileInputStream0);
            if(arr_b != null) {
                return hfvs0.p(arr_b, hftc.a());
            }
            throw new IOException("Could not decrypt");
        }
        catch(IOException unused_ex) {
            return this.c;
        }
    }
}

