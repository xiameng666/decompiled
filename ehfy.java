import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.Set;

public final class ehfy {
    public final ehab a;
    public final egzq b;
    private final ehim c;

    public ehfy(ehim ehim0, ehab ehab0, egzq egzq0) {
        this.c = ehim0;
        this.a = ehab0;
        this.b = egzq0;
    }

    public final void a() {
        if(hwyi.z()) {
            egzq egzq0 = this.b;
            egzr egzr0 = egzq0.a;
            if(egzr0.b()) {
                egzs egzs0 = egzq0.b;
                Set set0 = egzs0.b;
                if(!set0.isEmpty() || !egzs0.a.isEmpty()) {
                    ggfp ggfp0 = ggfp.G(set0);
                    if(ggfp0.isEmpty() || egzr0.f(ggfp0)) {
                        if(ggfp.G(egzs0.a).isEmpty() || egzr0.d(egzs0.a)) {
                            if(egzr0.c()) {
                                egzq0.a();
                                return;
                            }
                            egig.b("FSA2_CpgOperator", "Failed to flush pending CPG operations into AppSearch");
                            throw new ehfh(new ehfg(9, "Failed to flush pending CPG operations into AppSearch"));
                        }
                        egig.b("FSA2_GroupContactOrderOp", "Failed to remove group contact orders from AppSearch");
                        throw new ehfh(new ehfg(9, "Failed to remove group contact orders from AppSearch"));
                    }
                    egig.b("FSA2_GroupContactOrderOp", "Failed to upsert group contact orders");
                    throw new ehfh(new ehfg(9, "Failed to upsert group contact orders into AppSearch"));
                }
            }
        }
    }

    public final void b(egzx egzx0) {
        if(hwyi.z()) {
            this.b.c(egzx0);
        }
    }

    public final void c(Long long0) {
        this.a.d.m(long0);
    }

    public final void d(egzx egzx0, boolean z) {
        if(hwyi.z() && !z) {
            this.b.c(egzx0);
        }
        this.a.d.m(egzx0.h);
    }

    public final void e(Long long0) {
        this.a.d.d(long0, true);
    }

    public final void f(ehhn ehhn0, boolean z) {
        girk girk2;
        boolean z3;
        girk girk0;
        boolean z2;
        egzx egzx0 = (egzx)ehhn0.b;
        egzx egzx1 = (egzx)ehhn0.a;
        egiv.R();
        boolean z1 = true;
        int v = egiv.v().booleanValue() ^ 1;
        batl.s(egzx1);
        ehac ehac0 = this.a.d;
        if(egzx1.f) {
            if(((int)z)) {
                this.c.h(girk.d, gjgi.c, true, 1, 1);
                z2 = true;
            }
            else {
                z2 = false;
            }
            if(egzx0 == null) {
                this.c.h(girk.d, gjgi.c, z2, 3, 1);
                return;
            }
            if(egzx0.e) {
                this.c.h(girk.d, gjgi.c, z2, 4, 1);
            }
            if(hwyi.z()) {
                this.b.d(egzx0, z2);
            }
            ehac0.d(egzx0.h, true);
            return;
        }
        int v1 = v | ((int)z);
        if(egzx0 == null) {
            if(((int)z) == 0) {
                z1 = false;
            }
            else {
                this.c.h(girk.b, gjgi.c, true, 1, 1);
            }
            if(hwyi.z()) {
                egzq egzq0 = this.b;
                if(egzq0.a.b()) {
                    egzs egzs0 = egzq0.b;
                    if(egzx1.d()) {
                        girk0 = !hwyi.x() || egzx1.e() ? egzs0.a(null, egzx1, z1) : egzs0.b(girk.b, z1);
                    }
                    else {
                        girk0 = egzs0.b(girk.b, z1);
                    }
                }
                else {
                    girk0 = girk.e;
                }
                ehac0.o(ehfy.i(egzx1, girk0, null), ((boolean)v1));
                return;
            }
            ehac0.o(egzx1, ((boolean)v1));
            return;
        }
        if(((int)z) == 0) {
            z3 = false;
        }
        else {
            ehim ehim0 = this.c;
            girk girk1 = girk.c;
            gjgi gjgi0 = gjgi.c;
            ehim0.h(girk1, gjgi0, true, 1, 1);
            if(egzx0.e) {
                ehim0.h(girk1, gjgi0, true, 4, 1);
            }
            z3 = true;
        }
        if(hwyi.z()) {
            egzq egzq1 = this.b;
            if(egzq1.a.b()) {
                egzs egzs1 = egzq1.b;
                if(!egzx0.d() && !egzx1.d()) {
                    girk2 = egzs1.b(girk.c, z3);
                }
                else if(hwyi.x() && !egzx1.e() && !egzx0.e()) {
                    girk2 = egzs1.b(girk.c, z3);
                }
                else {
                    Long long0 = egzx0.h;
                    if(long0 != null && !egzx0.t && !egzx1.t) {
                        egfe egfe0 = new egfe();
                        egfe0.b();
                        egfe0.a = long0.toString();
                        egfe0.c(egzx1.c());
                        GroupContactOrder groupContactOrder0 = egzx0.s;
                        girk girk3 = girk.b;
                        if(groupContactOrder0 == null) {
                            z1 = false;
                        label_87:
                            GroupContactOrder groupContactOrder1 = egfe0.a();
                            egzs1.b.add(groupContactOrder1);
                            egzs1.c(girk3, z3, z1);
                            girk2 = girk3;
                        }
                        else if(z3 && groupContactOrder0.c() && !egzx1.d()) {
                            girk2 = egzs1.b(girk.c, true);
                        }
                        else if(hwyi.y() && !egzx1.d() && ((long)groupContactOrder0.b().size()) >= hwyi.b()) {
                            egig.k("FSA2_GroupContactOrderOp", "Skipping overwrite for oversized CPG group");
                            girk2 = egzs1.b(girk.c, z3);
                        }
                        else {
                            egfe0.c = groupContactOrder0.a();
                            if(groupContactOrder0.a() > 0L) {
                                girk3 = girk.c;
                            }
                            if(!z3 || !groupContactOrder0.c()) {
                                z1 = false;
                            }
                            goto label_87;
                        }
                    }
                    else {
                        girk2 = egzs1.a(egzx0, egzx1, z3);
                    }
                }
            }
            else {
                girk2 = girk.e;
            }
            ehac0.n(egzx0, ehfy.i(egzx1, girk2, egzx0.n), ((boolean)v1));
            return;
        }
        ehac0.n(egzx0, egzx1, ((boolean)v1));
    }

    public final void g(egzx egzx0) {
        this.a.d.j(egzx0.h, egzx0.u, egzx0.i);
    }

    public final void h(egzx egzx0) {
        if(egzx0.f()) {
            egig.d("LocalGroupsWriter", "suppressed attempt to delete group isStarred = %s", new Object[]{Boolean.valueOf(egzx0.e())});
            return;
        }
        if(hwyi.z()) {
            this.b.d(egzx0, false);
        }
        this.a.d.d(egzx0.h, true);
    }

    private static final egzx i(egzx egzx0, girk girk0, String s) {
        if(girk0 != girk.f) {
            return egzx0;
        }
        egzw egzw0 = new egzw(egzx0);
        egzw0.g = s;
        return egzw0.a();
    }
}

