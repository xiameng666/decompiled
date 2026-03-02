import java.util.concurrent.ExecutionException;

public final class fupj implements Runnable {
    public final fupl a;
    public final gmcd b;

    public fupj(fupl fupl0, gmcd gmcd0) {
        this.a = fupl0;
        this.b = gmcd0;
    }

    @Override
    public final void run() {
        bzs bzs0;
        try {
            bzs0 = (bzs)gmbu.r(this.b);
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException(executionException0);
        }
        this.a.d.set(bzs0);
    }
}

