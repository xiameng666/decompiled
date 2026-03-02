import java.util.List;

final class igwu extends igvx {
    public igwu(igvt igvt0, List list0) {
        super(igvt0, "IPE Header");
        igvv igvv0 = igvt0.e();
        this.e(new igwe(igvt0, "IPELength"));
        this.e(new igwl(igvt0, "IPEBitMap", list0));
        this.e(new igwt(igvt0, "IPEFormatRevision", 4));
        igvt0.g(igvv0);
        igvt0.c(16);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final String toString() {
        return "";
    }
}

