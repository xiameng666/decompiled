import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class egzs {
    public final Set a;
    public final Set b;
    public final List c;
    private final ehim d;

    public egzs(ehim ehim0) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new ArrayList();
        this.d = ehim0;
    }

    public final girk a(egzx egzx0, egzx egzx1, boolean z) {
        ehhw ehhw0 = new ehhw();
        ehhw0.a(ggna.a);
        egfe egfe0 = new egfe();
        egfe0.b();
        ehhw0.d = egfe0.a();
        String s = egzx1.k;
        if(s != null) {
            ehhw0.a = s;
            gged_interceptors gged0 = egzx1.r;
            if(gged0 != null) {
                ehhw0.a(gged0);
            }
            String s1 = egzx1.n;
            if(s1 != null) {
                ehhw0.c = s1;
            }
            if(egzx0 == null) {
                egfe egfe2 = new egfe();
                egfe2.b();
                ehhw0.d = egfe2.a();
            }
            else {
                GroupContactOrder groupContactOrder0 = egzx0.s;
                if(groupContactOrder0 != null) {
                    egfe egfe1 = new egfe(groupContactOrder0);
                    egfe1.b();
                    ehhw0.d = egfe1.a();
                }
                ehhw0.b = egzx0.n;
            }
            List list0 = this.c;
            String s2 = ehhw0.a;
            if(s2 != null) {
                String s3 = ehhw0.c;
                if(s3 != null) {
                    GroupContactOrder groupContactOrder1 = ehhw0.d;
                    if(groupContactOrder1 != null) {
                        gged_interceptors gged1 = ehhw0.e;
                        if(gged1 != null) {
                            list0.add(new ehhx(s2, ehhw0.b, s3, groupContactOrder1, gged1));
                            this.c(girk.f, z, false);
                            return girk.f;
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(ehhw0.a == null) {
                stringBuilder0.append(" sourceId");
            }
            if(ehhw0.c == null) {
                stringBuilder0.append(" newEtag");
            }
            if(ehhw0.d == null) {
                stringBuilder0.append(" groupContactOrder");
            }
            if(ehhw0.e == null) {
                stringBuilder0.append(" contactSourceIdOrder");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        egig.b("FSA2_GroupContactOrderOp", "Skipping pending cpg write, apiGroup without source id");
        this.d(girk.f, z, 1);
        this.d(girk.f, z, 2);
        return girk.e;
    }

    public final girk b(girk girk0, boolean z) {
        this.d(girk0, z, 1);
        this.d(girk0, z, 3);
        return girk.e;
    }

    public final void c(girk girk0, boolean z, boolean z1) {
        if(z1) {
            this.d(girk0, z, 4);
        }
        this.d(girk0, z, 1);
    }

    private final void d(girk girk0, boolean z, int v) {
        if(girk0 != girk.e && girk0 != girk.a) {
            this.d.h(girk0, gjgi.h, z, v, 1);
        }
    }
}

