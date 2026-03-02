import java.util.Arrays;
import java.util.List;

public final class iamu {
    public final List a;
    public final iakk b;
    public final Object[][] c;

    public iamu(List list0, iakk iakk0, Object[][] arr2_object) {
        gftb.z(list0, "addresses are not set");
        this.a = list0;
        gftb.z(iakk0, "attrs");
        this.b = iakk0;
        gftb.z(arr2_object, "customOptions");
        this.c = arr2_object;
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("addrs", this.a);
        gfsv0.add("attrs", this.b);
        gfsv0.add("customOptions", Arrays.deepToString(this.c));
        return gfsv0.toString();
    }
}

