import androidx.constraintlayout.widget.Group;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cshm implements Consumer {
    @Override
    public final void accept(Object object0) {
        cshp cshp0 = ((cskd)object0).a;
        if(cshp0 == null) {
            return;
        }
        Group group0 = cshp0.y;
        if(group0 == null) {
            ((ggtj)cshp.t.i()).x("Cannot locate visibility group to toggle!");
            return;
        }
        pat pat0 = new pat(null);
        pao.b(cshp0.x, pat0);
        if(group0.getVisibility() == 0) {
            group0.setVisibility(8);
            return;
        }
        group0.setVisibility(0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

