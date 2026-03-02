import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory.DetectionResult;
import java.util.ArrayList;

public final class aorj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        FillForm fillForm0 = parcel0.readInt() == 1 ? ((FillForm)parcel0.readTypedObject(FillForm.b)) : null;
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, FillField.a);
        return AbstractDetectionHistory.DetectionResult.b(fillForm0, gged_interceptors.i(arrayList0));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AbstractDetectionHistory.DetectionResult[v];
    }
}

