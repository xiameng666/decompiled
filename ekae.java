public final class ekae implements gfsi {
    public final String a;
    public final Boolean b;

    public ekae(String s, Boolean boolean0) {
        this.a = s;
        this.b = boolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s;
        int v1 = -1;
        for(int v = 0; true; ++v) {
            s = this.a;
            if(v >= ((ejyo)object0).g.size()) {
                break;
            }
            if(((ejyp)((ejyo)object0).g.get(v)).c.equals(s)) {
                v1 = v;
            }
        }
        if(v1 != -1) {
            ejyp ejyp0 = (ejyp)((ejyo)object0).g.get(v1);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ejyp0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ejyp0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ejyp ejyp1 = (ejyp)hftp0.b_message;
            ejyp1.b |= 2;
            ejyp1.d = true;
            ejyp ejyp2 = (ejyp)hftp0.N_build();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((ejyo)object0))));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ejyo ejyo0 = (ejyo)hftp1.b_message;
            ejyp2.getClass();
            ejyo0.d();
            ejyo0.g.set(v1, ejyp2);
            return (ejyo)hftp1.N_build();
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((ejyo)object0))));
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ejyp.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ejyp ejyp3 = (ejyp)hftp3.b_message;
        s.getClass();
        ejyp3.b |= 1;
        ejyp3.c = s;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ejyp ejyp4 = (ejyp)hftp3.b_message;
        ejyp4.b |= 2;
        ejyp4.d = true;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ejyo ejyo1 = (ejyo)hftp2.b_message;
        ejyp ejyp5 = (ejyp)hftp3.N_build();
        ejyp5.getClass();
        ejyo1.d();
        ejyo1.g.add(ejyp5);
        return (ejyo)hftp2.N_build();
    }
}

