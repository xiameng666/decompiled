import java.util.LinkedHashMap;

public final class hmdk implements hmhh {
    public hmgz a;
    public hmgz b;
    public hmgz c;

    public hmdk(hmgz hmgz0, hmgz hmgz1) {
        hmgz hmgz3;
        hmgz hmgz2;
        if(hmgz0 == null || hmgz0.p()) {
            throw new hmdn("Invalid TLV tag (null or empty)");
        }
        byte[] arr_b = hmgz0.a;
        if((arr_b[0] & 0x1F) != 0x1F) {
            if(arr_b.length <= 1) {
            label_14:
                if(hmgz1 == null) {
                    throw new hmdl("Null TLV value");
                }
                this.a = hmgz0;
                long v2 = (long)hmgz1.b();
                if(v2 <= 0x7FL) {
                    hmgz2 = new hmgz(((byte)(((int)v2))));
                }
                else if(v2 <= 0xFFL) {
                    hmgz2 = new hmgz(2);
                    hmgz2.m(0, (byte)0x81);
                    hmgz2.m(1, ((byte)(((int)v2))));
                }
                else {
                    if(Long.compare(v2, 0xFFFFL) <= 0) {
                        hmgz3 = new hmgz(3);
                        hmgz3.m(0, (byte)0x82);
                        hmgz3.m(1, ((byte)(((int)((0xFF00L & v2) >> 8)))));
                        hmgz3.m(2, ((byte)(((int)(v2 & 0xFFL)))));
                    }
                    else if(Long.compare(v2, 0xFFFFFFL) <= 0) {
                        hmgz3 = new hmgz(4);
                        hmgz3.m(0, (byte)0x83);
                        hmgz3.m(1, ((byte)(((int)((v2 & 0xFF0000L) >> 16)))));
                        hmgz3.m(2, ((byte)(((int)((0xFF00L & v2) >> 8)))));
                        hmgz3.m(3, ((byte)(((int)(v2 & 0xFFL)))));
                    }
                    else {
                        hmgz3 = new hmgz(5);
                        hmgz3.m(0, (byte)0x84);
                        hmgz3.m(1, ((byte)(((int)((0xFFFFFFFFFF000000L & v2) >> 24)))));
                        hmgz3.m(2, ((byte)(((int)((v2 & 0xFF0000L) >> 16)))));
                        hmgz3.m(3, ((byte)(((int)((v2 & 0xFF00L) >> 8)))));
                        hmgz3.m(4, ((byte)(((int)(v2 & 0xFFL)))));
                    }
                    hmgz2 = hmgz3;
                }
                this.b = hmgz2;
                this.c = hmgz1;
                return;
            }
        }
        else if(arr_b.length >= 2) {
            for(int v = 1; true; ++v) {
                int v1 = arr_b.length - 1;
                if(v >= v1) {
                    break;
                }
                if((arr_b[v] & 0xFFFFFF80) != 0xFFFFFF80) {
                    throw new hmdn();
                }
            }
            if((arr_b[v1] & 0xFFFFFF80) != 0xFFFFFF80) {
                goto label_14;
            }
        }
        throw new hmdn();
    }

