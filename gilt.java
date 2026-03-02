public final class gilt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gilt a;
    private static volatile Parser b;
    private byte c;

    static {
        gilt gilt0 = new gilt();
        gilt.a = gilt0;
        ProtoLiteMessage.L(gilt.class, ((ProtoLiteMessage)gilt0));
    }

    private gilt() {
        this.c = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.c;
                }
                case 2: {
                    return new hfvw(((MessageLite)gilt.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gilt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gilt.a));
                }
                case 5: {
                    return gilt.a;
                }
                case 6: {
                    Object object1 = gilt.b;
                    if(object1 == null) {
                        Class class0 = gilt.class;
                        synchronized(class0) {
                            hfvs0 = gilt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gilt.a));
                                gilt.b = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.c = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

