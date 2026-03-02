import android.text.TextUtils;
import com.google.android.gms.auth.aang.GetTokenResponse;
import java.util.concurrent.ExecutionException;

public final class dlnu implements kar {
    public final dlnw a;

    public dlnu(dlnw dlnw0) {
        this.a = dlnw0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        String s;
        gmcd gmcd0 = (gmcd)object0;
        dlnw dlnw0 = this.a;
        try {
            s = ((GetTokenResponse)gmcd0.get()).a;
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            dlnw0.a();
            s = null;
        }
        if(!TextUtils.isEmpty(s)) {
            dlnw0.b(s);
        }
    }
}

