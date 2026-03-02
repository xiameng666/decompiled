public final class bvhi {
    public static final bvfn a(ccnb ccnb0, String s) {
        ibts ibts0 = bvhi.c(ccnb0.b);
        cmhx cmhx0 = bvhi.d(0x3047A, null, null, new bvha(ccnb0, s), 6);
        return new bvfn(ccnb0.a, ibts0, cmhx0);
    }

    public static final bvfz b(bvfy bvfy0, int v) {
        ibuq.f(bvfy0, "<this>");
        return new bvfz(bvfy0.a, bvfy0.b, bvhi.d(0x3047C, Integer.valueOf(v), null, new bvhd(bvfy0), 4), bvfy0.c);
    }

    public static final ibts c(ccmy ccmy0) {
        if((ccmy0 instanceof ccmw)) {
            return new bvhe(ccmy0);
        }
        if((ccmy0 instanceof ccmx)) {
            return new bvhf(ccmy0);
        }
        if((ccmy0 instanceof ccmv)) {
            return new bvhg(ccmy0);
        }
        throw new ibnq();
    }

    public static cmhx d(int v, Integer integer0, String s, ibts ibts0, int v1) {
        cmfs cmfs0;
        if((v1 & 8) != 0) {
            ibts0 = null;
        }
        if(ibts0 == null) {
            cmfs0 = null;
        }
        else {
            cmgm cmgm0 = cmgl.a(((ProtoLiteMessage)cmfs.a).v_newBuilder());
            cmgf cmgf0 = cmge.a(((ProtoLiteMessage)cmfe.a).v_newBuilder());
            ibts0.a(cmgf0);
            cmgm0.b(cmgf0.a());
            cmfs0 = cmgm0.a();
        }
        String s1 = (v1 & 4) == 0 ? s : null;
        return (v1 & 2) == 0 ? new cmhx(v, cmfs0, integer0, s1, 20) : new cmhx(v, cmfs0, null, s1, 20);
    }
}

