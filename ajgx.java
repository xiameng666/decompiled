import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public interface ajgx extends IInterface {
    void a(ajhp arg1, String arg2, Account arg3, ApiMetadata arg4);

    void b(ajhs arg1, byte[] arg2, ApiMetadata arg3);

    void c(ajhd arg1, byte[] arg2, ApiMetadata arg3);

    void d(ajhd arg1, String arg2, Account arg3, ApiMetadata arg4);

    void e(ajhg arg1, Account arg2, String arg3, String arg4, byte[] arg5, byte[] arg6, ApiMetadata arg7);

    void f(ajhj arg1, Account arg2, String arg3, String arg4, byte[] arg5, ApiMetadata arg6);

    void g(ajhm arg1, byte[] arg2, ApiMetadata arg3);

    void h(ajhv arg1, int arg2, String arg3, Account arg4, List arg5, ApiMetadata arg6);

    void i(ajha arg1, String arg2, Account arg3, ClientPublicKey arg4, ApiMetadata arg5);

    void j(ajhy arg1, int arg2, List arg3, String arg4, Account arg5, List arg6, byte[] arg7, ApiMetadata arg8);

    void k(ajhy arg1, int arg2, String arg3, Account arg4, byte[] arg5, byte[] arg6, byte[] arg7, ApiMetadata arg8);

    void l(azxs arg1, String arg2, Account arg3, int arg4, byte[] arg5, List arg6, ApiMetadata arg7);

    void m(ajib arg1, String arg2, Account arg3, ApiMetadata arg4);

    void n(ajib arg1, String arg2, ApiMetadata arg3);

    void o(ajha arg1, String arg2, Account arg3, ApiMetadata arg4);

    void p(ajie arg1, String arg2, Account arg3, ApiMetadata arg4);

    void q(azxs arg1, String arg2, Account arg3, int arg4, List arg5, ApiMetadata arg6);

    void v(ajih arg1, String arg2, String arg3, Account arg4, Payload arg5, ApiMetadata arg6);

    void w(ajik arg1, String arg2, Account arg3, Payload arg4, ApiMetadata arg5);

    void x(ajik arg1, byte[] arg2, String arg3, byte[] arg4, ApiMetadata arg5);

    void y(ajin arg1, String arg2, byte[] arg3, Payload arg4, ApiMetadata arg5);
}

