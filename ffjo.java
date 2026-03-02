import android.util.Log;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import j..util.Objects;

final class ffjo extends ffee {
    final String c;
    final int d;
    final fdiy e;
    final fflv f;

    public ffjo(fflv fflv0, String s, int v, fdiy fdiy0) {
        this.c = s;
        this.d = v;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("closeChannelWithError");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdri fdri0 = this.f.l;
            fdrq fdrq0 = fdrq.a(this.f.e, this.c);
            int v = this.d;
            if(Log.isLoggable("ChannelManager", 2)) {
                throw null;
            }
            fdri0.b(new fdqq(fdri0, fdrq0, v));
            CloseChannelResponse closeChannelResponse0 = new CloseChannelResponse(0);
            this.e.j(closeChannelResponse0);
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to closeWithError.", fdrp0);
            CloseChannelResponse closeChannelResponse1 = new CloseChannelResponse(8);
            this.e.j(closeChannelResponse1);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "closeChannelWithError: exception during processing", runtimeException0);
            CloseChannelResponse closeChannelResponse2 = new CloseChannelResponse(8);
            this.e.j(closeChannelResponse2);
        }
    }
}

