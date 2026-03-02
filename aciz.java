import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.aidl.AppSearchBatchResultParcel;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import j..util.Objects;
import java.util.Arrays;

public final class aciz extends acja {
    @Override  // acja
    public final AppSearchBatchResultParcel a(Parcel parcel0) {
        AppSearchBatchResultParcel appSearchBatchResultParcel0;
        byte[] arr_b = (byte[])Objects.requireNonNull(achx.b(parcel0));
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel1.unmarshall(arr_b, 0, arr_b.length);
            parcel1.setDataPosition(0);
            int v1 = parcel1.dataSize();
            Bundle bundle0 = new Bundle();
            while(parcel1.dataPosition() < v1) {
                String s = (String)Objects.requireNonNull(parcel1.readString());
                bauc.i(Arrays.asList(new Parcelable[]{((acjc)AppSearchResultParcel.a).a(parcel1)}), bundle0, s);
            }
            appSearchBatchResultParcel0 = new AppSearchBatchResultParcel(bundle0);
        }
        finally {
            parcel1.recycle();
        }
        return appSearchBatchResultParcel0;
    }

    @Override  // acja
    public final Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }
}

