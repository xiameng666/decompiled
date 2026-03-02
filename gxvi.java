import android.accounts.Account;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.ProtoWrapper;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.List;

public interface gxvi extends IInterface {
    byte[] A(byte[] arg1);

    void B(gxvq arg1);

    int a(String arg1, int arg2, int arg3);

    int c(String arg1);

    int d(byte[] arg1);

    Bundle f(String arg1);

    TrueWirelessHeadset g(String arg1);

    ProtoWrapper h(ProtoWrapper arg1);

    ProtoWrapper i(ProtoWrapper arg1, List arg2, boolean arg3);

    DeviceDetailsLinks j(String arg1);

    String k(byte[] arg1);

    String l(String arg1);

    List m(byte[] arg1);

    List n();

    List o();

    List p(Account arg1);

    void q(byte[] arg1);

    void r(int arg1, BluetoothDevice arg2);

    void s(Account arg1);

    void t(Account arg1, boolean arg2);

    void u();

    boolean v(String arg1);

    boolean w(Account arg1);

    boolean x(String arg1);

    boolean y(String arg1, boolean arg2, boolean arg3);

    byte[] z(byte[] arg1);
}

