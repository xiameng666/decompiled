import android.util.Log;
import j..util.Objects;
import java.io.IOException;

public final class fdqx extends fdrc {
    final fdri a;

    public fdqx(fdri fdri0) {
        Objects.requireNonNull(fdri0);
        this.a = fdri0;
        super(fdri0, false);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running cleanup.");
        }
        this.b();
        try {
            this.a.b.close();
        }
        catch(IOException iOException0) {
            Log.w("ChannelManager", "Failed to close selector", iOException0);
        }
    }
}

