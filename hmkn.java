import java.nio.ByteBuffer;
import java.util.List;

public final class hmkn {
    private final hmqm a;
    private final hmkv b;
    private final hmko c;

    public hmkn(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmqm0;
        this.c = new hmko(hmlg0);
        this.b = new hmkv(hmlg0);
    }

    public final hmli a(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.isEmpty()) {
                this.c.a(false);
                return new hmli(Boolean.valueOf(true));
            }
            if(list0.size() != 1) {
                throw new IllegalArgumentException("Incorrect number of parameters");
            }
            hmli hmli2 = (hmli)list0.get(0);
            boolean z = ((Boolean)this.b.b(hmli2, Boolean.TRUE)).booleanValue();
            this.c.a(z);
            return new hmli(Boolean.valueOf(true));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing chainingMode method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli b(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.size() != 1) {
                throw new IllegalArgumentException("Incorrect number of parameters");
            }
            hmli hmli2 = (hmli)list0.get(0);
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
            ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli2, byteBuffer0);
            hmlx.g(byteBuffer1.array());
            this.c.a.f.a().c(byteBuffer1);
            return new hmli(Boolean.valueOf(true));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing data method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

