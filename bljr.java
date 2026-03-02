import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.fido.credentialstore.PasskeyList;
import java.io.File;
import java.io.FileOutputStream;

public final class bljr implements evpo {
    public final Context a;

    public bljr(Context context0) {
        this.a = context0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        gged_interceptors gged0 = (gged_interceptors)evql0.j();
        boolean[] arr_z = blkq.c(gged0);
        byte[][] arr2_b = new byte[gged0.size()][];
        for(int v = 0; v < gged0.size(); ++v) {
            arr2_b[v] = ((hery)gged0.get(v)).toBytesArray();
        }
        PasskeyList passkeyList0 = new PasskeyList(arr2_b, arr_z);
        Parcel parcel0 = Parcel.obtain();
        passkeyList0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        File file0 = File.createTempFile("LargePayload", "", this.a.getCacheDir());
        Object object0 = ParcelFileDescriptor.open(file0, 0x38000000);
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        fileOutputStream0.write(arr_b);
        fileOutputStream0.close();
        file0.delete();
        parcel0.recycle();
        return object0;
    }
}

