import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

public final class crig extends wbx implements crii {
    public crig(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override  // crii
    public final ConsentParcel a(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        Parcel parcel1 = this.hM(21, parcel0);
        ConsentParcel consentParcel0 = (ConsentParcel)wbz.a(parcel1, ConsentParcel.CREATOR);
        parcel1.recycle();
        return consentParcel0;
    }

    @Override  // crii
    public final String b(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        Parcel parcel1 = this.hM(11, parcel0);
        String s = parcel1.readString();
        parcel1.recycle();
        return s;
    }

    @Override  // crii
    public final List c(String s, String s1, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        wbz.f(parcel0, appMetadata0);
        Parcel parcel1 = this.hM(16, parcel0);
        List list0 = parcel1.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // crii
    public final List d(String s, String s1, String s2) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        Parcel parcel1 = this.hM(17, parcel0);
        List list0 = parcel1.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // crii
    public final List e(String s, String s1, boolean z, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeInt(((int)z));
        wbz.f(parcel0, appMetadata0);
        Parcel parcel1 = this.hM(14, parcel0);
        List list0 = parcel1.createTypedArrayList(UserAttributeParcel.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // crii
    public final List f(String s, String s1, String s2, boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        parcel0.writeInt(((int)z));
        Parcel parcel1 = this.hM(15, parcel0);
        List list0 = parcel1.createTypedArrayList(UserAttributeParcel.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // crii
    public final void g(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(27, parcel0);
    }

    @Override  // crii
    public final void h(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(4, parcel0);
    }

    @Override  // crii
    public final void i(EventParcel eventParcel0, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, eventParcel0);
        wbz.f(parcel0, appMetadata0);
        this.jp(1, parcel0);
    }

    @Override  // crii
    public final void j(EventParcel eventParcel0, String s, String s1) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, eventParcel0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.jp(5, parcel0);
    }

    @Override  // crii
    public final void k(AppMetadata appMetadata0, Bundle bundle0, cril cril0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        wbz.f(parcel0, bundle0);
        wbz.h(parcel0, cril0);
        this.jp(0x1F, parcel0);
    }

    @Override  // crii
    public final void l(ConditionalUserPropertyParcel conditionalUserPropertyParcel0, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, conditionalUserPropertyParcel0);
        wbz.f(parcel0, appMetadata0);
        this.jp(12, parcel0);
    }

    @Override  // crii
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, conditionalUserPropertyParcel0);
        this.jp(13, parcel0);
    }

    @Override  // crii
    public final void n(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(20, parcel0);
    }

    @Override  // crii
    public final void o(long v, String s, String s1, String s2) {
        Parcel parcel0 = this.jo();
        parcel0.writeLong(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        this.jp(10, parcel0);
    }

    @Override  // crii
    public final void p(Bundle bundle0, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, bundle0);
        wbz.f(parcel0, appMetadata0);
        this.jp(19, parcel0);
    }

    @Override  // crii
    public final void q(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(26, parcel0);
    }

    @Override  // crii
    public final void v(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(6, parcel0);
    }

    @Override  // crii
    public final void w(AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, appMetadata0);
        this.jp(25, parcel0);
    }

    @Override  // crii
    public final void x(UserAttributeParcel userAttributeParcel0, AppMetadata appMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, userAttributeParcel0);
        wbz.f(parcel0, appMetadata0);
        this.jp(2, parcel0);
    }
}

