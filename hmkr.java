import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class hmkr {
    private final hmqm a;
    private final hmkv b;
    private final hmks c;

    public hmkr(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmqm0;
        this.c = new hmks(hmlg0);
        this.b = new hmkv(hmlg0);
    }

    public final hmli a(hmlf hmlf0, List list0) {
        boolean z;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            hmkv hmkv0 = this.b;
            int v = ((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue();
            if(v == 0) {
                ArrayList arrayList0 = new ArrayList();
                if(list0.size() == 6) {
                    hmli hmli2 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(1)), new hmkg(3))).a.intValue());
                    hmli hmli3 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(2)), new hmkg(3))).a.intValue());
                    hmli hmli4 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(3)), new hmkg(3))).a.intValue());
                    hmli hmli5 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(4)), new hmkg(3))).a.intValue());
                    hmli hmli6 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(5)), new hmkg(3))).a.intValue());
                    arrayList0.add(((hmli)list0.get(0)));
                    arrayList0.add(hmli2);
                    arrayList0.add(hmli3);
                    arrayList0.add(hmli4);
                    arrayList0.add(hmli5);
                    arrayList0.add(hmli6);
                    hmlf0.a().c = arrayList0;
                    z = this.c.b(Integer.valueOf(0), null, ((Integer)hmli2.a), ((Integer)hmli3.a), ((Integer)hmli4.a), ((Integer)hmli5.a), ((Integer)hmli6.a));
                }
                else {
                    if(list0.size() != 7) {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                    hmli hmli7 = new hmli(((ByteBuffer)hmkv0.b(((hmli)list0.get(1)), ByteBuffer.allocate(1))));
                    hmli hmli8 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(2)), new hmkg(3))).a.intValue());
                    hmli hmli9 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(3)), new hmkg(3))).a.intValue());
                    hmli hmli10 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(4)), new hmkg(3))).a.intValue());
                    hmli hmli11 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(5)), new hmkg(3))).a.intValue());
                    hmli hmli12 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(6)), new hmkg(3))).a.intValue());
                    arrayList0.add(((hmli)list0.get(0)));
                    arrayList0.add(hmli7);
                    arrayList0.add(hmli8);
                    arrayList0.add(hmli9);
                    arrayList0.add(hmli10);
                    arrayList0.add(hmli11);
                    arrayList0.add(hmli12);
                    hmlf0.a().c = arrayList0;
                    z = this.c.b(Integer.valueOf(0), ((ByteBuffer)hmli7.a), ((Integer)hmli8.a), ((Integer)hmli9.a), ((Integer)hmli10.a), ((Integer)hmli11.a), ((Integer)hmli12.a));
                    return new hmli(Boolean.valueOf(z));
                }
            }
            else {
                switch(list0.size()) {
                    case 6: {
                        Integer integer0 = (Integer)((hmli)list0.get(1)).a;
                        Integer integer1 = (Integer)((hmli)list0.get(2)).a;
                        Integer integer2 = (Integer)((hmli)list0.get(3)).a;
                        Integer integer3 = (Integer)((hmli)list0.get(4)).a;
                        Integer integer4 = (Integer)((hmli)list0.get(5)).a;
                        z = this.c.b(Integer.valueOf(v), null, integer0, integer1, integer2, integer3, integer4);
                        break;
                    }
                    case 7: {
                        ByteBuffer byteBuffer0 = (ByteBuffer)((hmli)list0.get(1)).a;
                        Integer integer5 = (Integer)((hmli)list0.get(2)).a;
                        Integer integer6 = (Integer)((hmli)list0.get(3)).a;
                        Integer integer7 = (Integer)((hmli)list0.get(4)).a;
                        Integer integer8 = (Integer)((hmli)list0.get(5)).a;
                        Integer integer9 = (Integer)((hmli)list0.get(6)).a;
                        z = this.c.b(Integer.valueOf(v), byteBuffer0, integer5, integer6, integer7, integer8, integer9);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing forEach method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli b(hmlf hmlf0, List list0) {
        boolean z;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            hmkv hmkv0 = this.b;
            int v = ((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue();
            if(v == 0) {
                ArrayList arrayList0 = new ArrayList();
                if(list0.size() == 6) {
                    hmli hmli2 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(1)), new hmkg(3))).a.intValue());
                    hmli hmli3 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(2)), new hmkg(3))).a.intValue());
                    hmli hmli4 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(3)), new hmkg(3))).a.intValue());
                    hmli hmli5 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(4)), new hmkg(3))).a.intValue());
                    hmli hmli6 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(5)), new hmkg(3))).a.intValue());
                    arrayList0.add(((hmli)list0.get(0)));
                    arrayList0.add(hmli2);
                    arrayList0.add(hmli3);
                    arrayList0.add(hmli4);
                    arrayList0.add(hmli5);
                    arrayList0.add(hmli6);
                    hmlf0.a().c = arrayList0;
                    z = this.c.c(Integer.valueOf(0), null, ((Integer)hmli2.a), ((Integer)hmli3.a), ((Integer)hmli4.a), ((Integer)hmli5.a), ((Integer)hmli6.a));
                }
                else {
                    if(list0.size() != 7) {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                    hmli hmli7 = new hmli(((ByteBuffer)hmkv0.b(((hmli)list0.get(1)), ByteBuffer.allocate(1))));
                    hmli hmli8 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(2)), new hmkg(3))).a.intValue());
                    hmli hmli9 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(3)), new hmkg(3))).a.intValue());
                    hmli hmli10 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(4)), new hmkg(3))).a.intValue());
                    hmli hmli11 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(5)), new hmkg(3))).a.intValue());
                    hmli hmli12 = new hmli(((hmkg)hmkv0.b(((hmli)list0.get(6)), new hmkg(3))).a.intValue());
                    arrayList0.add(((hmli)list0.get(0)));
                    arrayList0.add(hmli7);
                    arrayList0.add(hmli8);
                    arrayList0.add(hmli9);
                    arrayList0.add(hmli10);
                    arrayList0.add(hmli11);
                    arrayList0.add(hmli12);
                    hmlf0.a().c = arrayList0;
                    z = this.c.c(Integer.valueOf(0), ((ByteBuffer)hmli7.a), ((Integer)hmli8.a), ((Integer)hmli9.a), ((Integer)hmli10.a), ((Integer)hmli11.a), ((Integer)hmli12.a));
                    return new hmli(Boolean.valueOf(z));
                }
            }
            else {
                switch(list0.size()) {
                    case 6: {
                        Integer integer0 = (Integer)((hmli)list0.get(1)).a;
                        Integer integer1 = (Integer)((hmli)list0.get(2)).a;
                        Integer integer2 = (Integer)((hmli)list0.get(3)).a;
                        Integer integer3 = (Integer)((hmli)list0.get(4)).a;
                        Integer integer4 = (Integer)((hmli)list0.get(5)).a;
                        z = this.c.c(Integer.valueOf(v), null, integer0, integer1, integer2, integer3, integer4);
                        break;
                    }
                    case 7: {
                        ByteBuffer byteBuffer0 = (ByteBuffer)((hmli)list0.get(1)).a;
                        Integer integer5 = (Integer)((hmli)list0.get(2)).a;
                        Integer integer6 = (Integer)((hmli)list0.get(3)).a;
                        Integer integer7 = (Integer)((hmli)list0.get(4)).a;
                        Integer integer8 = (Integer)((hmli)list0.get(5)).a;
                        Integer integer9 = (Integer)((hmli)list0.get(6)).a;
                        z = this.c.c(Integer.valueOf(v), byteBuffer0, integer5, integer6, integer7, integer8, integer9);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing forEachIn method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli c(List list0) {
        boolean z;
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
                    Integer integer0 = ((hmkg)this.b.b(hmli2, hmkg0)).a.intValue();
                    z = this.c.d(integer0, false);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    hmkg hmkg1 = new hmkg(3);
                    Integer integer1 = ((hmkg)this.b.b(hmli3, hmkg1)).a.intValue();
                    hmli hmli4 = (hmli)list0.get(1);
                    boolean z1 = ((Boolean)this.b.b(hmli4, Boolean.TRUE)).booleanValue();
                    z = this.c.d(integer1, z1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing forEachRecord method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli d(List list0, boolean z) {
        boolean z1;
        ByteBuffer byteBuffer0 = null;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        if(list0.size() == 2) {
            try {
                if(z) {
                    hmli hmli2 = (hmli)list0.get(0);
                    hmkg hmkg0 = new hmkg(3);
                    Integer integer0 = ((hmkg)this.b.b(hmli2, hmkg0)).a.intValue();
                    hmli hmli3 = (hmli)list0.get(1);
                    String s = (String)this.b.b(hmli3, "");
                    z1 = this.c.f(integer0, null, s);
                    return new hmli(Boolean.valueOf(z1));
                }
                hmli hmli4 = (hmli)list0.get(0);
                hmkg hmkg1 = new hmkg(3);
                Integer integer1 = ((hmkg)this.b.b(hmli4, hmkg1)).a.intValue();
                hmli hmli5 = (hmli)list0.get(1);
                String s1 = (String)this.b.b(hmli5, "");
                z1 = this.c.e(integer1, null, s1);
                return new hmli(Boolean.valueOf(z1));
            label_22:
                if(list0.size() != 3) {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
                hmkv hmkv0 = this.b;
                if(((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue() == 0) {
                    byteBuffer0 = (ByteBuffer)hmkv0.b(((hmli)list0.get(1)), ByteBuffer.allocate(1));
                }
                if(z) {
                    Integer integer2 = ((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue();
                    String s2 = (String)hmkv0.b(((hmli)list0.get(2)), "");
                    z1 = this.c.f(integer2, byteBuffer0, s2);
                }
                else {
                    Integer integer3 = ((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue();
                    String s3 = (String)hmkv0.b(((hmli)list0.get(2)), "");
                    z1 = this.c.e(integer3, byteBuffer0, s3);
                }
                return new hmli(Boolean.valueOf(z1));
            }
            catch(Exception exception0) {
                this.a.a("Exception executing forEachTag method", exception0);
                return new hmli(exception0.getMessage());
            }
        }
        goto label_22;
    }

    public final hmli e(List list0) {
        boolean z;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 4: {
                    hmli hmli2 = (hmli)list0.get(0);
                    hmkg hmkg0 = new hmkg(3);
                    Integer integer0 = ((hmkg)this.b.b(hmli2, hmkg0)).a.intValue();
                    hmli hmli3 = (hmli)list0.get(1);
                    hmkg hmkg1 = new hmkg(3);
                    Integer integer1 = ((hmkg)this.b.b(hmli3, hmkg1)).a.intValue();
                    hmli hmli4 = (hmli)list0.get(2);
                    hmkg hmkg2 = new hmkg(3);
                    Integer integer2 = ((hmkg)this.b.b(hmli4, hmkg2)).a.intValue();
                    hmli hmli5 = (hmli)list0.get(3);
                    hmkg hmkg3 = new hmkg(3);
                    Integer integer3 = ((hmkg)this.b.b(hmli5, hmkg3)).a.intValue();
                    z = this.c.g(null, integer0, integer1, integer2, integer3);
                    break;
                }
                case 5: {
                    hmli hmli6 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli6, byteBuffer0);
                    hmli hmli7 = (hmli)list0.get(1);
                    hmkg hmkg4 = new hmkg(3);
                    Integer integer4 = ((hmkg)this.b.b(hmli7, hmkg4)).a.intValue();
                    hmli hmli8 = (hmli)list0.get(2);
                    hmkg hmkg5 = new hmkg(3);
                    Integer integer5 = ((hmkg)this.b.b(hmli8, hmkg5)).a.intValue();
                    hmli hmli9 = (hmli)list0.get(3);
                    hmkg hmkg6 = new hmkg(3);
                    Integer integer6 = ((hmkg)this.b.b(hmli9, hmkg6)).a.intValue();
                    hmli hmli10 = (hmli)list0.get(4);
                    hmkg hmkg7 = new hmkg(3);
                    Integer integer7 = ((hmkg)this.b.b(hmli10, hmkg7)).a.intValue();
                    z = this.c.g(byteBuffer1, integer4, integer5, integer6, integer7);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing select method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli f(List list0) {
        boolean z;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 4: {
                    hmli hmli2 = (hmli)list0.get(0);
                    hmkg hmkg0 = new hmkg(3);
                    Integer integer0 = ((hmkg)this.b.b(hmli2, hmkg0)).a.intValue();
                    hmli hmli3 = (hmli)list0.get(1);
                    hmkg hmkg1 = new hmkg(3);
                    Integer integer1 = ((hmkg)this.b.b(hmli3, hmkg1)).a.intValue();
                    hmli hmli4 = (hmli)list0.get(2);
                    hmkg hmkg2 = new hmkg(3);
                    Integer integer2 = ((hmkg)this.b.b(hmli4, hmkg2)).a.intValue();
                    hmli hmli5 = (hmli)list0.get(3);
                    hmkg hmkg3 = new hmkg(3);
                    Integer integer3 = ((hmkg)this.b.b(hmli5, hmkg3)).a.intValue();
                    z = this.c.i(null, integer0, integer1, integer2, integer3);
                    break;
                }
                case 5: {
                    hmli hmli6 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli6, byteBuffer0);
                    hmli hmli7 = (hmli)list0.get(1);
                    hmkg hmkg4 = new hmkg(3);
                    Integer integer4 = ((hmkg)this.b.b(hmli7, hmkg4)).a.intValue();
                    hmli hmli8 = (hmli)list0.get(2);
                    hmkg hmkg5 = new hmkg(3);
                    Integer integer5 = ((hmkg)this.b.b(hmli8, hmkg5)).a.intValue();
                    hmli hmli9 = (hmli)list0.get(3);
                    hmkg hmkg6 = new hmkg(3);
                    Integer integer6 = ((hmkg)this.b.b(hmli9, hmkg6)).a.intValue();
                    hmli hmli10 = (hmli)list0.get(4);
                    hmkg hmkg7 = new hmkg(3);
                    Integer integer7 = ((hmkg)this.b.b(hmli10, hmkg7)).a.intValue();
                    z = this.c.i(byteBuffer1, integer4, integer5, integer6, integer7);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing selectIn method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli g(List list0, boolean z) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        if(list0.size() == 1) {
            try {
                if(z) {
                    hmli hmli2 = (hmli)list0.get(0);
                    String s = (String)this.b.b(hmli2, "");
                    this.c.m(null, s);
                    return new hmli(Boolean.valueOf(true));
                }
                hmli hmli3 = (hmli)list0.get(0);
                String s1 = (String)this.b.b(hmli3, "");
                this.c.l(null, s1);
                return new hmli(Boolean.valueOf(true));
            label_15:
                if(list0.size() != 2) {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
                if(z) {
                    hmli hmli4 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli4, byteBuffer0);
                    hmli hmli5 = (hmli)list0.get(1);
                    String s2 = (String)this.b.b(hmli5, "");
                    this.c.m(byteBuffer1, s2);
                }
                else {
                    hmli hmli6 = (hmli)list0.get(0);
                    ByteBuffer byteBuffer2 = ByteBuffer.allocate(1);
                    ByteBuffer byteBuffer3 = (ByteBuffer)this.b.b(hmli6, byteBuffer2);
                    hmli hmli7 = (hmli)list0.get(1);
                    String s3 = (String)this.b.b(hmli7, "");
                    this.c.l(byteBuffer3, s3);
                }
                return new hmli(Boolean.valueOf(true));
            }
            catch(Exception exception0) {
                this.a.a("Exception executing selectTag method", exception0);
                return new hmli(exception0.getMessage());
            }
        }
        goto label_15;
    }

    public final hmli h(List list0, boolean z) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(!list0.isEmpty()) {
                switch(list0.size()) {
                    case 2: {
                        if(z) {
                            hmli hmli2 = (hmli)list0.get(0);
                            String s = (String)this.b.b(hmli2, "");
                            hmli hmli3 = (hmli)list0.get(1);
                            boolean z1 = ((Boolean)this.b.b(hmli3, Boolean.TRUE)).booleanValue();
                            this.c.k(null, s, z1);
                        }
                        else {
                            hmli hmli4 = (hmli)list0.get(0);
                            String s1 = (String)this.b.b(hmli4, "");
                            hmli hmli5 = (hmli)list0.get(1);
                            boolean z2 = ((Boolean)this.b.b(hmli5, Boolean.TRUE)).booleanValue();
                            this.c.j(null, s1, z2);
                        }
                        break;
                    }
                    case 3: {
                        if(z) {
                            hmli hmli6 = (hmli)list0.get(0);
                            ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                            ByteBuffer byteBuffer1 = (ByteBuffer)this.b.b(hmli6, byteBuffer0);
                            hmli hmli7 = (hmli)list0.get(1);
                            String s2 = (String)this.b.b(hmli7, "");
                            hmli hmli8 = (hmli)list0.get(2);
                            boolean z3 = ((Boolean)this.b.b(hmli8, Boolean.TRUE)).booleanValue();
                            this.c.k(byteBuffer1, s2, z3);
                        }
                        else {
                            hmli hmli9 = (hmli)list0.get(0);
                            ByteBuffer byteBuffer2 = ByteBuffer.allocate(1);
                            ByteBuffer byteBuffer3 = (ByteBuffer)this.b.b(hmli9, byteBuffer2);
                            hmli hmli10 = (hmli)list0.get(1);
                            String s3 = (String)this.b.b(hmli10, "");
                            hmli hmli11 = (hmli)list0.get(2);
                            boolean z4 = ((Boolean)this.b.b(hmli11, Boolean.TRUE)).booleanValue();
                            this.c.j(byteBuffer3, s3, z4);
                        }
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(Boolean.valueOf(true));
        }
        catch(hmki hmki0) {
            this.a.a("Exception executing validateTLV method", hmki0);
            return new hmli(hmki0.getMessage());
        }
        catch(Exception exception0) {
            this.a.a("Exception executing validateTLV method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

