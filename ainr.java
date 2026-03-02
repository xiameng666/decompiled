import java.util.ArrayList;

public final class ainr implements glzm {
    public final ainy a;
    public final ArrayList b;

    public ainr(ainy ainy0, ArrayList arrayList0) {
        this.a = ainy0;
        this.b = arrayList0;
    }

    @Override  // glzm
    public final gmcd a() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.b;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gfsx gfsx0 = (gfsx)gmbu.r(((gmcd)arrayList1.get(v1)));
            if(gfsx0.i() && !arrayList0.contains(gfsx0.d())) {
                arrayList0.add(((String)gfsx0.d()));
            }
        }
        return this.a.d.i(arrayList0);
    }
}

