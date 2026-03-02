import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class hlyd implements hlyb {
    // This method was un-flattened
    @Override  // hlyb
    public final hlym a(String s, hlxv hlxv0, int v, int v1, Map map0) {
        int v41;
        int v37;
        int v29;
        int v28;
        hlyl hlyl5;
        hlyl hlyl1;
        int v19;
        int v18;
        int v17;
        boolean z;
        int v8;
        Iterator iterator0;
        LinkedList linkedList0;
        int v6;
        byte[] arr_b;
        Charset charset0 = StandardCharsets.ISO_8859_1;
        hlxx hlxx0 = hlxx.b;
        if(map0.containsKey(hlxx0)) {
            charset0 = Charset.forName(map0.get(hlxx0).toString());
        }
        int v2 = map0.containsKey(hlxx.a) ? Integer.parseInt(map0.get(hlxx.a).toString()) : 33;
        int v3 = map0.containsKey(hlxx.j) ? Integer.parseInt(map0.get(hlxx.j).toString()) : 0;
        if(hlxv0 != hlxv.a) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got " + hlxv0.toString());
        }
        hlyh hlyh0 = new hlyh(s.getBytes(charset0));
        Collection collection0 = Collections.singletonList(hlyj.a);
        int v4 = 0;
        while(true) {
            arr_b = hlyh0.e;
            int v5 = arr_b.length;
            v6 = 0x20;
            if(v4 >= v5) {
                break;
            }
            int v7 = v4 + 1 < v5 ? arr_b[v4 + 1] : 0;
            switch(arr_b[v4]) {
                case 13: {
                    if(v7 == 10) {
                        linkedList0 = new LinkedList();
                        iterator0 = collection0.iterator();
                        goto label_38;
                    }
                    break;
                }
                case 44: {
                    if(v7 == 0x20) {
                        v8 = 4;
                        linkedList0 = new LinkedList();
                        iterator0 = collection0.iterator();
                        goto label_38;
                    }
                    break;
                }
                case 46: {
                    if(v7 == 0x20) {
                        v8 = 3;
                        linkedList0 = new LinkedList();
                        iterator0 = collection0.iterator();
                        goto label_38;
                    }
                    break;
                }
                case 58: {
                    if(v7 == 0x20) {
                        v8 = 5;
                        linkedList0 = new LinkedList();
                        iterator0 = collection0.iterator();
                    label_38:
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            hlyj hlyj0 = (hlyj)object0;
                            hlyj hlyj1 = hlyj0.b(v4);
                            linkedList0.add(hlyj1.c(4, v8));
                            if(hlyj0.b != 4) {
                                linkedList0.add(hlyj1.d(4, v8));
                            }
                            switch(v8) {
                                case 3: {
                                    linkedList0.add(hlyj1.c(2, 13).c(2, 1));
                                    break;
                                }
                                case 4: {
                                    linkedList0.add(hlyj1.c(2, 12).c(2, 1));
                                }
                            }
                            if(hlyj0.d > 0) {
                                linkedList0.add(hlyj0.a(v4).a(v4 + 1));
                            }
                        }
                        collection0 = hlyh.a(linkedList0);
                        ++v4;
                        goto label_88;
                    }
                }
            }
            v8 = 0;
            LinkedList linkedList1 = new LinkedList();
            for(Object object1: collection0) {
                hlyj hlyj2 = (hlyj)object1;
                int v9 = arr_b[v4] & 0xFF;
                int[][] arr2_v = hlyh.c;
                int v10 = hlyj2.b;
                int v11 = arr2_v[v10][v9];
                hlyj hlyj3 = null;
                for(int v12 = 0; v12 <= 4; ++v12) {
                    int v13 = arr2_v[v12][v9];
                    if(v13 > 0) {
                        if(hlyj3 == null) {
                            hlyj3 = hlyj2.b(v4);
                        }
                        if(v11 <= 0 || v12 == v10) {
                            linkedList1.add(hlyj3.c(v12, v13));
                        }
                        else if(v12 == 2) {
                            v12 = 2;
                            linkedList1.add(hlyj3.c(2, v13));
                        }
                        if(v11 <= 0 && hlyh.d[v10][v12] >= 0) {
                            linkedList1.add(hlyj3.d(v12, v13));
                        }
                        hlyj3 = hlyj3;
                    }
                }
                if(hlyj2.d > 0 || arr2_v[v10][v9] == 0) {
                    linkedList1.add(hlyj2.a(v4));
                }
            }
            collection0 = hlyh.a(linkedList1);
        label_88:
            ++v4;
        }
        hlyj hlyj4 = (hlyj)Collections.min(collection0, new hlyg(hlyh0));
        LinkedList linkedList2 = new LinkedList();
        for(hlyk hlyk0 = hlyj4.b(v5).c; hlyk0 != null; hlyk0 = hlyk0.b) {
            linkedList2.addFirst(hlyk0);
        }
        hlyl hlyl0 = new hlyl();
        for(Object object2: linkedList2) {
            ((hlyk)object2).a(hlyl0, arr_b);
        }
        int v14 = 11;
        int v15 = v2 * hlyl0.b / 100 + 11;
        int v16 = hlyl0.b + v15;
        if(v3 != 0) {
            z = v3 < 0;
            v17 = Math.abs(v3);
            if(v3 < 0) {
                v6 = 4;
            }
            if(v17 > v6) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", v3));
            }
            v18 = hlyf.a(v17, z);
            v19 = hlyf.a[v17];
            hlyl1 = hlyf.c(hlyl0, v19);
            int v20 = hlyl1.b;
            if(v15 + v20 > v18 - v18 % v19) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if(!z || v20 <= v19 * 0x40) {
                goto label_137;
            }
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        int v21 = 0;
        hlyl hlyl2 = null;
        for(int v22 = 0; v22 <= 0x20; ++v22) {
            int v23 = v22 <= 3 ? v22 + 1 : v22;
            int v24 = hlyf.a(v23, v22 <= 3);
            if(v16 <= v24) {
                if(hlyl2 == null || v21 != hlyf.a[v23]) {
                    v21 = hlyf.a[v23];
                    hlyl2 = hlyf.c(hlyl0, v21);
                }
                if((v22 > 3 || hlyl2.b <= v21 * 0x40) && hlyl2.b + v15 <= v24 - v24 % v21) {
                    z = v22 <= 3;
                    hlyl1 = hlyl2;
                    v18 = v24;
                    v19 = v21;
                    v17 = v23;
                label_137:
                    hlyl hlyl3 = hlyf.b(hlyl1, v18, v19);
                    int v25 = hlyl1.b / v19 - 1;
                    hlyl hlyl4 = new hlyl();
                    if(z) {
                        hlyl4.d(v17 - 1, 2);
                        hlyl4.d(v25, 6);
                        hlyl5 = hlyf.b(hlyl4, 28, 4);
                    }
                    else {
                        hlyl4.d(v17 - 1, 5);
                        hlyl4.d(v25, 11);
                        hlyl5 = hlyf.b(hlyl4, 40, 4);
                    }
                    if(!z) {
                        v14 = 14;
                    }
                    int v26 = v14 + v17 * 4;
                    int[] arr_v = new int[v26];
                    if(z) {
                        for(int v27 = 0; v27 < v26; ++v27) {
                            arr_v[v27] = v27;
                        }
                        v28 = v26;
                        v29 = 1;
                    }
                    else {
                        int v30 = (v26 / 2 - 1) / 15;
                        int v31 = v26 + 1 + (v30 + v30);
                        for(int v32 = 0; v32 < v26 / 2; ++v32) {
                            int v33 = v32 / 15 + v32;
                            arr_v[v26 / 2 - v32 - 1] = v31 / 2 - v33 - 1;
                            arr_v[v26 / 2 + v32] = v33 + v31 / 2 + 1;
                        }
                        v28 = v31;
                        v29 = 0;
                    }
                    hlym hlym0 = new hlym(v28, v28);
                    int v35 = 0;
                    for(int v34 = 0; v34 < v17; ++v34) {
                        for(int v36 = 0; true; ++v36) {
                            v37 = (v17 - v34) * 4 + (1 == v29 ? 9 : 12);
                            if(v36 >= v37) {
                                break;
                            }
                            int v38 = 0;
                            while(v38 < 2) {
                                int v39 = v36 + v36;
                                if(hlyl3.e(v35 + v39 + v38)) {
                                    int v40 = v34 + v34;
                                    v41 = v29;
                                    hlym0.b(arr_v[v40 + v38], arr_v[v40 + v36]);
                                }
                                else {
                                    v41 = v29;
                                }
                                if(hlyl3.e(v37 + v37 + v35 + v39 + v38)) {
                                    int v42 = v34 + v34;
                                    hlym0.b(arr_v[v42 + v36], arr_v[v26 - 1 - v42 - v38]);
                                }
                                if(hlyl3.e(v37 * 4 + v35 + v39 + v38)) {
                                    int v43 = v26 - 1 - (v34 + v34);
                                    hlym0.b(arr_v[v43 - v38], arr_v[v43 - v36]);
                                }
                                if(hlyl3.e(v37 * 6 + v35 + v39 + v38)) {
                                    int v44 = v34 + v34;
                                    hlym0.b(arr_v[v26 - 1 - v44 - v36], arr_v[v44 + v38]);
                                }
                                ++v38;
                                arr_v = arr_v;
                                v29 = v41;
                            }
                        }
                        v35 += v37 * 8;
                    }
                    if(v29 == 0) {
                        for(int v47 = 0; v47 < 10; ++v47) {
                            int v48 = v28 / 2 - 5 + v47 + v47 / 5;
                            if(hlyl5.e(v47)) {
                                hlym0.b(v48, v28 / 2 - 7);
                            }
                            if(hlyl5.e(v47 + 10)) {
                                hlym0.b(v28 / 2 + 7, v48);
                            }
                            if(hlyl5.e(29 - v47)) {
                                hlym0.b(v48, v28 / 2 + 7);
                            }
                            if(hlyl5.e(39 - v47)) {
                                hlym0.b(v28 / 2 - 7, v48);
                            }
                        }
                        hlyf.d(hlym0, v28 / 2, 7);
                        int v49 = 0;
                        for(int v50 = 0; v49 < v26 / 2 - 1; v50 += 16) {
                            for(int v51 = v28 / 2 & 1; v51 < v28; v51 += 2) {
                                int v52 = v28 / 2 - v50;
                                hlym0.b(v52, v51);
                                int v53 = v28 / 2 + v50;
                                hlym0.b(v53, v51);
                                hlym0.b(v51, v52);
                                hlym0.b(v51, v53);
                            }
                            v49 += 15;
                        }
                    }
                    else {
                        for(int v45 = 0; v45 < 7; ++v45) {
                            int v46 = v28 / 2 - 3 + v45;
                            if(hlyl5.e(v45)) {
                                hlym0.b(v46, v28 / 2 - 5);
                            }
                            if(hlyl5.e(v45 + 7)) {
                                hlym0.b(v28 / 2 + 5, v46);
                            }
                            if(hlyl5.e(20 - v45)) {
                                hlym0.b(v46, v28 / 2 + 5);
                            }
                            if(hlyl5.e(27 - v45)) {
                                hlym0.b(v28 / 2 - 5, v46);
                            }
                        }
                        hlyf.d(hlym0, v28 / 2, 5);
                    }
                    int v54 = hlym0.a;
                    int v55 = Math.max(0, v54);
                    int v56 = hlym0.b;
                    int v57 = Math.max(0, v56);
                    int v58 = Math.min(v55 / v54, v57 / v56);
                    int v59 = (v57 - v56 * v58) / 2;
                    hlym hlym1 = new hlym(v55, v57);
                    int v60 = 0;
                    while(v60 < v56) {
                        int v61 = (v55 - v54 * v58) / 2;
                        int v62 = 0;
                        while(v62 < v54) {
                            if(hlym0.d(v62, v60)) {
                                hlym1.c(v61, v59, v58, v58);
                            }
                            ++v62;
                            v61 += v58;
                        }
                        ++v60;
                        v59 += v58;
                    }
                    return hlym1;
                }
            }
        }
        throw new IllegalArgumentException("Data too large for an Aztec code");
    }
}

