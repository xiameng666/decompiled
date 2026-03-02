import android.view.View;

public final class aahi implements lqj {
    public final aahl a;

    public aahi(aahl aahl0) {
        this.a = aahl0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aahl aahl0 = this.a;
        if(!((Boolean)object0).booleanValue()) {
            aahl0.ag.k(false);
            View view0 = aahl0.ai;
            batl.s(view0);
            view0.setVisibility(8);
            return;
        }
        if(aahl0.ah.getVisibility() == 0) {
            View view1 = aahl0.ai;
            batl.s(view1);
            view1.setVisibility(8);
            aahl0.ag.k(true);
            return;
        }
        View view2 = aahl0.ai;
        batl.s(view2);
        view2.setVisibility(0);
        aahl0.ag.k(false);
    }
}

