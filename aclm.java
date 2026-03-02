import java.util.ArrayList;
import java.util.List;

public final class aclm implements glzn {
    public final acln a;
    public final List b;
    public final ProtoLiteBuilder c;

    public aclm(acln acln0, List list0, ProtoLiteBuilder hftp0) {
        this.a = acln0;
        this.b = list0;
        this.c = hftp0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = this.b;
        for(Object object1: list0) {
            arrayList0.add(((acma)object0).a(((String)object1)));
        }
        return gmbu.c(arrayList0).a(new acll(arrayList0, this.c, list0), this.a.b);
    }
}

