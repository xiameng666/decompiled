import java.util.List;

public final class ekir implements lqj {
    public final ekjl a;

    public ekir(ekjl ekjl0) {
        this.a = ekjl0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekjl ekjl0 = this.a;
        ekit ekit0 = ekjl0.e;
        boolean z = false;
        ekit0.C(false);
        if(((List)object0) == null || ((List)object0).isEmpty()) {
            ejze.a().d("CRSA.restore_source_no_loaded");
            ekit0.H();
            ekit0.z(false);
        }
        ejze.a().b(((List)object0).size(), 0, 0);
        ekjl0.g = (List)object0;
        ejyv ejyv0 = ekjl0.a;
        if(((List)object0).size() == 1) {
            z = true;
        }
        ejyv0.c = z;
        ejyv0.w(((List)object0));
        if(ejyv0.l() != null) {
            ekjl0.n(((boolean)(ejyv0.l().isEmpty() ^ 1)));
        }
        ekjl0.q();
    }
}

