package org.tensorflow.lite;

import a;
import igrq;
import igrr;
import igrv;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class TensorImpl {
    public long a;
    public int[] b;
    public final igrv c;
    public final int d;

    private TensorImpl(long v) {
        int v2;
        this.a = v;
        int v1 = TensorImpl.dtype(v);
        switch(v1) {
            case 1: {
                v2 = 1;
                break;
            }
            case 2: {
                v2 = 2;
                break;
            }
            case 3: {
                v2 = 3;
                break;
            }
            case 4: {
                v2 = 4;
                break;
            }
            case 5: {
                v2 = 5;
                break;
            }
            case 6: {
                v2 = 6;
                break;
            }
            case 7: {
                v2 = 7;
                break;
            }
            case 9: {
                v2 = 8;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "DataType error: DataType ", " is not recognized in Java."));
            }
        }
        this.d = v2;
        this.b = TensorImpl.shape(v);
        TensorImpl.shapeSignature(v);
        this.c = new igrv(TensorImpl.quantizationScale(v), TensorImpl.quantizationZeroPoint(v));
    }

    static int a(Object object0) {
        if(object0 != null && object0.getClass().isArray()) {
            if(Array.getLength(object0) != 0) {
                return TensorImpl.a(Array.get(object0, 0)) + 1;
            }
            throw new IllegalArgumentException("Array lengths cannot be 0.");
        }
        return 0;
    }

    public final int b() {
        return TensorImpl.numBytes(this.a);
    }

    private static native ByteBuffer buffer(long arg0) {
    }

    public final String c() {
        return TensorImpl.name(this.a);
    }

    private static native long create(long arg0, int arg1, int arg2) {
    }

    public final ByteBuffer d() {
        return TensorImpl.buffer(this.a).order(ByteOrder.nativeOrder());
    }

    private static native void delete(long arg0) {
    }

    private static native int dtype(long arg0) {
    }

    static TensorImpl e(long v, int v1) {
        return new TensorImpl(TensorImpl.create(v, v1, 0));
    }

    final void f() {
        TensorImpl.delete(this.a);
        this.a = 0L;
    }

    static void g(Object object0, int v, int[] arr_v) {
        if(v != arr_v.length) {
            int v1 = Array.getLength(object0);
            int v2 = arr_v[v];
            if(v2 == 0) {
                arr_v[v] = v1;
            }
            else if(v2 != v1) {
                throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", v2, v1, v));
            }
            if(v + 1 != arr_v.length) {
                for(int v3 = 0; v3 < v1; ++v3) {
                    TensorImpl.g(Array.get(object0, v3), v + 1, arr_v);
                }
            }
        }
    }

    public final void h() {
        this.b = TensorImpl.shape(this.a);
    }

    public static native boolean hasDelegateBufferHandle(long arg0) {
    }

    public final void i(Object object0) {
        if(!(object0 instanceof ByteBuffer)) {
            Class class0 = object0.getClass();
            int v = 6;
            if(class0.isArray()) {
                while(class0.isArray()) {
                    class0 = class0.getComponentType();
                }
                if(Float.TYPE.equals(class0)) {
                    v = 1;
                }
                else if(Integer.TYPE.equals(class0)) {
                    v = 2;
                }
                else if(Short.TYPE.equals(class0)) {
                    v = 7;
                }
                else if(!Byte.TYPE.equals(class0)) {
                    if(Long.TYPE.equals(class0)) {
                        v = 4;
                    }
                    else if(!Boolean.TYPE.equals(class0)) {
                        if(!String.class.equals(class0)) {
                            throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + object0.getClass().getName());
                        }
                        v = 5;
                    }
                }
                else if(this.d != 5) {
                    v = 3;
                }
                else {
                    v = 5;
                }
            }
            else if(Float.class.equals(class0) || (object0 instanceof FloatBuffer)) {
                v = 1;
            }
            else if(Integer.class.equals(class0) || (object0 instanceof IntBuffer)) {
                v = 2;
            }
            else if(Short.class.equals(class0) || (object0 instanceof ShortBuffer)) {
                v = 7;
            }
            else if(Byte.class.equals(class0)) {
                v = 3;
            }
            else if(Long.class.equals(class0) || (object0 instanceof LongBuffer)) {
                v = 4;
            }
            else if(!Boolean.class.equals(class0)) {
                if(!String.class.equals(class0)) {
                    throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + object0.getClass().getName());
                }
                v = 5;
            }
            int v1 = this.d;
            if(v != v1 && !igrr.a(v).equals(igrr.a(v1))) {
                throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", igrq.a(v1), object0.getClass().getName(), igrq.a(v)));
            }
        }
    }

    public final int[] j(Object object0) {
        int v = TensorImpl.a(object0);
        if(this.d == 5) {
            Class class0 = object0.getClass();
            if(class0.isArray()) {
                while(class0.isArray()) {
                    class0 = class0.getComponentType();
                }
                if(Byte.TYPE.equals(class0)) {
                    --v;
                }
            }
        }
        int[] arr_v = new int[v];
        TensorImpl.g(object0, 0, arr_v);
        return arr_v;
    }

    private static native String name(long arg0) {
    }

    private static native int numBytes(long arg0) {
    }

    private static native float quantizationScale(long arg0) {
    }

    private static native int quantizationZeroPoint(long arg0) {
    }

    public static native void readMultiDimensionalArray(long arg0, Object arg1) {
    }

    private static native int[] shape(long arg0) {
    }

    private static native int[] shapeSignature(long arg0) {
    }

    public static native void writeDirectBuffer(long arg0, Buffer arg1) {
    }

    public static native void writeMultiDimensionalArray(long arg0, Object arg1) {
    }

    public static native void writeScalar(long arg0, Object arg1) {
    }
}

