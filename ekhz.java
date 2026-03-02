final class ekhz implements oyj {
    final ekia a;

    public ekhz(ekia ekia0) {
        this.a = ekia0;
    }

    @Override  // oyj
    public final void a() {
        ekia ekia0 = this.a;
        xni xni0 = (xni)ekia0.getContext();
        if(ekmu.d(xni0.getApplicationContext())) {
            if(ekia0.ai != null && ekia0.ai.l()) {
                ekia0.ai.e();
            }
            lqd lqd0 = ekia0.ag;
            if(lqd0 != null) {
                lqd0.k(ekia0);
            }
            String s = ekia0.c.i();
            String s1 = ekia0.c.j();
            ekia0.ag = ekia0.b.a(s, s1, ekia0.b.j());
            ekia0.ag.g(ekia0, new ekhs(ekia0));
            return;
        }
        xni0.setResult(0);
        xni0.finish();
        ekia0.ai = fyxp.s(ekia0.getView(), 0x7F1528C2, 0);  // string:romanesco_restore_no_connection "Check connection and try again"
        ekia0.ai.i();
        ekia0.z(false);
    }
}

