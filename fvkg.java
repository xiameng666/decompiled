import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public final class fvkg {
    private final fvsw a;
    private final String b;
    private int c;
    private int d;
    private String e;

    public fvkg(String s, fvsw fvsw0) {
        this.c = 0;
        this.b = s;
        this.a = fvsw0;
        this.d = -1;
    }

    public final fvnp a(int v, byte[] arr_b) {
        fvnp fvnp2;
        fvnp fvnp1;
        fvnp fvnp0;
        DataOutputStream dataOutputStream0;
        String s2;
        File file0;
        boolean z;
        int v1;
        synchronized(this) {
            if(this.e == null) {
                if(v == 0) {
                    v1 = this.d + 1;
                    v = 0;
                }
                else {
                    v1 = v;
                }
                this.d = v;
                String s = "0000" + v1;
                this.e = s;
                this.e = s.substring(s.length() - 5);
                z = true;
            }
            else {
                z = false;
            }
            if(huqs.c()) {
                ccsg ccsg0 = ccsb.a;
                String s1 = this.e;
                gftb.check(s1);
                file0 = new File(ccsg0.d(this.b, s1));
            }
            else {
                file0 = new File(this.b, this.e);
            }
            s2 = file0.getAbsolutePath();
            dataOutputStream0 = null;
        }
        try {
            try {
                dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file0, true)));
                if(z) {
                    dataOutputStream0.writeInt(3);
                }
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
                gZIPOutputStream0.write(arr_b);
                gZIPOutputStream0.close();
                byteArrayOutputStream0.close();
                byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                this.a.c(dataOutputStream0, arr_b1);
                file0.getAbsoluteFile();
                int v2 = this.c + 1;
                this.c = v2;
                if(v2 >= 50) {
                    this.b();
                }
                fvnp0 = new fvnp(true, s2, "");
                goto label_52;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException unused_ex) {
                goto label_44;
            }
            fvnp1 = new fvnp(false, s2, "File not found.");
        }
        catch(Throwable throwable1) {
            fyba.b(dataOutputStream0);
            throw throwable1;
        }
        fyba.b(dataOutputStream0);
        return fvnp1;
        try {
        label_44:
            this.b();
            fvnp2 = new fvnp(false, s2, "Failed to write data to file");
        }
        catch(Throwable throwable1) {
            fyba.b(dataOutputStream0);
            throw throwable1;
        }
        fyba.b(dataOutputStream0);
        return fvnp2;
    label_52:
        fyba.b(dataOutputStream0);
        return fvnp0;
    }

    private final void b() {
        this.c = 0;
        this.e = null;
    }
}

