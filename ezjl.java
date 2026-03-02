import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezjl implements Function {
    public final String a;

    public ezjl() {
        this.a = "auth_trust_agent_pref_trusted_bluetooth_title";
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((String)object0).substring(this.a.length());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

