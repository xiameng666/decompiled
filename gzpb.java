public final class gzpb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzpb a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzpb gzpb0 = new gzpb();
        gzpb.a = gzpb0;
        ProtoLiteMessage.L(gzpb.class, ((ProtoLiteMessage)gzpb0));
    }

    private gzpb() {
        this.b = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
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
                    return new hfvw(((MessageLite)gzpb.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzpg.class});
                }
                case 3: {
                    return new gzpb();
                }
                case 4: {
                    return new gzpa();
                }
                case 5: {
                    return gzpb.a;
                }
                case 6: {
                    Object object1 = gzpb.c;
                    if(object1 == null) {
                        Class class0 = gzpb.class;
                        synchronized(class0) {
                            hfvs0 = gzpb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzpb.a));
                                gzpb.c = hfvs0;
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

