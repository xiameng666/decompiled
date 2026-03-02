public final class hlvp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlvp a;
    private static volatile Parser b;
    private hfvh c;

    static {
        hlvp hlvp0 = new hlvp();
        hlvp.a = hlvp0;
        ProtoLiteMessage.L(hlvp.class, ((ProtoLiteMessage)hlvp0));
    }

    private hlvp() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)hlvp.a), "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"c", hlvo.a});
                }
                case 3: {
                    return new hlvp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlvp.a));
                }
                case 5: {
                    return hlvp.a;
                }
                case 6: {
                    Object object1 = hlvp.b;
                    if(object1 == null) {
                        Class class0 = hlvp.class;
                        synchronized(class0) {
                            hfvs0 = hlvp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlvp.a));
                                hlvp.b = hfvs0;
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

