import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import java.util.concurrent.Callable;

public final class flew implements Callable {
    public final flfv a;
    public final flfu b;

    public flew(flfv flfv0, flfu flfu0) {
        this.a = flfv0;
        this.b = flfu0;
    }

    @Override
    public final Object call() {
        flfv flfv0 = this.a;
        flfu flfu0 = this.b;
        synchronized(flfv0) {
            if(flfv0.m) {
                flbj.a("MsgReceiver", "BindV2 stream had an error. Not marking as open.");
                return null;
            }
            flfv0.o = flfu0;
            flfv0.l = true;
            flfv0.m = false;
            flfv0.g.a(2);
            flbj.a("MsgReceiver", a.v(((.AutoValue_ContactId)flfv0.b.c().f()).a, "BindV2 stream opened for "));
        }
        return null;
    }
}

