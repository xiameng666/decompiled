import java.nio.ByteBuffer;
import java.util.List;

public final class hmkp {
    private final hmqm a;
    private final hmkv b;
    private final hmkq c;

    public hmkp(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmqm0;
        this.c = new hmkq(hmlg0, hmqm0);
        this.b = new hmkv(hmlg0);
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
                    int v = ((hmkg)this.b.b(hmli2, hmkg.a(Integer.valueOf(1)))).a.intValue();
                    byteBuffer0 = this.c.f(null, v);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer2 = (ByteBuffer)this.b.b(hmli3, byteBuffer1);
                    hmli hmli4 = (hmli)list0.get(1);
                    int v1 = ((hmkg)this.b.b(hmli4, hmkg.a(Integer.valueOf(1)))).a.intValue();
                    byteBuffer0 = this.c.f(byteBuffer2, v1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertBases method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli b(List list0) {
        String s1;
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
                    String s = (String)this.b.b(hmli2, "");
                    s1 = this.c.e(null, s);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli3, byteBuffer0);
                    hmli hmli4 = (hmli)list0.get(1);
                    String s2 = (String)this.b.b(hmli4, "");
                    s1 = this.c.e(byteBuffer1, s2);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(s1);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertBytesToString method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli c(List list0) {
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
                    String s = (String)this.b.b(hmli2, "");
                    byteBuffer0 = this.c.g(null, s);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    String s1 = (String)this.b.b(hmli3, "");
                    hmli hmli4 = (hmli)list0.get(1);
                    String s2 = (String)this.b.b(hmli4, "");
                    byteBuffer0 = this.c.g(s1, s2);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(byteBuffer0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertStringToBytes method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli d(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            if(list0.size() == 1) {
                hmli hmli1 = (hmli)list0.get(0);
                String s = (String)this.b.b(hmli1, "");
                return this.c.c(null, s);
            }
            switch(list0.size()) {
                case 2: {
                    hmli hmli2 = (hmli)list0.get(0);
                    String s1 = (String)this.b.b(hmli2, "");
                    hmli hmli3 = (hmli)list0.get(1);
                    String s2 = (String)this.b.b(hmli3, "");
                    return this.c.d(null, s1, s2);
                }
                case 3: {
                    hmli hmli4 = (hmli)list0.get(0);
                    hmli hmli5 = this.b.a(hmli4);
                    hmli hmli6 = (hmli)list0.get(1);
                    String s3 = (String)this.b.b(hmli6, "");
                    hmli hmli7 = (hmli)list0.get(2);
                    String s4 = (String)this.b.b(hmli7, "");
                    return this.c.d(hmli5, s3, s4);
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertTo method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli e(List list0) {
        hmkf hmkf0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.isEmpty()) {
                hmkf0 = this.c.a(null, null, null);
            }
            else if(list0.size() == 1) {
                hmli hmli2 = (hmli)list0.get(0);
                String s = (String)this.b.b(hmli2, "");
                hmkf0 = this.c.a(null, s, null);
            }
            else {
                switch(list0.size()) {
                    case 2: {
                        hmli hmli3 = (hmli)list0.get(0);
                        String s1 = (String)this.b.b(hmli3, "");
                        hmli hmli4 = (hmli)list0.get(1);
                        String s2 = (String)this.b.b(hmli4, "");
                        hmkf0 = this.c.a(null, s1, s2);
                        break;
                    }
                    case 3: {
                        hmli hmli5 = (hmli)list0.get(0);
                        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                        ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli5, byteBuffer0);
                        hmli hmli6 = (hmli)list0.get(1);
                        String s3 = (String)this.b.b(hmli6, "");
                        hmli hmli7 = (hmli)list0.get(2);
                        String s4 = (String)this.b.b(hmli7, "");
                        hmkf0 = this.c.a(byteBuffer1, s3, s4);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(hmkf0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertToBCDDate method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli f(List list0) {
        hmkf hmkf0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.isEmpty()) {
                hmkf0 = this.c.b(null, null, null, null);
            }
            else if(list0.size() == 1) {
                hmli hmli2 = (hmli)list0.get(0);
                String s = (String)this.b.b(hmli2, "");
                hmkf0 = this.c.b(null, s, null, null);
            }
            else {
                switch(list0.size()) {
                    case 2: {
                        hmli hmli3 = (hmli)list0.get(0);
                        String s1 = (String)this.b.b(hmli3, "");
                        hmli hmli4 = (hmli)list0.get(1);
                        String s2 = (String)this.b.b(hmli4, "");
                        hmkf0 = this.c.b(null, s1, s2, null);
                        break;
                    }
                    case 3: {
                        hmli hmli5 = (hmli)list0.get(0);
                        String s3 = (String)this.b.b(hmli5, "");
                        hmli hmli6 = (hmli)list0.get(1);
                        String s4 = (String)this.b.b(hmli6, "");
                        hmli hmli7 = (hmli)list0.get(2);
                        String s5 = (String)this.b.b(hmli7, "");
                        hmkf0 = this.c.b(null, s3, s4, s5);
                        break;
                    }
                    case 4: {
                        hmli hmli8 = (hmli)list0.get(0);
                        hmli hmli9 = this.b.a(hmli8);
                        hmli hmli10 = (hmli)list0.get(1);
                        String s6 = (String)this.b.b(hmli10, "");
                        hmli hmli11 = (hmli)list0.get(2);
                        String s7 = (String)this.b.b(hmli11, "");
                        hmli hmli12 = (hmli)list0.get(3);
                        String s8 = (String)this.b.b(hmli12, "");
                        hmkf0 = this.c.b(hmli9, s6, s7, s8);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(hmkf0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing convertToData method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

