import com.google.android.gms.auth.aang.GetAccountsRequest;
import java.util.List;

public final class actm {
    public List a;
    public List b;
    public byte c;
    private String d;

    public final GetAccountsRequest a() {
        if(this.c == 1) {
            String s = this.d;
            if(s != null) {
                return new GetAccountsRequest(s, this.a, this.b, false);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == null) {
            stringBuilder0.append(" accountType");
        }
        if(this.c == 0) {
            stringBuilder0.append(" includeRestrictedAccounts");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null accountType");
        }
        this.d = s;
    }
}

