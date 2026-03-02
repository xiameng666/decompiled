import j..util.Objects;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class fvry implements Runnable {
    final fvsw a;
    final File b;
    final String c;
    final fvsa d;

    public fvry(fvsa fvsa0, fvsw fvsw0, File file0) {
        this.a = fvsw0;
        this.b = file0;
        this.c = "fsdsc";
        Objects.requireNonNull(fvsa0);
        this.d = fvsa0;
        super();
    }

    @Override
    public final void run() {
        byte[] arr_b;
        fvsa fvsa0 = this.d;
        fvsa0.b = this.a;
        fvsa0.e = huqs.c() ? new File(ccsb.a.b(this.b, this.c)) : new File(this.b, this.c);
        if(!fyba.d(fvsa0.e)) {
            return;
        }
        fvsa0.f = new File[1];
        File[] arr_file = fvsa0.f;
        arr_file[0] = huqs.c() ? new File(ccsb.a.b(fvsa0.e, this.c + ".0")) : new File(fvsa0.e, this.c + ".0");
        File[] arr_file1 = fvsa0.e.listFiles();
        if(arr_file1 == null) {
            fyba.c(fvsa0.e);
            return;
        }
        List list0 = Arrays.asList(fvsa0.f);
        for(int v = 0; v < arr_file1.length; ++v) {
            File file0 = arr_file1[v];
            if(!list0.contains(file0)) {
                fyba.c(file0);
            }
        }
        try {
            if(!fyba.d(fvsa0.e)) {
                throw new IOException("Cache directory cannot be validated.");
            }
            File file1 = fvsa0.f[0];
            if(file1 == null || !file1.exists()) {
                throw new IOException("Cache file does not exist.");
            }
            FileInputStream fileInputStream0 = new FileInputStream(file1);
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0);
            DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
            try {
                arr_b = fvsa0.b.a(dataInputStream0).b;
            }
            catch(IOException iOException0) {
                fyba.c(file1);
                throw iOException0;
            }
            finally {
                fyba.b(fileInputStream0);
                fyba.b(bufferedInputStream0);
                fyba.b(dataInputStream0);
            }
            fvsa fvsa1 = this.d;
            if(fvsa1.i == null) {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gwrm.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(fvsa1.g.e.U()) {
                    fvsa1.g.c.a().execute(new gxhj(fvsa1, ((gwrm)hftv0)));
                }
                else {
                    fvsa1.g.c(((gwrm)hftv0));
                }
            }
        }
        catch(IOException unused_ex) {
            fyba.c(this.d.f[0]);
        }
        this.d.d = 0;
        this.d.c = true;
    }
}

