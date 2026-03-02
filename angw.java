import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import j..util.DesugarArrays;
import j..util.stream.Collectors;
import java.util.Collection;

public final class angw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        angx angx0 = new angx();
        angx0.a = (AutofillId)parcel0.readTypedObject(AutofillId.CREATOR);
        angx0.b = parcel0.readInt();
        angx0.c(parcel0.createStringArray());
        angx0.f(((Collection)DesugarArrays.stream(parcel0.createIntArray()).mapToObj(new angv()).collect(Collectors.toList())));
        angx0.c = parcel0.readInt();
        angx0.g(aols.b(parcel0.readInt()));
        angx0.h(FillField.n(parcel0));
        angx0.d = parcel0.readInt();
        angx0.e = parcel0.readInt();
        angx0.f = parcel0.readString();
        if(hqec.e()) {
            angx0.d(((Collection)DesugarArrays.stream(parcel0.createIntArray()).mapToObj(new angv()).collect(Collectors.toList())));
        }
        angx0.g = parcel0.readInt() == 1;
        return angx0.a();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FillField[v];
    }
}

