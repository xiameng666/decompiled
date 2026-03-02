public final class coxm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((cpfi)object0).b & 1) != 0) {
            cpfh cpfh0 = ((cpfi)object0).c;
            if(cpfh0 == null) {
                cpfh0 = cpfh.a;
            }
            cpad cpad0 = (cpfh0.b & 1) == 0 || (cpfh0.b & 2) == 0 || (cpfh0.b & 4) == 0 || (cpfh0.b & 8) == 0 || (cpfh0.b & 0x20) == 0 || (cpfh0.b & 16) == 0 ? null : new cpad(cpfh0.e, cpfh0.d, cpfh0.c, (cpfh0.h == null ? cpfs.a : cpfh0.h), (cpfh0.g == null ? cpga.b : cpfh0.g), System.currentTimeMillis());
            if(cpad0 == null) {
                return null;
            }
            cpfh cpfh1 = ((cpfi)object0).c;
            if(cpfh1 == null) {
                cpfh1 = cpfh.a;
            }
            return new coxq(cpad0, cpfh1.f);
        }
        return null;
    }
}

