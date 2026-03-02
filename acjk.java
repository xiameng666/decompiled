import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appsearch.aidl.GetSchemaAidlRequest;
import com.google.android.gms.appsearch.aidl.SetSchemaAidlRequest;

public final class acjk extends wbx implements IInterface {
    public acjk(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.appsearch.aidl.IAppSearchManager");
    }

    public final void a(GetSchemaAidlRequest getSchemaAidlRequest0, acjm acjm0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, getSchemaAidlRequest0);
        wbz.h(parcel0, acjm0);
        this.jp(3, parcel0);
    }

    public final void b(SetSchemaAidlRequest setSchemaAidlRequest0, acjm acjm0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, setSchemaAidlRequest0);
        wbz.h(parcel0, acjm0);
        this.jp(2, parcel0);
    }
}

