import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

public final class eiqf extends wby implements eiqg {
    private final evqp a;

    public eiqf() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    public eiqf(evqp evqp0) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = evqp0;
    }

    @Override  // eiqg
    public final void a(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void b(Status status0, DogfoodsToken dogfoodsToken0) {
        azzf.b(status0, dogfoodsToken0, this.a);
    }

    @Override  // eiqg
    public final void c(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void d(Status status0, ExperimentTokens experimentTokens0) {
        azzf.b(status0, experimentTokens0, this.a);
    }

    @Override  // eiqg
    public final void e(Status status0, Configurations configurations0) {
        azzf.b(status0, configurations0, this.a);
    }

    @Override  // eiqg
    public final void f(Status status0, Configurations configurations0) {
        azzf.b(status0, configurations0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.j(status0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.n(status1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.m(status2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                Configurations configurations0 = (Configurations)wbz.a(parcel0, Configurations.CREATOR);
                eiqf.gr(parcel0);
                this.f(status3, configurations0);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.a(status4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                ExperimentTokens experimentTokens0 = (ExperimentTokens)wbz.a(parcel0, ExperimentTokens.CREATOR);
                eiqf.gr(parcel0);
                this.d(status5, experimentTokens0);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                DogfoodsToken dogfoodsToken0 = (DogfoodsToken)wbz.a(parcel0, DogfoodsToken.CREATOR);
                eiqf.gr(parcel0);
                this.b(status6, dogfoodsToken0);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.c(status7);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                Flag flag0 = (Flag)wbz.a(parcel0, Flag.CREATOR);
                eiqf.gr(parcel0);
                this.g(status8, flag0);
                return true;
            }
            case 10: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                Configurations configurations1 = (Configurations)wbz.a(parcel0, Configurations.CREATOR);
                eiqf.gr(parcel0);
                this.e(status9, configurations1);
                return true;
            }
            case 11: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.readLong();
                eiqf.gr(parcel0);
                this.o(status10);
                return true;
            }
            case 12: {
                Status status11 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.l(status11);
                return true;
            }
            case 13: {
                Status status12 = (Status)wbz.a(parcel0, Status.CREATOR);
                FlagOverrides flagOverrides0 = (FlagOverrides)wbz.a(parcel0, FlagOverrides.CREATOR);
                eiqf.gr(parcel0);
                this.i(status12, flagOverrides0);
                return true;
            }
            case 14: {
                Status status13 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                this.k(status13);
                return true;
            }
            case 15: {
                Status status14 = (Status)wbz.a(parcel0, Status.CREATOR);
                eiqf.gr(parcel0);
                azzf.a(status14, this.a);
                return true;
            }
            case 16: {
                Status status15 = (Status)wbz.a(parcel0, Status.CREATOR);
                long v1 = parcel0.readLong();
                eiqf.gr(parcel0);
                this.h(status15, v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eiqg
    public final void g(Status status0, Flag flag0) {
        azzf.b(status0, flag0, this.a);
    }

    @Override  // eiqg
    public final void h(Status status0, long v) {
        azzf.b(status0, Long.valueOf(v), this.a);
    }

    @Override  // eiqg
    public final void i(Status status0, FlagOverrides flagOverrides0) {
        azzf.b(status0, flagOverrides0, this.a);
    }

    @Override  // eiqg
    public final void j(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void k(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void l(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void m(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void n(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // eiqg
    public final void o(Status status0) {
        azzf.b(status0, null, this.a);
    }
}

