import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class gpgh {
    public ByteBuffer bb;
    public int bb_pos;
    gpgj utf8;
    private int vtable_size;
    private int vtable_start;

    public gpgh() {
        this.utf8 = gpgj.a();
    }

    public static int A(gpgf gpgf0, int v, int v1, int v2, long v3) {
        gpgf0.w(4);
        gpgf0.k(3, v3, -1L);
        gpgf0.D(2, v2);
        gpgf0.D(1, v1);
        gpgf0.j(0, v, 0);
        return gpgf0.d();
    }

    public final int B() {
        int v = this.__offset(6);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public final long C() {
        int v = this.__offset(10);
        return v == 0 ? -1L : this.bb.getLong(v + this.bb_pos);
    }

    public final xeb D() {
        xeb xeb0 = new xeb();
        int v = this.__offset(8);
        if(v != 0) {
            xeb0.__reset(this.__indirect(v + this.bb_pos), this.bb);
            return xeb0;
        }
        return null;
    }

    public static void E(gpgf gpgf0, int v) {
        gpgf0.o(v, "FTMR");
    }

    public final long F() {
        int v = this.__offset(6);
        return v == 0 ? 0L : this.bb.getLong(v + this.bb_pos);
    }

    public final String G() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final String H() {
        int v = this.__offset(10);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final String I() {
        int v = this.__offset(8);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final int J(int v) {
        int v1 = this.__offset(6);
        return v1 == 0 ? 0 : this.bb.getInt(this.__vector(v1) + v * 4);
    }

    public final int K() {
        int v = this.__offset(6);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public static int L(gpgf gpgf0, int[] arr_v) {
        int v = arr_v.length;
        gpgf0.x(4, v, 4);
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            gpgf0.i(arr_v[v]);
        }
        return gpgf0.e();
    }

    public static int M(gpgf gpgf0, int v, int v1) {
        gpgf0.w(2);
        gpgf0.D(1, v1);
        gpgf0.j(0, v, -1);
        return gpgf0.d();
    }

    public final xmf N(xmf xmf0, int v) {
        int v1 = this.__offset(6);
        if(v1 != 0) {
            xmf0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return xmf0;
        }
        return null;
    }

    public final String O() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final int P() {
        int v = this.__offset(0x20);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public final int Q() {
        int v = this.__offset(24);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public final int R() {
        int v = this.__offset(30);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public final xly S(String s) {
        int v = this.__offset(28);
        if(v != 0) {
            int v1 = this.__vector(v);
            ByteBuffer byteBuffer0 = this.bb;
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            int v2 = byteBuffer0.getInt(v1 - 4);
            int v3 = 0;
            while(v2 != 0) {
                int v4 = xly.__indirect((v3 + v2 / 2) * 4 + v1, byteBuffer0);
                int v5 = xly.compareStrings(xly.__offset(4, byteBuffer0.capacity() - v4, byteBuffer0), arr_b, byteBuffer0);
                if(v5 > 0) {
                    v2 /= 2;
                    continue;
                }
                if(v5 < 0) {
                    int v6 = v2 / 2 + 1;
                    v3 += v6;
                    v2 -= v6;
                    continue;
                }
                xly xly0 = new xly();
                xly0.__reset(v4, byteBuffer0);
                return xly0;
            }
        }
        return null;
    }

    public final xma T(String s) {
        int v = this.__offset(24);
        if(v != 0) {
            int v1 = this.__vector(v);
            ByteBuffer byteBuffer0 = this.bb;
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            int v2 = byteBuffer0.getInt(v1 - 4);
            int v3 = 0;
            while(v2 != 0) {
                int v4 = xma.__indirect((v3 + v2 / 2) * 4 + v1, byteBuffer0);
                int v5 = xma.compareStrings(xma.__offset(4, byteBuffer0.capacity() - v4, byteBuffer0), arr_b, byteBuffer0);
                if(v5 > 0) {
                    v2 /= 2;
                    continue;
                }
                if(v5 < 0) {
                    int v6 = v2 / 2 + 1;
                    v3 += v6;
                    v2 -= v6;
                    continue;
                }
                xma xma0 = new xma();
                xma0.__reset(v4, byteBuffer0);
                return xma0;
            }
        }
        return null;
    }

    public final xmb U(xmb xmb0, int v) {
        int v1 = this.__offset(30);
        if(v1 != 0) {
            xmb0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return xmb0;
        }
        return null;
    }

    public final xmh V(String s) {
        int v = this.__offset(16);
        if(v != 0) {
            int v1 = this.__vector(v);
            ByteBuffer byteBuffer0 = this.bb;
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            int v2 = byteBuffer0.getInt(v1 - 4);
            int v3 = 0;
            while(v2 != 0) {
                int v4 = xmh.__indirect((v3 + v2 / 2) * 4 + v1, byteBuffer0);
                int v5 = xmh.compareStrings(xmh.__offset(4, byteBuffer0.capacity() - v4, byteBuffer0), arr_b, byteBuffer0);
                if(v5 > 0) {
                    v2 /= 2;
                    continue;
                }
                if(v5 < 0) {
                    int v6 = v2 / 2 + 1;
                    v3 += v6;
                    v2 -= v6;
                    continue;
                }
                xmh xmh0 = new xmh();
                xmh0.__reset(v4, byteBuffer0);
                return xmh0;
            }
        }
        return null;
    }

    public final xmi W(String s) {
        int v = this.__offset(34);
        if(v != 0) {
            int v1 = this.__vector(v);
            ByteBuffer byteBuffer0 = this.bb;
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            int v2 = byteBuffer0.getInt(v1 - 4);
            int v3 = 0;
            while(v2 != 0) {
                int v4 = xmi.__indirect((v3 + v2 / 2) * 4 + v1, byteBuffer0);
                int v5 = xmi.compareStrings(xmi.__offset(4, byteBuffer0.capacity() - v4, byteBuffer0), arr_b, byteBuffer0);
                if(v5 > 0) {
                    v2 /= 2;
                    continue;
                }
                if(v5 < 0) {
                    int v6 = v2 / 2 + 1;
                    v3 += v6;
                    v2 -= v6;
                    continue;
                }
                xmi xmi0 = new xmi();
                xmi0.__reset(v4, byteBuffer0);
                return xmi0;
            }
        }
        return null;
    }

    public final String X() {
        int v = this.__offset(26);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final void Y(xma xma0, int v) {
        int v1 = this.__offset(24);
        if(v1 != 0) {
            xma0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
        }
    }

    public final String Z() {
        int v = this.__offset(6);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public static boolean __has_identifier(ByteBuffer byteBuffer0, String s) {
        if(s.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for(int v = 0; v < 4; ++v) {
            if(s.charAt(v) != ((char)byteBuffer0.get(byteBuffer0.position() + 4 + v))) {
                return false;
            }
        }
        return true;
    }

    public static int __indirect(int v, ByteBuffer byteBuffer0) {
        return v + byteBuffer0.getInt(v);
    }

    public int __indirect(int v) {
        return v + this.bb.getInt(v);
    }

    public static int __offset(int v, int v1, ByteBuffer byteBuffer0) {
        int v2 = byteBuffer0.capacity() - v1;
        return byteBuffer0.getShort(v + v2 - byteBuffer0.getInt(v2)) + v2;
    }

    public int __offset(int v) {
        return v >= this.vtable_size ? 0 : this.bb.getShort(this.vtable_start + v);
    }

    public void __reset() {
        this.__reset(0, null);
    }

    public void __reset(int v, ByteBuffer byteBuffer0) {
        int v2;
        this.bb = byteBuffer0;
        if(byteBuffer0 == null) {
            v2 = 0;
            this.bb_pos = 0;
            this.vtable_start = 0;
        }
        else {
            this.bb_pos = v;
            int v1 = v - byteBuffer0.getInt(v);
            this.vtable_start = v1;
            v2 = this.bb.getShort(v1);
        }
        this.vtable_size = v2;
    }

    protected static String __string(int v, ByteBuffer byteBuffer0, gpgj gpgj0) {
        int v12;
        int v8;
        char[] arr_c;
        int v1 = v + byteBuffer0.getInt(v);
        int v2 = v1 + 4;
        int v3 = byteBuffer0.getInt(v1);
        if(byteBuffer0.hasArray()) {
            byte[] arr_b = byteBuffer0.array();
            int v4 = byteBuffer0.arrayOffset() + v2;
            if((v4 | v3 | arr_b.length - v4 - v3) >= 0) {
                int v5 = v4 + v3;
                arr_c = new char[v3];
                int v6;
                for(v6 = 0; v4 < v5; ++v6) {
                    int v7 = arr_b[v4];
                    if(((byte)v7) < 0) {
                        break;
                    }
                    ++v4;
                    gpgi.b(((byte)v7), arr_c, v6);
                }
                v8 = v6;
                while(true) {
                    if(v4 >= v5) {
                        return new String(arr_c, 0, v8);
                    }
                    int v9 = v4 + 1;
                    int v10 = arr_b[v4];
                    if(((byte)v10) >= 0) {
                        gpgi.b(((byte)v10), arr_c, v8);
                        ++v8;
                        v4 = v9;
                        while(v4 < v5) {
                            int v11 = arr_b[v4];
                            if(((byte)v11) < 0) {
                                break;
                            }
                            ++v4;
                            gpgi.b(((byte)v11), arr_c, v8);
                            ++v8;
                        }
                        continue;
                    }
                    if(((byte)v10) < 0xFFFFFFE0) {
                        if(v9 >= v5) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        v12 = v8 + 1;
                        v4 += 2;
                        gpgi.d(((byte)v10), arr_b[v9], arr_c, v8);
                        v8 = v12;
                        continue;
                    }
                    if(((byte)v10) < -16) {
                        if(v9 >= v5 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        v12 = v8 + 1;
                        int v13 = v4 + 2;
                        v4 += 3;
                        gpgi.c(((byte)v10), arr_b[v9], arr_b[v13], arr_c, v8);
                        v8 = v12;
                        continue;
                    }
                    if(v9 >= v5 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int v14 = arr_b[v9];
                    int v15 = v4 + 3;
                    int v16 = arr_b[v4 + 2];
                    v4 += 4;
                    gpgi.a(((byte)v10), ((byte)v14), ((byte)v16), arr_b[v15], arr_c, v8);
                    v8 += 2;
                    continue;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v4, v3));
        }
        if((v2 | v3 | byteBuffer0.limit() - v2 - v3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v2, v3));
        }
        int v17 = v2 + v3;
        arr_c = new char[v3];
        int v18;
        for(v18 = 0; v2 < v17; ++v18) {
            int v19 = byteBuffer0.get(v2);
            if(((byte)v19) < 0) {
                break;
            }
            ++v2;
            gpgi.b(((byte)v19), arr_c, v18);
        }
        v8 = v18;
        while(v2 < v17) {
            int v20 = v2 + 1;
            int v21 = byteBuffer0.get(v2);
            if(((byte)v21) >= 0) {
                gpgi.b(((byte)v21), arr_c, v8);
                ++v8;
                v2 = v20;
                while(v2 < v17) {
                    int v22 = byteBuffer0.get(v2);
                    if(((byte)v22) < 0) {
                        break;
                    }
                    ++v2;
                    gpgi.b(((byte)v22), arr_c, v8);
                    ++v8;
                }
                continue;
            }
            if(((byte)v21) < 0xFFFFFFE0) {
                if(v20 < v17) {
                    v2 += 2;
                    gpgi.d(((byte)v21), byteBuffer0.get(v20), arr_c, v8);
                    ++v8;
                    continue;
                }
            }
            else if(((byte)v21) < -16) {
                if(v20 < v17 - 1) {
                    int v23 = v2 + 2;
                    v2 += 3;
                    gpgi.c(((byte)v21), byteBuffer0.get(v20), byteBuffer0.get(v23), arr_c, v8);
                    ++v8;
                    continue;
                }
            }
            else if(v20 < v17 - 2) {
                int v24 = byteBuffer0.get(v20);
                int v25 = v2 + 3;
                int v26 = byteBuffer0.get(v2 + 2);
                v2 += 4;
                gpgi.a(((byte)v21), ((byte)v24), ((byte)v26), byteBuffer0.get(v25), arr_c, v8);
                v8 += 2;
                continue;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        return new String(arr_c, 0, v8);
    }

    public String __string(int v) {
        return gpgh.__string(v, this.bb, this.utf8);
    }

    protected static gpgh __union(gpgh gpgh0, int v, ByteBuffer byteBuffer0) {
        gpgh0.__reset(gpgh.__indirect(v, byteBuffer0), byteBuffer0);
        return gpgh0;
    }

    protected gpgh __union(gpgh gpgh0, int v) {
        gpgh.__union(gpgh0, v, this.bb);
        return gpgh0;
    }

    public int __vector(int v) {
        int v1 = v + this.bb_pos;
        return v1 + this.bb.getInt(v1) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int v, int v1) {
        int v2 = this.__offset(v);
        if(v2 == 0) {
            return null;
        }
        ByteBuffer byteBuffer0 = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int v3 = this.__vector(v2);
        byteBuffer0.position(v3);
        byteBuffer0.limit(v3 + this.__vector_len(v2) * v1);
        return byteBuffer0;
    }

    protected ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer0, int v, int v1) {
        int v2 = this.__offset(v);
        if(v2 == 0) {
            return null;
        }
        int v3 = this.__vector(v2);
        byteBuffer0.rewind();
        byteBuffer0.limit(this.__vector_len(v2) * v1 + v3);
        byteBuffer0.position(v3);
        return byteBuffer0;
    }

    public int __vector_len(int v) {
        int v1 = v + this.bb_pos;
        int v2 = v1 + this.bb.getInt(v1);
        return this.bb.getInt(v2);
    }

    public final int aa() {
        int v = this.__offset(6);
        return v == 0 ? 0 : this.bb.getInt(v + this.bb_pos);
    }

    public final int ab() {
        int v = this.__offset(4);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public final brtw ac(int v) {
        brtw brtw0 = new brtw();
        int v1 = this.__offset(4);
        if(v1 != 0) {
            brtw0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return brtw0;
        }
        return null;
    }

    public final String ad() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final String ae() {
        int v = this.__offset(14);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final String af() {
        int v = this.__offset(12);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public final boolean ag() {
        int v = this.__offset(10);
        return v != 0 && this.bb.get(v + this.bb_pos) != 0;
    }

    public final byte ah() {
        int v = this.__offset(6);
        return v == 0 ? 0 : this.bb.get(v + this.bb_pos);
    }

    public final String ai() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public static gpgh aj(ByteBuffer byteBuffer0) {
        gpgh gpgh0 = new gpgh();
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        gpgh0.__reset(byteBuffer0.getInt(byteBuffer0.position()) + byteBuffer0.position(), byteBuffer0);
        return gpgh0;
    }

    public final gpgh ak(gpgh gpgh0, int v) {
        int v1 = this.__offset(6);
        if(v1 != 0) {
            gpgh0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return gpgh0;
        }
        return null;
    }

    public final gpgh al() {
        gpgh gpgh0 = new gpgh();
        int v = this.__offset(36);
        if(v != 0) {
            gpgh0.__reset(this.__indirect(v + this.bb_pos), this.bb);
            return gpgh0;
        }
        return null;
    }

    public final gpgh am() {
        gpgh gpgh0 = new gpgh();
        int v = this.__offset(42);
        if(v != 0) {
            gpgh0.__reset(this.__indirect(v + this.bb_pos), this.bb);
            return gpgh0;
        }
        return null;
    }

    public final gpgh an(gpgh gpgh0, int v) {
        int v1 = this.__offset(0x20);
        if(v1 != 0) {
            gpgh0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return gpgh0;
        }
        return null;
    }

    public static gpgh ao(ByteBuffer byteBuffer0) {
        gpgh gpgh0 = new gpgh();
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        gpgh0.__reset(byteBuffer0.getInt(byteBuffer0.position()) + byteBuffer0.position(), byteBuffer0);
        return gpgh0;
    }

    public final gpgh ap(gpgh gpgh0, int v) {
        int v1 = this.__offset(4);
        if(v1 != 0) {
            gpgh0.__reset(this.__indirect(this.__vector(v1) + v * 4), this.bb);
            return gpgh0;
        }
        return null;
    }

    public final gpgh aq() {
        gpgh gpgh0 = new gpgh();
        int v = this.__offset(6);
        if(v != 0) {
            gpgh0.__reset(this.__indirect(v + this.bb_pos), this.bb);
            return gpgh0;
        }
        return null;
    }

    public String ar() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    public int as() {
        int v = this.__offset(4);
        return v == 0 ? 0 : this.bb.getInt(v + this.bb_pos);
    }

    public int at() {
        int v = this.__offset(4);
        return v == 0 ? -1 : this.bb.getInt(v + this.bb_pos);
    }

    public int au() {
        int v = this.__offset(6);
        return v == 0 ? 0 : this.bb.getInt(v + this.bb_pos);
    }

    protected static int compareStrings(int v, int v1, ByteBuffer byteBuffer0) {
        int v2 = v + byteBuffer0.getInt(v);
        int v3 = v1 + byteBuffer0.getInt(v1);
        int v4 = byteBuffer0.getInt(v2);
        int v5 = byteBuffer0.getInt(v3);
        int v6 = Math.min(v4, v5);
        for(int v7 = 0; v7 < v6; ++v7) {
            int v8 = v2 + 4 + v7;
            int v9 = v3 + 4 + v7;
            if(byteBuffer0.get(v8) != byteBuffer0.get(v9)) {
                return byteBuffer0.get(v8) - byteBuffer0.get(v9);
            }
        }
        return v4 - v5;
    }

    public static int compareStrings(int v, byte[] arr_b, ByteBuffer byteBuffer0) {
        int v1 = v + byteBuffer0.getInt(v);
        int v2 = byteBuffer0.getInt(v1);
        int v3 = Math.min(v2, arr_b.length);
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = v1 + 4 + v4;
            if(byteBuffer0.get(v5) != arr_b[v4]) {
                return byteBuffer0.get(v5) - arr_b[v4];
            }
        }
        return v2 - arr_b.length;
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    public int getPosition() {
        return this.bb_pos;
    }

    protected int keysCompare(Integer integer0, Integer integer1, ByteBuffer byteBuffer0) {
        return 0;
    }

    protected void sortTables(int[] arr_v, ByteBuffer byteBuffer0) {
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_integer[v1] = (int)arr_v[v1];
        }
        Arrays.sort(arr_integer, new gpgg(this, byteBuffer0));
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
    }

    public final long x() {
        int v = this.__offset(6);
        return v == 0 ? 0L : this.bb.getLong(v + this.bb_pos);
    }

    public final boolean y() {
        int v = this.__offset(10);
        return v != 0 && this.bb.get(v + this.bb_pos) != 0;
    }

    public final boolean z() {
        int v = this.__offset(8);
        return v != 0 && this.bb.get(v + this.bb_pos) != 0;
    }
}

