import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public interface ekpa extends IInterface {
    void a(Status arg1, boolean arg2);

    void b(Status arg1, AttestationData arg2);

    void c(Status arg1);

    void d(String arg1);

    void e(Status arg1, boolean arg2);

    void f(Status arg1, HarmfulAppsInfo arg2);

    void g(Status arg1, RecaptchaResultData arg2);

    void h(Status arg1, RemoveHarmfulAppData arg2);

    void i(Status arg1, SafeBrowsingData arg2);

    void j(Status arg1, String arg2, int arg3);
}

