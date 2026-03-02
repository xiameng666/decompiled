import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class fuwl {
    public final int a;
    public final boolean b;
    public final int[] c;
    public final ByteBuffer d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    private final int l;

    public fuwl(ByteBuffer byteBuffer0, boolean z) {
        byteBuffer0.rewind();
        this.d = byteBuffer0;
        this.b = z;
        byteBuffer0.getLong();
        int v = byteBuffer0.getInt();
        this.l = v;
        if(v != 2 && v != 4) {
            throw new IllegalArgumentException("Unsupported numBytesForFloat: " + v);
        }
        int v1 = byteBuffer0.getInt();
        this.a = v1;
        this.c = new int[v1];
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        if(z) {
            this.e = null;
            this.f = null;
        }
        else {
            this.e = new ArrayList();
            this.f = new ArrayList();
        }
        this.k = new ArrayList();
        for(int v3 = 0; v3 < this.a; ++v3) {
            this.c[v3] = byteBuffer0.getInt();
            int v4 = this.c[v3];
            switch(v4) {
                case 1: {
                    int v5 = byteBuffer0.getInt();
                    int v6 = byteBuffer0.getInt();
                    int[] arr_v = new int[3];
                    for(int v7 = 0; v7 < 3; ++v7) {
                        arr_v[v7] = byteBuffer0.getInt();
                    }
                    this.g.add(arr_v);
                    Integer integer0 = byteBuffer0.getInt();
                    this.h.add(integer0);
                    Integer integer1 = byteBuffer0.getInt();
                    this.i.add(integer1);
                    Integer integer2 = byteBuffer0.getInt();
                    this.j.add(integer2);
                    int v8 = byteBuffer0.position();
                    this.k.add(new int[]{v8, v6, v5});
                    if(z) {
                        byteBuffer0.position(v8 + v6 * (v5 + v5 + 24));
                    }
                    else {
                        float[][] arr2_f = new float[v6][v5];
                        float[][] arr2_f1 = new float[v6][4];
                        int v9 = 0;
                        for(int v2 = 0; v9 < v6; v2 = 0) {
                            switch(this.l) {
                                case 2: {
                                    float f = byteBuffer0.getFloat();
                                    float f1 = byteBuffer0.getFloat();
                                    for(int v10 = 0; v10 < v5; ++v10) {
                                        float[] arr_f = arr2_f[v9];
                                        arr_f[v10] = ((float)(((char)byteBuffer0.getShort()))) * f1 + f;
                                    }
                                    break;
                                }
                                case 4: {
                                    for(int v11 = 0; v11 < v5; ++v11) {
                                        float[] arr_f1 = arr2_f[v9];
                                        arr_f1[v11] = byteBuffer0.getFloat();
                                    }
                                }
                            }
                            while(v2 < 4) {
                                float[] arr_f2 = arr2_f1[v9];
                                arr_f2[v2] = byteBuffer0.getFloat();
                                ++v2;
                            }
                            ++v9;
                        }
                        this.e.add(arr2_f);
                        this.f.add(arr2_f1);
                    }
                    break;
                }
                case 2: {
                    int v12 = byteBuffer0.getInt();
                    int v13 = byteBuffer0.getInt();
                    int v14 = byteBuffer0.position();
                    this.k.add(new int[]{v14, v13, v12});
                    if(z) {
                        byteBuffer0.position(v14 + v13 * (v12 + v12 + 8));
                    }
                    else {
                        float[][] arr2_f2 = new float[v13][v12];
                        for(int v15 = 0; v15 < v13; ++v15) {
                            switch(this.l) {
                                case 2: {
                                    float f2 = byteBuffer0.getFloat();
                                    float f3 = byteBuffer0.getFloat();
                                    for(int v16 = 0; v16 < v12; ++v16) {
                                        float[] arr_f3 = arr2_f2[v15];
                                        arr_f3[v16] = ((float)(((char)byteBuffer0.getShort()))) * f3 + f2;
                                    }
                                    break;
                                }
                                case 4: {
                                    for(int v17 = 0; v17 < v12; ++v17) {
                                        float[] arr_f4 = arr2_f2[v15];
                                        arr_f4[v17] = byteBuffer0.getFloat();
                                    }
                                }
                            }
                        }
                        this.e.add(arr2_f2);
                    }
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported layerType: " + v4);
                }
            }
        }
    }
}

