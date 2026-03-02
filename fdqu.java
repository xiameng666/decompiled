import android.os.ParcelFileDescriptor;
import android.util.Log;
import j..util.Objects;

public final class fdqu extends fdrc {
    final fdrq a;
    final fdiy b;
    final ParcelFileDescriptor c;
    final long d;
    final long e;
    final fdri f;

    public fdqu(fdri fdri0, fdrq fdrq0, fdiy fdiy0, ParcelFileDescriptor parcelFileDescriptor0, long v, long v1) {
        this.a = fdrq0;
        this.b = fdiy0;
        this.c = parcelFileDescriptor0;
        this.d = v;
        this.e = v1;
        Objects.requireNonNull(fdri0);
        this.f = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        try {
            fdrq fdrq0 = this.a;
            fdro fdro0 = (fdro)this.f.d.a(fdrq0);
            this.g = fdro0;
            if(fdro0 != null && !fdro0.p()) {
                if(fdro0.n()) {
                    Log.w("ChannelManager", a.ab(fdrq0, "Error: Channel.sendFile or Channel.getInputStream mayonly be called once per channel: "));
                    fdri.d(this.b, 10);
                    return;
                }
                fdro0.u(this.c, null, this.d, this.e);
                fdri.d(this.b, 0);
                return;
            }
            Log.w("ChannelManager", a.ab(fdrq0, "Called Channel.sendFile on closed channel: "));
            fdri.d(this.b, 13);
        }
        catch(RuntimeException runtimeException0) {
            fdri.d(this.b, 8);
            throw runtimeException0;
        }
    }
}

