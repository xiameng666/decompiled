import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public interface eqiz extends IInterface {
    void a(eqiw arg1, ApiMetadata arg2);

    void c(eqvw arg1, HandshakeData arg2, ApiMetadata arg3);

    void d(eqvw arg1, ApiMetadata arg2);

    void e(eqiw arg1, ApiMetadata arg2);

    void f(eqiw arg1, BootstrapOptions arg2, eqit arg3, ApiMetadata arg4);

    void h(eqiw arg1, ApiMetadata arg2);

    void i(eqvw arg1, ApiMetadata arg2);

    void j(eqiw arg1, ApiMetadata arg2);

    void k(eqiw arg1, ApiMetadata arg2);

    void l(eqiw arg1, ApiMetadata arg2);

    void n(eqvw arg1, ApiMetadata arg2);

    void p(eqvw arg1, HandshakeData arg2, ApiMetadata arg3);

    void q(eqvw arg1, ApiMetadata arg2);

    void t(eqiw arg1, BootstrapOptions arg2, ParcelFileDescriptor[] arg3, eqib arg4, ApiMetadata arg5);

    void u(eqvw arg1, ApiMetadata arg2);

    String v(BootstrapOptions arg1);

    void w(eqiw arg1, BootstrapOptions arg2, ParcelFileDescriptor[] arg3, eqia arg4, ApiMetadata arg5);

    void x(eqiw arg1, eqit arg2, ApiMetadata arg3);
}

