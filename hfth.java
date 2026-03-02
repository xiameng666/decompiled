import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;

public final class hfth {
    public static final hfth a;
    final hfwh b;
    boolean c;
    boolean d;

    static {
        hfth.a = new hfth(null);
    }

    private hfth() {
        this.b = new hfwh();
    }

    private hfth(byte[] arr_b) {
        hfwh hfwh0 = new hfwh();
        super();
        this.b = hfwh0;
        this.e();
        this.e();
    }

    static int a(hfxe hfxe0, int v, Object object0) {
        int v1 = CodedOutputStream.W(v);
        v1 = hfxe0 == hfxe.j ? v1 + v1 : CodedOutputStream.W(v);
        switch(hfxe0.ordinal()) {
            case 0: {
                Double double0 = (Double)object0;
                return v1 + 8;
            }
            case 1: {
                Float float0 = (Float)object0;
                return v1 + 4;
            }
            case 2: {
                return v1 + CodedOutputStream.aa(((Long)object0).longValue());
            }
            case 3: {
                return v1 + CodedOutputStream.aa(((Long)object0).longValue());
            }
            case 4: {
                return v1 + CodedOutputStream.L(((Integer)object0).intValue());
            }
            case 5: {
                Long long0 = (Long)object0;
                return v1 + 8;
            }
            case 6: {
                Integer integer0 = (Integer)object0;
                return v1 + 4;
            }
            case 7: {
                Boolean boolean0 = (Boolean)object0;
                return v1 + 1;
            }
            case 8: {
                return (object0 instanceof ByteString) ? v1 + CodedOutputStream.I(((ByteString)object0)) : v1 + CodedOutputStream.V(((String)object0));
            }
            case 9: {
                return v1 + ((MessageLite)object0).getSerializedSize();
            }
            case 10: {
                return (object0 instanceof hfuw) ? v1 + ((hfuw)object0).b() : v1 + CodedOutputStream.O(((MessageLite)object0));
            }
            case 11: {
                return (object0 instanceof ByteString) ? v1 + CodedOutputStream.I(((ByteString)object0)) : v1 + CodedOutputStream.G(((byte[])object0));
            }
            case 12: {
                return v1 + CodedOutputStream.Y(((Integer)object0).intValue());
            }
            case 13: {
                return (object0 instanceof hfub) ? v1 + CodedOutputStream.L(((hfub)object0).a()) : v1 + CodedOutputStream.L(((Integer)object0).intValue());
            }
            case 14: {
                Integer integer1 = (Integer)object0;
                return v1 + 4;
            }
            case 15: {
                Long long1 = (Long)object0;
                return v1 + 8;
            }
            case 16: {
                return v1 + CodedOutputStream.R(((Integer)object0).intValue());
            }
            case 17: {
                return v1 + CodedOutputStream.T(((Long)object0).longValue());
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public final int b(Map.Entry map$Entry0) {
        hftu hftu0 = (hftu)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(hftu0.a() == hfxf.i) {
            if((object0 instanceof hfuw)) {
                int v = CodedOutputStream.W(1);
                return v + v + CodedOutputStream.X(2, ((hftu)map$Entry0.getKey()).a) + ((hfuw)object0).a(3);
            }
            int v1 = CodedOutputStream.W(1);
            return v1 + v1 + CodedOutputStream.X(2, ((hftu)map$Entry0.getKey()).a) + (CodedOutputStream.W(3) + CodedOutputStream.O(((MessageLite)object0)));
        }
        return hfth.j(hftu0, object0);
    }

    public final hfth c() {
        hfth hfth0 = new hfth();
        hfwh hfwh0 = this.b;
        int v = hfwh0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            hfwe hfwe0 = (hfwe)hfwh0.d(v1);
            hfth0.l(((hftu)hfwe0.a), hfwe0.b);
        }
        for(Object object0: hfwh0.a()) {
            hfth0.l(((hftu)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        hfth0.d = this.d;
        return hfth0;
    }

    @Override
    public final Object clone() {
        return this.c();
    }

    public final Iterator d() {
        if(this.h()) {
            return Collections.emptyIterator();
        }
        return this.d ? new hfuv(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if(this.c) {
            return;
        }
        hfwh hfwh0 = this.b;
        int v = hfwh0.b;
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = ((hfwe)hfwh0.d(v2)).b;
            if((object0 instanceof ProtoLiteMessage)) {
                ((ProtoLiteMessage)object0).J_markImmutable();
            }
        }
        for(Object object1: hfwh0.a()) {
            Object object2 = ((Map.Entry)object1).getValue();
            if((object2 instanceof ProtoLiteMessage)) {
                ((ProtoLiteMessage)object2).J_markImmutable();
            }
        }
        if(!hfwh0.d) {
            for(int v1 = 0; v1 < hfwh0.b; ++v1) {
                hftu hftu0 = (hftu)((hfwe)hfwh0.d(v1)).a;
            }
            for(Object object3: hfwh0.a()) {
                hftu hftu1 = (hftu)((Map.Entry)object3).getKey();
            }
        }
        if(!hfwh0.d) {
            hfwh0.c = hfwh0.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(hfwh0.c);
            hfwh0.e = hfwh0.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(hfwh0.e);
            hfwh0.d = true;
        }
        this.c = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof hfth) ? this.b.equals(((hfth)object0).b) : false;
    }

    public final void f(Map.Entry map$Entry0) {
        hftu hftu0 = (hftu)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(hftu0.a() == hfxf.i) {
            Object object1 = this.k(hftu0);
            if(object1 == null) {
                Object object2 = hfth.n(object0);
                this.b.b(hftu0, object2);
                if((object0 instanceof hfuw)) {
                    this.d = true;
                }
                return;
            }
            if(!(object0 instanceof hfuw)) {
                if((object1 instanceof MessageLite)) {
                    Builder hfvl0 = ((MessageLite)object1).newBuilderForType();
                    hftu.b(hfvl0, object0);
                    MessageLite hfvm0 = hfvl0.build();
                    this.b.b(hftu0, hfvm0);
                    return;
                }
                hftu.b(object1, object0);
                return;
            }
            hfuw hfuw0 = (hfuw)object0;
            throw null;
        }
        if((object0 instanceof hfuw)) {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object object3 = hfth.n(object0);
        this.b.b(hftu0, object3);
    }

    static void g(CodedOutputStream hfsq0, hfxe hfxe0, int v, Object object0) {
        if(hfxe0 != hfxe.j) {
            hfsq0.A(v, hfxe0.t);
            switch(hfxe0.ordinal()) {
                case 0: {
                    hfsq0.ai(((Double)object0).doubleValue());
                    return;
                }
                case 1: {
                    hfsq0.ak(((Float)object0).floatValue());
                    return;
                }
                case 2: {
                    hfsq0.writeRawVarint64(((Long)object0).longValue());
                    return;
                }
                case 3: {
                    hfsq0.writeRawVarint64(((Long)object0).longValue());
                    return;
                }
                case 4: {
                    hfsq0.u(((Integer)object0).intValue());
                    return;
                }
                case 5: {
                    hfsq0.s(((Long)object0).longValue());
                    return;
                }
                case 6: {
                    hfsq0.q(((Integer)object0).intValue());
                    return;
                }
                case 7: {
                    hfsq0.k(((byte)((Boolean)object0).booleanValue()));
                    return;
                }
                case 8: {
                    if((object0 instanceof ByteString)) {
                        hfsq0.o(((ByteString)object0));
                        return;
                    }
                    hfsq0.z(((String)object0));
                    return;
                }
                case 9: {
                    hfsq0.al(((MessageLite)object0));
                    return;
                }
                case 10: {
                    hfsq0.v(((MessageLite)object0));
                    return;
                }
                case 11: {
                    if((object0 instanceof ByteString)) {
                        hfsq0.o(((ByteString)object0));
                        return;
                    }
                    hfsq0.ag(((byte[])object0));
                    return;
                }
                case 12: {
                    hfsq0.writeRawVarint32(((Integer)object0).intValue());
                    return;
                }
                case 13: {
                    if((object0 instanceof hfub)) {
                        hfsq0.u(((hfub)object0).a());
                        return;
                    }
                    hfsq0.u(((Integer)object0).intValue());
                    return;
                }
                case 14: {
                    hfsq0.q(((Integer)object0).intValue());
                    return;
                }
                case 15: {
                    hfsq0.s(((Long)object0).longValue());
                    return;
                }
                case 16: {
                    hfsq0.ao(((Integer)object0).intValue());
                    return;
                }
                case 17: {
                    hfsq0.aq(((Long)object0).longValue());
                    return;
                }
                default: {
                    return;
                }
            }
        }
        hfsq0.A(v, 3);
        hfsq0.al(((MessageLite)object0));
        hfsq0.A(v, 4);
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        hfwh hfwh0 = this.b;
        int v = hfwh0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!hfth.o(hfwh0.d(v1))) {
                return false;
            }
        }
        for(Object object0: hfwh0.a()) {
            if(!hfth.o(((Map.Entry)object0))) {
                return false;
            }
        }
        return true;
    }

    public static int j(hftu hftu0, Object object0) {
        return hfth.a(hftu0.b, hftu0.a, object0);
    }

    public final Object k(hftu hftu0) {
        Object object0 = this.b.get(hftu0);
        if(!(object0 instanceof hfuw)) {
            return object0;
        }
        hfuw hfuw0 = (hfuw)object0;
        throw null;
    }

    public final void l(hftu hftu0, Object object0) {
        boolean z;
        hfup.d(object0);
        hfxf hfxf0 = hftu0.b.s;
        switch(hfxf0.ordinal()) {
            case 0: {
                z = object0 instanceof Integer;
                goto label_15;
            }
            case 1: {
                z = object0 instanceof Long;
                goto label_15;
            }
            case 2: {
                z = object0 instanceof Float;
                goto label_15;
            }
            case 3: {
                z = object0 instanceof Double;
                goto label_15;
            }
            case 4: {
                z = object0 instanceof Boolean;
                goto label_15;
            }
            case 5: {
                z = object0 instanceof String;
            label_15:
                if(z) {
                    goto label_22;
                }
                break;
            }
            case 6: {
                if((object0 instanceof ByteString) || (object0 instanceof byte[])) {
                    goto label_22;
                }
                break;
            }
            case 7: {
                if((object0 instanceof Integer) || (object0 instanceof hfub)) {
                    goto label_22;
                }
                break;
            }
            case 8: {
                if((object0 instanceof MessageLite) || (object0 instanceof hfuw)) {
                label_22:
                    if((object0 instanceof hfuw)) {
                        this.d = true;
                    }
                    this.b.b(hftu0, object0);
                    return;
                }
            }
        }
        String s = object0.getClass().getName();
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", ((int)hftu0.a), hfxf0, s));
    }

    public final boolean m(hftu hftu0) {
        return this.b.get(hftu0) != null;
    }

    private static Object n(Object object0) {
        if((object0 instanceof hfvr)) {
            return ((hfvr)object0).a();
        }
        if((object0 instanceof byte[])) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    private static boolean o(Map.Entry map$Entry0) {
        if(((hftu)map$Entry0.getKey()).a() == hfxf.i) {
            Object object0 = map$Entry0.getValue();
            if((object0 instanceof MessageLiteOrBuilder)) {
                return ((MessageLiteOrBuilder)object0).isInitialized();
            }
            if((object0 instanceof hfuw)) {
                return true;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }
}

