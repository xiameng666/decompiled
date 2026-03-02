import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import com.google.location.nearby.direct.service.NearbyDirectChimeraService;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class gylo extends gyis {
    public gylu a;
    final NearbyDirectChimeraService b;

    public gylo(NearbyDirectChimeraService nearbyDirectChimeraService0) {
        Objects.requireNonNull(nearbyDirectChimeraService0);
        this.b = nearbyDirectChimeraService0;
        super();
    }

    @Override  // gyit
    public final OperationResponse a(String s) {
        gylv.a(this.b);
        this.f();
        return this.a.a(s);
    }

    @Override  // gyit
    public final OperationResponse b(OperationRequest operationRequest0) {
        gylv.a(this.b);
        this.f();
        return this.a.b(operationRequest0);
    }

    @Override  // gyit
    public final OperationResponse c(OperationRequest operationRequest0) {
        gylv.a(this.b);
        this.f();
        return this.a.c(operationRequest0);
    }

    @Override  // gyit
    public final boolean d(OperationRequest operationRequest0) {
        gylv.a(this.b);
        this.f();
        return this.a.d(operationRequest0);
    }

    @Override  // gyit
    public final boolean e(OperationRequest operationRequest0) {
        gylv.a(this.b);
        this.f();
        return this.a.e(operationRequest0);
    }

    private final void f() {
        synchronized(this) {
            if(this.a != null && !this.a.h.get()) {
                return;
            }
            gylu gylu0 = this.a;
            if(gylu0 != null) {
                try {
                    if(!gylu0.f.await(5000L, TimeUnit.MILLISECONDS)) {
                        goto label_10;
                    }
                    goto label_11;
                }
                catch(InterruptedException unused_ex) {
                }
            label_10:
                ((ggtj)((ggtj)gyke.a.i()).ar(0x4F7A)).A("NearbyDirect failed to shut down after %sms", 5000L);
            }
        label_11:
            this.a = new gylu(this.b, this.b.a);
        }
    }
}

