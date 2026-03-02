import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Set;

public interface bnao extends bmzv {
    public static final bnam g;

    static {
        bnao.g = new bnam();
    }

    void i(bnae arg1, bmbb arg2);

    void j(bnae arg1, bmbc arg2);

    void k(bnae arg1, String arg2, RegisterRequestParams arg3, Set arg4);

    void l(bnae arg1, Transport arg2);

    void m(bnae arg1, int arg2, String arg3);

    void n(bnae arg1, String arg2, SignRequestParams arg3, Set arg4);

    void o(bnae arg1, SignResponseData arg2, Transport arg3);
}

