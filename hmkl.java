import java.util.List;

public final class hmkl {
    private final hmlg a;
    private final hmqm b;
    private final hmkv c;
    private final hmkm d;

    public hmkl(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmlg0;
        this.b = hmqm0;
        this.d = new hmkm(hmlg0);
        this.c = new hmkv(hmlg0);
    }

    public final hmli a(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.size() == 2) {
                hmli hmli2 = (hmli)list0.get(0);
                String s = (String)this.c.b(hmli2, "");
                hmli hmli3 = (hmli)list0.get(1);
                boolean z = ((Boolean)this.c.b(hmli3, Boolean.TRUE)).booleanValue();
                this.d.a(null, s, z, false);
            }
            else {
                switch(list0.size()) {
                    case 3: {
                        hmli hmli4 = (hmli)list0.get(0);
                        hmli hmli5 = this.c.a(hmli4);
                        hmli hmli6 = (hmli)list0.get(1);
                        String s1 = (String)this.c.b(hmli6, "");
                        hmli hmli7 = (hmli)list0.get(2);
                        boolean z1 = ((Boolean)this.c.b(hmli7, Boolean.TRUE)).booleanValue();
                        this.d.a(hmli5, s1, z1, false);
                        break;
                    }
                    case 4: {
                        hmli hmli8 = (hmli)list0.get(0);
                        hmli hmli9 = this.c.a(hmli8);
                        hmli hmli10 = (hmli)list0.get(1);
                        String s2 = (String)this.c.b(hmli10, "");
                        hmli hmli11 = (hmli)list0.get(2);
                        boolean z2 = ((Boolean)this.c.b(hmli11, Boolean.TRUE)).booleanValue();
                        hmli hmli12 = (hmli)list0.get(3);
                        boolean z3 = ((Boolean)this.c.b(hmli12, Boolean.TRUE)).booleanValue();
                        this.d.a(hmli9, s2, z2, z3);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(Boolean.valueOf(true));
        }
        catch(Exception exception0) {
            this.b.a("Exception executing storeAs method", exception0);
            return new hmli(exception0.getMessage());
        }
    }
}

