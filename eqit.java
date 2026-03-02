import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;

public interface eqit extends IInterface {
    void a(BootstrapCompletionResult arg1);

    void b(TargetConnectionArgs arg1);

    void c();

    void d(int arg1);

    void e(String arg1);

    void f(String arg1);

    boolean g(BootstrapProgressResult arg1);
}

