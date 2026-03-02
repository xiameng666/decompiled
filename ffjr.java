import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import j..util.Objects;

final class ffjr extends ffee {
    final String c;
    final ParcelFileDescriptor d;
    final fdiy e;
    final fflv f;

    public ffjr(fflv fflv0, String s, ParcelFileDescriptor parcelFileDescriptor0, fdiy fdiy0) {
        this.c = s;
        this.d = parcelFileDescriptor0;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("writeChannelInputToFileDescriptor");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdrq fdrq0 = fdrq.a(this.f.e, this.c);
            batl.s(this.d);
            batl.s(this.e);
            fdqt fdqt0 = new fdqt(this.f.l, fdrq0, this.e, this.d);
            this.f.l.b(fdqt0);
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to Channel.receiveFile.", fdrp0);
            ChannelReceiveFileResponse channelReceiveFileResponse0 = new ChannelReceiveFileResponse(8);
            this.e.g(channelReceiveFileResponse0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "writeChannelInputToFileDescriptor: uncaught exception", runtimeException0);
            ChannelReceiveFileResponse channelReceiveFileResponse1 = new ChannelReceiveFileResponse(8);
            this.e.g(channelReceiveFileResponse1);
        }
        finally {
            fflv.be(this.d);
        }
    }
}

