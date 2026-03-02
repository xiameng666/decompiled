import java.util.List;
import java.util.Set;

public final class ekip implements lqj {
    public final ekih a;

    public ekip(ekih ekih0) {
        this.a = ekih0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekih ekih0 = this.a;
        ekit ekit0 = ekih0.e;
        ekit0.C(false);
        if(((List)object0) == null || ((List)object0).isEmpty()) {
            ejze.a().d("CRSA.gms_restore_source_no_loaded");
            ekit0.H();
            ekit0.z(false);
        }
        ejze.a().b(0, 0, ((List)object0).size());
        ekih0.i = (List)object0;
        ekih0.a.c = ((List)object0).size() == 1;
        Set set0 = ekih0.a.l();
        if(set0 != null) {
            ekih0.I(((boolean)(set0.isEmpty() ^ 1)));
        }
        else if(((List)object0).size() == 1) {
            ekih0.I(true);
        }
        else {
            ekih0.I(false);
        }
        ekih0.q();
    }
}

