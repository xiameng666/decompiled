import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import j..util.Objects;

final class ffjp extends ffee {
    final String c;
    final fdiy d;
    final fflv e;
    final fdir f;

    public ffjp(fflv fflv0, String s, fdiy fdiy0, fdir fdir0) {
        this.c = s;
        this.d = fdiy0;
        this.f = fdir0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getChannelInputStream");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdrq fdrq0 = fdrq.a(this.e.e, this.c);
            batl.s(this.d);
            fdqr fdqr0 = new fdqr(this.e.l, fdrq0, this.d, this.f);
            this.e.l.b(fdqr0);
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to Channel.getInputStream.", fdrp0);
            GetChannelInputStreamResponse getChannelInputStreamResponse0 = new GetChannelInputStreamResponse(8, null);
            this.d.q(getChannelInputStreamResponse0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "getChannelInputStream: exception during processing", runtimeException0);
            GetChannelInputStreamResponse getChannelInputStreamResponse1 = new GetChannelInputStreamResponse(8, null);
            this.d.q(getChannelInputStreamResponse1);
        }
    }
}