    public hmdk(hmgz hmgz0, Iterable iterable0) {
        if(iterable0 == null) {
            throw new hmdl("Null data to convert");
        }
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            v1 += ((hmdk)object0).a();
        }
        hmgz hmgz1 = new hmgz(v1);
        for(Object object1: iterable0) {
            hmgz1.n(v, ((hmdk)object1).d().a);
            v += ((hmdk)object1).a();
        }
        this(hmgz0, hmgz1);
    }

    public final int a() {
        return this.a.b() + this.b.b() + this.c.b();
    }

    public static hmdk b(byte[] arr_b) {
        return hmdk.c(arr_b, 0);
    }

    public static hmdk c(byte[] arr_b, int v) {
        if(arr_b == null || arr_b.length <= 0) {
            throw new hmdl("Null or empty input data");
        }
        if(v < 0) {
            throw new hmdl("Initial offset cannot be negative");
        }
        if(v >= arr_b.length) {
            throw new hmdm("Initial offset is beyond the array");
        }
        hmgz hmgz0 = hmgw.f(arr_b, v);
        if(arr_b.length <= hmgz0.b() + v) {
            throw new hmdm("Not enough data in length field (no length field)");
        }
        int v1 = hmgw.a(arr_b[hmgz0.b() + v]);
        int v2 = hmgz0.b() + v;
        if(v2 >= arr_b.length) {
            throw new hmdl("Offset beyond array bounds");
        }
        byte b = arr_b[v2];
        if((b & 0xFF) > 0x84) {
            throw new hmdl("Incorrect first byte of length. Max value 0x84");
        }
        if((b & 0xFF) == 0x80) {
            throw new hmdl("Incorrect first byte of length. Cannot be 0x80");
        }
        switch(b) {
            case 0xFFFFFF81: {
                goto label_14;
            }
            case 0xFFFFFF82: {
                goto label_18;
            }
            case 0xFFFFFF83: {
                goto label_22;
            }
            case 0xFFFFFF84: {
                goto label_26;
            }
        }
        long v3 = hmgw.c(new byte[]{b});
        goto label_28;
    label_14:
        if(v2 + 1 >= arr_b.length) {
            throw new hmdl("Incorrect start offset or not enough data in the array");
        }
        v3 = hmgw.c(new byte[]{arr_b[v2 + 1]});
        goto label_28;
    label_18:
        if(v2 + 2 >= arr_b.length) {
            throw new hmdl("Incorrect start offset or not enough data in the array");
        }
        v3 = hmgw.c(new byte[]{arr_b[v2 + 1], arr_b[v2 + 2]});
        goto label_28;
    label_22:
        if(v2 + 3 >= arr_b.length) {
            throw new hmdl("Incorrect start offset or not enough data in the array");
        }
        v3 = hmgw.c(new byte[]{arr_b[v2 + 1], arr_b[v2 + 2], arr_b[v2 + 3]});
        goto label_28;
    label_26:
        if(v2 + 4 >= arr_b.length) {
            throw new hmdl("Incorrect start offset or not enough data in the array");
        }
        v3 = hmgw.c(new byte[]{arr_b[v2 + 1], arr_b[v2 + 2], arr_b[v2 + 3], arr_b[v2 + 4]});
    label_28:
        if(v3 > 0x4FFFFFF7L) {
            throw new hmdm("The length part represents too big number. Max is 1342177271");
        }
        if(((long)arr_b.length) < ((long)(hmgz0.b() + v + v1)) + v3) {
            throw new hmdm("Not enough data in value field");
        }
        hmgz hmgz1 = new hmgz(((int)v3));
        hmgz1.o(0, arr_b, v + hmgz0.b() + v1, ((int)v3));
        return new hmdk(hmgz0, hmgz1);
    }

    public final hmgz d() {
        hmgz hmgz0 = new hmgz(this.a());
        try {
            hmgz0.n(0, this.a.a);
            hmgz0.n(this.a.b(), this.b.a);
            hmgz0.n(this.a.b() + this.b.b(), this.c.a);
            return hmgz0;
        }
        catch(hmdl hmdl0) {
            throw new RuntimeException(hmdl0);
        }
    }

    public static LinkedHashMap e(hmgz hmgz0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v = 0; v < hmgz0.b(); v += hmdk0.a()) {
            hmdk hmdk0 = hmdk.c(hmgz0.a, v);
            linkedHashMap0.put(hmdk0.a, hmdk0);
        }
        return linkedHashMap0;
    }

    @Override  // hmhh
    public final void g() {
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        this.a.i();
        this.b.i();
        this.c.i();
        hmbb0.e();
        return "TlvObject";
    }
}

