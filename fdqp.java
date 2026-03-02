import android.util.Log;
import j..util.Objects;

public final class fdqp extends fdrc {
    final fdrq a;
    final fdri b;

    public fdqp(fdri fdri0, fdrq fdrq0) {
        this.a = fdrq0;
        Objects.requireNonNull(fdri0);
        this.b = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running closeChannel(%s)", this.a));
        }
        fdrq fdrq0 = this.a;
        fdro fdro0 = (fdro)this.b.d.a(fdrq0);
        if(fdro0 == null) {
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", "Tried to close channel which is not open: " + fdrq0.toString());
            }
            return;
        }
        try {
            this.g = fdro0;
            fdro0.r(0);
        }
        catch(fdrm fdrm0) {
            this.c(fdrm0.a);
        }
    }
}

