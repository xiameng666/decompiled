public final class hfft extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfft a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hfft hfft0 = new hfft();
        hfft.a = hfft0;
        ProtoLiteMessage.L(hfft.class, ((ProtoLiteMessage)hfft0));
    }

    private hfft() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hfft.a), "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002;\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hfft();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfft.a));
                }
                case 5: {
                    return hfft.a;
                }
                case 6: {
                    Object object1 = hfft.d;
                    if(object1 == null) {
                        Class class0 = hfft.class;
                        synchronized(class0) {
                            hfvs0 = hfft.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfft.a));
                                hfft.d = hfvs0;
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

