public final class hltf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hltf a;
    private static volatile Parser b;

    static {
        hltf hltf0 = new hltf();
        hltf.a = hltf0;
        ProtoLiteMessage.L(hltf.class, ((ProtoLiteMessage)hltf0));
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
                    return new hfvw(((MessageLite)hltf.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hltf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hltf.a));
                }
                case 5: {
                    return hltf.a;
                }
                case 6: {
                    Object object1 = hltf.b;
                    if(object1 == null) {
                        Class class0 = hltf.class;
                        synchronized(class0) {
                            hfvs0 = hltf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hltf.a));
                                hltf.b = hfvs0;
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

