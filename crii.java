import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

public interface crii extends IInterface {
    ConsentParcel a(AppMetadata arg1);

    String b(AppMetadata arg1);

    List c(String arg1, String arg2, AppMetadata arg3);

    List d(String arg1, String arg2, String arg3);

    List e(String arg1, String arg2, boolean arg3, AppMetadata arg4);

    List f(String arg1, String arg2, String arg3, boolean arg4);

    void g(AppMetadata arg1);

    void h(AppMetadata arg1);

    void i(EventParcel arg1, AppMetadata arg2);

    void j(EventParcel arg1, String arg2, String arg3);

    void k(AppMetadata arg1, Bundle arg2, cril arg3);

    void l(ConditionalUserPropertyParcel arg1, AppMetadata arg2);

    void m(ConditionalUserPropertyParcel arg1);

    void n(AppMetadata arg1);

    void o(long arg1, String arg2, String arg3, String arg4);

    void p(Bundle arg1, AppMetadata arg2);

    void q(AppMetadata arg1);

    void v(AppMetadata arg1);

    void w(AppMetadata arg1);

    void x(UserAttributeParcel arg1, AppMetadata arg2);
}

