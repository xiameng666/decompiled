public final class ccfy implements gfsi {
    public final ccgo a;

    public ccfy(ccgo ccgo0) {
        this.a = ccgo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((Boolean)object0).booleanValue()) {
            ccgo.a.i("JobScheduler returned failure after successful run!");
            this.a.d.c(0x468);
        }
        return null;
    }
}

