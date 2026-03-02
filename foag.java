public final class foag implements fnjg {
    public final fnjd a;
    public String b;
    private final fnfm c;

    public foag(fnjd fnjd0, fnfm fnfm0) {
        this.a = fnjd0;
        this.c = fnfm0;
    }

    @Override  // fnjg
    public final void g(gged_interceptors gged0) {
        Object object0;
        fnjd fnjd0 = this.a;
        fnjd0.g(gged0);
        if(!gged0.isEmpty() && fnjd0.a() == null) {
            String s = this.b;
            if(s != null) {
                int v = gged0.size();
                int v1 = 0;
                while(v1 < v) {
                    object0 = gged0.get(v1);
                    ++v1;
                    if(!s.equals(this.c.c(object0))) {
                        continue;
                    }
                    goto label_13;
                }
            }
            object0 = null;
        label_13:
            if(object0 == null || !gged0.contains(object0)) {
                object0 = gged0.get(0);
            }
            gftb.z(object0, "LimitedAvailableAccountsModel cannot set null selected account");
            fnjd0.h(object0);
        }
        if(!gged0.isEmpty()) {
            this.b = null;
        }
    }
}

