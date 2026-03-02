import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class ejtq extends wbx implements IInterface {
    public ejtq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.reminders.internal.IRemindersCallbacks");
    }

    public final void a(boolean z, Status status0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(5, parcel0);
    }

    public final void b(DataHolder dataHolder0, Status status0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, dataHolder0);
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(1, parcel0);
    }

    public final void c(String s, String s1, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        wbz.f(parcel0, apiMetadata0);
        this.jp(6, parcel0);
    }

    public final void d(Status status0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(2, parcel0);
    }
}

