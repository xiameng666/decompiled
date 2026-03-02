import android.util.Log;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import j..util.Objects;

final class ffjn extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffjn(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("closeChannel");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdri fdri0 = this.e.l;
            fdrq fdrq0 = fdrq.a(this.e.e, this.c);
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Posting closeChannel(%s)", fdrq0));
            }
            fdri0.b(new fdqp(fdri0, fdrq0));
            CloseChannelResponse closeChannelResponse0 = new CloseChannelResponse(0);
            this.d.i(closeChannelResponse0);
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to close.", fdrp0);
            CloseChannelResponse closeChannelResponse1 = new CloseChannelResponse(8);
            this.d.i(closeChannelResponse1);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "closeChannel: exception during processing", runtimeException0);
            CloseChannelResponse closeChannelResponse2 = new CloseChannelResponse(8);
            this.d.i(closeChannelResponse2);
        }
    }
}

