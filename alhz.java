import android.os.Parcel;
import android.util.MutableBoolean;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class alhz extends wby implements alia {
    final ByteArrayOutputStream a;
    final MutableBoolean b;

    public alhz() {
        super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
    }

    public alhz(ByteArrayOutputStream byteArrayOutputStream0, MutableBoolean mutableBoolean0) {
        this.a = byteArrayOutputStream0;
        this.b = mutableBoolean0;
        super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
    }

    @Override  // alia
    public final void a(Status status0, byte[] arr_b) {
        if(status0.equals(Status.b) && arr_b != null) {
            try {
                this.a.write(arr_b);
                this.b.value = true;
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            alhz.gr(parcel0);
            this.a(status0, arr_b);
            return true;
        }
        return false;
    }
}

