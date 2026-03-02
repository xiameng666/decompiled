public final class aqvc {
    private grkh a;
    private int b;

    public final aqvd a() {
        int v = this.b;
        if(v != 0) {
            grkh grkh0 = this.a;
            if(grkh0 != null) {
                return new aqvd(v, grkh0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == 0) {
            stringBuilder0.append(" callSite");
        }
        if(this.a == null) {
            stringBuilder0.append(" auditToken");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(grkh grkh0) {
        if(grkh0 == null) {
            throw new NullPointerException("Null auditToken");
        }
        this.a = grkh0;
    }

    public final void c(int v) {
        if(v == 0) {
            throw new NullPointerException("Null callSite");
        }
        this.b = v;
    }
}

