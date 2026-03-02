import com.android.volley.Request;
import com.android.volley.Response;

public final class sps implements Runnable {
    private final Request a;
    private final Response b;
    private final Runnable c;

    public sps(Request request0, Response response0, Runnable runnable0) {
        this.a = request0;
        this.b = response0;
        this.c = runnable0;
    }

    @Override
    public final void run() {
        Request request0 = this.a;
        if(request0.isCanceled()) {
            request0.a("canceled-at-delivery");
            return;
        }
        Response response0 = this.b;
        if(response0.isSuccess()) {
            request0.deliverResponse(response0.result);
        }
        else {
            request0.deliverError(response0.error);
        }
        if(response0.intermediate) {
            request0.addMarker("intermediate-response");
        }
        else {
            request0.a("done");
        }
        Runnable runnable0 = this.c;
        if(runnable0 != null) {
            runnable0.run();
        }
    }
}

