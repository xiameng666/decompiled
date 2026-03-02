public final class ajaz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajaz a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ajaz ajaz0 = new ajaz();
        ajaz.a = ajaz0;
        ProtoLiteMessage.L(ajaz.class, ((ProtoLiteMessage)ajaz0));
    }

    private ajaz() {
        this.b = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
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
                    return new hfvw(((MessageLite)ajaz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ajay.a});
                }
                case 3: {
                    return new ajaz();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ajaz.a;
                }
                case 6: {
                    Object object1 = ajaz.c;
                    if(object1 == null) {
                        Class class0 = ajaz.class;
                        synchronized(class0) {
                            hfvs0 = ajaz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajaz.a));
                                ajaz.c = hfvs0;
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

