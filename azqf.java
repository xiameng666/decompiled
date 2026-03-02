import java.util.concurrent.Callable;

final class azqf extends azqg {
    private final Callable g;

    public azqf(Callable callable0) {
        super(false, azpg.a, null, null, -1L);
        this.g = callable0;
    }

    @Override  // azqg
    public final String a() {
        try {
            return (String)this.g.call();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

