import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.List;

public final class ajec extends ajdv {
    final ajhu a;
    final String b;
    final Account c;
    final List d;

    public ajec() {
        super(0x64F);
        this.a = new ajhu(this);
    }

    public ajec(ajes ajes0, String s, Account account0, List list0) {
        this.b = s;
        this.c = account0;
        this.d = list0;
        Objects.requireNonNull(ajes0);
        super(0x64F);
        this.a = new ajhu(this);
    }

    @Override  // ajdv
    public final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.h(this.a, 14, this.b, this.c, this.d, apiMetadata0);
    }
}

