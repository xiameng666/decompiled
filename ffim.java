import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;

final class ffim extends ffee {
    final int c;
    final fdiy d;
    final Uri e;
    final fflv f;

    public ffim(fflv fflv0, String s, int v, fdiy fdiy0, Uri uri0) {
        this.c = v;
        this.d = fdiy0;
        this.e = uri0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        boolean z = true;
        int v = this.c;
        switch(v) {
            case 0: {
                z = false;
                break;
            }
            case 1: {
                break;
            }
            default: {
                Log.w("WearableService", "getDataItemsByUri: invalid filter type: " + v);
                DataHolder dataHolder0 = new DataHolder(DataHolder.a, 13);
                this.d.k(dataHolder0);
                return;
            }
        }
        fduz fduz0 = this.f.h.j(this.f.e, this.e, z);
        fduz0.hB(new ffil(fduz0, this.d, this.e), new gmaq());
    }
}

