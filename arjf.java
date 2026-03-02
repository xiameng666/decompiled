import j..util.Objects;
import java.util.ArrayDeque;

final class arjf extends arkp {
    final hkyj a;
    final arjh b;

    public arjf(arjh arjh0, arin arin0, hkyj hkyj0, hkyj hkyj1) {
        this.a = hkyj1;
        Objects.requireNonNull(arjh0);
        this.b = arjh0;
        super(arin0, hkyj0);
    }

    @Override  // arkq
    protected final void d() {
        arjh.p.m("MultipleItemRequest stream expectation failed.", new Object[0]);
        this.b.l(2, "ItemRequest stream expectation failed.", false);
    }

    @Override  // arkp
    protected final MessageLite e(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asce.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (asce)hftv0;
    }

    @Override  // arkp
    protected final void f(MessageLite hfvm0) {
        ArrayDeque arrayDeque0 = new ArrayDeque(((asce)hfvm0).d);
        arjh arjh0 = this.b;
        arjh0.B = false;
        arjh0.C = false;
        hkyj hkyj0 = this.a;
        if((((asce)hfvm0).b & 4) != 0 && ((asce)hfvm0).f) {
            hkyj hkyj1 = hkyj.c;
            if(!hkyj0.equals(hkyj1)) {
                arjh.p.h("Shutting down WiFi medium as the throughput is not meeting the threshold.", new Object[0]);
                arjh0.e.g(hkyj1);
            }
        }
        if((((asce)hfvm0).b & 16) != 0 && !((asce)hfvm0).h) {
            hkyj hkyj2 = hkyj.b;
            if(arjh0.e.t(hkyj2)) {
                arjh.p.h("Shutting down USB medium as it\'s not available on target side but available on source side.", new Object[0]);
                arjh0.e.g(hkyj2);
            }
        }
        if((((asce)hfvm0).b & 8) != 0 && !((asce)hfvm0).g) {
            hkyj hkyj3 = hkyj.c;
            if(arjh0.e.t(hkyj3)) {
                arjh.p.h("Shutting down WiFi medium as it\'s not available on target side but available on source side.", new Object[0]);
                arjh0.e.g(hkyj3);
            }
        }
        if(((Boolean)arjh0.i.mr()).booleanValue() && (((asce)hfvm0).b & 1) != 0) {
            asbk asbk0 = ((asce)hfvm0).c;
            if(asbk0 == null) {
                asbk0 = asbk.a;
            }
            if(aqhj.a(asbk0).equals(aqfx.g)) {
                goto label_29;
            }
            asbk asbk1 = ((asce)hfvm0).c;
            if(asbk1 == null) {
                asbk1 = asbk.a;
            }
            if(aqhj.a(asbk1).equals(aqfx.h)) {
            label_29:
                aqql aqql0 = arjh.p;
                aqql0.h("sendNextItemForNonPrefetchableFlavor", new Object[0]);
                if(arjh0.F) {
                    aqql0.m("Protocol instance is disconnected and should not attempt to send items.", new Object[0]);
                    return;
                }
                if(arrayDeque0.isEmpty()) {
                    aqql0.m("Items queue is empty for non prefetchable flavor request. This should be impossible.", new Object[0]);
                    return;
                }
                if(!arjh0.e.t(hkyj0)) {
                    aqql0.m("Medium of the request is not available for sending item in non prefetchable flavor", new Object[0]);
                    return;
                }
                asby asby0 = (asby)arrayDeque0.poll();
                hkyj hkyj4 = hkyj.b;
                if(hkyj0.equals(hkyj4)) {
                    arjh0.C = true;
                    arjh0.z(((asce)hfvm0), arrayDeque0, asby0, hkyj4);
                    return;
                }
                hkyj hkyj5 = hkyj.c;
                if(hkyj0.equals(hkyj5)) {
                    arjh0.B = true;
                    if((((asce)hfvm0).b & 2) != 0 && ((asce)hfvm0).e) {
                        arjh0.y(((asce)hfvm0), arrayDeque0, asby0);
                        return;
                    }
                    arjh0.z(((asce)hfvm0), arrayDeque0, asby0, hkyj5);
                }
                return;
            }
        }
        arjh0.x(((asce)hfvm0), arrayDeque0);
    }
}

