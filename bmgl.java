public final class bmgl {
    public static bmgm a(int v) {
        if(v == bmiu.d.i) {
            return bmiu.h;
        }
        bmiu[] arr_bmiu = bmiu.values();
        for(int v2 = 0; v2 < arr_bmiu.length; ++v2) {
            bmgm bmgm0 = arr_bmiu[v2];
            if(bmgm0.i == v) {
                return bmgm0;
            }
        }
        bmhq[] arr_bmhq = bmhq.values();
        for(int v1 = 0; v1 < arr_bmhq.length; ++v1) {
            bmgm bmgm1 = arr_bmhq[v1];
            if(bmgm1.h == v) {
                return bmgm1;
            }
        }
        throw new bmhm(v);
    }
}

