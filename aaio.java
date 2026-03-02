public final class aaio implements lqj {
    public final aaiu a;

    public aaio(aaiu aaiu0) {
        this.a = aaiu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        aaiu aaiu0 = this.a;
        grxw grxw0 = aaiu0.d;
        if(!gggq.v(gged0, new aaij(grxw0))) {
            aaiu0.z(gged_interceptors.l(new aaoz("", null, null, grxw0)));
            aaiu0.ai.setVisibility(8);
            return;
        }
        aaiu0.ai.setVisibility(0);
        if(aabu.r(aaiu0.requireContext())) {
            gged0 = gged0.ot();
        }
        if(ggia.i(gged0, aaiu0.aj)) {
            return;
        }
        aaiu0.z(gged0);
    }
}

