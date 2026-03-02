public final class artk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final artk a;
    public hfvh b;
    private static volatile Parser c;

    static {
        artk artk0 = new artk();
        artk.a = artk0;
        ProtoLiteMessage.L(artk.class, ((ProtoLiteMessage)artk0));
    }

    private artk() {
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
                    return new hfvw(((MessageLite)artk.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", artj.a});
                }
                case 3: {
                    return new artk();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return artk.a;
                }
                case 6: {
                    Object object1 = artk.c;
                    if(object1 == null) {
                        Class class0 = artk.class;
                        synchronized(class0) {
                            hfvs0 = artk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)artk.a));
                                artk.c = hfvs0;
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

