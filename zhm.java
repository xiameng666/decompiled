import java.util.Collections;
import java.util.List;

public final class zhm extends lqh {
    public final List a;

    public zhm(List list0) {
        this.a = list0;
        for(Object object0: list0) {
            this.o(((lqd)object0), new zhl(this));
        }
        if(list0.isEmpty()) {
            this.l(Collections.EMPTY_MAP);
        }
    }
}

