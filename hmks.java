import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class hmks {
    private final hmlg a;

    public hmks(hmlg hmlg0) {
        this.a = hmlg0;
    }

    public final boolean a(hmlt hmlt0, boolean z) {
        int v8;
        int v7;
        int v6;
        int v4;
        int v3;
        int v2;
        int v1;
        Integer integer0 = hmlt0.c;
        if(((int)integer0) >= 0) {
            Integer integer1 = hmlt0.d;
            if(((int)integer1) >= 0) {
                Integer integer2 = hmlt0.e;
                if(((int)integer2) >= 0) {
                    Integer integer3 = hmlt0.f;
                    if(((int)integer3) >= 0) {
                        Integer integer4 = hmlt0.g;
                        if(((int)integer4) >= 0) {
                            ByteBuffer byteBuffer0 = hmlt0.b;
                            hmlg hmlg0 = this.a;
                            hmle hmle0 = hmlg0.f.a();
                            if(byteBuffer0 != null) {
                                hmle0.c(byteBuffer0);
                                hmlx.g(byteBuffer0.array());
                            }
                            int v = (int)Math.ceil(((float)(((int)integer4))) / 8.0f);
                            if(v <= 0) {
                                return false;
                            }
                            Integer integer5 = hmlt0.a;
                            if(((int)integer3) < ((int)integer0)) {
                                v1 = ((int)integer0) - ((int)integer5) * ((int)integer4) / 8;
                                v2 = v1 - v;
                                if(v2 < ((int)integer3)) {
                                    return false;
                                }
                                v3 = ((int)integer1) + ((int)integer5) * ((int)integer4) - (((int)integer0) - v1) * 8;
                                v4 = ((int)integer4) + v3;
                                if(v1 < ((int)integer3) || v3 < ((int)integer2) && ((int)integer1) > 0) {
                                    return false;
                                }
                            }
                            else {
                                v1 = ((int)integer0) + ((int)integer5) * ((int)integer4) / 8;
                                v2 = v + v1;
                                if(v2 > ((int)integer3)) {
                                    return false;
                                }
                                v3 = ((int)integer0) * 8 + ((int)integer1) + ((int)integer5) * ((int)integer4) - v1 * 8;
                                v4 = ((int)integer4) + v3;
                                if(v4 / 8 > v3 / 8 && v4 % 8 != 0) {
                                    ++v2;
                                }
                                if(v4 > ((int)integer2) && ((int)integer2) > 0) {
                                    return false;
                                }
                            }
                            hmlm hmlm0 = hmle0.c;
                            if(z) {
                                int v5 = (int)Math.ceil(((float)(((int)integer4))) / 8.0f);
                                if(((int)integer3) > ((int)integer0)) {
                                    if(((int)integer0) == 0) {
                                        v6 = ((int)integer5) == 0 ? 0 : ((int)integer4) / 8;
                                        v7 = (int)integer5;
                                    }
                                    else {
                                        v6 = (int)integer0;
                                        v7 = ((int)integer5) * ((int)integer4) / 8 + v6;
                                    }
                                    v8 = v6 + v5;
                                    if(v7 + v5 > ((int)integer3)) {
                                        return false;
                                    }
                                }
                                else {
                                    v6 = ((int)integer5) == 0 ? ((int)integer0) : 1;
                                    v8 = ((int)integer5) == 0 ? ((int)integer3) : v5 + v6;
                                }
                                int v9 = hmlm0.a;
                                if(v9 > hmlm0.d) {
                                    hmlm0.c(v9 - v6, 0, integer4.intValue(), v9 - v8);
                                }
                                else {
                                    hmlm0.c(v6 + v9, 0, integer4.intValue(), v9 + v8);
                                }
                                hmlg0.f.a().d = (int)integer5;
                                return true;
                            }
                            hmlm0.c(v1, v3, v4, v2);
                            hmle0.d = (int)integer5;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(Integer integer0, ByteBuffer byteBuffer0, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5) {
        Objects.toString(integer1);
        Objects.toString(integer2);
        Objects.toString(integer3);
        Objects.toString(integer4);
        Objects.toString(integer5);
        return this.a(new hmlt(integer0, byteBuffer0, integer1, integer2, integer3, integer4, integer5), false);
    }

    public final boolean c(Integer integer0, ByteBuffer byteBuffer0, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5) {
        Objects.toString(integer1);
        Objects.toString(integer2);
        Objects.toString(integer3);
        Objects.toString(integer4);
        Objects.toString(integer5);
        return this.a(new hmlt(integer0, byteBuffer0, integer1, integer2, integer3, integer4, integer5), true);
    }

    public final boolean d(Integer integer0, boolean z) {
        hmlg hmlg0 = this.a;
        List list0 = hmlg0.c.b;
        int v = (int)integer0;
        if(z) {
            v = list0.size() - 1 - ((int)integer0);
            if(v < 0) {
                return false;
            }
        }
        else if(v >= list0.size()) {
            return false;
        }
        hmlx.g(((ByteBuffer)list0.get(v)).array());
        hmlg0.f.a().c(((ByteBuffer)list0.get(v)));
        hmlg0.f.a().d = (int)integer0;
        return true;
    }

    public final boolean e(Integer integer0, ByteBuffer byteBuffer0, String s) {
        hmlp hmlp1;
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null && ((int)integer0) == 0) {
            hmle0.c(byteBuffer0);
            hmlx.g(byteBuffer0.array());
        }
        if(((int)integer0) == 0) {
            this.l(byteBuffer0, s);
            hmkh hmkh0 = hmle0.b;
            hmlp hmlp0 = hmks.o(((hmlp)hmkh0.a).b.a, hmle0.a.array());
            if(hmlp0 == null) {
                hmle0.d(hmkh0);
                return false;
            }
            hmkh hmkh1 = new hmkh(hmlp0);
            hmkh0.a(hmkh1);
            hmle0.d(hmkh1);
            hmle0.d = (int)integer0;
            return true;
        }
        String[] arr_s = s.split("#")[1].split("~");
        String s1 = arr_s[arr_s.length - 1];
        hmkh hmkh2;
        for(hmkh2 = hmle0.b.c; true; hmkh2 = hmkh2.c) {
            hmlp1 = (hmlp)hmkh2.a;
            if(hmlp1.a.equals(s1)) {
                break;
            }
        }
        int v = (int)integer0;
        hmle0.d(hmkh2);
        hmlm hmlm0 = hmlp1.b;
        for(int v1 = hmlm0.a; true; v1 = v2) {
            hmlp hmlp2 = hmks.o(v1, hmle0.a.array());
            if(hmlp2 == null) {
                hmle0.d(hmkh2);
                return false;
            }
            --v;
            int v2 = hmlp2.b.d;
            if(v2 >= hmlm0.d && v >= 0) {
                hmle0.d(hmkh2);
                return false;
            }
            if(v < 0) {
                hmkh hmkh3 = new hmkh(hmlp2);
                hmkh2.a(hmkh3);
                hmle0.d(hmkh3);
                hmle0.d = (int)integer0;
                return true;
            }
        }
    }

    public final boolean f(Integer integer0, ByteBuffer byteBuffer0, String s) {
        hmlp hmlp1;
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null && ((int)integer0) == 0) {
            hmle0.c(byteBuffer0);
            hmlx.g(byteBuffer0.array());
        }
        if(((int)integer0) == 0) {
            this.m(byteBuffer0, s);
            hmkh hmkh0 = hmle0.b;
            hmlp hmlp0 = hmks.p(((hmlp)hmkh0.a).b.a, hmle0.a.array());
            if(hmlp0 == null) {
                hmle0.d(hmkh0);
                return false;
            }
            hmkh hmkh1 = new hmkh(hmlp0);
            hmkh0.a(hmkh1);
            hmle0.d(hmkh1);
            hmle0.d = (int)integer0;
            return true;
        }
        String[] arr_s = s.split("#")[1].split("~");
        String s1 = arr_s[arr_s.length - 1];
        hmkh hmkh2;
        for(hmkh2 = hmle0.b.c; true; hmkh2 = hmkh2.c) {
            hmlp1 = (hmlp)hmkh2.a;
            if(hmlp1.a.equals(s1)) {
                break;
            }
        }
        int v = (int)integer0;
        hmle0.d(hmkh2);
        hmlm hmlm0 = hmlp1.b;
        for(int v1 = hmlm0.a; true; v1 = v2) {
            hmlp hmlp2 = hmks.p(v1, hmle0.a.array());
            if(hmlp2 == null) {
                hmle0.d(hmkh2);
                return false;
            }
            --v;
            int v2 = hmlp2.b.d;
            if(v2 >= hmlm0.d && v >= 0) {
                hmle0.d(hmkh2);
                return false;
            }
            if(v < 0) {
                hmkh hmkh3 = new hmkh(hmlp2);
                hmkh2.a(hmkh3);
                hmle0.d(hmkh3);
                hmle0.d = (int)integer0;
                return true;
            }
        }
    }

    public final boolean g(ByteBuffer byteBuffer0, Integer integer0, Integer integer1, Integer integer2, Integer integer3) {
        Objects.toString(integer0);
        Objects.toString(integer1);
        Objects.toString(integer2);
        Objects.toString(integer3);
        return this.h(byteBuffer0, integer0, integer1, integer2, integer3, false);
    }

    public final boolean h(ByteBuffer byteBuffer0, Integer integer0, Integer integer1, Integer integer2, Integer integer3, boolean z) {
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null) {
            hmle0.c(byteBuffer0);
            hmlx.g(byteBuffer0.array());
        }
        if(((int)integer0) >= 0 && ((int)integer1) >= 0 && ((int)integer2) >= 0 && ((int)integer3) >= 0) {
            int v = ((int)integer3) < ((int)integer0) ? hmlx.b(integer0.intValue(), integer3.intValue()) : hmlx.b(integer3.intValue(), integer0.intValue());
            if(((int)integer2) > v * 8) {
                integer2 = (int)(v * 8);
            }
            hmlm hmlm0 = hmle0.c;
            if(z) {
                hmlm0.c(hmlm0.a + ((int)integer0), hmlm0.b + ((int)integer1), hmlm0.b + ((int)integer2), hmlm0.a + ((int)integer3));
                return true;
            }
            hmlm0.c(integer0.intValue(), integer1.intValue(), integer2.intValue(), integer3.intValue());
            return true;
        }
        return false;
    }

    public final boolean i(ByteBuffer byteBuffer0, Integer integer0, Integer integer1, Integer integer2, Integer integer3) {
        Objects.toString(integer0);
        Objects.toString(integer1);
        Objects.toString(integer2);
        Objects.toString(integer3);
        return this.h(byteBuffer0, integer0, integer1, integer2, integer3, true);
    }

    public final void j(ByteBuffer byteBuffer0, String s, boolean z) {
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null) {
            hmle0.c(byteBuffer0);
        }
        ByteBuffer byteBuffer1 = hmle0.a;
        if(byteBuffer1 == null) {
            throw new hmki("Context should have data. Please use validateTLV in chainingMode and one of the precedent functions must set the data");
        }
        hmlx.g(byteBuffer1.array());
        if(byteBuffer1.capacity() < 3) {
            throw new hmki("Too less bytes for a TLV.");
        }
        if(z) {
            hmlv hmlv0 = hmlw.b(byteBuffer1, new hmlu(s.toCharArray()), false);
            if(!hmlv0.k) {
                return;
            }
            throw new hmki(hmlw.a(hmlv0));
        }
        hmlv hmlv1 = hmlw.c(byteBuffer1, new hmlu(s.toCharArray()), false);
        if(!hmlv1.k) {
            return;
        }
        throw new hmki(hmlw.a(hmlv1));
    }

    public final void k(ByteBuffer byteBuffer0, String s, boolean z) {
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null) {
            hmle0.c(byteBuffer0);
        }
        ByteBuffer byteBuffer1 = hmle0.a;
        if(byteBuffer1 == null) {
            throw new hmki("Context should have data. Please use validateTLV in chainingMode and one of the precedent functions must set the data");
        }
        hmlx.g(byteBuffer1.array());
        if(byteBuffer1.capacity() < 3) {
            throw new hmki("Too less bytes for a TLV.");
        }
        if(z) {
            hmlr hmlr0 = hmls.b(byteBuffer1, new hmlq(s.toCharArray()), false);
            if(!hmlr0.k) {
                return;
            }
            throw new hmki(hmls.a(hmlr0));
        }
        hmlr hmlr1 = hmls.c(byteBuffer1, new hmlq(s.toCharArray()), false);
        if(!hmlr1.k) {
            return;
        }
        throw new hmki(hmls.a(hmlr1));
    }

    public final void l(ByteBuffer byteBuffer0, String s) {
        this.q(byteBuffer0, s, false);
    }

    public final void m(ByteBuffer byteBuffer0, String s) {
        this.q(byteBuffer0, s, true);
    }

    private final void n(hmle hmle0, hmkh hmkh0, byte b, boolean z, boolean z1) {
        hmlp hmlp1;
        if(z) {
            hmkh hmkh1 = hmkh0.c;
            if(hmkh1 != null) {
                if(((hmlp)hmkh1.a).a() == b) {
                    hmle0.d(hmkh1);
                }
                else {
                    hmkh hmkh2 = hmkh1.c;
                    if(hmkh2 == null) {
                        throw new hmki("Tag not found...");
                    }
                    if(((hmlp)hmkh2.a).a() != b) {
                        Iterator iterator0 = hmkh2.b.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                return;
                            }
                            Object object0 = iterator0.next();
                            hmkh hmkh3 = (hmkh)object0;
                            if(((hmlp)hmkh3.a).a() != b) {
                                continue;
                            }
                            hmle0.d(hmkh3);
                            return;
                        }
                    }
                    hmle0.d(hmkh2);
                    return;
                }
            }
            return;
        }
        hmlp hmlp0 = (hmlp)hmkh0.a;
        if(hmlp0.a() != b) {
            List list0 = hmkh0.b;
            if(list0 != null) {
                for(Object object1: list0) {
                    hmkh hmkh4 = (hmkh)object1;
                    if(((hmlp)hmkh4.a).a() == b) {
                        hmle0.d(hmkh4);
                        return;
                    }
                }
            }
            hmlm hmlm0 = hmlp0.b;
            this.a.f.a().c.b(hmlm0);
            byte[] arr_b = this.a.f.a().b().array();
            if(z1) {
                int v = hmlm0.a;
                int v1 = 0;
                while(v1 < arr_b.length) {
                    if(arr_b[v1] == b) {
                        if(v1 + 1 >= arr_b.length) {
                            throw new hmki("Tag not found...");
                        }
                        int v2 = v + (v1 + 1 + hmlx.c(arr_b, v1 + 1));
                        hmlp1 = new hmlp(hmlx.h(b), new hmlm(v2, 0, 0, hmlx.d(arr_b, v1 + 1) + v2));
                        goto label_56;
                    }
                    if(v1 + 1 < arr_b.length) {
                        v1 = v1 + hmlx.d(arr_b, v1 + 1) + 1;
                    }
                    ++v1;
                }
                throw new hmki("Tag not found...");
            }
            int v3 = hmlm0.a;
            for(int v4 = 0; v4 < arr_b.length; ++v4) {
                if(arr_b[v4] == b) {
                    if(v4 + 1 >= arr_b.length) {
                        throw new hmki("Tag not found...");
                    }
                    int v5 = v3 + (v4 + 2);
                    hmlp1 = new hmlp(hmlx.h(b), new hmlm(v5, 0, 0, ByteBuffer.wrap(new byte[]{0, 0, 0, arr_b[v4 + 1]}).getInt() + v5));
                label_56:
                    hmkh hmkh5 = new hmkh(hmlp1);
                    hmkh0.a(hmkh5);
                    hmle0.d(hmkh5);
                    return;
                }
                if(v4 + 1 < arr_b.length) {
                    v4 = v4 + ByteBuffer.wrap(new byte[]{0, 0, 0, arr_b[v4 + 1]}).getInt() + 1;
                }
            }
            throw new hmki("Tag not found...");
        }
        hmle0.d(hmkh0);
    }

    private static final hmlp o(int v, byte[] arr_b) {
        if(arr_b.length > v + 1) {
            int v1 = arr_b[v];
            int v2 = ByteBuffer.wrap(new byte[]{0, 0, 0, arr_b[v + 1]}).getInt();
            if(v1 != 0 && v2 != 0) {
                int v3 = v2 + (v + 2);
                return arr_b.length < v3 - 1 ? null : new hmlp(hmlx.h(((byte)v1)), new hmlm(v + 2, 0, 0, v3));
            }
        }
        return null;
    }

    private static final hmlp p(int v, byte[] arr_b) {
        if(arr_b.length > v + 1) {
            int v1 = arr_b[v];
            int v2 = hmlx.d(arr_b, v + 1);
            if(v1 != 0 && v2 != 0) {
                int v3 = (v2 <= 0x80 ? 2 : 3) + v;
                int v4 = v2 + v3;
                return arr_b.length < v4 - 1 ? null : new hmlp(hmlx.h(((byte)v1)), new hmlm(v3, 0, 0, v4));
            }
        }
        return null;
    }

    private final void q(ByteBuffer byteBuffer0, String s, boolean z) {
        boolean z1;
        hmks hmks0;
        hmle hmle0 = this.a.f.a();
        if(byteBuffer0 != null) {
            hmle0.c(byteBuffer0);
            hmlx.g(byteBuffer0.array());
        }
        if(hmle0.b == null) {
            hmlm hmlm0 = new hmlm();
            hmlm0.b(hmle0.c);
            hmle0.d(new hmkh(new hmlp(hmlx.h(((byte)-1)), hmlm0)));
        }
        String[] arr_s = s.split("#");
        if(arr_s.length > 0) {
            int v = 0;
            String[] arr_s1 = arr_s[0].split("~");
            String[] arr_s2 = arr_s[1].split("~");
            if(arr_s1.length > 0) {
                while(v < arr_s1.length) {
                    String s1 = arr_s1[v];
                    if(s1.isEmpty()) {
                        hmks0 = this;
                        z1 = z;
                    }
                    else {
                        hmks0 = this;
                        z1 = z;
                        hmks0.n(hmle0, hmle0.b, hmlx.a(s1), true, z1);
                    }
                    ++v;
                    this = hmks0;
                    z = z1;
                }
            }
            if(arr_s2.length > 0) {
                for(int v1 = 1; v1 < arr_s2.length; ++v1) {
                    if(!arr_s2[v1].isEmpty()) {
                        this.n(hmle0, hmle0.b, hmlx.a(arr_s2[v1]), false, z);
                    }
                }
            }
        }
    }
}

