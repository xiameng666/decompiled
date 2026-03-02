public final class ifo {
    public static final int a(igl igl0, hxw hxw0) {
        igl igl1 = igl0.N();
        if(igl1 == null) {
            hxt.d(a.i(igl0, "Child of ", " cannot be null when calculating alignment line"));
        }
        if(igl0.K().e().containsKey(hxw0)) {
            Integer integer0 = (Integer)igl0.K().e().get(hxw0);
            return integer0 == null ? 0x80000000 : ((int)integer0);
        }
        int v = igl1.ee(hxw0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        igl1.k = true;
        igl0.l = true;
        igl0.S();
        igl1.k = false;
        igl0.l = false;
        return (hxw0 instanceof hyy) ? v + jlf.b(igl1.I()) : v + jlf.a(igl1.I());
    }
}

