import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajju extends cjtm {
    private final ajhd a;
    private final String b;
    private final Account c;
    private static final baun d;

    static {
        ajju.d = new baun(new String[]{"HaveKeyWithKeyNameOperation"}, null);
    }

    public ajju(ajhd ajhd0, String s, Account account0, azug azug0) {
        super(0x81, "HaveKeyWithKeyNameOperation", azug0);
        this.a = ajhd0;
        this.b = s;
        this.c = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajju.d.h("Have key with key name operation is called.", new Object[0]);
        try {
            new ajfn(context0).f(this.b, this.c);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(true, apiMetadata0);
        }
        catch(ajiv unused_ex) {
            ApiMetadata apiMetadata1 = cckf.d(bbdp.R);
            this.a.b(false, apiMetadata1);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

