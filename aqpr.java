import android.content.Context;
import android.os.SystemClock;
import j..util.concurrent.ThreadLocalRandom;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public abstract class aqpr {
    private static final baun a;
    private final gmcg b;

    static {
        aqpr.a = aqql.a("GmsGetRequest");
    }

    protected aqpr() {
        this.b = new bblp(1, 9);
    }

    protected abstract clcf a();

    public final ProtoLiteMessage b(Context context0, String s, ProtoLiteMessage hftv0) {
        clcf clcf0 = this.a();
        long v = hqje.h();
        int v1 = 0;
        while(((long)v1) < -1L + v) {
            try {
                return this.c(context0, clcf0, s, hftv0);
            }
            catch(IOException unused_ex) {
                ++v1;
                SystemClock.sleep(hqje.c() + TimeUnit.SECONDS.toMillis(((long)Math.pow(2.0, v1))) + ThreadLocalRandom.current().nextLong(hqje.b()));
            }
        }
        return this.c(context0, clcf0, s, hftv0);
    }

    private final ProtoLiteMessage c(Context context0, clcf clcf0, String s, ProtoLiteMessage hftv0) {
        clda clda0 = clbv.a(context0).c(clcf0, 1, hftv0, this.b, -1, 1040);
        clda0.B("GET");
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/x-protobuf");
        clda0.A(new clax(claw0));
        clda0.w(s);
        cldb cldb0 = clda0.t();
        try {
            cldc cldc0 = (cldc)cldb0.a().get();
            clcq clcq0 = cldc0.a;
            int v = clcq0.a();
            if(v == 200) {
                return cldc0.b;
            }
            aqpr.a.j("HTTP GET response code: %d", new Object[]{v});
            throw new aqxy("Server rejected HTTP request: " + clcq0.e(), v);
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0.getCause() instanceof clbw)) {
                throw new aqxy("Parse Proto Exception.", 404);
            }
            if((exception0.getCause() instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            throw new IOException("Failed to connect", exception0);
        }
    }
}

