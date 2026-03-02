import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public final class igvd implements Serializable {
    public static final byte[] a;
    transient igvh b;
    public igvo[] c;

    static {
        igvd.a = new byte[]{(byte)0xE0, 23, (byte)0xC1, 4, 3, 2, (byte)0x81, (byte)0x82, -62, 2, 0, 0x40, -61, 1, 1, -60, 1, 0, -59, 1, 1, -57, 2, -33, 16};
    }

    public igvd(JSONObject jSONObject0) {
        this.b = null;
        try {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("sectors");
            JSONObject jSONObject1 = jSONArray0.getJSONObject(0);
            byte[] arr_b = igvq.h(jSONObject1.getJSONArray("data"));
            igvd.k(arr_b);
            igvo[] arr_igvo = new igvo[arr_b[17]];
            this.c = arr_igvo;
            arr_igvo[0] = new igvo(Arrays.copyOf(arr_b, ((int)arr_b[16])));
            for(int v = 1; v < this.a() - 2; ++v) {
                igvo[] arr_igvo1 = this.c;
                arr_igvo1[v] = new igvo(this.b());
            }
            igvo[] arr_igvo2 = this.c;
            int v1 = this.a() - 2;
            arr_igvo2[v1] = new igvo(this.c());
            igvo[] arr_igvo3 = this.c;
            int v2 = this.a() - 1;
            arr_igvo3[v2] = new igvo(this.c());
            igvo igvo0 = this.c[0];
            igvo0.b = jSONObject1.getBoolean("dirty");
            for(int v3 = 1; v3 < jSONArray0.length(); ++v3) {
                JSONObject jSONObject2 = jSONArray0.getJSONObject(v3);
                igvo igvo1 = this.c[v3];
                byte[] arr_b1 = igvq.h(jSONObject2.getJSONArray("data"));
                if(arr_b1.length != igvo1.a.length) {
                    throw new igvg(0x6700);
                }
                igvo1.a = arr_b1;
                igvo1.b = true;
                igvo igvo2 = this.c[v3];
                igvo2.c = Arrays.copyOfRange(igvq.h(jSONObject2.getJSONArray("accessKey")), 0, 8);
                igvo2.b = true;
                igvo igvo3 = this.c[v3];
                igvo3.b = jSONObject2.getBoolean("dirty");
            }
        }
        catch(Exception unused_ex) {
            throw new igvg(0x6B00);
        }
    }

    public final byte a() {
        return this.c == null ? 0 : this.c[0].a[17];
    }

    final int b() {
        igvo[] arr_igvo = this.c;
        return arr_igvo == null ? 0 : arr_igvo[0].a[16];
    }

    public final int c() {
        return this.c == null ? 0 : this.d() * 5 + 2 + this.c[0].a[19] + 14;
    }

    final int d() {
        igvo[] arr_igvo = this.c;
        return arr_igvo == null ? 0 : arr_igvo[0].a[18];
    }

    final String e() {
        return igvq.d(this.c[0].a, 2, 9);
    }

    public final igvh f() {
        int v = this.a();
        int v1 = this.d();
        igvh igvh0 = new igvh(this.c[v - 2], v1, v);
        int v2 = this.d();
        igvh igvh1 = new igvh(this.c[v - 1], v2, v);
        if((igvh0.e != 0 || igvh1.e != 0xFF) && (igvh0.e == 0xFF && igvh1.e == 0 || igvh0.e < igvh1.e)) {
            igvh0 = igvh1;
        }
        this.b = igvh0;
        return igvh0;
    }

    final boolean g(int v) {
        return this.b.b(v) == 2;
    }

    final boolean h() {
        return this.b.b;
    }

    final byte[] i() {
        igvo[] arr_igvo = this.c;
        if(arr_igvo == null) {
            return new byte[0];
        }
        byte[] arr_b = arr_igvo[0].a;
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b[0] & 0xFC);
        byte[] arr_b2 = new byte[arr_b1.length + 44];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b2);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.put(0x6F);
        byteBuffer0.put(((byte)(arr_b1.length + 42 & 0xFF)));
        byteBuffer0.put(igvq.i("840BA0000002164954534F2D31A5"));
        byteBuffer0.put(((byte)(arr_b1.length + 27 & 0xFF)));
        byteBuffer0.put((byte)0xC0);
        byteBuffer0.put(((byte)(arr_b1.length & 0xFF)));
        byteBuffer0.put(arr_b1);
        igvd.a[17] = (byte)(this.c() & 0xFF);
        byteBuffer0.put(igvd.a);
        return arr_b2;
    }

    public final igvn j(igve igve0, int v) {
        igvh igvh0 = this.b;
        ArrayList arrayList0 = new ArrayList();
        if(igvh0.d[v - 1] != 0) {
            int v1 = 0;
            while(true) {
                arrayList0.add(Integer.valueOf(v));
                int[] arr_v = igvh0.d;
                v = arr_v[v - 1];
                if(v1 > arr_v.length) {
                    throw new Exception("Invalid SCT.");
                }
                if(v > arr_v.length || v <= 0 || v == ((int)(((Integer)arrayList0.get(v1))))) {
                    break;
                }
                ++v1;
                continue;
            }
        }
        int v2 = 1;
        igvn igvn0 = new igvn();
        if((igve0 instanceof igvl)) {
            for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                igvo[] arr_igvo = this.c;
                byte[] arr_b = arr_igvo[((int)(((Integer)arrayList0.get(v3))))].a;
                int v4 = igvq.b(arr_b, 0, 6) * 4 + 16;
                if(v4 > 19) {
                    igvn0.add(igvq.g(arr_b, v4));
                }
            }
            return igvn0;
        }
        if(((igvf)igve0).b()) {
            v2 = 3;
        }
        int v5 = 0;
        int v6 = 0;
        while(v5 < v2) {
            igvo[] arr_igvo1 = this.c;
            int v7 = v6 + 1;
            byte[] arr_b1 = arr_igvo1[((int)(((Integer)arrayList0.get(v6))))].a;
            int v8 = igvq.b(arr_b1, 0, 6) * 4 + 16;
            byte[] arr_b2;
            for(arr_b2 = (byte[])arr_b1.clone(); arr_b2.length < v8 && v7 < arrayList0.size(); arr_b2 = arr_b4) {
                igvo[] arr_igvo2 = this.c;
                byte[] arr_b3 = arr_igvo2[((int)(((Integer)arrayList0.get(v7))))].a;
                byte[] arr_b4 = new byte[arr_b2.length + arr_b3.length];
                System.arraycopy(arr_b2, 0, arr_b4, 0, arr_b2.length);
                System.arraycopy(arr_b3, 0, arr_b4, arr_b2.length, arr_b3.length);
                ++v7;
            }
            if(v8 > arr_b2.length) {
                throw new Exception("Data group corrupt");
            }
            igvn0.add(igvq.g(arr_b2, v8));
            ++v5;
            v6 = v7;
            continue;
        }
        return igvn0;
    }

    public static final void k(byte[] arr_b) {
        int v = igvc.c(arr_b, 0);
        if(v != 6161 && v != 0x2031) {
            throw new igvg(0x6B81);
        }
        if(arr_b.length != (arr_b[16] & 0xFF) && arr_b.length != v >> 8) {
            throw new igvg(0x6B81);
        }
        if(igvc.c(arr_b, 11) != 0x203) {
            throw new igvg(0x6B82);
        }
        int v1 = arr_b[16];
        if(arr_b[18] <= arr_b[17]) {
            return;
        }
        throw new igvg(0x6B84);
    }

    @Override
    public final String toString() {
        String s = String.format("dirSize = %d\r\n", this.c());
        String s1 = String.format("fci = %s\r\n", igvq.c(this.i()));
        String s2 = String.format("S = %d\r\n", this.a());
        igvo[] arr_igvo = this.c;
        String s3 = "" + s + s1 + String.format("E = %d\r\n", this.d()) + s2 + String.format("SCTL = %d\r\n", ((byte)this.c[0].a[19]));
        for(int v = 0; v < arr_igvo.length; ++v) {
            s3 = s3 + arr_igvo[v].toString() + "\r\n";
        }
        return s3 + String.format("shellHeaderHeader = %d\r\n", igvc.c(this.c[0].a, 0));
    }
}

