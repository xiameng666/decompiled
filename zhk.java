import java.util.Collections;
import java.util.List;

public final class zhk extends lqh {
    public final List a;

    public zhk(List list0) {
        this.a = list0;
        for(Object object0: list0) {
            this.o(((lqd)object0), new zhj(this));
        }
        if(list0.isEmpty()) {
            this.l(Collections.EMPTY_LIST);
        }
    }
}

