import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.AppClaim;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ajka extends cjtm {
    private final ajhy a;
    private final int b;
    private final String c;
    private final String d;
    private final Account e;
    private final byte[] f;
    private final byte[] g;
    private final byte[] h;
    private static final baun i;

    static {
        ajka.i = new baun(new String[]{"RegisterForCustomKeyOperation"}, null);
    }

    public ajka(ajhy ajhy0, int v, String s, String s1, Account account0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, azug azug0) {
        super(0x81, "RegisterForCustomKeyOperation", azug0);
        this.a = ajhy0;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = account0;
        this.f = arr_b;
        this.g = arr_b1;
        this.h = arr_b2;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ygm ygm0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.f);
        List list0 = Arrays.asList(new String[]{this.c});
        ajjd ajjd0 = new ajjd(context0, this.b, list0, this.d, this.e, arrayList0, null, this.g, this.h, null);
        try {
            ygm0 = ajjd0.b();
        }
        catch(ygj ygj0) {
            ajka.i.n("Failed to perform enrollment. StatusCode=" + ygj0.a.toString(), ygj0, new Object[0]);
            Status status0 = ajjp.a(ygj0.a);
            this.a.a(status0, ApiMetadata.b);
            return;
        }
        ygt ygt0 = (ygt)ygm0.b.get(this.c);
        ArrayList arrayList1 = new ArrayList();
        if(ygt0 != null) {
            for(Object object0: ygt0.a) {
                arrayList1.add(new AppClaim(1, ((yge)object0).a, ((yge)object0).b, ((yge)object0).c));
            }
        }
        KeyRegistrationResult keyRegistrationResult0 = new KeyRegistrationResult(ajjp.a(ygm0.a), (ygt0 == null ? null : ygt0.b), arrayList1);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.b(keyRegistrationResult0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

