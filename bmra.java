public final class bmra implements cjis {
    public final bmrf a;

    public bmra(bmrf bmrf0) {
        this.a = bmrf0;
    }

    @Override  // cjis
    public final void a(int v) {
        blrs blrs0 = this.a.b;
        if(v != 0) {
            blrs0.a(new bmby("Too many attempts. User locked out."));
            return;
        }
        blrs0.a(new bmbz("The flow was cancelled"));
    }
}

