import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

public final class ahgo implements Callable {
    public final ahgq a;
    public final gged_interceptors b;

    public ahgo(ahgq ahgq0, gged_interceptors gged0) {
        this.a = ahgq0;
        this.b = gged0;
    }

    @Override
    public final Object call() {
        Status status0;
        ahgq ahgq0 = this.a;
        Account account0 = ahgq0.a;
        int v = bbmq.c(ahgq0.d, ahgq0.c);
        bxke bxke0 = bxke.b(account0, this.b);
        bxke0.e(ahgq0.b);
        bxke0.i(ahgq0.c, v);
        TokenRequest tokenRequest0 = bxke0.a();
        TokenResponse tokenResponse0 = ahgq0.ah.c(tokenRequest0);
        switch(tokenResponse0.a().ordinal()) {
            case 4: {
                status0 = new Status(7, "Network error.");
                throw bxma.f(status0.i, status0.j);
            }
            case 5: {
                status0 = new Status(8, "Service unavailable.");
                throw bxma.f(status0.i, status0.j);
            }
            case 6: {
                status0 = new Status(8, "Internal error.");
                throw bxma.f(status0.i, status0.j);
            }
            case 8: {
                ahgq0.aj = tokenRequest0.a;
                return gfsx.m(Integer.valueOf(2));
            }
            case 2: 
            case 22: 
            case 23: {
                return gfqx.a;
            }
            case 37: {
                return gfsx.m(Integer.valueOf(4));
            }
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 38: 
            case 39: {
                return gfsx.m(Integer.valueOf(3));
            }
            default: {
                status0 = new Status(8, "Unknown error [status=" + tokenResponse0.a() + "].");
                throw bxma.f(status0.i, status0.j);
            }
        }
    }
}

