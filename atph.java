public final class atph extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final atph a;
    public hfvh b;
    private static volatile Parser c;

    static {
        atph atph0 = new atph();
        atph.a = atph0;
        ProtoLiteMessage.L(atph.class, ((ProtoLiteMessage)atph0));
    }

    private atph() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)atph.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", atpf.a});
                }
                case 3: {
                    return new atph();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return atph.a;
                }
                case 6: {
                    Object object1 = atph.c;
                    if(object1 == null) {
                        Class class0 = atph.class;
                        synchronized(class0) {
                            hfvs0 = atph.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)atph.a));
                                atph.c = hfvs0;
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

