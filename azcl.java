import android.content.Context;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class azcl extends azts {
    public azcl(Context context0) {
        azta_api azta0 = ayud.c;
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        super(context0, azta0, azsx.s, aztr0);
    }

    // Detected as a lambda impl.
    public final evql e(aytx aytx0, ayvl ayvl0) {
        azck azck0 = new azck(this, aytx0, this.D, ayvl0);
        super.jr(2, azck0);
        return batf.c(azck0);
    }

    public final boolean f(long v, TimeUnit timeUnit0) {
        evql evql0 = this.iG(new azcg(this));
        try {
            evrg.o(evql0, v, timeUnit0);
            return true;
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            return false;
        }
        catch(ExecutionException | TimeoutException unused_ex) {
            return false;
        }
    }

    public final void g(BatchedLogErrorParcelable batchedLogErrorParcelable0) {
        if(batchedLogErrorParcelable0.a.isEmpty()) {
            evrg.d(Status.b);
            return;
        }
        azzc azzc0 = new azzc();
        azzc0.a = new azce(this, batchedLogErrorParcelable0);
        azzc0.c = new Feature[]{ayvi.a};
        azzc0.b = false;
        this.iF(azzc0.a());
    }

    public final evql h(aytx aytx0) {
        azcf azcf0 = (aytx aytx0) -> {
            azck azck0 = new azck(this, aytx0, this.D, ayvl.a);
            super.jr(2, azck0);
            return batf.c(azck0);
        };
        gmcd gmcd0 = aytx0.e();
        if(gmcd0.isDone() && !gmcd0.isCancelled()) {
            try {
                gmde.a(gmcd0);
            }
            catch(ExecutionException | RuntimeException unused_ex) {
                goto label_5;
            }
            return (evql)azcf0.apply(aytx0);
        }
    label_5:
        evql evql0 = fhqu.a(gmcd0);
        azcd azcd0 = new azcd(azcf0, aytx0);
        return evql0.f(gmap.a, azcd0);
    }
}

