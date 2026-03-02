public final class acre extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final acre a;
    public hfuo b;
    private static volatile Parser c;

    static {
        acre acre0 = new acre();
        acre.a = acre0;
        ProtoLiteMessage.L(acre.class, ((ProtoLiteMessage)acre0));
    }

    private acre() {
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
                    return new hfvw(((MessageLite)acre.a), "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001B", new Object[]{"b", acrd.class});
                }
                case 3: {
                    return new acre();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)acre.a));
                }
                case 5: {
                    return acre.a;
                }
                case 6: {
                    Object object1 = acre.c;
                    if(object1 == null) {
                        Class class0 = acre.class;
                        synchronized(class0) {
                            hfvs0 = acre.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)acre.a));
                                acre.c = hfvs0;
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

