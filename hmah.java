import java.util.Map;

public final class hmah implements hlyb {
    @Override  // hlyb
    public final hlym a(String s, hlxv hlxv0, int v, int v1, Map map0) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if(hlxv0 != hlxv.l) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + hlxv0);
        }
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(a.z(v1, v, "Requested dimensions are too small: ", "x"));
        }
        hmai hmai0 = hmai.a;
        int v2 = 4;
        if(map0 != null) {
            hlxx hlxx0 = hlxx.a;
            if(map0.containsKey(hlxx0)) {
                String s1 = map0.get(hlxx0).toString();
                hmai0 = (hmai)Enum.valueOf(hmai.class, s1);
            }
            hlxx hlxx1 = hlxx.f;
            if(map0.containsKey(hlxx1)) {
                v2 = Integer.parseInt(map0.get(hlxx1).toString());
            }
        }
        hmao hmao0 = hmap.b(s, hmai0, map0).e;
        if(hmao0 == null) {
            throw new IllegalStateException();
        }
        int v3 = v2 + v2;
        int v4 = hmao0.b;
        int v5 = v4 + v3;
        int v6 = Math.max(v, v5);
        int v7 = hmao0.c;
        int v8 = v3 + v7;
        int v9 = Math.max(v1, v8);
        int v10 = Math.min(v6 / v5, v9 / v8);
        hlym hlym0 = new hlym(v6, v9);
        int v11 = (v9 - v7 * v10) / 2;
        int v12 = 0;
        while(v12 < v7) {
            int v13 = (v6 - v4 * v10) / 2;
            int v14 = 0;
            while(v14 < v4) {
                if(hmao0.a(v14, v12) == 1) {
                    hlym0.c(v13, v11, v10, v10);
                }
                ++v14;
                v13 += v10;
            }
            ++v12;
            v11 += v10;
        }
        return hlym0;
    }
}

