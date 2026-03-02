import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;

final class ffik extends ffee {
    final int c;
    final fdiy d;
    final Uri e;
    final fflv f;

    public ffik(fflv fflv0, String s, int v, fdiy fdiy0, Uri uri0) {
        this.c = v;
        this.d = fdiy0;
        this.e = uri0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        try {
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
            DataHolder dataHolder1 = this.f.h.g(this.f.e, this.e, z);
            try {
                this.d.k(dataHolder1);
            }
            finally {
                ffme.a(dataHolder1, this.d);
            }
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getDataItemsByUri: exception during processing: " + this.e, exception0);
            DataHolder dataHolder2 = new DataHolder(DataHolder.a, 8);
            this.d.k(dataHolder2);
        }
    }
}

