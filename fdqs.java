import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import j..util.Objects;
import java.io.IOException;

public final class fdqs extends fdrc {
    final fdrq a;
    final fdiy b;
    final fdri c;
    final fdir d;

    public fdqs(fdri fdri0, fdrq fdrq0, fdiy fdiy0, fdir fdir0) {
        this.a = fdrq0;
        this.b = fdiy0;
        this.d = fdir0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor1;
        fdro fdro0;
        try {
            fdrq fdrq0 = this.a;
            fdro0 = (fdro)this.c.d.a(fdrq0);
            this.g = fdro0;
            if(fdro0 == null || fdro0.p()) {
                Log.w("ChannelManager", a.ab(fdrq0, "Called Channel.getOutputStream on closed channel: "));
                fdri.f(this.b, 13);
                return;
            }
            if(fdro0.n()) {
                Log.w("ChannelManager", a.ab(fdrq0, "Error: Channel.getOutputStream or Channel.receiveFile mayonly be called once per channel: "));
                fdri.f(this.b, 10);
                return;
            }
            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
            parcelFileDescriptor1 = arr_parcelFileDescriptor[1];
            fdro0.u(parcelFileDescriptor0, this.d, 0L, -1L);
        }
        catch(IOException iOException0) {
            goto label_30;
        }
        catch(RuntimeException runtimeException0) {
            fdri.f(this.b, 8);
            throw runtimeException0;
        }
        try {
            try {
                GetChannelOutputStreamResponse getChannelOutputStreamResponse0 = new GetChannelOutputStreamResponse(0, parcelFileDescriptor1);
                this.b.v(getChannelOutputStreamResponse0);
                goto label_27;
            }
            catch(RemoteException unused_ex) {
            }
            Log.w("ChannelManager", "Failed to set SUCCESS on result of Channel.getOutputStream. Closing channel " + this.a.toString());
            try {
                fdro0.g();
            }
            catch(fdrm unused_ex) {
                this.c(fdro0.a);
            }
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
            parcelFileDescriptor1.close();
            return;
        label_25:
            parcelFileDescriptor1.close();
            throw throwable0;
        label_27:
            parcelFileDescriptor1.close();
        }
        catch(IOException iOException0) {
        label_30:
            Log.w("ChannelManager", "Failed to create pipe for channel " + this.a.toString(), iOException0);
            fdri.f(this.b, 8);
        }
        catch(RuntimeException runtimeException0) {
            fdri.f(this.b, 8);
            throw runtimeException0;
        }
    }
}

