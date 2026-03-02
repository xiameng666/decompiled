import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.FIN;

public final class fvkf {
    public final String a;
    private long b;
    private DataInputStream c;
    private int d;
    private boolean e;
    private Integer f;
    private final fvsw g;

    public fvkf(String s, fvsw fvsw0) {
        this.b = -1L;
        this.d = 0;
        this.e = false;
        this.a = s;
        this.g = fvsw0;
    }

    public final void a() {
        if(!this.e) {
            DataInputStream dataInputStream0 = this.c;
            if(dataInputStream0 != null) {
                dataInputStream0.close();
                this.e = true;
            }
        }
    }

    public final byte[] b() {
        byte[] arr_b1;
        int v2;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(Long.compare(this.b, -1L) == 0) {
            File file0 = huqs.c() ? new File(ccsb.a.a(this.a)) : new File(this.a);
            if(file0.exists()) {
                this.c = new DataInputStream(new BufferedInputStream(new FileInputStream(file0)));
                this.e = false;
                this.b = file0.length();
                goto label_10;
            }
            throw new FileNotFoundException(String.format("Could not found file %s.", this.a));
        }
    label_10:
        if(this.e) {
            FIN.finallyCodeBegin$NT(v);
            return null;
        }
        try {
            if(this.f == null || ((int)this.f) != 3) {
                Integer integer0 = this.c.readInt();
                this.f = integer0;
                int v1 = this.d + 4;
                this.d = v1;
                if(((long)v1) == this.b || ((int)integer0) < 3) {
                    this.c();
                    FIN.finallyExec$NT(v);
                    return null;
                }
            }
            try {
                fvsv fvsv0 = this.g.a(this.c);
                v2 = fvsv0.a;
                GZIPInputStream gZIPInputStream0 = new GZIPInputStream(new ByteArrayInputStream(fvsv0.b));
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                byte[] arr_b = new byte[0x400];
                int v3;
                while((v3 = gZIPInputStream0.read(arr_b)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v3);
                }
                byteArrayOutputStream0.close();
                gZIPInputStream0.close();
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException1) {
                throw new fvke((iOException1.getMessage() == null ? "" : iOException1.getMessage()));
            }
            int v4 = this.d + v2;
            this.d = v4;
            if(((long)v4) == this.b) {
                this.c();
            }
            FIN.finallyExec$NT(v);
            return arr_b1;
        }
        catch(EOFException unused_ex) {
            this.c();
            throw new fvke("Unexpected end of file " + this.a);
        }
        catch(IOException iOException0) {
            this.c();
            throw iOException0;
        }
    }

    private final void c() {
        try {
            this.a();
        }
        catch(IOException unused_ex) {
        }
    }
}

