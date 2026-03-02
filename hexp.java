public final class hexp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hexp a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hexp hexp0 = new hexp();
        hexp.a = hexp0;
        ProtoLiteMessage.L(hexp.class, ((ProtoLiteMessage)hexp0));
    }

    private hexp() {
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
                    return new hfvw(((MessageLite)hexp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hexo.class});
                }
                case 3: {
                    return new hexp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hexp.a));
                }
                case 5: {
                    return hexp.a;
                }
                case 6: {
                    Object object1 = hexp.c;
                    if(object1 == null) {
                        Class class0 = hexp.class;
                        synchronized(class0) {
                            hfvs0 = hexp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hexp.a));
                                hexp.c = hfvs0;
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

