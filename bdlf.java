import androidx.activity.result.ActivityResult;

public final class bdlf implements acn {
    public final bdmb a;

    public bdlf(bdmb bdmb0) {
        this.a = bdmb0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "activityResult");
        int v = ((ActivityResult)object0).a;
        bdmg bdmg0 = this.a.y();
        icnl icnl0 = bdmg0.l;
        do {
            Object object1 = icnl0.b();
            bdtu bdtu0 = (bdtu)object1;
            bdtu bdtu1 = (bdtu0 instanceof bdts) ? bdtu0 : null;
            if(((bdts)bdtu1) == null) {
                ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu0.getClass()).c(), new ibuk(bdts.class).c());
            }
            else {
                bdtu0 = ((bdts)bdtu1).a();
            }
        }
        while(!icnl0.h(object1, bdtu0));
        if(v != -1) {
            do {
                Object object2 = icnl0.b();
                bdtu bdtu2 = (bdtu)object2;
                bdtu bdtu3 = (bdtu2 instanceof bdtr) ? bdtu2 : null;
                if(((bdtr)bdtu3) == null) {
                    ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu2.getClass()).c(), new ibuk(bdtr.class).c());
                }
                else {
                    bdtu2 = ((bdtr)bdtu3).b();
                }
            }
            while(!icnl0.h(object2, bdtu2));
            return;
        }
        bdmg0.a();
    }
}

