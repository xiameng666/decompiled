import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;

final class fczc implements Runnable {
    final DataHolder a;
    final fczl b;

    public fczc(fczl fczl0, DataHolder dataHolder0) {
        this.a = dataHolder0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        fcet fcet0 = new fcet(this.a);
        try {
            this.b.a.gu(fcet0);
        }
        finally {
            fcet0.iz();
        }
    }
}

