import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class ProtoLiteMessage extends hfrk {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = 0x7FFFFFFF;
    private static final int MUTABLE_FLAG_MASK = 0x80000000;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = 0x7FFFFFFF;
    public static Map defaultInstanceMap;
    public int memoizedSerializedSize;
    protected hfwt unknownFields;

    static {
        ProtoLiteMessage.defaultInstanceMap = new ConcurrentHashMap();
    }

    public ProtoLiteMessage() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = hfwt.a;
    }

    public static hfua A(hfua hfua0) {
        int v = hfua0.size();
        return hfua0.g(v + v);
    }

    public static hfue B(hfue hfue0) {
        int v = hfue0.size();
        return hfue0.g(v + v);
    }

    public static hfuf C(hfuf hfuf0) {
        int v = hfuf0.size();
        return hfuf0.h(v + v);
    }

    public static hfui D(hfui hfui0) {
        int v = hfui0.size();
        return hfui0.f(v + v);
    }

    public static hfuo E(hfuo hfuo0) {
        int v = hfuo0.size();
        return hfuo0.e(v + v);
    }

    @Override  // MessageLite
    public final Builder toBuilder() {
        return (ProtoLiteBuilder)this.jf(5, null);
    }

    @Override  // MessageLite
    public final Builder newBuilderForType() {
        Builder hfvl0 = (ProtoLiteBuilder)this.jf(5, null);
        ((ProtoLiteBuilder)hfvl0).X(this);
        return hfvl0;
    }

    @Override  // MessageLite
    public final Parser getParserForType() {
        return (Parser)this.jf(7, null);
    }

    static Object I(Method method0, Object object0, Object[] arr_object) {
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if((throwable0 instanceof RuntimeException)) {
                throw (RuntimeException)throwable0;
            }
            if((throwable0 instanceof Error)) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    protected final void J_markImmutable() {
        hfvu.a.c(this).g(this);
        this.K();
    }

    final void K() {
        this.memoizedSerializedSize &= 0x7FFFFFFF;
    }

    protected static void L(Class class0, ProtoLiteMessage hftv0) {
        hftv0.K();
        ProtoLiteMessage.defaultInstanceMap.put(class0, hftv0);
    }

    @Override  // MessageLite
    public final void writeTo(CodedOutputStream hfsq0) {
        hfwc hfwc0 = hfvu.a.c(this);
        Object object0 = hfsq0.f;
        if(object0 == null) {
            object0 = new hfsr(hfsq0);
        }
        hfwc0.m(this, ((hfsr)object0));
    }

    public static final boolean N(ProtoLiteMessage hftv0, boolean z) {
        ProtoLiteMessage hftv1 = null;
        int v = (byte)(((Byte)hftv0.jf(1, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = hfvu.a.c(hftv0).k(hftv0);
        if(z) {
            if(z1) {
                hftv1 = hftv0;
            }
            hftv0.jf(2, hftv1);
        }
        return z1;
    }

    public final boolean isImmutable() {
        return (this.memoizedSerializedSize & 0x80000000) != 0;
    }

    public static void P_makeImmutable(ProtoLiteMessage hftv0) {
        if(hftv0 != null && !hftv0.isInitialized()) {
            hfur hfur0 = new hfwr().a();
            hfur0.a = hftv0;
            throw hfur0;
        }
    }

    public static hfta Q(MessageLite hfvm0, Object object0, MessageLite hfvm1, int v, hfxe hfxe0) {
        return new hfta(hfvm0, object0, hfvm1, new hftu(v, hfxe0));
    }

    @Override  // MessageLiteOrBuilder
    public final MessageLite S() {
        return (ProtoLiteMessage)this.jf(6, null);
    }

    @Override  // MessageLiteOrBuilder
    public final boolean isInitialized() {
        return ProtoLiteMessage.N(this, true);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? hfvu.a.c(this).j(this, ((ProtoLiteMessage)object0)) : false;
    }

    @Override
    public final int hashCode() {
        if(!this.isImmutable()) {
            int v = this.memoizedHashCode;
            if(v == 0) {
                v = this.s();
                this.memoizedHashCode = v;
            }
            return v;
        }
        return this.s();
    }

    public abstract Object jf(int arg1, Object arg2);

    @Override  // hfrk
    public final int ox(hfwc hfwc0) {
        if(this.isImmutable()) {
            int v = this.t(hfwc0);
            if(v >= 0) {
                return v;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        int v1 = this.memoizedSerializedSize & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return v1;
        }
        int v2 = this.t(hfwc0);
        if(v2 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
        }
        this.memoizedSerializedSize = this.memoizedSerializedSize & 0x80000000 | v2;
        return v2;
    }

    public final int s() {
        return hfvu.a.c(this).b(this);
    }

    public final int t(hfwc hfwc0) {
        return hfwc0 == null ? hfvu.a.c(this).a(this) : hfwc0.a(this);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        hfvo.b(((MessageLite)this), stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    @Override  // MessageLite
    public final int getSerializedSize() {
        if(this.isImmutable()) {
            int v = this.t(null);
            if(v >= 0) {
                return v;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        int v1 = this.memoizedSerializedSize & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return v1;
        }
        int v2 = this.t(null);
        if(v2 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
        }
        this.memoizedSerializedSize = this.memoizedSerializedSize & 0x80000000 | v2;
        return v2;
    }

    public final ProtoLiteBuilder v_newBuilder() {
        return (ProtoLiteBuilder)this.jf(5, null);
    }

    public final ProtoLiteBuilder w(ProtoLiteMessage hftv0) {
        ProtoLiteBuilder hftp0 = this.v_newBuilder();
        hftp0.X(hftv0);
        return hftp0;
    }

    public final ProtoLiteMessage x_newMutableInstance() {
        return (ProtoLiteMessage)this.jf(4, null);
    }

    public static ProtoLiteMessage y_parseFrom(ProtoLiteMessage hftv0, byte[] arr_b, int v, int v1, hftc hftc0) {
        if(v1 == 0) {
            return hftv0;
        }
        ProtoLiteMessage hftv1 = hftv0.x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv1);
            hfwc0.i(hftv1, arr_b, v, v + v1, new hfro(hftc0));
            hfwc0.g(hftv1);
            return hftv1;
        }
        catch(hfur hfur0) {
            hfur hfur1 = hfur0.b ? new hfur(hfur0) : hfur0;
            hfur1.a = hftv1;
            throw hfur1;
        }
        catch(hfwr hfwr0) {
            hfur hfur2 = hfwr0.a();
            hfur2.a = hftv1;
            throw hfur2;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur3 = new hfur(iOException0);
            hfur3.a = hftv1;
            throw hfur3;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            hfur hfur4 = new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            hfur4.a = hftv1;
            throw hfur4;
        }
    }

    public static hftz z(hftz hftz0) {
        int v = hftz0.size();
        return hftz0.d(v + v);
    }
}

