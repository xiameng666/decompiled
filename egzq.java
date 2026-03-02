import com.google.android.gms.people.cpg.model.GroupContactOrder;

public final class egzq {
    public final egzr a;
    public final egzs b;
    public final egzt c;

    public egzq(egzr egzr0, ehim ehim0) {
        this.a = egzr0;
        egzs egzs0 = new egzs(ehim0);
        this.b = egzs0;
        this.c = new egzt(egzs0);
    }

    public final void a() {
        this.b.a.clear();
        this.b.b.clear();
    }

    public final boolean b() {
        return this.a.b() ? this.c.c() : false;
    }

    public final void c(egzx egzx0) {
        if(egzx0.d()) {
            GroupContactOrder groupContactOrder0 = egzx0.s;
            if(groupContactOrder0 != null && groupContactOrder0.c()) {
                egfe egfe0 = new egfe(groupContactOrder0);
                egfe0.b = false;
                egfe0.b();
                GroupContactOrder groupContactOrder1 = egfe0.a();
                this.b.b.add(groupContactOrder1);
            }
        }
    }

    public final void d(egzx egzx0, boolean z) {
        if(!this.a.b()) {
            return;
        }
        egzs egzs0 = this.b;
        if(egzx0 == null) {
            egzs0.b(girk.d, z);
            return;
        }
        GroupContactOrder groupContactOrder0 = egzx0.s;
        if(groupContactOrder0 != null) {
            Long long0 = egzx0.h;
            if(long0 == null) {
                egzs0.b(girk.d, z);
                return;
            }
            boolean z1 = groupContactOrder0.c();
            egzs0.a.add(long0.toString());
            egzs0.c(girk.d, z, z1);
            return;
        }
        egzs0.b(girk.d, z);
    }
}

