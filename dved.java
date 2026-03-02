public final class dved implements dpug {
    public final dvfh a;

    public dved(dvfh dvfh0) {
        this.a = dvfh0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        String s;
        int v = ((hkbr)object0).b;
        dvfh dvfh0 = this.a;
        if((hkbq.a(v) == 0 ? 1 : hkbq.a(v)) == 3) {
            dvfh0.C.ii(dvfd.c);
            return;
        }
        int v1 = hkbq.a(v);
        if(v1 == 0) {
            s = "UNRECOGNIZED";
        }
        else {
            switch(v1) {
                case 2: {
                    s = "UNKNOWN";
                    break;
                }
                case 3: {
                    s = "PASSED";
                    break;
                }
                default: {
                    s = v1 == 4 ? "FAILED" : "UNRECOGNIZED";
                }
            }
        }
        dvfh0.i(new Exception("Returned VerifyChallengeStatus was " + s));
    }
}

