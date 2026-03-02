import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.util.concurrent.Executors;

public final class erpy {
    public static final baun a;
    public boolean b;
    private final DataOutput c;
    private final gmcg d;

    static {
        erpy.a = new erqc(new String[]{"D2D", "PipeWriteManager"});
    }

    public erpy(ParcelFileDescriptor parcelFileDescriptor0) {
        this.b = false;
        this.c = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor0));
        this.d = gmcn.a(Executors.newSingleThreadExecutor());
    }

    public final gmcd a(byte[] arr_b) {
        if(this.b) {
            erpx erpx0 = new erpx(this.c, arr_b);
            return this.d.e(erpx0);
        }
        erpw erpw0 = new erpw(this.c, arr_b);
        return this.d.e(erpw0);
    }
}

