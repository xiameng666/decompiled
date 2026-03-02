import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.ExecutionException;

public final class flde implements Runnable {
    public final fldt a;
    public final gmcd b;
    public final AccountContext c;

    public flde(fldt fldt0, gmcd gmcd0, AccountContext accountContext0) {
        this.a = fldt0;
        this.b = gmcd0;
        this.c = accountContext0;
    }

    @Override
    public final void run() {
        try {
            ((glyq)gmbu.b(new gmcd[]{this.b}).a(new fldm(this.b), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            flbj.d("LitBlockController", "Failed to store block list", exception0);
        }
        this.a.d.remove(this.c);
    }
}

