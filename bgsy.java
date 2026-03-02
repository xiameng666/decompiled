import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgsy implements Consumer {
    public final bgtb a;

    public bgsy(bgtb bgtb0) {
        this.a = bgtb0;
    }

    @Override
    public final void accept(Object object0) {
        fxoy fxoy0 = new fxoy("NtfObsSt", ((bgpr)object0), new fxnw(7, this.a.g), new bgst(this.a), new bgsu());
        this.a.g.k(fxoy0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

