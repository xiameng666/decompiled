public final class hkow extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkow a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hkow hkow0 = new hkow();
        hkow.a = hkow0;
        ProtoLiteMessage.L(hkow.class, ((ProtoLiteMessage)hkow0));
    }

    private hkow() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hkow.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", hkot.class});
                }
                case 3: {
                    return new hkow();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkow.a));
                }
                case 5: {
                    return hkow.a;
                }
                case 6: {
                    Object object1 = hkow.c;
                    if(object1 == null) {
                        Class class0 = hkow.class;
                        synchronized(class0) {
                            hfvs0 = hkow.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkow.a));
                                hkow.c = hfvs0;
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

