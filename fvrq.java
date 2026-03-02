import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class fvrq implements Runnable {
    public final fvrs a;

    public fvrq(fvrs fvrs0) {
        this.a = fvrs0;
    }

    @Override
    public final void run() {
        byte[] arr_b;
        fvrs fvrs0 = this.a;
        File file0 = fvrs0.a();
        if(fyba.d(file0)) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                fyba.c(file0);
                return;
            }
            List list0 = Arrays.asList(fvrs0.c());
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                File file1 = arr_file[v1];
                if(!list0.contains(file1)) {
                    fyba.c(file1);
                }
            }
            for(int v = 0; v <= 0; ++v) {
                try {
                    if(!fyba.d(fvrs0.a())) {
                        throw new IOException("Cache directory cannot be validated.");
                    }
                    File file2 = fvrs0.c()[v];
                    if(file2 == null || !file2.exists()) {
                        throw new IOException("Cache file does not exist.");
                    }
                    FileInputStream fileInputStream0 = new FileInputStream(file2);
                    BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0);
                    DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
                    try {
                        arr_b = fvrs0.b.a().a(dataInputStream0).b;
                    }
                    catch(IOException iOException0) {
                        fyba.c(file2);
                        throw iOException0;
                    }
                    finally {
                        fyba.b(fileInputStream0);
                        fyba.b(bufferedInputStream0);
                        fyba.b(dataInputStream0);
                    }
                    fvrs0.c.d.mJ().a.execute(new fvrr(fvrs0, arr_b));
                }
                catch(IOException unused_ex) {
                    fvrs0.b(v);
                }
            }
        }
    }
}

