import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fvxh implements Consumer {
    public final fvxn_FusionEngine a;

    public fvxh(fvxn_FusionEngine fvxn0) {
        this.a = fvxn0;
    }

    @Override
    public final void accept(Object object0) {
        fvxn_FusionEngine fvxn0 = this.a;
        if(!fvxn0.l) {
            return;
        }
        fvxn0.n_deepblueHandler.l(((cjhf)object0).a(), ((cjhf)object0));
        fvxn0.m(((cjhf)object0).a());
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

