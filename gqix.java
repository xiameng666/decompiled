public final class gqix {
    public static final int a(CharSequence charSequence0, gqit gqit0) {
        int v1;
        if((gqit0.b & 2) != 0) {
            byte[] arr_b = gqit0.c.toByteArray();
            if(arr_b.length != 0) {
                gqje gqje0 = new gqje(arr_b);
                gqjd gqjd0 = new gqjd(charSequence0);
                gqjc gqjc0 = new gqjc(gqje0);
                do {
                    int v = 1;
                    v1 = 4;
                    switch(gqjf.g[gqjc0.a(0) >>> 5].ordinal()) {
                        case 0: {
                            int v2 = gqjc0.b();
                            v = gqjc0.d(((v2 & 16) == 0 ? v2 & 15 : gqjc0.b() + ((v2 & 15) << 8)));
                            break;
                        }
                        case 1: {
                            int v3 = gqjc0.b();
                            if(gqjd0.b()) {
                                if((v3 & 15) != gqjd0.a()) {
                                    v = 3;
                                }
                            }
                            else if((v3 & 16) == 0) {
                                v = 4;
                            }
                            else {
                                v = 2;
                            }
                            break;
                        }
                        case 2: {
                            int v4 = gqjc0.b();
                            int v5 = v4 & 16;
                            int v6 = (v4 & 15) + 1;
                            while(v6 > 0) {
                                if(gqjd0.b()) {
                                    gqjd0.a();
                                    --v6;
                                    continue;
                                }
                                else if(v5 == 0) {
                                    v = 4;
                                }
                                else {
                                    v = 2;
                                }
                                break;
                            }
                            break;
                        }
                        case 3: {
                            int v7 = gqjc0.c();
                            if(gqjd0.b()) {
                                int v8 = gqjd0.a();
                                if((v7 & 0x800) != 0) {
                                    v = gqjc0.e(~v7 >>> v8 & 1);
                                }
                                else if((v7 & 1 << v8) == 0) {
                                    v = 3;
                                }
                            }
                            else if((v7 & 0x1000) == 0) {
                                v = 4;
                            }
                            else {
                                v = 2;
                            }
                            break;
                        }
                        case 4: {
                            v = gqjf.a(gqjc0, gqjd0, 4);
                            break;
                        }
                        case 5: {
                            v = gqjf.a(gqjc0, gqjd0, 2);
                            break;
                        }
                        default: {
                            throw null;
                        }
                    }
                }
                while(v == 1);
                switch(v - 1) {
                    case 1: {
                        if(!gqjd0.b()) {
                            v1 = 1;
                        }
                        return v1 == 3 ? 2 : v1;
                    }
                    case 3: {
                        return 2;
                    }
                    default: {
                        return 2;
                    }
                }
            }
            throw new IllegalArgumentException("matcher data cannot be empty");
        }
        return 2;
    }
}

