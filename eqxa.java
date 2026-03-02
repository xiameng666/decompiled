import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.WifiConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import java.util.List;

public interface eqxa extends IInterface {
    List a();

    void b(WifiConnectionResult arg1);

    void c(BootstrapOptions arg1);

    void d(WifiTransferOptions arg1);

    void e(QuickStartTargetEventData arg1);

    void f(int arg1, TargetQuickStartOptions arg2, eqwu arg3);

    void g(eqwr arg1);

    void h(eqxd arg1);

    void i(eqxg arg1, String arg2, String arg3, Bundle arg4);

    void j();

    void k();

    void l(byte[] arg1, eqwo arg2);
}

