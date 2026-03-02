import android.location.Location;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqjo implements Consumer {
    public final cqjq a;

    public cqjo(cqjq cqjq0) {
        this.a = cqjq0;
    }

    @Override
    public final void accept(Object object0) {
        cqjq cqjq0 = this.a;
        if(((Location)object0) == null) {
            cqjq0.a(hltz.g, null);
        }
        else {
            cqjq0.d = true;
            cqjq0.a(hltz.a, ((Location)object0));
        }
        cqjq0.e();
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

