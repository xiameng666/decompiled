package j$.time.format;

import j..desugar.sun.nio.fs.g;
import j..time.DateTimeException;
import j..time.temporal.ChronoField;
import j..util.Objects;

public final class k implements e {
    public final String a;
    public final int b;
    public final int c;
    public static final String[] d;
    public static final k e;
    public static final k f;

    static {
        k.d = new String[]{"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        k.e = new k("+HH:MM:ss", "Z");
        k.f = new k("+HH:MM:ss", "0");
    }

    public k(String s, String s1) {
        Objects.requireNonNull(s, "pattern");
        Objects.requireNonNull(s1, "noOffsetText");
        for(int v = 0; v < 22; ++v) {
            if(k.d[v].equals(s)) {
                this.b = v;
                this.c = v % 11;
                this.a = s1;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + s);
    }

    public static void a(boolean z, int v, StringBuilder stringBuilder0) {
        stringBuilder0.append((z ? ":" : ""));
        stringBuilder0.append(((char)(v / 10 + 0x30)));
        stringBuilder0.append(((char)(v % 10 + 0x30)));
    }

    public static boolean b(CharSequence charSequence0, boolean z, int v, int[] arr_v) {
        int v1 = arr_v[0];
        if(v1 < 0) {
            return true;
        }
        if(!z || v == 1) {
        label_6:
            if(v1 + 2 <= charSequence0.length()) {
                int v2 = charSequence0.charAt(v1);
                int v3 = charSequence0.charAt(v1 + 1);
                if(v2 >= 0x30 && v2 <= 57 && v3 >= 0x30 && v3 <= 57) {
                    int v4 = v3 - 0x30 + (v2 - 0x30) * 10;
                    if(v4 >= 0 && v4 <= 59) {
                        arr_v[v] = v4;
                        arr_v[0] = v1 + 2;
                        return true;
                    }
                }
            }
        }
        else if(v1 + 1 <= charSequence0.length() && charSequence0.charAt(v1) == 58) {
            ++v1;
            goto label_6;
        }
        return false;
    }

    public static void c(CharSequence charSequence0, boolean z, int[] arr_v) {
        if(z) {
            if(!k.b(charSequence0, false, 1, arr_v)) {
                arr_v[0] = ~arr_v[0];
            }
            return;
        }
        k.e(charSequence0, 1, 2, arr_v);
    }

    public static void d(CharSequence charSequence0, boolean z, boolean z1, int[] arr_v) {
        if(!k.b(charSequence0, z, 2, arr_v) && z1) {
            arr_v[0] = ~arr_v[0];
        }
    }

    public static void e(CharSequence charSequence0, int v, int v1, int[] arr_v) {
        int v2 = arr_v[0];
        char[] arr_c = new char[v1];
        int v3 = 0;
        int v4 = 0;
        while(v3 < v1 && v2 + 1 <= charSequence0.length()) {
            char c = charSequence0.charAt(v2);
            if(c < 0x30 || c > 57) {
                break;
            }
            arr_c[v3] = c;
            ++v4;
            ++v3;
            ++v2;
        }
        if(v4 < v) {
            arr_v[0] = ~arr_v[0];
            return;
        }
        switch(v4) {
            case 1: {
                arr_v[1] = arr_c[0] - 0x30;
                break;
            }
            case 2: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                break;
            }
            case 3: {
                arr_v[1] = arr_c[0] - 0x30;
                arr_v[2] = arr_c[2] - 0x30 + (arr_c[1] - 0x30) * 10;
                break;
            }
            case 4: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                arr_v[2] = arr_c[3] - 0x30 + (arr_c[2] - 0x30) * 10;
                break;
            }
            case 5: {
                arr_v[1] = arr_c[0] - 0x30;
                arr_v[2] = arr_c[2] - 0x30 + (arr_c[1] - 0x30) * 10;
                arr_v[3] = arr_c[4] - 0x30 + (arr_c[3] - 0x30) * 10;
                break;
            }
            case 6: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                arr_v[2] = arr_c[3] - 0x30 + (arr_c[2] - 0x30) * 10;
                arr_v[3] = arr_c[5] - 0x30 + (arr_c[4] - 0x30) * 10;
            }
        }
        arr_v[0] = v2;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        Long long0 = x0.a(ChronoField.OFFSET_SECONDS);
        boolean z = false;
        if(long0 == null) {
            return false;
        }
        int v = g.y(long0.longValue());
        String s = this.a;
        if(v == 0) {
            stringBuilder0.append(s);
            return true;
        }
        int v1 = Math.abs(v / 3600 % 100);
        int v2 = Math.abs(v / 60 % 60);
        int v3 = Math.abs(v % 60);
        int v4 = stringBuilder0.length();
        stringBuilder0.append((v >= 0 ? "+" : "-"));
        if(this.b < 11 || v1 >= 10) {
            k.a(false, v1, stringBuilder0);
        }
        else {
            stringBuilder0.append(((char)(v1 + 0x30)));
        }
        int v5 = this.c;
        if(v5 >= 3 && v5 <= 8 || v5 >= 9 && v3 > 0 || v5 >= 1 && v2 > 0) {
            k.a(v5 > 0 && v5 % 2 == 0, v2, stringBuilder0);
            v1 += v2;
            if(v5 == 7 || v5 == 8 || v5 >= 5 && v3 > 0) {
                if(v5 > 0 && v5 % 2 == 0) {
                    z = true;
                }
                k.a(z, v3, stringBuilder0);
                v1 += v3;
            }
        }
        if(v1 == 0) {
            stringBuilder0.setLength(v4);
            stringBuilder0.append(s);
        }
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        CharSequence charSequence1;
        int v2 = charSequence0.length();
        int v3 = this.a.length();
        if(v3 == 0) {
            if(v1 == v2) {
                return v0.f(ChronoField.OFFSET_SECONDS, 0L, v1, v1);
            }
            charSequence1 = charSequence0;
        }
        else {
            if(v1 == v2) {
                return ~v1;
            }
            charSequence1 = charSequence0;
            if(v0.g(charSequence1, v1, this.a, 0, v3)) {
                return v0.f(ChronoField.OFFSET_SECONDS, 0L, v1, v1 + v3);
            }
        }
        int v4 = charSequence0.charAt(v1);
        if(v4 == 43 || v4 == 45) {
            boolean z = this.c > 0 && this.c % 2 == 0;
            int v5 = this.b;
            boolean z1 = v5 < 11;
            int[] arr_v = new int[4];
            arr_v[0] = v1 + 1;
            if(!v0.c) {
                if(!z1) {
                    if(!z && (v5 != 11 || v2 <= v1 + 3 || charSequence1.charAt(v1 + 2) != 58 && charSequence1.charAt(v1 + 3) != 58)) {
                        v5 = 20;
                    }
                    else {
                        v5 = 21;
                        z = true;
                    }
                }
                else if(!z && (v5 != 0 || v2 <= v1 + 3 || charSequence1.charAt(v1 + 3) != 58)) {
                    v5 = 9;
                }
                else {
                    v5 = 10;
                    z = true;
                }
            }
            switch(v5) {
                case 0: 
                case 11: {
                    k.c(charSequence1, z1, arr_v);
                    break;
                }
                case 12: {
                    k.e(charSequence1, 1, 4, arr_v);
                    break;
                }
                case 1: 
                case 2: 
                case 13: {
                    k.c(charSequence1, z1, arr_v);
                    k.d(charSequence1, z, false, arr_v);
                    break;
                }
                case 14: {
                    k.e(charSequence1, 3, 4, arr_v);
                    break;
                }
                case 3: 
                case 4: 
                case 15: {
                    k.c(charSequence1, z1, arr_v);
                    k.d(charSequence1, z, true, arr_v);
                    break;
                }
                case 16: {
                    k.e(charSequence1, 3, 6, arr_v);
                    break;
                }
                case 5: 
                case 6: 
                case 17: {
                    k.c(charSequence1, z1, arr_v);
                    k.d(charSequence1, z, true, arr_v);
                    k.b(charSequence1, z, 3, arr_v);
                    break;
                }
                case 18: {
                    k.e(charSequence1, 5, 6, arr_v);
                    break;
                }
                case 7: 
                case 8: 
                case 19: {
                    k.c(charSequence1, z1, arr_v);
                    k.d(charSequence1, z, true, arr_v);
                    if(!k.b(charSequence1, z, 3, arr_v)) {
                        arr_v[0] = ~arr_v[0];
                    }
                    break;
                }
                case 20: {
                    k.e(charSequence1, 1, 6, arr_v);
                    break;
                }
                case 9: 
                case 10: 
                case 21: {
                    k.c(charSequence1, z1, arr_v);
                    if(k.b(charSequence1, z, 2, arr_v)) {
                        k.b(charSequence1, z, 3, arr_v);
                    }
                }
            }
            int v6 = arr_v[0];
            if(v6 > 0) {
                int v7 = arr_v[1];
                if(v7 <= 23) {
                    int v8 = arr_v[2];
                    if(v8 <= 59) {
                        int v9 = arr_v[3];
                        if(v9 <= 59) {
                            return v0.f(ChronoField.OFFSET_SECONDS, (((long)v8) * 60L + ((long)v7) * 3600L + ((long)v9)) * ((long)(v4 == 45 ? -1 : 1)), v1, v6);
                        }
                    }
                }
                throw __alloc_invoke__ DateTimeException, RuntimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
        }
        return v3 == 0 ? v0.f(ChronoField.OFFSET_SECONDS, 0L, v1, v1) : ~v1;
    }

    @Override
    public final String toString() {
        return "Offset(" + k.d[this.b] + ",\'" + this.a.replace("\'", "\'\'") + "\')";
    }
}

