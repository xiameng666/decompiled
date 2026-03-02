import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ekee implements Consumer {
    public final ekeb a;

    public ekee(ekeb ekeb0) {
        this.a = ekeb0;
    }

    @Override
    public final void accept(Object object0) {
        Long long0 = ((ekek)object0).a();
        ekea ekea0 = (ekea)this.a.a.get(long0);
        int v = 2;
        if(ekea0 != null) {
            if(ekea0.a != 0L) {
                v = 4;
            }
            else if(ekea0.b) {
                v = 3;
            }
        }
        ((ekek)object0).k = v;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

