package j$.time.format;

import java.util.ArrayList;

public final class d implements e {
    public final e[] a;
    public final boolean b;

    public d(ArrayList arrayList0, boolean z) {
        this(((e[])arrayList0.toArray(new e[arrayList0.size()])), z);
    }

    public d(e[] arr_e, boolean z) {
        this.a = arr_e;
        this.b = z;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        boolean z = this.b;
        if(z) {
            ++x0.c;
        }
        try {
            e[] arr_e = this.a;
            int v1 = 0;
            while(true) {
                if(v1 >= arr_e.length) {
                    goto label_18;
                }
                if(!arr_e[v1].g(x0, stringBuilder0)) {
                    stringBuilder0.setLength(v);
                    break;
                }
                ++v1;
            }
        }
        catch(Throwable throwable0) {
            if(z) {
                --x0.c;
            }
            throw throwable0;
        }
        if(!z) {
            return true;
        }
        --x0.c;
        return true;
    label_18:
        if(!z) {
            return true;
        }
        --x0.c;
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        ArrayList arrayList0 = v0.d;
        e[] arr_e = this.a;
        int v2 = 0;
        if(this.b) {
            b0 b00 = v0.c();
            b00.getClass();
            b0 b01 = new b0();
            b01.a.putAll(b00.a);
            b01.b = b00.b;
            b01.c = b00.c;
            b01.d = b00.d;
            arrayList0.add(b01);
            int v3 = v1;
            while(v2 < arr_e.length) {
                v3 = arr_e[v2].i(v0, charSequence0, v3);
                if(v3 < 0) {
                    arrayList0.remove(arrayList0.size() - 1);
                    return v1;
                }
                ++v2;
            }
            arrayList0.remove(arrayList0.size() - 2);
            return v3;
        }
        while(v2 < arr_e.length) {
            v1 = arr_e[v2].i(v0, charSequence0, v1);
            if(v1 < 0) {
                return v1;
            }
            ++v2;
        }
        return v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        e[] arr_e = this.a;
        if(arr_e != null) {
            boolean z = this.b;
            stringBuilder0.append((z ? "[" : "("));
            for(int v = 0; v < arr_e.length; ++v) {
                stringBuilder0.append(arr_e[v]);
            }
            stringBuilder0.append((z ? "]" : ")"));
        }
        return stringBuilder0.toString();
    }
}

