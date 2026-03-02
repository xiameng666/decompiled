final class gqdn extends gqad {
    @Override  // gqad
    public final Object a(gqff gqff0) {
        if(gqff0.u() == 9) {
            gqff0.p();
            return null;
        }
        try {
            int v = gqff0.d == 0 ? gqff0.b() : gqff0.d;
            switch(v) {
                case 15: {
                    goto label_16;
                }
                case 16: {
                    goto label_20;
                }
                default: {
                    if(v != 8 && v != 9 && v != 10) {
                        throw gqff0.d("a long");
                    }
                    gqff0.g = v == 10 ? gqff0.k() : gqff0.i(((char)(v == 8 ? 39 : 34)));
                }
            }
        }
        catch(NumberFormatException numberFormatException0) {
            throw new gpzy(numberFormatException0);
        }
        try {
            long v1 = Long.parseLong(gqff0.g);
            gqff0.d = 0;
            int v2 = gqff0.h - 1;
            ++gqff0.i[v2];
            return v1;
        }
        catch(NumberFormatException unused_ex) {
            goto label_24;
        }
        try {
        label_16:
            gqff0.d = 0;
            int v3 = gqff0.h - 1;
            ++gqff0.i[v3];
            return (long)gqff0.e;
        label_20:
            int v4 = gqff0.c;
            int v5 = gqff0.f;
            gqff0.g = new String(gqff0.b, v4, v5);
            gqff0.c = v4 + v5;
        label_24:
            gqff0.d = 11;
            double f = Double.parseDouble(gqff0.g);
            if(((double)(((long)f))) != f) {
                throw new NumberFormatException("Expected a long but was " + gqff0.g + gqff0.g());
            }
            gqff0.g = null;
            gqff0.d = 0;
            int v6 = gqff0.h - 1;
            ++gqff0.i[v6];
            return (long)f;
        }
        catch(NumberFormatException numberFormatException0) {
            throw new gpzy(numberFormatException0);
        }
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        if(((Number)object0) == null) {
            gqfh0.j();
            return;
        }
        gqfh0.k(((Number)object0).longValue());
    }
}

