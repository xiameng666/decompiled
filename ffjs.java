import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import j..util.Objects;

final class ffjs extends ffee {
    final String c;
    final ParcelFileDescriptor d;
    final fdiy e;
    final long f;
    final long g;
    final fflv h;

    public ffjs(fflv fflv0, String s, ParcelFileDescriptor parcelFileDescriptor0, fdiy fdiy0, long v, long v1) {
        this.c = s;
        this.d = parcelFileDescriptor0;
        this.e = fdiy0;
        this.f = v;
        this.g = v1;
        Objects.requireNonNull(fflv0);
        this.h = fflv0;
        super("readChannelOutputFromFileDescriptor");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdri fdri0 = this.h.l;
            fdrq fdrq0 = fdrq.a(this.h.e, this.c);
            ParcelFileDescriptor parcelFileDescriptor0 = this.d;
            fdiy fdiy0 = this.e;
            long v1 = this.f;
            long v2 = this.g;
            batl.s(parcelFileDescriptor0);
            batl.s(fdiy0);
            boolean z = true;
            batl.d(Long.compare(v1, 0L) >= 0, "invalid startOffset %s", new Object[]{v1});
            if(v2 < -1L) {
                z = false;
            }
            batl.d(z, "invalid length %s", new Object[]{v2});
            fdri0.b(new fdqu(fdri0, fdrq0, fdiy0, parcelFileDescriptor0, v1, v2));
        }
        catch(fdrp fdrp0) {
            Log.w("WearableService", "Invalid channel token passed to Channel.sendFile.", fdrp0);
            ChannelSendFileResponse channelSendFileResponse0 = new ChannelSendFileResponse(8);
            this.e.h(channelSendFileResponse0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "readChannelOutputFromFileDescriptor: uncaught exception", runtimeException0);
            ChannelSendFileResponse channelSendFileResponse1 = new ChannelSendFileResponse(8);
            this.e.h(channelSendFileResponse1);
        }
        finally {
            fflv.be(this.d);
        }
    }
}

