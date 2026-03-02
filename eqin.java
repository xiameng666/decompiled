import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public interface eqin extends IInterface {
    void a(eqik arg1, ApiMetadata arg2);

    void c(eqvw arg1, HandshakeData arg2, ApiMetadata arg3);

    void d(eqik arg1, D2DDevice arg2, BootstrapConfigurations arg3, eqie arg4, ApiMetadata arg5);

    void f(eqik arg1, D2DDevice arg2, String arg3, eqih arg4, ApiMetadata arg5);

    void g(ConnectParams arg1, ApiMetadata arg2);

    void h(eqik arg1, ApiMetadata arg2);

    void i(eqik arg1, ApiMetadata arg2);

    void j(eqvw arg1, ApiMetadata arg2);

    void k(eqvw arg1, HandshakeData arg2, ApiMetadata arg3);

    void l(eqik arg1, Bundle arg2, ApiMetadata arg3);

    void p(eqik arg1, Bundle arg2, ApiMetadata arg3);

    void q(eqik arg1, BootstrapConfigurations arg2, ParcelFileDescriptor[] arg3, eqib arg4, ApiMetadata arg5);

    void r(eqik arg1, eqiq arg2, ApiMetadata arg3);

    void s(eqik arg1, ApiMetadata arg2);

    void t(eqik arg1, BootstrapConfigurations arg2, ApiMetadata arg3);

    void u(eqik arg1, BootstrapConfigurations arg2, ParcelFileDescriptor[] arg3, eqia arg4, ApiMetadata arg5);

    void v(eqik arg1, ApiMetadata arg2);
}

