import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class eppq implements azsu {
    public final Bundle a;

    public eppq(Bundle bundle0) {
        this.a = bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof eppq)) {
            return false;
        }
        Bundle bundle0 = this.a;
        Bundle bundle1 = ((eppq)object0).a;
        if(bundle0.size() != bundle1.size()) {
            return false;
        }
        Set set0 = bundle0.keySet();
        if(!set0.containsAll(bundle1.keySet())) {
            return false;
        }
        for(Object object1: set0) {
            if(!bata.b(bundle0.get(((String)object1)), bundle1.get(((String)object1)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        Bundle bundle0 = this.a;
        ArrayList arrayList0 = new ArrayList(bundle0.keySet());
        Collections.sort(arrayList0);
        int v = arrayList0.size();
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            String s = (String)arrayList0.get(v2);
            v1 = (v1 * 0x1F + s.hashCode()) * 0x1F + Arrays.hashCode(new Object[]{bundle0.get(s)});
        }
        return v1;
    }
}

