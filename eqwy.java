import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.WifiConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import java.util.List;

public final class eqwy extends wbx implements eqxa {
    public eqwy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
    }

    @Override  // eqxa
    public final List a() {
        Parcel parcel0 = this.hM(12, this.jo());
        List list0 = parcel0.createTypedArrayList(BootstrapAccount.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // eqxa
    public final void b(WifiConnectionResult wifiConnectionResult0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, wifiConnectionResult0);
        this.jp(14, parcel0);
    }

    @Override  // eqxa
    public final void c(BootstrapOptions bootstrapOptions0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, bootstrapOptions0);
        this.jp(4, parcel0);
    }

    @Override  // eqxa
    public final void d(WifiTransferOptions wifiTransferOptions0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, wifiTransferOptions0);
        this.jp(3, parcel0);
    }

    @Override  // eqxa
    public final void e(QuickStartTargetEventData quickStartTargetEventData0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, quickStartTargetEventData0);
        this.jp(11, parcel0);
    }

    @Override  // eqxa
    public final void f(int v, TargetQuickStartOptions targetQuickStartOptions0, eqwu eqwu0) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        wbz.f(parcel0, targetQuickStartOptions0);
        wbz.h(parcel0, eqwu0);
        this.jp(13, parcel0);
    }

    @Override  // eqxa
    public final void g(eqwr eqwr0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, eqwr0);
        this.jp(15, parcel0);
    }

    @Override  // eqxa
    public final void h(eqxd eqxd0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, eqxd0);
        this.jp(6, parcel0);
    }

    @Override  // eqxa
    public final void i(eqxg eqxg0, String s, String s1, Bundle bundle0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, eqxg0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        wbz.f(parcel0, bundle0);
        this.jp(10, parcel0);
    }

    @Override  // eqxa
    public final void j() {
        this.jp(2, this.jo());
    }

    @Override  // eqxa
    public final void k() {
        this.jp(16, this.jo());
    }

    @Override  // eqxa
    public final void l(byte[] arr_b, eqwo eqwo0) {
        Parcel parcel0 = this.jo();
        parcel0.writeByteArray(arr_b);
        wbz.h(parcel0, eqwo0);
        this.jp(9, parcel0);
    }
}

