import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.bluetooth.fastpair.InputDevice;
import j..util.DesugarArrays;
import java.util.ArrayList;

public final class fgob implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = parcel0.readString();
        ArrayList arrayList0 = new ArrayList();
        parcel0.readList(arrayList0, Integer.TYPE.getClassLoader());
        int v = parcel0.readInt();
        int v1 = parcel0.readByte();
        Uri uri0 = (Uri)parcel0.readParcelable(Uri.class.getClassLoader());
        long v2 = parcel0.readLong();
        String s1 = parcel0.readString();
        long v3 = parcel0.readLong();
        higy higy0 = higy.b(parcel0.readInt());
        gged_interceptors gged0 = ggna.a;
        int[] arr_v = parcel0.createIntArray();
        if(arr_v != null) {
            gged0 = (gged_interceptors)DesugarArrays.stream(arr_v).mapToObj(new fgoa()).collect(ggaf.a);
        }
        fgoc fgoc0 = InputDevice.n();
        fgoc0.j(gfta.b(s));
        fgoc0.h(gged_interceptors.i(arrayList0));
        fgoc0.b(v);
        fgoc0.c(v1 != 0);
        fgoc0.a = uri0;
        fgoc0.g(v2);
        fgoc0.i(gfta.b(s1));
        fgoc0.f(v3);
        if(higy0 == null) {
            higy0 = higy.a;
        }
        fgoc0.d(higy0);
        fgoc0.e(gged0);
        return fgoc0.a();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InputDevice[v];
    }
}

