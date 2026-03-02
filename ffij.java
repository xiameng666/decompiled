import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;

final class ffij extends ffee {
    final fdiy c;
    final fflv d;

    public ffij(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getDataItems");
    }

    @Override  // ffee
    public final void a() {
        try {
            DataHolder dataHolder0 = this.d.h.g(this.d.e, null, false);
            try {
                this.c.k(dataHolder0);
            }
            finally {
                ffme.a(dataHolder0, this.c);
            }
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getDataItems: exception during processing", exception0);
            DataHolder dataHolder1 = new DataHolder(DataHolder.a, 8);
            this.c.k(dataHolder1);
        }
    }
}

