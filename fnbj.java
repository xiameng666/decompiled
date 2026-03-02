import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.FIN;

public class fnbj implements fncc {
    private static final String a = "fnbj";
    private final File b;
    private final File c;

    static {
    }

    public fnbj(File file0, String s) {
        this.b = file0;
        this.c = new File(file0, s);
    }

    @Override  // fncc
    public long a(InputStream inputStream0, long v, long v1) {
        long v5;
        int v3;
        int v2;
        if(!this.b.exists() && !this.b.mkdirs() && !this.b.exists()) {
            throw new fnby(new IOException("Error creating output directory"), 10);
        }
        File file0 = this.c;
        if(v > file0.length()) {
            throw new IOException("Given offsetBytes does not correspond with existing data: " + v + ", " + file0.length());
        }
        idmv idmv0 = Long.compare(v, 0L) <= 0 ? idmf.a(file0) : idmg.a(new FileOutputStream(file0, true));
        idlo idlo0 = idmh.a(idmg.c(inputStream0));
        try {
            v2 = FIN.finallyOpen$NT();
            idlm idlm0 = new idlm();
            while(true) {
                try {
                label_8:
                    if(idlo0.J()) {
                        break;
                    }
                    idlo0.b(idlm0, 0x10000L);
                }
                catch(IOException iOException0) {
                    v3 = 1;
                    throw new fnby(iOException0, (1 == v3 ? 8 : 9));
                }
                long v4 = idlm0.b;
                if(v4 <= 0L) {
                    goto label_8;
                }
                idmv0.oS(idlm0, v4);
            }
            idmv0.flush();
            v5 = file0.length();
            file0.getAbsolutePath();
            goto label_25;
        }
        catch(IOException iOException0) {
            v3 = 0;
        }
        throw new fnby(iOException0, (1 == v3 ? 8 : 9));
        try {
        label_25:
            FIN.finallyCodeBegin$NT(v2);
            idmv0.close();
        }
        catch(IOException iOException1) {
            Log.wtf(fnbj.a, "Error closing download file", iOException1);
        }
        try {
            idlo0.close();
        }
        catch(IOException iOException2) {
            Log.wtf(fnbj.a, "Error closing buffered source", iOException2);
            FIN.finallyCodeEnd$NT(v2);
        }
        return v5;
    }

    @Override  // fncc
    public final long b() {
        return this.c.length();
    }
}

