import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

public final class jbx {
    public final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;

    public jbx(Layout layout0) {
        this.a = layout0;
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        do {
            int v2 = ibzk.M(this.a.getText(), '\n', v1, 4);
            v1 = v2 >= 0 ? v2 + 1 : this.a.getText().length();
            arrayList0.add(Integer.valueOf(v1));
        }
        while(v1 < this.a.getText().length());
        this.b = arrayList0;
        int v3 = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v3);
        for(int v = 0; v < v3; ++v) {
            arrayList1.add(null);
        }
        this.c = arrayList1;
        this.d = new boolean[this.b.size()];
    }

    public final float a(int v, boolean z, boolean z1) {
        int v15;
        int v12;
        if(!z1) {
            return this.g(v, z);
        }
        Layout layout0 = this.a;
        int v1 = jbv.a(layout0, v);
        int v2 = layout0.getLineStart(v1);
        int v3 = layout0.getLineEnd(v1);
        if(v != v2 && v != v3) {
            return this.g(v, z);
        }
        if(v != 0 && v != layout0.getText().length()) {
            boolean z2 = true;
            int v4 = this.b(v, true);
            boolean z3 = this.f(v4);
            int v5 = this.d(v3, v2);
            int v6 = this.c(v4);
            Bidi bidi0 = this.e(v4);
            Bidi bidi1 = bidi0 == null ? null : bidi0.createLineBidi(v2 - v6, v5 - v6);
            if(bidi1 != null && bidi1.getRunCount() != 1) {
                int v7 = bidi1.getRunCount();
                jbw[] arr_jbw = new jbw[v7];
                for(int v8 = 0; v8 < v7; ++v8) {
                    arr_jbw[v8] = new jbw(bidi1.getRunStart(v8) + v2, bidi1.getRunLimit(v8) + v2, bidi1.getRunLevel(v8) % 2 == 1);
                }
                int v9 = bidi1.getRunCount();
                byte[] arr_b = new byte[v9];
                for(int v10 = 0; v10 < v9; ++v10) {
                    arr_b[v10] = (byte)bidi1.getRunLevel(v10);
                }
                Bidi.reorderVisually(arr_b, 0, arr_jbw, 0, v7);
                if(v == v2) {
                    int v11;
                    for(v11 = 0; true; ++v11) {
                        if(v11 >= v7) {
                            v11 = -1;
                            break;
                        }
                        if(arr_jbw[v11].a == v) {
                            break;
                        }
                    }
                    if(z || z3 == arr_jbw[v11].c) {
                        z3 = !z3;
                    }
                    if(v11 == 0) {
                        if(!z3) {
                            v12 = 0;
                            goto label_48;
                        }
                        return layout0.getLineLeft(v1);
                    }
                    else {
                        v12 = v11;
                    }
                label_48:
                    if(v12 == ibpg.w(arr_jbw) && !z3) {
                        return layout0.getLineRight(v1);
                    }
                    return z3 ? layout0.getPrimaryHorizontal(arr_jbw[v12 - 1].a) : layout0.getPrimaryHorizontal(arr_jbw[v12 + 1].a);
                }
                int v13 = v <= v5 ? v : this.d(v, v2);
                int v14;
                for(v14 = 0; true; ++v14) {
                    if(v14 >= v7) {
                        v14 = -1;
                        break;
                    }
                    if(arr_jbw[v14].b == v13) {
                        break;
                    }
                }
                if(!z && z3 != arr_jbw[v14].c) {
                    z3 = !z3;
                }
                if(v14 == 0) {
                    if(!z3) {
                        v15 = 0;
                        goto label_67;
                    }
                    return layout0.getLineLeft(v1);
                }
                else {
                    v15 = v14;
                }
            label_67:
                if(v15 == ibpg.w(arr_jbw) && !z3) {
                    return layout0.getLineRight(v1);
                }
                return z3 ? layout0.getPrimaryHorizontal(arr_jbw[v15 - 1].b) : layout0.getPrimaryHorizontal(arr_jbw[v15 + 1].b);
            }
            if(!z && z3 != layout0.isRtlCharAt(v2)) {
                z2 = z3;
            }
            else if(z3) {
                z2 = false;
            }
            if(v == v2) {
                return z2 ? layout0.getLineLeft(v1) : layout0.getLineRight(v1);
            }
            return z2 ? layout0.getLineRight(v1) : layout0.getLineLeft(v1);
        }
        return this.g(v, z);
    }

    public final int b(int v, boolean z) {
        int v1 = ibpo.n(this.b, Integer.valueOf(v));
        int v2 = v1 >= 0 ? v1 + 1 : -(v1 + 1);
        return !z || v2 <= 0 || v != ((Number)this.b.get(v2 - 1)).intValue() ? v2 : v2 - 1;
    }

    public final int c(int v) {
        return v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
    }

    public final int d(int v, int v1) {
        while(v > v1) {
            int v2 = this.a.getText().charAt(v - 1);
            if(v2 != 10 && v2 != 0x20 && v2 != 5760) {
                if(ibuq.a(v2, 0x2000) >= 0 && ibuq.a(v2, 0x200A) <= 0) {
                    if(v2 == 0x2007) {
                        v2 = 0x2007;
                    }
                    else {
                        --v;
                        continue;
                    }
                }
                if(v2 == 0x205F || v2 == 0x3000) {
                    --v;
                    continue;
                }
                break;
            }
            --v;
        }
        return v;
    }

    public final Bidi e(int v) {
        Bidi bidi0;
        boolean[] arr_z = this.d;
        if(arr_z[v]) {
            return (Bidi)this.c.get(v);
        }
        int v1 = v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
        int v2 = ((Number)this.b.get(v)).intValue();
        int v3 = v2 - v1;
        char[] arr_c = this.e != null && this.e.length >= v3 ? this.e : new char[v3];
        TextUtils.getChars(this.a.getText(), v1, v2, arr_c, 0);
        if(Bidi.requiresBidi(arr_c, 0, v3)) {
            bidi0 = new Bidi(arr_c, 0, null, 0, v3, ((int)this.f(v)));
            if(bidi0.getRunCount() == 1) {
                bidi0 = null;
            }
        }
        else {
            bidi0 = null;
        }
        this.c.set(v, bidi0);
        arr_z[v] = true;
        if(bidi0 != null) {
            arr_c = arr_c == this.e ? null : this.e;
        }
        this.e = arr_c;
        return bidi0;
    }

    public final boolean f(int v) {
        int v1 = this.c(v);
        int v2 = this.a.getLineForOffset(v1);
        return this.a.getParagraphDirection(v2) == -1;
    }

    private final float g(int v, boolean z) {
        int v1 = ibwt.h(v, this.a.getLineEnd(this.a.getLineForOffset(v)));
        return z ? this.a.getPrimaryHorizontal(v1) : this.a.getSecondaryHorizontal(v1);
    }
}

