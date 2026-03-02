import androidx.appsearch.safeparcel.PackageIdentifierParcel;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class afr extends ajk {
    final List a;
    final List b;
    final PackageIdentifierParcel c;
    private Integer d;
    private List e;
    private Set f;

    public afr(List list0, List list1, PackageIdentifierParcel packageIdentifierParcel0) {
        this.a = (List)Objects.requireNonNull(list0);
        this.b = (List)Objects.requireNonNull(list1);
        this.c = packageIdentifierParcel0;
    }

    public final afj a() {
        return this.c == null ? null : new afj(this.c);
    }

    public final List b() {
        if(this.e == null) {
            List list0 = this.a;
            this.e = new ArrayList(list0.size());
            for(int v = 0; v < list0.size(); ++v) {
                this.e.add(new afj(((PackageIdentifierParcel)list0.get(v))));
            }
        }
        return this.e;
    }

    public final Set c() {
        if(this.f == null) {
            List list0 = this.b;
            this.f = new bxf(list0.size());
            for(int v = 0; v < list0.size(); ++v) {
                int[] arr_v = ((agg)list0.get(v)).a;
                bxf bxf0 = new bxf(arr_v.length);
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    bxf0.add(Integer.valueOf(arr_v[v1]));
                }
                Set set0 = this.f;
                if(set0 != null) {
                    set0.add(bxf0);
                }
            }
        }
        return (Set)Objects.requireNonNull(this.f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof afr) ? Objects.equals(this.a, ((afr)object0).a) && Objects.equals(this.b, ((afr)object0).b) && Objects.equals(this.c, ((afr)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        if(this.d == null) {
            this.d = Objects.hash(new Object[]{this.a, this.b, this.c});
        }
        return (int)this.d;
    }
}

