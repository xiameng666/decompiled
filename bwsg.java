import java.util.Collections;
import java.util.Set;

public final class bwsg {
    public final Set a;
    public final Set b;

    public bwsg(Set set0, Set set1) {
        if(set0 == null) {
            set0 = Collections.EMPTY_SET;
        }
        this.a = set0;
        if(set1 == null) {
            set1 = Collections.EMPTY_SET;
        }
        this.b = set1;
    }
}

