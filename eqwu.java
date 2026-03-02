import android.app.RemoteLockscreenValidationSession;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;

public interface eqwu extends IInterface {
    void a();

    void b(BootstrapCompletionResult arg1);

    void c();

    void d();

    void e(int arg1, Bundle arg2);

    void f(QuickStartTargetEventData arg1);

    void g(VerificationInfo arg1);

    void h(RemoteLockscreenValidationSession arg1);

    void i(int arg1);

    void j(Bundle arg1);

    void k(BootstrapProgressResult arg1);
}

