import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.ArrayList;

public final class anhi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        Parcelable.Creator parcelable$Creator0 = FillField.a;
        ArrayList arrayList0 = parcel0.createTypedArrayList(parcelable$Creator0);
        gged_interceptors gged0 = arrayList0 == null ? ggna.a : gged_interceptors.i(arrayList0);
        gfsx gfsx0 = gfqx.a;
        if(parcel0.readInt() == 1) {
            gfsx0 = gfsx.l(((FillField)parcel0.readTypedObject(parcelable$Creator0)));
        }
        amno amno0 = amnr.a(parcel0);
        if(parcel0.readInt() == 1) {
            amno amno1 = amnr.a(parcel0);
            gftb.checkTrue(amno1 instanceof ammw);
            return new FillForm(v, gged0, gfsx0, amno0, gfsx.l(((ammw)amno1)));
        }
        return new FillForm(v, gged0, gfsx0, amno0, gfsx.l(null));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FillForm[v];
    }
}

