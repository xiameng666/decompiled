import java.util.ArrayList;
import java.util.List;

public final class futr {
    public final List a;

    public futr() {
        this.a = new ArrayList(7);
    }

    public final void a(fvtg fvtg0) {
        List list0 = this.a;
        if(list0.isEmpty() || fvtg0.d - ((fvtg)list0.get(list0.size() - 1)).d >= 55000L) {
            list0.add(fvtg0);
            if(list0.size() > 7) {
                list0.remove(0);
            }
        }
    }
}

