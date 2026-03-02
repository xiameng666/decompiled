public final class hlfk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlfk a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hlfk hlfk0 = new hlfk();
        hlfk.a = hlfk0;
        ProtoLiteMessage.L(hlfk.class, ((ProtoLiteMessage)hlfk0));
    }

    private hlfk() {
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
                    return new hfvw(((MessageLite)hlfk.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new hlfk();
                }
                case 4: {
                    return new hlfj();
                }
                case 5: {
                    return hlfk.a;
                }
                case 6: {
                    Object object1 = hlfk.c;
                    if(object1 == null) {
                        Class class0 = hlfk.class;
                        synchronized(class0) {
                            hfvs0 = hlfk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlfk.a));
                                hlfk.c = hfvs0;
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

