import java.util.concurrent.ExecutionException;

public final class fcpf implements Runnable {
    public final fcpu a;
    public final byte[] b;
    public final gmcd c;

    public fcpf(fcpu fcpu0, byte[] arr_b, gmcd gmcd0) {
        this.a = fcpu0;
        this.b = arr_b;
        this.c = gmcd0;
    }

    @Override
    public final void run() {
        fcpu fcpu0;
        try {
            fcpu0 = this.a;
            aqej aqej0 = (aqej)gmbu.r(this.c);
            fcpu0.e(this.b, aqej0);
        }
        catch(ExecutionException executionException0) {
            fcpu.a.g("Failed to fetch updated Folsom vault", executionException0, new Object[0]);
            fcpu0.b(executionException0, null);
        }
    }
}

