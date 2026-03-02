import j..util.Optional;

public final class ebun implements evqk {
    public final ebup a;

    public ebun(ebup ebup0) {
        this.a = ebup0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((Optional)object0).isPresent()) {
            gged_interceptors gged0 = gged_interceptors.l(((dyhj)((Optional)object0).get()));
            return this.a.c(gged0);
        }
        return this.a.c(ggna.a);
    }
}

