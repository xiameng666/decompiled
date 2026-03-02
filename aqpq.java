import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public abstract class aqpq {
    private static final baun a;
    private final gmcg b;

    static {
        aqpq.a = aqql.a("GmsDeleteRequest");
    }

    protected aqpq() {
        this.b = new bblp(1, 9);
    }

    protected abstract clcf a();

    public final void b(Context context0, String s) {
        clcf clcf0 = this.a();
        clcj clcj0 = clbv.a(context0).e(clcf0, clcl.a, this.b, -1, 1040);
        clcj0.n("DELETE");
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/x-protobuf");
        clcj0.m(new clax(claw0));
        clcj0.h(s);
        clcn clcn0 = clcj0.e();
        try {
            clcq clcq0 = ((clcp)clcn0.a().get()).a;
            int v = clcq0.a();
            if(v == 200) {
                return;
            }
            aqpq.a.j("HTTP DELETE response code: %d", new Object[]{v});
            throw new aqxy("Server rejected HTTP request: " + clcq0.e(), v);
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0.getCause() instanceof IOException)) {
                throw (IOException)exception0.getCause();
            }
            if((exception0.getCause() instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
                clcn0.b();
            }
            throw new IOException("Failed to connect", exception0);
        }
    }
}

