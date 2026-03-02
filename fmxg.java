public final class fmxg extends lp {
    private static final String a = "fmxg";

    static {
    }

    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        return ((fmxe)object0).equals(((fmxe)object1));
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        if(((fmxe)object0).b() == ((fmxe)object1).b()) {
            switch(((fmxe)object0).b().ordinal()) {
                case 0: {
                    fmwd fmwd0 = ((fmxe)object0).a();
                    fmwd fmwd1 = ((fmxe)object1).a();
                    return ((fmga)fmwd0.a.d()).a.equals(((fmga)fmwd1.a.d()).a);
                }
                case 1: {
                    fmhr fmhr0 = ((fmxe)object0).d();
                    fmhr fmhr1 = ((fmxe)object1).d();
                    return fmhr0.b.equals(fmhr1.b);
                }
                case 2: {
                    fmwd fmwd2 = ((fmxe)object0).c();
                    fmwd fmwd3 = ((fmxe)object1).c();
                    return ((fmga)fmwd2.a.d()).a.equals(((fmga)fmwd3.a.d()).a);
                }
                case 3: {
                    fmwd fmwd4 = ((fmxe)object0).e();
                    fmwd fmwd5 = ((fmxe)object1).e();
                    return ((fmga)fmwd4.a.d()).a.equals(((fmga)fmwd5.a.d()).a);
                }
                case 4: {
                    break;
                }
                default: {
                    flbj.c(fmxg.a, "Unrecognized messageList cell type");
                    return true;
                }
            }
        }
        return false;
    }
}

