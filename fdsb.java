import android.util.Log;
import j..util.Objects;
import java.util.List;

public final class fdsb extends fdus {
    public final List a;
    long b;
    final fdsc c;

    public fdsb(fdsc fdsc0, List list0) {
        Objects.requireNonNull(fdsc0);
        this.c = fdsc0;
        super();
        this.a = list0;
    }

    @Override  // fdus
    public final void a(fduq fduq0) {
        if(!this.c.a.g.Z(fduq0, 1, false, "cloud")) {
            this.a.add(fduq0);
        }
        else if(Log.isLoggable("CloudNode", 3)) {
            Log.d("CloudNode", "filtering data item for cloud: " + fduq0.b.c);
        }
        this.b = fduq0.f;
    }
}

