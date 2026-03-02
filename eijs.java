import java.util.HashSet;
import java.util.Set;

public final class eijs implements Runnable {
    public final eikb a;
    public final Set b;

    public eijs(eikb eikb0, Set set0) {
        this.a = eikb0;
        this.b = set0;
    }

    @Override
    public final void run() {
        eikb eikb0 = this.a;
        eikx eikx0 = eikb0.b.w();
        eilb eilb0 = new eilb(a.aF(((HashSet)this.b), "DELETE FROM Scan WHERE macAddress not in ("), this.b);
        Integer integer0 = (Integer)oqj.b(((eilf)eikx0).a, false, true, eilb0);
        eikj eikj0 = eikb0.b.u();
        eikp eikp0 = new eikp(a.aF(((HashSet)this.b), "DELETE FROM DEVICEDATA WHERE macAddress not in ("), this.b);
        if(((int)(((Integer)oqj.b(((eikt)eikj0).a, false, true, eikp0)))) > 0) {
            eikb0.j();
        }
    }
}

