import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import java.io.IOException;
import java.io.InputStream;

public final class ahet implements bxso {
    public final ahev a;

    public ahet(ahev ahev0) {
        this.a = ahev0;
    }

    @Override  // bxso
    public final evql a(Object object0) {
        byte[] arr_b;
        try(InputStream inputStream0 = AppContextProvider.a().getAssets().open("nextgen.wasm")) {
            arr_b = new byte[inputStream0.available()];
            inputStream0.read(arr_b);
        }
        catch(IOException iOException0) {
            throw bxma.g(8, iOException0);
        }
        RegistrationRequest registrationRequest0 = new RegistrationRequest(((byte[])object0), arr_b, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL", "", ggna.a, "com.google.android.gms.auth.api.credentials", "com.google.android.gms.auth.api.credentials.GET_CREDENTIAL");
        return this.a.b.e(registrationRequest0);
    }
}

