import com.google.android.gms.update.SystemUpdateStatus;
import java.util.concurrent.Callable;

public final class ezyt implements Callable {
    public final ezyv a;
    public final ggdy b;
    public final SystemUpdateStatus c;

    public ezyt(ezyv ezyv0, ggdy ggdy0, SystemUpdateStatus systemUpdateStatus0) {
        this.a = ezyv0;
        this.b = ggdy0;
        this.c = systemUpdateStatus0;
    }

    @Override
    public final Object call() {
        ezxu ezxu0 = (ezxu)ezxu.a.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gigt)hftp0.b_message).c = 2;
        ((gigt)hftp0.b_message).b |= 1;
        gigt gigt0 = (gigt)hftp0.N_build();
        ezxu0.b.a(gigt0);
        gged_interceptors gged0 = this.b.h();
        this.a.k.h(gged0, this.c.C);
        return null;
    }
}

