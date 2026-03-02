import android.os.ParcelFileDescriptor;
import android.util.Log;
import j..util.Objects;

public final class fdqt extends fdrc {
    final fdrq a;
    final fdiy b;
    final ParcelFileDescriptor c;
    final fdri d;

    public fdqt(fdri fdri0, fdrq fdrq0, fdiy fdiy0, ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = fdrq0;
        this.b = fdiy0;
        this.c = parcelFileDescriptor0;
        Objects.requireNonNull(fdri0);
        this.d = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        try {
            fdrq fdrq0 = this.a;
            fdro fdro0 = (fdro)this.d.d.a(fdrq0);
            this.g = fdro0;
            if(fdro0 != null && !fdro0.o()) {
                if(fdro0.m()) {
                    Log.w("ChannelManager", a.ab(fdrq0, "Error: Channel.receiveFile or Channel.getOutputStream mayonly be called once per channel: "));
                    fdri.g(this.b, 10);
                    return;
                }
                fdro0.t(this.c, null);
                fdri.g(this.b, 0);
                return;
            }
            Log.w("ChannelManager", a.ab(fdrq0, "Called Channel.receiveFile on closed channel: "));
            fdri.g(this.b, 13);
        }
        catch(RuntimeException runtimeException0) {
            fdri.g(this.b, 8);
            throw runtimeException0;
        }
    }
}

