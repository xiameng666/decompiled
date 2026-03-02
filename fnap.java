public final class fnap extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final fnap a;
    public hfuo b;
    private static volatile Parser c;

    static {
        fnap fnap0 = new fnap();
        fnap.a = fnap0;
        ProtoLiteMessage.L(fnap.class, ((ProtoLiteMessage)fnap0));
    }

    private fnap() {
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
                    return new hfvw(((MessageLite)fnap.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", fnan.class});
                }
                case 3: {
                    return new fnap();
                }
                case 4: {
                    return new fnao();
                }
                case 5: {
                    return fnap.a;
                }
                case 6: {
                    Object object1 = fnap.c;
                    if(object1 == null) {
                        Class class0 = fnap.class;
                        synchronized(class0) {
                            hfvs0 = fnap.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)fnap.a));
                                fnap.c = hfvs0;
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

