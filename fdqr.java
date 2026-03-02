import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import j..util.Objects;
import java.io.IOException;

public final class fdqr extends fdrc {
    final fdrq a;
    final fdiy b;
    final fdri c;
    final fdir d;

    public fdqr(fdri fdri0, fdrq fdrq0, fdiy fdiy0, fdir fdir0) {
        this.a = fdrq0;
        this.b = fdiy0;
        this.d = fdir0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor0;
        fdro fdro0;
        try {
            fdrq fdrq0 = this.a;
            fdro0 = (fdro)this.c.d.a(fdrq0);
            this.g = fdro0;
            if(fdro0 == null || fdro0.o()) {
                Log.w("ChannelManager", a.ab(fdrq0, "Called Channel.getInputStream on closed channel: "));
                fdri.e(this.b, 13);
                return;
            }
            if(fdro0.m()) {
                Log.w("ChannelManager", a.ab(fdrq0, "Error: Channel.getInputStream or Channel.sendFile mayonly be called once per channel: "));
                fdri.e(this.b, 10);
                return;
            }
            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
            fdro0.t(arr_parcelFileDescriptor[1], this.d);
        }
        catch(IOException iOException0) {
            goto label_29;
        }
        catch(RuntimeException runtimeException0) {
            fdri.e(this.b, 8);
            throw runtimeException0;
        }
        try {
            try {
                GetChannelInputStreamResponse getChannelInputStreamResponse0 = new GetChannelInputStreamResponse(0, parcelFileDescriptor0);
                this.b.q(getChannelInputStreamResponse0);
                goto label_26;
            }
            catch(RemoteException unused_ex) {
            }
            Log.w("ChannelManager", "Failed to set SUCCESS on result of Channel.getInputStream. Closing channel " + this.a.toString());
            try {
                fdro0.g();
            }
            catch(fdrm unused_ex) {
                this.c(fdro0.a);
            }
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
        try {
            parcelFileDescriptor0.close();
            return;
        label_24:
            parcelFileDescriptor0.close();
            throw throwable0;
        label_26:
            parcelFileDescriptor0.close();
        }
        catch(IOException iOException0) {
        label_29:
            Log.w("ChannelManager", "Failed to create pipe for channel " + this.a.toString(), iOException0);
            fdri.e(this.b, 8);
        }
        catch(RuntimeException runtimeException0) {
            fdri.e(this.b, 8);
            throw runtimeException0;
        }
    }
}

