import android.util.Log;
import j..util.Objects;
import java.util.Collection;

final class fdqz implements fduj {
    final fdri a;

    public fdqz(fdri fdri0) {
        Objects.requireNonNull(fdri0);
        this.a = fdri0;
        super();
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Received onConnectedNodes");
        }
        fdqy fdqy0 = new fdqy(this);
        this.a.b(fdqy0);
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
    }
}

