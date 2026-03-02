public final class bovc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = false;
        if((((fqzv)object0).c & 4) != 0) {
            fqxr fqxr0 = ((fqzv)object0).g;
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

