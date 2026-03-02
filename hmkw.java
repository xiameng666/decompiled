import java.nio.ByteBuffer;
import java.util.List;

public final class hmkw {
    public final hmkv a;
    public final hmqm b;
    public final hmkx c;
    private final hmlg d;

    public hmkw(hmlg hmlg0, hmqm hmqm0) {
        this.d = hmlg0;
        this.b = hmqm0;
        this.c = new hmkx(hmlg0, hmqm0);
        this.a = new hmkv(hmlg0);
    }

    public final hmli a(List list0) {
        ByteBuffer byteBuffer0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    String s = (String)this.a.b(hmli2, "");
                    byteBuffer0 = this.c.g(null, s);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer2 = (ByteBuffer)this.a.b(hmli3, byteBuffer1);
                    hmli hmli4 = (hmli)list0.get(1);
                    String s1 = (String)this.a.b(hmli4, "");
                    byteBuffer0 = this.c.g(byteBuffer2, s1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.b.a("Exception executing applyByteDecoding method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli b(List list0) {
        ByteBuffer byteBuffer0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 2: {
                    hmli hmli2 = (hmli)list0.get(0);
                    boolean z = ((Boolean)this.a.b(hmli2, Boolean.TRUE)).booleanValue();
                    hmli hmli3 = (hmli)list0.get(1);
                    boolean z1 = ((Boolean)this.a.b(hmli3, Boolean.TRUE)).booleanValue();
                    byteBuffer0 = this.c.h(null, z, z1);
                    break;
                }
                case 3: {
                    hmli hmli4 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer2 = (ByteBuffer)this.a.b(hmli4, byteBuffer1);
                    hmli hmli5 = (hmli)list0.get(1);
                    boolean z2 = ((Boolean)this.a.b(hmli5, Boolean.TRUE)).booleanValue();
                    hmli hmli6 = (hmli)list0.get(2);
                    boolean z3 = ((Boolean)this.a.b(hmli6, Boolean.TRUE)).booleanValue();
                    byteBuffer0 = this.c.h(byteBuffer2, z2, z3);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.b.a("Exception executing applyByteEndianness method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

