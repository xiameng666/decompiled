import android.accounts.Account;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.ProtoWrapper;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.ArrayList;
import java.util.List;

public abstract class gxvh extends wby implements gxvi {
    public gxvh() {
        super("com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gxvq gxvq0;
        switch(v) {
            case 2: {
                String s = parcel0.readString();
                gxvh.gr(parcel0);
                TrueWirelessHeadset trueWirelessHeadset0 = this.g(s);
                parcel1.writeNoException();
                wbz.g(parcel1, trueWirelessHeadset0);
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                gxvh.gr(parcel0);
                DeviceDetailsLinks deviceDetailsLinks0 = this.j(s1);
                parcel1.writeNoException();
                wbz.g(parcel1, deviceDetailsLinks0);
                return true;
            }
            case 4: {
                byte[] arr_b = parcel0.createByteArray();
                gxvh.gr(parcel0);
                String s2 = this.k(arr_b);
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 5: {
                List list0 = this.n();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 6: {
                String s3 = parcel0.readString();
                boolean z = wbz.i(parcel0);
                boolean z1 = wbz.i(parcel0);
                gxvh.gr(parcel0);
                boolean z2 = this.y(s3, z, z1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 7: {
                String s4 = parcel0.readString();
                int v1 = parcel0.readInt();
                int v2 = parcel0.readInt();
                gxvh.gr(parcel0);
                int v3 = this.a(s4, v1, v2);
                parcel1.writeNoException();
                parcel1.writeInt(v3);
                return true;
            }
            case 8: {
                byte[] arr_b1 = parcel0.createByteArray();
                gxvh.gr(parcel0);
                byte[] arr_b2 = this.A(arr_b1);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b2);
                return true;
            }
            case 9: {
                String s5 = parcel0.readString();
                gxvh.gr(parcel0);
                boolean z3 = this.x(s5);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 10: {
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                gxvh.gr(parcel0);
                boolean z4 = this.w(account0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z4));
                return true;
            }
            case 11: {
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                boolean z5 = wbz.i(parcel0);
                gxvh.gr(parcel0);
                this.t(account1, z5);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.location.nearby.common.fastpair.IFootprintsListenerCallback");
                    if((iInterface0 instanceof gxvp)) {
                        gxvp gxvp0 = (gxvp)iInterface0;
                    }
                }
                gxvh.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                Account account3 = (Account)wbz.a(parcel0, Account.CREATOR);
                gxvh.gr(parcel0);
                this.s(account3);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                Account account4 = (Account)wbz.a(parcel0, Account.CREATOR);
                gxvh.gr(parcel0);
                List list1 = this.p(account4);
                parcel1.writeNoException();
                parcel1.writeList(list1);
                return true;
            }
            case 16: {
                byte[] arr_b3 = parcel0.createByteArray();
                gxvh.gr(parcel0);
                byte[] arr_b4 = this.z(arr_b3);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b4);
                return true;
            }
            case 17: {
                byte[] arr_b5 = parcel0.createByteArray();
                gxvh.gr(parcel0);
                this.q(arr_b5);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                List list2 = this.o();
                parcel1.writeNoException();
                parcel1.writeTypedList(list2);
                return true;
            }
            case 19: {
                byte[] arr_b6 = parcel0.createByteArray();
                gxvh.gr(parcel0);
                int v4 = this.d(arr_b6);
                parcel1.writeNoException();
                parcel1.writeInt(v4);
                return true;
            }
            case 20: {
                String s6 = parcel0.readString();
                gxvh.gr(parcel0);
                int v5 = this.c(s6);
                parcel1.writeNoException();
                parcel1.writeInt(v5);
                return true;
            }
            case 21: {
                ProtoWrapper protoWrapper0 = (ProtoWrapper)wbz.a(parcel0, ProtoWrapper.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(BluetoothDevice.CREATOR);
                boolean z6 = wbz.i(parcel0);
                gxvh.gr(parcel0);
                ProtoWrapper protoWrapper1 = this.i(protoWrapper0, arrayList0, z6);
                parcel1.writeNoException();
                wbz.g(parcel1, protoWrapper1);
                return true;
            }
            case 22: {
                int v6 = parcel0.readInt();
                BluetoothDevice bluetoothDevice0 = (BluetoothDevice)wbz.a(parcel0, BluetoothDevice.CREATOR);
                gxvh.gr(parcel0);
                this.r(v6, bluetoothDevice0);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                ProtoWrapper protoWrapper2 = (ProtoWrapper)wbz.a(parcel0, ProtoWrapper.CREATOR);
                gxvh.gr(parcel0);
                ProtoWrapper protoWrapper3 = this.h(protoWrapper2);
                parcel1.writeNoException();
                wbz.g(parcel1, protoWrapper3);
                return true;
            }
            case 24: {
                String s7 = parcel0.readString();
                gxvh.gr(parcel0);
                Bundle bundle0 = this.f(s7);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 25: {
                byte[] arr_b7 = parcel0.createByteArray();
                gxvh.gr(parcel0);
                List list3 = this.m(arr_b7);
                parcel1.writeNoException();
                parcel1.writeStringList(list3);
                return true;
            }
            case 26: {
                String s8 = parcel0.readString();
                gxvh.gr(parcel0);
                boolean z7 = this.v(s8);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z7));
                return true;
            }
            case 27: {
                String s9 = parcel0.readString();
                gxvh.gr(parcel0);
                String s10 = this.l(s9);
                parcel1.writeNoException();
                parcel1.writeString(s10);
                return true;
            }
            case 28: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    gxvq0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.location.nearby.common.fastpair.IGellerFootprintsListenerCallback");
                    gxvq0 = (iInterface1 instanceof gxvq) ? ((gxvq)iInterface1) : new gxvq(iBinder1);
                }
                gxvh.gr(parcel0);
                this.B(gxvq0);
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                this.u();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

