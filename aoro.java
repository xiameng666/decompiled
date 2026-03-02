import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory.DetectionResult;
import com.google.android.gms.autofill.service.common.DetectionHistory;
import java.util.ArrayList;

public final class aoro implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, AbstractDetectionHistory.DetectionResult.a);
        return new DetectionHistory(arrayList0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DetectionHistory[v];
    }
}

