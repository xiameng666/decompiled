public final class grcu extends ibfx {
    public grcu(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        super(iakr0, iakq0);
    }

    public final Object a(grcl grcl0, iaof_metadata iaof0, ibrl ibrl0) {
        grcs grcs0;
        if((ibrl0 instanceof grcs)) {
            grcs0 = (grcs)ibrl0;
            int v = grcs0.c;
            if((v & 0x80000000) == 0) {
                grcs0 = new grcs(this, ibrl0);
            }
            else {
                grcs0.c = v - 0x80000000;
            }
        }
        else {
            grcs0 = new grcs(this, ibrl0);
        }
        Object object0 = grcs0.a;
        Object object1 = ibrx.a;
        switch(grcs0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = grcr.b;
                if(iaoj0 == null) {
                    synchronized(grcr.class) {
                        iaoj0 = grcr.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.passwords.leak.check.v1.PasswordsLeakCheckService", "LookupLeakMatches");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)grcl.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)grcm.a));
                            iaoj0 = iaog0.build();
                            grcr.b = iaoj0;
                        }
                    }
                }
                grcs0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, grcl0, this.b, iaof0, grcs0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object b(grcv grcv0, iaof_metadata iaof0, ibrl ibrl0) {
        grct grct0;
        if((ibrl0 instanceof grct)) {
            grct0 = (grct)ibrl0;
            int v = grct0.c;
            if((v & 0x80000000) == 0) {
                grct0 = new grct(this, ibrl0);
            }
            else {
                grct0.c = v - 0x80000000;
            }
        }
        else {
            grct0 = new grct(this, ibrl0);
        }
        Object object0 = grct0.a;
        Object object1 = ibrx.a;
        switch(grct0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = grcr.c;
                if(iaoj0 == null) {
                    synchronized(grcr.class) {
                        iaoj0 = grcr.c;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.passwords.leak.check.v1.PasswordsLeakCheckService", "ReencryptLookupHash");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)grcv.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)grcw.a));
                            iaoj0 = iaog0.build();
                            grcr.c = iaoj0;
                        }
                    }
                }
                grct0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, grcv0, this.b, iaof0, grct0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    @Override  // ibjo
    public final ibjo d(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        return new grcu(iakr0, iakq0);
    }
}

