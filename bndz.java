import com.google.android.gms.fido.common.Transport;
import java.util.Comparator;
import java.util.List;

public final class bndz implements Comparator {
    private final Transport a;

    public bndz(Transport transport0) {
        this.a = transport0;
    }

    private final boolean a(blxx blxx0) {
        List list0 = blxx0.a.d;
        return list0 == null ? false : list0.contains(this.a);
    }

    @Override
    public final int compare(Object object0, Object object1) {
        boolean z = this.a(((blxx)object0));
        boolean z1 = this.a(((blxx)object1));
        if(z) {
            if(!z1) {
                return -1;
            }
            z1 = true;
        }
        if(!z && z1) {
            return 1;
        }
        if(z) {
            return 0;
        }
        List list0 = ((blxx)object0).a.d;
        if(list0 == null && ((blxx)object1).a.d == null) {
            return 0;
        }
        return list0 == null ? -1 : 1;
    }
}

