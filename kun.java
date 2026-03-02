import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import java.util.concurrent.Executor;

public final class kun implements ibts {
    public final Executor a;
    public final kjk b;

    public kun(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Executor executor0 = this.a;
        kjk kjk0 = this.b;
        if(((SignalCredentialStateResponse)object0) == null) {
            executor0.execute(new kur(kjk0));
            return ibom.a;
        }
        executor0.execute(new kus(kjk0, new kks()));
        return ibom.a;
    }
}

