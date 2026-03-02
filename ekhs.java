import java.util.List;

public final class ekhs implements lqj {
    public final ekia a;

    public ekhs(ekia ekia0) {
        this.a = ekia0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekia ekia0 = this.a;
        if(((List)object0) != null && !((List)object0).isEmpty()) {
            ekhr ekhr0 = ekia0.a;
            ekhr0.e = (List)object0;
            ekhr0.a.z(false);
            ekhr0.q();
            return;
        }
        ejze.a().d("CRCA.restore_account_not_populated.");
        ekia0.A();
        ekia0.y();
    }
}

