public final class aiha extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aiha a;
    public hfvh b;
    public hfvh c;
    public long d;
    private static volatile Parser e;

    static {
        aiha aiha0 = new aiha();
        aiha.a = aiha0;
        ProtoLiteMessage.L(aiha.class, ((ProtoLiteMessage)aiha0));
    }

    private aiha() {
        this.b = hfvh.a;
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)aiha.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u00022\u0003\u0002", new Object[]{"b", aigy.a, "c", aigz.a, "d"});
                }
                case 3: {
                    return new aiha();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aiha.a));
                }
                case 5: {
                    return aiha.a;
                }
                case 6: {
                    Object object1 = aiha.e;
                    if(object1 == null) {
                        Class class0 = aiha.class;
                        synchronized(class0) {
                            hfvs0 = aiha.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aiha.a));
                                aiha.e = hfvs0;
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

