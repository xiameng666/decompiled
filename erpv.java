import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.DataInputStream;
import java.util.concurrent.Executors;

public final class erpv {
    public static final baun a;
    private final DataInputStream b;
    private final gmcg c;
    private gmcd d;
    private erpu e;

    static {
        erpv.a = new erqc(new String[]{"D2D", "PipeReadManager"});
    }

    public erpv(ParcelFileDescriptor parcelFileDescriptor0) {
        this.b = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0));
        this.c = gmcn.a(Executors.newSingleThreadExecutor());
    }

    public final void a(erpt erpt0) {
        synchronized(this) {
            this.b();
            erpu erpu0 = new erpu(erpt0, this.b);
            this.e = erpu0;
            gmcg gmcg0 = this.c;
            this.d = gmcg0.d(erpu0);
            erps erps0 = new erps(erpt0);
            gmcd gmcd0 = this.d;
            if(gmcd0 != null) {
                gmbu.t(gmcd0, erps0, gmcg0);
            }
        }
    }

    public final void b() {
        synchronized(this) {
            gmcd gmcd0 = this.d;
            if(gmcd0 != null) {
                erpv.a.j("Shutting down reading thread", new Object[0]);
                erpu erpu0 = this.e;
                if(erpu0 != null) {
                    erpu0.a = true;
                }
                gmcd0.cancel(true);
                this.d = null;
            }
        }
    }
}

