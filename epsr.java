import com.google.android.gms.signin.activity.SignInChimeraActivity;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class epsr implements Consumer {
    public final SignInChimeraActivity a;

    public epsr(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.u.a(bxok.b(2, ((bxoj)object0), this.a.v.g));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

