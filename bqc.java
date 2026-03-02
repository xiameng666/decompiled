import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class bqc {
    public final Collection a;
    public final Collection b;
    public final List c;
    public final List d;
    public final List e;
    public final bud f;
    public final ben g;
    public final Map h;
    public final bqo i;
    public final bqo j;

    public bqc(Collection collection0, Collection collection1, List list0, List list1, List list2, bud bud0, ben ben0, Map map0, bqo bqo0, bqo bqo1) {
        this.a = collection0;
        this.b = collection1;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = bud0;
        this.g = ben0;
        this.h = map0;
        this.i = bqo0;
        this.j = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bqc)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bqc)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bqc)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bqc)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bqc)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((bqc)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((bqc)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((bqc)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((bqc)object0).h)) {
            return false;
        }
        return ibuq.m(this.i, ((bqc)object0).i) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        ben ben0 = this.g;
        if(ben0 != null) {
            v1 = ben0.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=null)";
    }
}

