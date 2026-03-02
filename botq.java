public final class botq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = false;
        if((((fqzl)object0).b & 0x1000) != 0) {
            fqxr fqxr0 = ((fqzl)object0).t;
            if(fqxr0 == null) {
                fqxr0 = fqxr.a;
            }
            if(fqxr0.d) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

