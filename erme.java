import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class erme implements Runnable {
    public final ermn a;
    public final gmcd b;
    public final gmcd c;

    public erme(ermn ermn0, gmcd gmcd0, gmcd gmcd1) {
        this.a = ermn0;
        this.b = gmcd0;
        this.c = gmcd1;
    }

    @Override
    public final void run() {
        gmcd gmcd0;
        ermn ermn0;
        try {
            ermn0 = this.a;
            gmcd0 = this.c;
            ermn0.ag = (Set)gmbu.r(this.b);
        }
        catch(ExecutionException executionException0) {
            ermn.a.g("Failed to find Dasher accounts", executionException0, new Object[0]);
        }
        try {
            ermn0.ah = (Set)gmbu.r(gmcd0);
        }
        catch(ExecutionException executionException1) {
            ermn.a.g("Failed to find Unicorn accounts", executionException1, new Object[0]);
        }
        ermn0.d = bajm.b(ermn0.ag, ermn0.ah);
    }
}

