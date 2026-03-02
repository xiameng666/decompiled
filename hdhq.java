public final class hdhq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdhq a;
    public hfui b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hdhq hdhq0 = new hdhq();
        hdhq.a = hdhq0;
        ProtoLiteMessage.L(hdhq.class, ((ProtoLiteMessage)hdhq0));
        hdhq.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdhq0, ((MessageLite)hdhq0), 0xD4FF7AB, hfxe.k);
    }

    private hdhq() {
        this.b = hfvb.a;
    }

    public final void b() {
        hfui hfui0 = this.b;
        if(!hfui0.c()) {
            this.b = ProtoLiteMessage.D(hfui0);
        }
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)hdhq.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
                }
                case 3: {
                    return new hdhq();
                }
                case 4: {
                    return new hdhp();
                }
                case 5: {
                    return hdhq.a;
                }
                case 6: {
                    Object object1 = hdhq.d;
                    if(object1 == null) {
                        Class class0 = hdhq.class;
                        synchronized(class0) {
                            hfvs0 = hdhq.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdhq.a));
                                hdhq.d = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

