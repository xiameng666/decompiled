import org.json.JSONObject;

public final class igwy extends igvx {
    public igwy(igvt igvt0, String s) {
        super(igvt0, s);
        igvv igvv0 = igvt0.e();
        igvw igvw0 = new igvw(igvt0, s + "Length");
        this.e(igvw0);
        int v = 1;
        if(((short)(((Short)igvw0.b()))) != 0) {
            igvv igvv1 = igvt0.e();
            igvw igvw1 = new igvw(igvt0, s + "Length");
            if(((short)(((Short)igvw0.b()))) == ((short)(((Short)igvw1.b())))) {
                this.e(igvw1);
                v = 2;
            }
            else {
                igvt0.g(igvv1);
            }
            this.e(new igwk(igvt0, s, ((short)(((Short)igvw0.b()))) * 8));
            v += (short)(((Short)igvw0.b()));
        }
        igvt0.g(igvv0);
        igvt0.h(v);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        if(s.equals("json")) {
            return igvr.a(this);
        }
        return this.b != null && this.b.size() > 0 ? ((igvx)this.b.get(1)).a(s, jSONObject0) : "";
    }
}

