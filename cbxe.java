import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class cbxe extends wbx implements IInterface {
    public cbxe(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    public final void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(4, parcel0);
    }

    public final void b(Status status0, String s, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeString(s);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }

    public final void c(Status status0, List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeTypedList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(3, parcel0);
    }

    public final void d(Status status0, List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeTypedList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(2, parcel0);
    }
}

