import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map.Entry;

public final class bny extends FilterOutputStream {
    private static final byte[] a;
    private final bnx b;
    private final byte[] c;
    private final ByteBuffer d;
    private int e;
    private int f;
    private int g;

    static {
        bny.a = "Exif\u0000\u0000".getBytes(bns.a);
    }

    public bny(OutputStream outputStream0, bnx bnx0) {
        super(new BufferedOutputStream(outputStream0, 0x10000));
        this.c = new byte[1];
        this.d = ByteBuffer.allocate(4);
        this.e = 0;
        this.b = bnx0;
    }

    private final int a(int v, byte[] arr_b, int v1, int v2) {
        int v3 = Math.min(v2, v - this.d.position());
        this.d.put(arr_b, v1, v3);
        return v3;
    }

    @Override
    public final void write(int v) {
        this.c[0] = (byte)(v & 0xFF);
        this.write(this.c);
    }

    @Override
    public final void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        int[] arr_v3;
        int[] arr_v2;
        int v2 = v;
        int v3 = v1;
    alab1:
        while(true) {
            int v4 = this.f;
            if((v4 > 0 || this.g > 0 || this.e != 2) && v3 > 0) {
                if(v4 > 0) {
                    int v5 = Math.min(v3, v4);
                    v3 -= v5;
                    this.f -= v5;
                    v2 += v5;
                }
                int v6 = this.g;
                if(v6 > 0) {
                    int v7 = Math.min(v3, v6);
                    this.out.write(arr_b, v2, v7);
                    v3 -= v7;
                    this.g -= v7;
                    v2 += v7;
                }
                if(v3 == 0) {
                    break;
                }
                switch(this.e) {
                    case 0: {
                        int v8 = this.a(2, arr_b, v2, v3);
                        v2 += v8;
                        v3 -= v8;
                        ByteBuffer byteBuffer0 = this.d;
                        if(byteBuffer0.position() < 2) {
                            break alab1;
                        }
                        byteBuffer0.rewind();
                        if(byteBuffer0.getShort() != -40) {
                            throw new IOException("Not a valid jpeg image, cannot write exif");
                        }
                        this.out.write(byteBuffer0.array(), 0, 2);
                        this.e = 1;
                        byteBuffer0.rewind();
                        bnj bnj0 = new bnj(this.out, ByteOrder.BIG_ENDIAN);
                        bnj0.b((short)0xFFE1);
                        int[] arr_v = new int[4];
                        int[] arr_v1 = new int[4];
                        bnz[] arr_bnz = bnx.a;
                        for(int v9 = 0; v9 < 4; ++v9) {
                            bnz bnz0 = arr_bnz[v9];
                            for(int v10 = 0; v10 < 4; ++v10) {
                                this.b.a(v10).remove(bnz0.b);
                            }
                        }
                        bnx bnx0 = this.b;
                        if(!bnx0.a(1).isEmpty()) {
                            bnx0.a(0).put(arr_bnz[1].b, bns.b(0L, bnx0.e));
                        }
                        if(!bnx0.a(2).isEmpty()) {
                            bnx0.a(0).put(arr_bnz[2].b, bns.b(0L, bnx0.e));
                        }
                        if(!bnx0.a(3).isEmpty()) {
                            bnx0.a(1).put(arr_bnz[3].b, bns.b(0L, bnx0.e));
                        }
                        for(int v11 = 0; v11 < 4; ++v11) {
                            int v12 = 0;
                            for(Object object0: bnx0.a(v11).entrySet()) {
                                int v13 = ((bns)((Map.Entry)object0).getValue()).a();
                                if(v13 > 4) {
                                    v12 += v13;
                                }
                            }
                            arr_v1[v11] += v12;
                        }
                        int v14 = 8;
                        for(int v15 = 0; v15 < 4; ++v15) {
                            if(!bnx0.a(v15).isEmpty()) {
                                arr_v[v15] = v14;
                                v14 += bnx0.a(v15).size() * 12 + 6 + arr_v1[v15];
                            }
                        }
                        if(!bnx0.a(1).isEmpty()) {
                            bnx0.a(0).put(arr_bnz[1].b, bns.b(arr_v[1], bnx0.e));
                        }
                        if(!bnx0.a(2).isEmpty()) {
                            bnx0.a(0).put(arr_bnz[2].b, bns.b(arr_v[2], bnx0.e));
                        }
                        if(!bnx0.a(3).isEmpty()) {
                            bnx0.a(1).put(arr_bnz[3].b, bns.b(arr_v[3], bnx0.e));
                        }
                        bnj0.d(v14 + 8);
                        bnj0.write(bny.a);
                        bnj0.b(((short)(bnx0.e == ByteOrder.BIG_ENDIAN ? 0x4D4D : 0x4949)));
                        bnj0.b = bnx0.e;
                        bnj0.d(42);
                        bnj0.c(8L);
                        int v16 = 0;
                        while(v16 < 4) {
                            if(bnx0.a(v16).isEmpty()) {
                                arr_v3 = arr_v;
                            }
                            else {
                                bnj0.d(bnx0.a(v16).size());
                                int v17 = arr_v[v16] + 2 + bnx0.a(v16).size() * 12 + 4;
                                for(Object object1: bnx0.a(v16).entrySet()) {
                                    bnz bnz1 = (bnz)((HashMap)bnw.a.get(v16)).get(((Map.Entry)object1).getKey());
                                    kay.j(bnz1, "Tag not supported: " + ((String)((Map.Entry)object1).getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                    bns bns0 = (bns)((Map.Entry)object1).getValue();
                                    int v18 = bns0.a();
                                    bnj0.d(bnz1.a);
                                    bnj0.d(bns0.d);
                                    bnj0.a(bns0.e);
                                    if(v18 > 4) {
                                        arr_v2 = arr_v;
                                        bnj0.c(((long)v17));
                                        v17 += v18;
                                    }
                                    else {
                                        arr_v2 = arr_v;
                                        bnj0.write(bns0.f);
                                        if(v18 < 4) {
                                            while(v18 < 4) {
                                                bnj0.a.write(0);
                                                ++v18;
                                            }
                                        }
                                    }
                                    arr_v = arr_v2;
                                }
                                arr_v3 = arr_v;
                                bnj0.c(0L);
                                for(Object object2: bnx0.a(v16).entrySet()) {
                                    byte[] arr_b1 = ((bns)((Map.Entry)object2).getValue()).f;
                                    int v19 = arr_b1.length;
                                    if(v19 > 4) {
                                        bnj0.write(arr_b1, 0, v19);
                                    }
                                }
                            }
                            ++v16;
                            arr_v = arr_v3;
                        }
                        bnj0.b = ByteOrder.BIG_ENDIAN;
                        continue;
                    }
                    case 1: {
                        int v20 = this.a(4, arr_b, v2, v3);
                        v2 += v20;
                        v3 -= v20;
                        ByteBuffer byteBuffer1 = this.d;
                        if(byteBuffer1.position() == 2 && byteBuffer1.getShort() == -39) {
                            this.out.write(byteBuffer1.array(), 0, 2);
                            byteBuffer1.rewind();
                        }
                        if(byteBuffer1.position() < 4) {
                            break alab1;
                        }
                        byteBuffer1.rewind();
                        int v21 = byteBuffer1.getShort();
                        if(v21 == 0xFFFFFFE1) {
                            this.f = ((char)byteBuffer1.getShort()) - 2;
                            this.e = 2;
                        }
                        else if(v21 >= 0xFFFFFFC0 && v21 <= -49 && (v21 != -60 && v21 != -56 && v21 != -52)) {
                            this.out.write(byteBuffer1.array(), 0, 4);
                            this.e = 2;
                        }
                        else {
                            this.out.write(byteBuffer1.array(), 0, 4);
                            this.g = ((char)byteBuffer1.getShort()) - 2;
                        }
                        byteBuffer1.rewind();
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            if(v3 <= 0) {
                break;
            }
            this.out.write(arr_b, v2, v3);
            break;
        }
    }
}

