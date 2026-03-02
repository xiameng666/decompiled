import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class epql implements Consumer {
    public final ConsentChimeraActivity a;

    public epql(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.u.a(bxok.b(4, ((bxoj)object0), this.a.v.g));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

