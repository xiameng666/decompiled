public final class hkxe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkxe a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        hkxe hkxe0 = new hkxe();
        hkxe.a = hkxe0;
        ProtoLiteMessage.L(hkxe.class, ((ProtoLiteMessage)hkxe0));
    }

    private hkxe() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)hkxe.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001A", new Object[]{"b", hkxk.class, "c"});
                }
                case 3: {
                    return new hkxe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkxe.a));
                }
                case 5: {
                    return hkxe.a;
                }
                case 6: {
                    Object object1 = hkxe.d;
                    if(object1 == null) {
                        Class class0 = hkxe.class;
                        synchronized(class0) {
                            hfvs0 = hkxe.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkxe.a));
                                hkxe.d = hfvs0;
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

