import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class atgc implements atia {
    private final File a;
    private final MessageDigest b;
    private FileOutputStream c;
    private boolean d;
    private byte[] e;

    public atgc(File file0) {
        this.a = file0;
        try {
            this.b = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new aqli("Unable to use SHA-256", noSuchAlgorithmException0);
        }
    }

    @Override  // atia
    public final void a(atjv atjv0) {
        gftb.z(this.c, "Must open before processing chunks");
        this.c.write(atjv0.a, 0, atjv0.b());
        this.b.update(atjv0.a, 0, atjv0.b());
    }

    @Override  // atia
    public final byte[] b() {
        gftb.r(this.d, "Must close before getting digest");
        if(this.e == null) {
            this.e = this.b.digest();
        }
        return this.e;
    }

    @Override  // atia
    public final void c() {
        gftb.r(this.c == null, "Cannot open twice");
        this.c = new FileOutputStream(this.a);
    }

    @Override
    public final void close() {
        gftb.z(this.c, "Must open before close");
        this.c.close();
        this.d = true;
    }
}

