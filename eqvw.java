import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;

public interface eqvw extends IInterface {
    void a(Status arg1, StartServiceResponse arg2);

    void b(Status arg1);

    void c(Status arg1, ConnectionHint arg2);

    void d(Status arg1, HandshakeData arg2);

    void e(Status arg1, PostSetupAuthData arg2);

    void f(Status arg1, Bundle arg2);

    void g(Status arg1);

    void h(Status arg1, HandshakeData arg2);

    void i(Status arg1, HandshakeData arg2);
}

