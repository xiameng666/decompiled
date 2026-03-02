import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class grhr {
    public static void a(gpgh gpgh0, Map map0) {
        Iterator iterator0;
        if(map0.containsKey(gpgh0.ai())) {
            String s = (String)map0.get(gpgh0.ai());
            ArrayList arrayList0 = new ArrayList();
            if(gpgh0.ah() == 0) {
                Object object0 = null;
                int v = gpgh0.__offset(8);
                if(v != 0) {
                    int v1 = gpgh0.__vector(v);
                    ByteBuffer byteBuffer0 = gpgh0.bb;
                    byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
                    int v2 = byteBuffer0.getInt(v1 - 4);
                    int v3 = 0;
                    while(v2 != 0) {
                        int v4 = igry.__indirect((v3 + v2 / 2) * 4 + v1, byteBuffer0);
                        int v5 = igry.compareStrings(igry.__offset(4, byteBuffer0.capacity() - v4, byteBuffer0), arr_b, byteBuffer0);
                        if(v5 > 0) {
                            v2 /= 2;
                        }
                        else {
                            if(v5 >= 0) {
                                object0 = new igry();
                                ((gpgh)object0).__reset(v4, byteBuffer0);
                                break;
                            }
                            int v6 = v2 / 2 + 1;
                            v3 += v6;
                            v2 -= v6;
                        }
                    }
                }
                if(object0 != null) {
                    arrayList0.add(object0);
                }
            }
            else {
                for(int v7 = 0; true; ++v7) {
                    int v8 = gpgh0.__offset(8);
                    if(v7 >= (v8 == 0 ? 0 : gpgh0.__vector_len(v8))) {
                        break;
                    }
                    igry igry0 = new igry();
                    int v9 = gpgh0.__offset(8);
                    if(v9 == 0) {
                        igry0 = null;
                    }
                    else {
                        igry0.__reset(gpgh0.__indirect(gpgh0.__vector(v9) + v7 * 4), gpgh0.bb);
                    }
                    if(gpgh0.ah() != 1) {
                        if(s.compareTo(igry0.d()) <= 0) {
                            arrayList0.add(igry0);
                        }
                    }
                    else if(s.compareTo(igry0.d()) >= 0) {
                        arrayList0.add(igry0);
                    }
                }
            }
            iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                igry igry1 = (igry)object1;
                for(int v10 = 0; true; ++v10) {
                    int v11 = igry1.__offset(8);
                    if(v10 >= (v11 == 0 ? 0 : igry1.__vector_len(v11))) {
                        break;
                    }
                    gpgh gpgh1 = new gpgh();
                    int v12 = igry1.__offset(8);
                    if(v12 == 0) {
                        gpgh1 = null;
                    }
                    else {
                        gpgh1.__reset(igry1.__indirect(igry1.__vector(v12) + v10 * 4), igry1.bb);
                    }
                    int v13 = gpgh1.__offset(4);
                    String s1 = v13 == 0 ? null : gpgh1.__string(v13 + gpgh1.bb_pos);
                    int v14 = gpgh1.__offset(6);
                    map0.put(s1, (v14 == 0 ? null : gpgh1.__string(v14 + gpgh1.bb_pos)));
                }
                for(int v15 = 0; true; ++v15) {
                    int v16 = igry1.__offset(6);
                    if(v15 >= (v16 == 0 ? 0 : igry1.__vector_len(v16))) {
                        break;
                    }
                    gpgh gpgh2 = new gpgh();
                    int v17 = igry1.__offset(6);
                    if(v17 == 0) {
                        gpgh2 = null;
                    }
                    else {
                        gpgh2.__reset(igry1.__indirect(igry1.__vector(v17) + v15 * 4), igry1.bb);
                    }
                    grhr.a(gpgh2, map0);
                }
            }
        }
    }
}

