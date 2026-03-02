public final class chme implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gljp gljp0 = ((gljs)((ProtoLiteBuilder)object0).b_message).e;
        if(gljp0 == null) {
            gljp0 = gljp.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gljp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gljp0));
        float f = (float)(((Float)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gljp gljp1 = (gljp)hftp0.b_message;
        gljp1.b |= 2;
        gljp1.d = f;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gljs gljs0 = (gljs)((ProtoLiteBuilder)object0).b_message;
        gljp gljp2 = (gljp)hftp0.N_build();
        gljp2.getClass();
        gljs0.e = gljp2;
        gljs0.b |= 4;
    }
}

