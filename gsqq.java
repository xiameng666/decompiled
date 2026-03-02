public final class gsqq extends ibfx {
    public gsqq(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        ibuq.f(iakq0, "callOptions");
        super(iakr0, iakq0);
    }

    public final Object a(heib heib0, iaof_metadata iaof0, ibrl ibrl0) {
        gsqp gsqp0;
        if((ibrl0 instanceof gsqp)) {
            gsqp0 = (gsqp)ibrl0;
            int v = gsqp0.c;
            if((v & 0x80000000) == 0) {
                gsqp0 = new gsqp(this, ibrl0);
            }
            else {
                gsqp0.c = v - 0x80000000;
            }
        }
        else {
            gsqp0 = new gsqp(this, ibrl0);
        }
        Object object0 = gsqp0.a;
        Object object1 = ibrx.a;
        switch(gsqp0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsqo.b;
                if(iaoj0 == null) {
                    synchronized(gsqo.class) {
                        iaoj0 = gsqo.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.notifications.v1.NotificationsApiService", "MultiLoginUpdate");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)heib.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)heih.a));
                            iaoj0 = iaog0.build();
                            gsqo.b = iaoj0;
                        }
                    }
                }
                gsqp0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, heib0, this.b, iaof0, gsqp0);
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
        return new gsqq(iakr0, iakq0);
    }
}

