import android.accounts.Account;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.ProtoWrapper;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.List;

public final class gxvg extends wbx implements gxvi {
    public gxvg(IBinder iBinder0) {
        super(iBinder0, "com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    @Override  // gxvi
    public final byte[] A(byte[] arr_b) {
        throw null;
    }

    @Override  // gxvi
    public final void B(gxvq gxvq0) {
        throw null;
    }

    @Override  // gxvi
    public final int a(String s, int v, int v1) {
        throw null;
    }

    @Override  // gxvi
    public final int c(String s) {
        throw null;
    }

    @Override  // gxvi
    public final int d(byte[] arr_b) {
        Parcel parcel0 = this.jo();
        parcel0.writeByteArray(arr_b);
        Parcel parcel1 = this.hM(19, parcel0);
        int v = parcel1.readInt();
        parcel1.recycle();
        return v;
    }

    @Override  // gxvi
    public final Bundle f(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(24, parcel0);
        Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // gxvi
    public final TrueWirelessHeadset g(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(2, parcel0);
        TrueWirelessHeadset trueWirelessHeadset0 = (TrueWirelessHeadset)wbz.a(parcel1, TrueWirelessHeadset.CREATOR);
        parcel1.recycle();
        return trueWirelessHeadset0;
    }

    @Override  // gxvi
    public final ProtoWrapper h(ProtoWrapper protoWrapper0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, protoWrapper0);
        Parcel parcel1 = this.hM(23, parcel0);
        ProtoWrapper protoWrapper1 = (ProtoWrapper)wbz.a(parcel1, ProtoWrapper.CREATOR);
        parcel1.recycle();
        return protoWrapper1;
    }

    @Override  // gxvi
    public final ProtoWrapper i(ProtoWrapper protoWrapper0, List list0, boolean z) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, protoWrapper0);
        parcel0.writeTypedList(list0);
        parcel0.writeInt(((int)z));
        Parcel parcel1 = this.hM(21, parcel0);
        ProtoWrapper protoWrapper1 = (ProtoWrapper)wbz.a(parcel1, ProtoWrapper.CREATOR);
        parcel1.recycle();
        return protoWrapper1;
    }

    @Override  // gxvi
    public final DeviceDetailsLinks j(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(3, parcel0);
        DeviceDetailsLinks deviceDetailsLinks0 = (DeviceDetailsLinks)wbz.a(parcel1, DeviceDetailsLinks.CREATOR);
        parcel1.recycle();
        return deviceDetailsLinks0;
    }

    @Override  // gxvi
    public final String k(byte[] arr_b) {
        throw null;
    }

    @Override  // gxvi
    public final String l(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(27, parcel0);
        String s1 = parcel1.readString();
        parcel1.recycle();
        return s1;
    }

    @Override  // gxvi
    public final List m(byte[] arr_b) {
        throw null;
    }

    @Override  // gxvi
    public final List n() {
        Parcel parcel0 = this.hM(5, this.jo());
        List list0 = parcel0.createTypedArrayList(DiscoveryListItem.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // gxvi
    public final List o() {
        Parcel parcel0 = this.hM(18, this.jo());
        List list0 = parcel0.createTypedArrayList(DiscoveryListItem.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // gxvi
    public final List p(Account account0) {
        throw null;
    }

    @Override  // gxvi
    public final void q(byte[] arr_b) {
        throw null;
    }

    @Override  // gxvi
    public final void r(int v, BluetoothDevice bluetoothDevice0) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        wbz.f(parcel0, bluetoothDevice0);
        this.jp(22, parcel0);
    }

    @Override  // gxvi
    public final void s(Account account0) {
        throw null;
    }

    @Override  // gxvi
    public final void t(Account account0, boolean z) {
        throw null;
    }

    @Override  // gxvi
    public final void u() {
        throw null;
    }

    @Override  // gxvi
    public final boolean v(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(26, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // gxvi
    public final boolean w(Account account0) {
        throw null;
    }

    @Override  // gxvi
    public final boolean x(String s) {
        throw null;
    }

    @Override  // gxvi
    public final boolean y(String s, boolean z, boolean z1) {
        throw null;
    }

    @Override  // gxvi
    public final byte[] z(byte[] arr_b) {
        Parcel parcel0 = this.jo();
        parcel0.writeByteArray(arr_b);
        Parcel parcel1 = this.hM(16, parcel0);
        byte[] arr_b1 = parcel1.createByteArray();
        parcel1.recycle();
        return arr_b1;
    }
}

