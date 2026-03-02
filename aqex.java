public final class aqex extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqex a;
    public hfuo b;
    private static volatile Parser c;

    static {
        aqex aqex0 = new aqex();
        aqex.a = aqex0;
        ProtoLiteMessage.L(aqex.class, ((ProtoLiteMessage)aqex0));
    }

    private aqex() {
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
                    return new hfvw(((MessageLite)aqex.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new aqex();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return aqex.a;
                }
                case 6: {
                    Object object1 = aqex.c;
                    if(object1 == null) {
                        Class class0 = aqex.class;
                        synchronized(class0) {
                            hfvs0 = aqex.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqex.a));
                                aqex.c = hfvs0;
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

