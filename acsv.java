import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.util.List;

public final class acsv {
    public String a;
    public Long b;
    public boolean c;
    public boolean d;
    public List e;
    public String f;

    public acsv() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
    }

    public final TokenData a() {
        if(this.d && this.e == null) {
            throw new IllegalStateException("Granted scopes must be set if the token is snowballed.");
        }
        return TextUtils.isEmpty(this.a) ? null : new TokenData(1, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

