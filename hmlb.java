import java.nio.ByteBuffer;
import java.util.List;

public final class hmlb {
    final hmla a;
    final hmlg b;
    final hmkv c;
    final hmqm d;

    public hmlb(hmlg hmlg0, hmqm hmqm0) {
        this.b = hmlg0;
        this.d = hmqm0;
        this.a = new hmla(hmlg0);
        this.c = new hmkv(hmlg0);
    }

    public final hmli a(List list0) {
        ByteBuffer byteBuffer2;
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
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.c.b(hmli2, byteBuffer0);
                    byteBuffer2 = this.a.a(null, byteBuffer1);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer3 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer4 = (ByteBuffer)this.c.b(hmli3, byteBuffer3);
                    hmli hmli4 = (hmli)list0.get(1);
                    ByteBuffer byteBuffer5 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer6 = (ByteBuffer)this.c.b(hmli4, byteBuffer5);
                    byteBuffer2 = this.a.a(byteBuffer4, byteBuffer6);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer2);
        }
        catch(Exception exception0) {
            this.d.a("Exception executing bitAnd method", exception0);
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
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    hmkg hmkg0 = new hmkg(3);
                    int v = ((hmkg)this.c.b(hmli2, hmkg0)).a.intValue();
                    byteBuffer0 = this.a.b(null, v);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer2 = (ByteBuffer)this.c.b(hmli3, byteBuffer1);
                    hmli hmli4 = (hmli)list0.get(1);
                    hmkg hmkg1 = new hmkg(3);
                    int v1 = ((hmkg)this.c.b(hmli4, hmkg1)).a.intValue();
                    byteBuffer0 = this.a.b(byteBuffer2, v1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.d.a("Exception executing bitLeftShift method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli c(List list0) {
        ByteBuffer byteBuffer2;
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
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.c.b(hmli2, byteBuffer0);
                    byteBuffer2 = this.a.c(null, byteBuffer1);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer3 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer4 = (ByteBuffer)this.c.b(hmli3, byteBuffer3);
                    hmli hmli4 = (hmli)list0.get(1);
                    ByteBuffer byteBuffer5 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer6 = (ByteBuffer)this.c.b(hmli4, byteBuffer5);
                    byteBuffer2 = this.a.c(byteBuffer4, byteBuffer6);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer2);
        }
        catch(Exception exception0) {
            this.d.a("Exception executing bitOr method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli d(List list0) {
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
                    hmkg hmkg0 = new hmkg(3);
                    int v = ((hmkg)this.c.b(hmli2, hmkg0)).a.intValue();
                    byteBuffer0 = this.a.d(null, v);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer2 = (ByteBuffer)this.c.b(hmli3, byteBuffer1);
                    hmli hmli4 = (hmli)list0.get(1);
                    hmkg hmkg1 = new hmkg(3);
                    int v1 = ((hmkg)this.c.b(hmli4, hmkg1)).a.intValue();
                    byteBuffer0 = this.a.d(byteBuffer2, v1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.d.a("Exception executing bitRightShift method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli e(List list0) {
        ByteBuffer byteBuffer2;
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
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.c.b(hmli2, byteBuffer0);
                    byteBuffer2 = this.a.e(null, byteBuffer1);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer3 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer4 = (ByteBuffer)this.c.b(hmli3, byteBuffer3);
                    hmli hmli4 = (hmli)list0.get(1);
                    ByteBuffer byteBuffer5 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer6 = (ByteBuffer)this.c.b(hmli4, byteBuffer5);
                    byteBuffer2 = this.a.e(byteBuffer4, byteBuffer6);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer2);
        }
        catch(Exception exception0) {
            this.d.a("Exception executing bitXor method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

