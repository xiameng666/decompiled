final class cng {
    public final cil a;
    public cht b;
    public cht c;
    public final float d;
    private cht e;

    public cng(cil cil0) {
        this.a = cil0;
        this.d = cil0.a();
    }

    public final cht a(cht cht0, cht cht1) {
        if(this.e == null) {
            this.e = cht0.c();
        }
        cht cht2 = this.e;
        if(cht2 == null) {
            ibuq.j("targetVector");
            cht2 = null;
        }
        int v = cht2.b();
        for(int v1 = 0; v1 < v; ++v1) {
            cht cht3 = this.e;
            if(cht3 == null) {
                ibuq.j("targetVector");
                cht3 = null;
            }
            float f = cht0.a(v1);
            float f1 = cht1.a(v1);
            cht3.e(v1, this.a.b(f, f1));
        }
        cht cht4 = this.e;
        if(cht4 == null) {
            ibuq.j("targetVector");
            return null;
        }
        return cht4;
    }

    public final cht b(long v, cht cht0, cht cht1) {
        if(this.c == null) {
            this.c = cht0.c();
        }
        cht cht2 = this.c;
        if(cht2 == null) {
            ibuq.j("velocityVector");
            cht2 = null;
        }
        int v1 = cht2.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            cht cht3 = this.c;
            if(cht3 == null) {
                ibuq.j("velocityVector");
                cht3 = null;
            }
            cht0.a(v2);
            float f = cht1.a(v2);
            cht3.e(v2, this.a.e(v, f));
        }
        cht cht4 = this.c;
        if(cht4 == null) {
            ibuq.j("velocityVector");
            return null;
        }
        return cht4;
    }
}

