import org.json.JSONObject;

public final class igwd extends igvx {
    public igwd(igvt igvt0) {
        super(igvt0, "IPE Instance ID");
        igvv igvv0 = igvt0.e();
        this.e(new igwt(igvt0, "KID", 4));
        this.e(new igwt(igvt0, "INP#", 4));
        this.e(new igvy(igvt0, "ISAMID"));
        this.e(new igvy(igvt0, "ISAMS#", null));
        this.e(new igvy(igvt0, "Seal", 0x40));
        igvt0.g(igvv0);
        igvt0.h(16);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        return s.equals("json") ? igvr.a(this) : ((igvx)this.b.get(0)).toString() + ((igvx)this.b.get(1)).toString() + ((igvx)this.b.get(2)).toString() + ((igvx)this.b.get(3)).toString();
    }

    @Override  // igvx
    public final String toString() {
        return "n/a";
    }
}

