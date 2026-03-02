import android.content.Context;
import com.google.android.gms.phenotype.ExperimentTokens;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

final class fxqr extends bbln {
    final Context a;
    final fxqs b;

    public fxqr(fxqs fxqs0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(fxqs0);
        this.b = fxqs0;
        super(10);
    }

    @Override
    public final void run() {
        try {
            ExperimentTokens experimentTokens0 = (ExperimentTokens)evrg.n(new einq(this.a).m(this.b.a));
            this.b.c(experimentTokens0);
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            fxqw.f(("Failed to get experiment tokens for " + this.b.a));
            this.b.b();
        }
    }
}

