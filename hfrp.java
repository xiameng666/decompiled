final class hfrp {
    public static final int a = 0;
    private static volatile int b = 100;

    static {
    }

    static double a(byte[] arr_b, int v) {
        return Double.longBitsToDouble(hfrp.s(arr_b, v));
    }

    static float b(byte[] arr_b, int v) {
        return Float.intBitsToFloat(hfrp.d(arr_b, v));
    }

    static int c(byte[] arr_b, int v, hfro hfro0) {
        int v1 = hfrp.l(arr_b, v, hfro0);
        int v2 = hfro0.a;
        if(v2 < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v2 > arr_b.length - v1) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if(v2 == 0) {
            hfro0.c = ByteString.b;
            return v1;
        }
        hfro0.c = ByteString.z(arr_b, v1, v2);
        return v1 + v2;
    }

    static int d(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | ((arr_b[v + 1] & 0xFF) << 8 | arr_b[v] & 0xFF | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int e(hfwc hfwc0, byte[] arr_b, int v, int v1, int v2, hfro hfro0) {
        Object object0 = hfwc0.e();
        int v3 = hfrp.p(object0, hfwc0, arr_b, v, v1, v2, hfro0);
        hfwc0.g(object0);
        hfro0.c = object0;
        return v3;
    }

    static int f(hfwc hfwc0, byte[] arr_b, int v, int v1, hfro hfro0) {
        Object object0 = hfwc0.e();
        int v2 = hfrp.q(object0, hfwc0, arr_b, v, v1, hfro0);
        hfwc0.g(object0);
        hfro0.c = object0;
        return v2;
    }

    static int g(hfwc hfwc0, int v, byte[] arr_b, int v1, int v2, hfuo hfuo0, hfro hfro0) {
        int v3 = hfrp.f(hfwc0, arr_b, v1, v2, hfro0);
        hfuo0.add(hfro0.c);
        while(v3 < v2) {
            int v4 = hfrp.l(arr_b, v3, hfro0);
            if(v != hfro0.a) {
                break;
            }
            v3 = hfrp.f(hfwc0, arr_b, v4, v2, hfro0);
            hfuo0.add(hfro0.c);
        }
        return v3;
    }

    static int h(byte[] arr_b, int v, hfuo hfuo0, hfro hfro0) {
        int v1 = hfrp.l(arr_b, v, hfro0);
        int v2 = hfro0.a + v1;
        while(v1 < v2) {
            v1 = hfrp.l(arr_b, v1, hfro0);
            ((hfty)hfuo0).i(hfro0.a);
        }
        if(v1 == v2) {
            return v1;
        }
        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] arr_b, int v, hfro hfro0) {
        int v1 = hfrp.l(arr_b, v, hfro0);
        int v2 = hfro0.a;
        if(v2 < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v2 == 0) {
            hfro0.c = "";
            return v1;
        }
        hfro0.c = new String(arr_b, v1, v2, hfup.a);
        return v1 + v2;
    }

    static int j(byte[] arr_b, int v, hfro hfro0) {
        int v1 = hfrp.l(arr_b, v, hfro0);
        int v2 = hfro0.a;
        if(v2 < 0) {
            throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v2 == 0) {
            hfro0.c = "";
            return v1;
        }
        hfro0.c = hfxa.b(arr_b, v1, v2);
        return v1 + v2;
    }

    static int k(int v, byte[] arr_b, int v1, int v2, hfwt hfwt0, hfro hfro0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = hfrp.o(arr_b, v1, hfro0);
                    hfwt0.e(v, Long.valueOf(hfro0.b));
                    return v3;
                }
                case 1: {
                    hfwt0.e(v, Long.valueOf(hfrp.s(arr_b, v1)));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = hfrp.l(arr_b, v1, hfro0);
                    int v5 = hfro0.a;
                    if(v5 < 0) {
                        throw new hfur("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    if(v5 > arr_b.length - v4) {
                        throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if(v5 == 0) {
                        hfwt0.e(v, ByteString.b);
                        return v4;
                    }
                    hfwt0.e(v, ByteString.z(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    hfwt hfwt1 = new hfwt();
                    int v6 = v & -8 | 4;
                    int v7 = hfro0.e + 1;
                    hfro0.e = v7;
                    hfrp.t(v7);
                    int v8;
                    for(v8 = 0; v1 < v2; v8 = v10) {
                        int v9 = hfrp.l(arr_b, v1, hfro0);
                        int v10 = hfro0.a;
                        if(v10 == v6) {
                            v8 = v10;
                            v1 = v9;
                            break;
                        }
                        v1 = hfrp.k(v10, arr_b, v9, v2, hfwt1, hfro0);
                    }
                    --hfro0.e;
                    if(v1 > v2 || v8 != v6) {
                        throw new hfur("Failed to parse the message.");
                    }
                    hfwt0.e(v, hfwt1);
                    return v1;
                }
                case 5: {
                    hfwt0.e(v, Integer.valueOf(hfrp.d(arr_b, v1)));
                    return v1 + 4;
                }
                default: {
                    throw new hfur("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new hfur("Protocol message contained an invalid tag (zero).");
    }

    static int l(byte[] arr_b, int v, hfro hfro0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            hfro0.a = v1;
            return v + 1;
        }
        return hfrp.m(v1, arr_b, v + 1, hfro0);
    }

    static int m(int v, byte[] arr_b, int v1, hfro hfro0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            hfro0.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            hfro0.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            hfro0.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            hfro0.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        hfro0.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int n(int v, byte[] arr_b, int v1, int v2, hfuo hfuo0, hfro hfro0) {
        int v3 = hfrp.l(arr_b, v1, hfro0);
        ((hfty)hfuo0).i(hfro0.a);
        while(v3 < v2) {
            int v4 = hfrp.l(arr_b, v3, hfro0);
            if(v != hfro0.a) {
                break;
            }
            v3 = hfrp.l(arr_b, v4, hfro0);
            ((hfty)hfuo0).i(hfro0.a);
        }
        return v3;
    }

    static int o(byte[] arr_b, int v, hfro hfro0) {
        long v1 = (long)arr_b[v];
        if(Long.compare(v1, 0L) >= 0) {
            hfro0.b = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        hfro0.b = v4;
        return v2;
    }

    static int p(Object object0, hfwc hfwc0, byte[] arr_b, int v, int v1, int v2, hfro hfro0) {
        int v3 = hfro0.e + 1;
        hfro0.e = v3;
        hfrp.t(v3);
        int v4 = ((hfvp)hfwc0).c(object0, arr_b, v, v1, v2, hfro0);
        --hfro0.e;
        hfro0.c = object0;
        return v4;
    }

    static int q(Object object0, hfwc hfwc0, byte[] arr_b, int v, int v1, hfro hfro0) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = hfrp.m(v3, arr_b, v2, hfro0);
            v3 = hfro0.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int v4 = hfro0.e + 1;
        hfro0.e = v4;
        hfrp.t(v4);
        int v5 = v2 + v3;
        hfwc0.i(object0, arr_b, v2, v5, hfro0);
        --hfro0.e;
        hfro0.c = object0;
        return v5;
    }

    static int r(int v, byte[] arr_b, int v1, int v2, hfro hfro0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return hfrp.o(arr_b, v1, hfro0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return hfrp.l(arr_b, v1, hfro0) + hfro0.a;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = hfrp.l(arr_b, v1, hfro0);
                        v4 = hfro0.a;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = hfrp.r(v4, arr_b, v1, v2, hfro0);
                    }
                    if(v1 <= v2 && v4 == v3) {
                        return v1;
                    }
                    throw new hfur("Failed to parse the message.");
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw new hfur("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new hfur("Protocol message contained an invalid tag (zero).");
    }

    static long s(byte[] arr_b, int v) {
        return ((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30 | (((long)arr_b[v + 7]) & 0xFFL) << 56;
    }

    private static void t(int v) {
        if(v < hfrp.b) {
            return;
        }
        throw new hfur("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}

