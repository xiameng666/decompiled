public final class bgj implements kar {
    public final bgs a;

    public bgj(bgs bgs0) {
        this.a = bgs0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        if(((bgr)object0).a.a()) {
            bcs.d("ProcessingNode", "The postview image is closed due to request aborted");
            ((bgr)object0).b.close();
            return;
        }
        bgh bgh0 = new bgh(this.a, ((bgr)object0));
        this.a.a.execute(bgh0);
    }
}

