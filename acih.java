import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.appsearch.aidl.InvalidateNextPageTokenAidlRequest;

public final class acih implements azys {
    public final acik a;

    public acih(acik acik0) {
        this.a = acik0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        evqp evqp0 = (evqp)object1;
        acjk acjk0 = (acjk)((acjz)object0).H();
        long v = this.a.g;
        long v1 = SystemClock.elapsedRealtime();
        InvalidateNextPageTokenAidlRequest invalidateNextPageTokenAidlRequest0 = new InvalidateNextPageTokenAidlRequest(this.a.b, v, this.a.f, v1, false);
        Parcel parcel0 = acjk0.jo();
        wbz.f(parcel0, invalidateNextPageTokenAidlRequest0);
        acjk0.jp(10, parcel0);
    }
}

