class cqin extends gfsd {
    @Override  // gfsd
    protected final Object a(Object object0) {
        hluz hluz0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)elhs.a).v_newBuilder();
        gfsd gfsd0 = cqji.a.ic();
        switch(((hlva)object0).b) {
            case 0: {
                hluz0 = hluz.a;
                break;
            }
            case 1: {
                hluz0 = hluz.b;
                break;
            }
            case 2: {
                hluz0 = hluz.c;
                break;
            }
            case 3: {
                hluz0 = hluz.d;
                break;
            }
            case 4: {
                hluz0 = hluz.e;
                break;
            }
            case 5: {
                hluz0 = hluz.f;
                break;
            }
            case 6: {
                hluz0 = hluz.g;
                break;
            }
            case 7: {
                hluz0 = hluz.h;
                break;
            }
            case 8: {
                hluz0 = hluz.i;
                break;
            }
            case 9: {
                hluz0 = hluz.j;
                break;
            }
            case 10: {
                hluz0 = hluz.k;
                break;
            }
            default: {
                hluz0 = null;
            }
        }
        if(hluz0 == null) {
            hluz0 = hluz.l;
        }
        elhr elhr0 = (elhr)gfsd0.kt(hluz0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhs elhs0 = (elhs)hftp0.b_message;
        elhs0.c = elhr0.a();
        elhs0.b |= 1;
        String s = ((hlva)object0).c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhs elhs1 = (elhs)hftp0.b_message;
        s.getClass();
        elhs1.b |= 2;
        elhs1.d = s;
        return (elhs)hftp0.N_build();
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlva.a).v_newBuilder();
        if((((elhs)object0).b & 1) != 0) {
            gfsd gfsd0 = cqji.a;
            elhr elhr0 = elhr.b(((elhs)object0).c);
            if(elhr0 == null) {
                elhr0 = elhr.l;
            }
            hluz hluz0 = (hluz)gfsd0.kt(elhr0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlva hlva0 = (hlva)hftp0.b_message;
            hlva0.b = hluz0.a();
        }
        if((((elhs)object0).b & 2) != 0) {
            String s = ((elhs)object0).d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlva hlva1 = (hlva)hftp0.b_message;
            s.getClass();
            hlva1.c = s;
        }
        return (hlva)hftp0.N_build();
    }
}

