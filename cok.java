import java.util.List;

public abstract class cok {
    public abstract int a();

    public abstract void b(bzk arg1, int arg2, int arg3);

    public final void c(clj clj0, cpm cpm0, int v, goz goz0, int v1) {
        Object[] arr_object3;
        Object[] arr_object2;
        goz goz1 = goz0.ao(0x70ED1AF3);
        int v2 = (v1 & 6) == 0 ? (goz1.X(clj0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.Z(cpm0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.V(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.X(this) ? 0x800 : 0x400);
        }
        if(goz1.ad((v2 & 0x493) != 1170, v2 & 1)) {
            Object object0 = goz1.j();
            if((v2 & 0x380) == 0x100 || object0 == gop.a) {
                object0 = new bzk(null);
                this.b(((bzk)object0), v, 0);
                goz1.P(object0);
            }
            Object[] arr_object = ((bzk)object0).b;
            Object[] arr_object1 = ((bzk)object0).c;
            long[] arr_v = ((bzk)object0).a;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_98;
                    }
                    int v6 = 0;
                    while(true) {
                        int v7 = 8 - (~(v4 - v3) >>> 0x1F);
                        if(v6 >= v7) {
                            break;
                        }
                        if((v5 & 0xFFL) < 0x80L) {
                            int v8 = (v4 << 3) + v6;
                            Object object1 = arr_object[v8];
                            cpb cpb0 = (cpb)arr_object1[v8];
                            String s = (String)object1;
                            List list0 = cpb0.a;
                            arr_object2 = arr_object;
                            arr_object3 = arr_object1;
                            if(list0.size() > 1) {
                                ibpo.t(list0, new coj());
                            }
                            gui gui0 = cpb0.a(clj0, v, goz1, v2 & 910);
                            switch(s) {
                                case "fillAlpha": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.m = gui0;
                                    break;
                                }
                                case "fillColor": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>");
                                    cpm0.i = gui0;
                                    break;
                                }
                                case "pathData": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.collections.List<androidx.compose.ui.graphics.vector.PathNode>>");
                                    cpm0.h = gui0;
                                    break;
                                }
                                case "pivotX": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.b = gui0;
                                    break;
                                }
                                case "pivotY": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.c = gui0;
                                    break;
                                }
                                case "rotation": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.a = gui0;
                                    break;
                                }
                                case "scaleX": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.d = gui0;
                                    break;
                                }
                                case "scaleY": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.e = gui0;
                                    break;
                                }
                                case "strokeAlpha": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.l = gui0;
                                    break;
                                }
                                case "strokeColor": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>");
                                    cpm0.j = gui0;
                                    break;
                                }
                                case "strokeWidth": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.k = gui0;
                                    break;
                                }
                                case "translateX": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.f = gui0;
                                    break;
                                }
                                case "translateY": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.g = gui0;
                                    break;
                                }
                                case "trimPathEnd": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.o = gui0;
                                    break;
                                }
                                case "trimPathOffset": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.p = gui0;
                                    break;
                                }
                                case "trimPathStart": {
                                    ibuq.d(gui0, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Float>");
                                    cpm0.n = gui0;
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("Unknown propertyName: " + s);
                                }
                            }
                        }
                        else {
                            arr_object2 = arr_object;
                            arr_object3 = arr_object1;
                        }
                        v5 >>= 8;
                        ++v6;
                        arr_object = arr_object2;
                        arr_object1 = arr_object3;
                    }
                    Object[] arr_object4 = arr_object;
                    Object[] arr_object5 = arr_object1;
                    if(v7 == 8) {
                        goto label_100;
                    label_98:
                        arr_object4 = arr_object;
                        arr_object5 = arr_object1;
                    label_100:
                        v3 = v3;
                        if(v4 != v3) {
                            ++v4;
                            arr_object = arr_object4;
                            arr_object1 = arr_object5;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new coi(this, clj0, cpm0, v, v1);
        }
    }
}

