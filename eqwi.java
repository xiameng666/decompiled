import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.quickstart.QuickStartSourceEventData;
import java.util.List;

public interface eqwi extends IInterface {
    void a(List arg1, AccountPickerOptions arg2);

    void b();

    void c(TargetConnectionArgs arg1);

    void d(boolean arg1);

    void e(int arg1);

    void f(QuickStartSourceEventData arg1);

    void g(VerificationInfo arg1);

    void h(BootstrapOptions arg1);

    void i(long arg1);

    void j(int arg1);

    void k();
}

