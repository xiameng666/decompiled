import com.google.android.gms.common.api.Status;
import com.google.android.gms.serviceentitlement.AuthenticationResult;
import com.google.android.gms.serviceentitlement.AuthenticationToken;

public final class ril implements Runnable {
    public final rip a;
    public final rim b;

    public ril(rip rip0, rim rim0) {
        this.a = rip0;
        this.b = rim0;
    }

    @Override
    public final void run() {
        rip rip0 = this.a;
        rip0.a.lock();
        rim rim0 = this.b;
        try {
            rhe rhe0 = new rhf(rip0.b, rim0.e, rim0.f).a(rim0.d, rim0.g, rim0.a, rim0.c, null);
            gged_interceptors gged0 = gged_interceptors.i(rhe0.b);
            AuthenticationResult authenticationResult0 = new AuthenticationResult(new AuthenticationToken(rhe0.a, gged0, rhe0.c), "", null);
            ((eont)rim0.i).b.c(((eont)rim0.i).a, Status.b, authenticationResult0);
        }
        catch(rhb rhb0) {
            rie rie0 = new rie(rhb0);
            ((eont)rim0.i).b(rie0);
        }
        finally {
            rip0.a.unlock();
        }
    }
}

