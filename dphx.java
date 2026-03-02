public final class dphx implements evqc {
    public final dpiz a;
    public final long b;
    public final String c;

    public dphx(dpiz dpiz0, long v, String s) {
        this.a = dpiz0;
        this.b = v;
        this.c = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        hajf hajf0;
        a.ae(dpiz.a.j(), "Failed to execute Delete SEMS Script after deleting token from Fitbit.", exception0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hajh.a).v_newBuilder();
        if((exception0 instanceof dpje)) {
            int v = ((dpje)exception0).a;
            if(v == 7) {
                hajf0 = hajf.H;
            }
            else if(v == 8) {
                hajf0 = hajf.G;
            }
            else {
                hajf0 = hajf.I;
            }
        }
        else {
            hajf0 = hajf.J;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hajh hajh0 = (hajh)hftp1.b_message;
        hajh0.b = hajf0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hajh)hftv0).g = 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hajh)hftv1).c = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hajh hajh1 = (hajh)hftp1.b_message;
        this.c.getClass();
        hajh1.d = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hajh hajh2 = (hajh)hftp1.N_build();
        hajh2.getClass();
        hapr0.bz = hajh2;
        hapr0.f |= 0x40000000;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.h.b(hapr1);
    }
}

