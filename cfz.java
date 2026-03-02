import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cfz implements ial {
    public final icck a;
    public final ibth b;
    public hzk c;
    public hzk d;
    public final SnapshotStateList e;
    public final bzk f;
    private final ial g;
    private final gra h;

    public cfz(ial ial0, icck icck0) {
        this.g = ial0;
        this.a = icck0;
        this.h = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        this.b = new cfv(this);
        this.e = new SnapshotStateList();
        this.f = new bzk(null);
    }

    public final hzk a() {
        hzk hzk0 = this.d;
        if(hzk0 != null) {
            return hzk0;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final void c() {
        int v12;
        long[] arr_v2;
        Object[] arr_object5;
        Object[] arr_object4;
        boolean z;
        bzk bzk0 = this.f;
        Object[] arr_object = bzk0.b;
        Object[] arr_object1 = bzk0.c;
        long[] arr_v = bzk0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_24;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                int v4 = 0;
                while(v4 < v3) {
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = (v1 << 3) + v4;
                        Object object0 = arr_object[v5];
                        if(((cfj)arr_object1[v5]).e()) {
                            z = true;
                            goto label_30;
                        }
                    }
                    v2 >>= 8;
                    ++v4;
                }
                if(v3 == 8) {
                label_24:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    z = false;
                }
                goto label_30;
            }
        }
        z = false;
    label_30:
        if(z == this.d()) {
        label_57:
            arr_object4 = bzk0.b;
            arr_object5 = bzk0.c;
            arr_v2 = bzk0.a;
            v12 = arr_v2.length - 2;
            if(v12 >= 0) {
                goto label_62;
            }
            return;
        }
        else {
            this.h.b(Boolean.valueOf(z));
            if(z) {
                goto label_57;
            }
            else {
                Object[] arr_object2 = bzk0.b;
                Object[] arr_object3 = bzk0.c;
                long[] arr_v1 = bzk0.a;
                int v6 = arr_v1.length - 2;
                if(v6 >= 0) {
                    int v7 = 0;
                    while(true) {
                        long v8 = arr_v1[v7];
                        if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_54;
                        }
                        int v9 = 8 - (~(v7 - v6) >>> 0x1F);
                        for(int v10 = 0; v10 < v9; ++v10) {
                            if((v8 & 0xFFL) < 0x80L) {
                                int v11 = (v7 << 3) + v10;
                                Object object1 = arr_object2[v11];
                                cfj cfj0 = (cfj)arr_object3[v11];
                                if(cfj0.e.a() <= 1 || !cfl.a(cfj0.e)) {
                                    cfj0.c.e();
                                }
                            }
                            v8 >>= 8;
                        }
                        if(v9 == 8) {
                        label_54:
                            if(v7 != v6) {
                                ++v7;
                                continue;
                            }
                        }
                        goto label_57;
                    }
                }
                else {
                    goto label_57;
                }
            }
        }
    label_62:
        int v13 = 0;
        while(true) {
            long v14 = arr_v2[v13];
            if((~v14 << 7 & v14 & 0x8080808080808080L) != 0x8080808080808080L) {
                int v15 = 8 - (~(v13 - v12) >>> 0x1F);
                for(int v16 = 0; v16 < v15; ++v16) {
                    if((v14 & 0xFFL) < 0x80L) {
                        int v17 = (v13 << 3) + v16;
                        Object object2 = arr_object4[v17];
                        ((cfj)arr_object5[v17]).c();
                    }
                    v14 >>= 8;
                }
                if(v15 == 8) {
                    goto label_76;
                }
                break;
            }
        label_76:
            if(v13 == v12) {
                break;
            }
            ++v13;
        }
    }

    public final boolean d() {
        return ((Boolean)this.h.a()).booleanValue();
    }

    @Override  // ial
    public final hzk dS(hzk hzk0) {
        return this.g.dS(hzk0);
    }

    @Override  // ial
    public final long dT(hzk hzk0, hzk hzk1) {
        return this.g.dT(hzk0, hzk1);
    }
}

