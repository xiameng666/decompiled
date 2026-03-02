import android.text.TextUtils;
import com.google.android.gms.auth.aang.GetTokenResponse;

public final class dlnq implements kar {
    public final dlnw a;

    public dlnq(dlnw dlnw0) {
        this.a = dlnw0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        String s = ((GetTokenResponse)object0).a;
        if(!TextUtils.isEmpty(s)) {
            this.a.b(s);
        }
    }
}

