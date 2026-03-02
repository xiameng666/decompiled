import android.util.Log;
import j..util.Objects;

public final class fdqq extends fdrc {
    final fdrq a;
    final int b;
    final fdri c;

    public fdqq(fdri fdri0, fdrq fdrq0, int v) {
        this.a = fdrq0;
        this.b = v;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            throw null;
        }
        fdrq fdrq0 = this.a;
        fdro fdro0 = (fdro)this.c.d.a(fdrq0);
        if(fdro0 == null) {
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", "Tried to close channel which is not open: " + fdrq0.toString());
            }
            return;
        }
        try {
            this.g = fdro0;
            fdro0.r(this.b);
        }
        catch(fdrm fdrm0) {
            this.c(fdrm0.a);
        }
    }
}

