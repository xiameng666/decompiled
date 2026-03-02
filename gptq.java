public final class gptq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gptq a;
    private static volatile Parser b;
    private hfvh c;

    static {
        gptq gptq0 = new gptq();
        gptq.a = gptq0;
        ProtoLiteMessage.L(gptq.class, ((ProtoLiteMessage)gptq0));
    }

    private gptq() {
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
                    return new hfvw(((MessageLite)gptq.a), "\u0004\u0001\u0000\u0000\u0019\u0019\u0001\u0001\u0000\u0000\u00192", new Object[]{"c", gptp.a});
                }
                case 3: {
                    return new gptq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gptq.a));
                }
                case 5: {
                    return gptq.a;
                }
                case 6: {
                    Object object1 = gptq.b;
                    if(object1 == null) {
                        Class class0 = gptq.class;
                        synchronized(class0) {
                            hfvs0 = gptq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gptq.a));
                                gptq.b = hfvs0;
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

