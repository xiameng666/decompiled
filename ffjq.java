import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import j..util.Objects;

final class ffjq extends ffee {
    final String c;
    final fdiy d;
    final fflv e;
    final fdir f;

    public ffjq(fflv fflv0, String s, fdiy fdiy0, fdir fdir0) {
        this.c = s;
        this.d = fdiy0;
        this.f = fdir0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getChannelOutputStream");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdrq fdrq0 = fdrq.a(this.e.e, this.c);
            batl.s(this.d);
            batl.s(this.f);
            fdqs fdqs0 = new fdqs(this.e.l, fdrq0, this.d, this.f);
            this.e.l.b(fdqs0);
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to Channel.getOutputStream.", fdrp0);
            GetChannelOutputStreamResponse getChannelOutputStreamResponse0 = new GetChannelOutputStreamResponse(8, null);
            this.d.v(getChannelOutputStreamResponse0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "getChannelOutputStream: exception during processing", runtimeException0);
            GetChannelOutputStreamResponse getChannelOutputStreamResponse1 = new GetChannelOutputStreamResponse(8, null);
            this.d.v(getChannelOutputStreamResponse1);
        }
    }
}

