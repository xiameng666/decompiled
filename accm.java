import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class accm implements luo {
    final accn a;
    private final lvb b;

    public accm(accn accn0, lvb lvb0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
        this.b = lvb0;
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return this.b;
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        int v = lvb0.getId();
        if(((ArrayList)object0) != null) {
            accn accn0 = this.a;
            LoaderSectionInfo loaderSectionInfo0 = (LoaderSectionInfo)accn0.aw.get(v);
            List list0 = accn0.C(v, ((ArrayList)object0));
            if(loaderSectionInfo0.a.hashCode() == 315730723 && loaderSectionInfo0.a.equals("suggested")) {
                accn0.aH = list0.size();
            }
            else {
                accn0.aI = list0.size();
            }
            if(loaderSectionInfo0.e) {
                ArrayList arrayList0 = new ArrayList(list0);
                acfd.c(arrayList0, accn0.an, accn0.ao, accn0.ap);
                accn0.aF.g.addAll(arrayList0);
            }
        }
        accn accn1 = this.a;
        SparseBooleanArray sparseBooleanArray0 = accn1.ax;
        int v1 = 0;
        if(!sparseBooleanArray0.get(v, false)) {
            if((lvb0 instanceof acdt)) {
                v1 = ((acdt)lvb0).c ^ 1;
            }
            sparseBooleanArray0.put(v, true);
            accn1.H(((boolean)v1));
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }
}

