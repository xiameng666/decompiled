public final class gpky {
    public static iakw a(ibnf ibnf0) {
        return new gpkx(new gpkw(ibnf0), MessageLite.class, MessageLite.class);
    }

    public static void b(gRPCMethodDescriptor iaoj0, Class class0, boolean z) {
        int v;
        Class class1;
        try {
            class1 = ((ibjh)(z ? iaoj0.requestMarshaller_ : iaoj0.responseMarshaller_)).c.getClass();
            v = 0;
        }
        catch(ClassCastException unused_ex) {
            class1 = Object.class;
            v = 1;
        }
        if(!class0.isAssignableFrom(class1)) {
            throw new iapl(iapk.p.f("AsyncClientInterceptor: The " + (z ? "request" : "response") + " message type of method " + iaoj0.fullMethodName_ + " (" + class1.getName() + (1 == v ? ", assumed because method doesn\'t use ReflectableMarshaller" : "") + ") must be a subclass of " + class0.toString()));
        }
    }
}

