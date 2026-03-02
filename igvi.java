import org.json.JSONObject;

public final class igvi implements ftrx {
    @Override  // ftrx
    public final ftrr a(JSONObject jSONObject0, fsbl fsbl0, ftrs ftrs0, dqqy dqqy0) {
        igvo[] arr_igvo;
        try {
            igvd igvd0 = new igvd(jSONObject0);
            igvd.k(igvd0.c[0].a);
            int v = igvd0.a();
            if(igvd0.c.length != v) {
                throw new igvg(0x6B86);
            }
            int v1 = igvd0.c();
            if(igvd0.c[igvd0.a() - 2].a.length != v1 || igvd0.c[igvd0.a() - 1].a.length != v1) {
                throw new igvg(0x6B87);
            }
            int v2 = 1;
            while(true) {
                arr_igvo = igvd0.c;
                int v3 = arr_igvo.length;
                if(v2 >= v3 - 2) {
                    break;
                }
                int v4 = igvd0.b();
                if(arr_igvo[v2].a.length != v4) {
                    throw new igvg(((short)(v2 + 0x6B00)));
                }
                ++v2;
                continue;
            }
            if(arr_igvo != null) {
                for(int v5 = 0; v5 < v3; ++v5) {
                    arr_igvo[v5].b = false;
                }
            }
            return new igvm(igvd0, fsbl0, ftrs0, dqqy0);
        }
        catch(Exception unused_ex) {
            throw new ftrq();
        }
    }
}

