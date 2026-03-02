package j$.time.format;

import j..desugar.sun.nio.fs.g;
import j..time.temporal.ChronoField;

public final class i implements e {
    public final int a;
    public final Object b;

    public i(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    public static void a(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append(((char)(v / 10 + 0x30)));
        stringBuilder0.append(((char)(v % 10 + 0x30)));
    }

    public static int b(CharSequence charSequence0, int v) {
        int v1 = charSequence0.charAt(v);
        return v1 < 0x30 || v1 > 57 ? -1 : v1 - 0x30;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        if(this.a != 0) {
            stringBuilder0.append(((String)this.b));
            return true;
        }
        Long long0 = x0.a(ChronoField.OFFSET_SECONDS);
        if(long0 == null) {
            return false;
        }
        stringBuilder0.append("GMT");
        int v = g.y(long0.longValue());
        if(v != 0) {
            int v1 = Math.abs(v / 3600 % 100);
            int v2 = Math.abs(v / 60 % 60);
            int v3 = Math.abs(v % 60);
            stringBuilder0.append((v >= 0 ? "+" : "-"));
            if(((TextStyle)this.b) == TextStyle.FULL) {
                i.a(stringBuilder0, v1);
                stringBuilder0.append(':');
                i.a(stringBuilder0, v2);
                if(v3 != 0) {
                    stringBuilder0.append(':');
                    i.a(stringBuilder0, v3);
                    return true;
                }
            }
            else {
                if(v1 >= 10) {
                    stringBuilder0.append(((char)(v1 / 10 + 0x30)));
                }
                stringBuilder0.append(((char)(v1 % 10 + 0x30)));
                if(v2 != 0 || v3 != 0) {
                    stringBuilder0.append(':');
                    i.a(stringBuilder0, v2);
                    if(v3 != 0) {
                        stringBuilder0.append(':');
                        i.a(stringBuilder0, v3);
                    }
                }
            }
        }
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        int v4;
        if(this.a != 0) {
            String s = (String)this.b;
            if(v1 <= charSequence0.length() && v1 >= 0) {
                return v0.g(charSequence0, v1, s, 0, s.length()) ? s.length() + v1 : ~v1;
            }
            throw new IndexOutOfBoundsException();
        }
        int v2 = charSequence0.length();
        if(v0.g(charSequence0, v1, "GMT", 0, 3)) {
            if(v1 + 3 == v2) {
                return v0.f(ChronoField.OFFSET_SECONDS, 0L, v1, v1 + 3);
            }
            int v3 = charSequence0.charAt(v1 + 3);
            if(v3 == 43) {
                v4 = 1;
            }
            else {
                if(v3 != 45) {
                    return v0.f(ChronoField.OFFSET_SECONDS, 0L, v1, v1 + 3);
                }
                v4 = -1;
            }
            int v5 = 0;
            if(((TextStyle)this.b) == TextStyle.FULL) {
                int v6 = i.b(charSequence0, v1 + 4);
                int v7 = i.b(charSequence0, v1 + 5);
                if(v6 >= 0 && v7 >= 0 && charSequence0.charAt(v1 + 6) == 58) {
                    int v8 = i.b(charSequence0, v1 + 7);
                    int v9 = v1 + 9;
                    int v10 = i.b(charSequence0, v1 + 8);
                    if(v8 >= 0 && v10 >= 0) {
                        if(v1 + 11 < v2 && charSequence0.charAt(v9) == 58) {
                            int v11 = i.b(charSequence0, v1 + 10);
                            int v12 = i.b(charSequence0, v1 + 11);
                            if(v11 >= 0 && v12 >= 0) {
                                v5 = v11 * 10 + v12;
                                v9 = v1 + 12;
                            }
                        }
                        return v0.f(ChronoField.OFFSET_SECONDS, (((long)(v8 * 10 + v10)) * 60L + ((long)(v6 * 10 + v7)) * 3600L + ((long)v5)) * ((long)v4), v1, v9);
                    }
                }
            }
            else {
                int v13 = v1 + 5;
                int v14 = i.b(charSequence0, v1 + 4);
                if(v14 >= 0) {
                    if(v13 < v2) {
                        int v15 = i.b(charSequence0, v13);
                        if(v15 >= 0) {
                            v14 = v14 * 10 + v15;
                            v13 = v1 + 6;
                        }
                        if(v13 + 2 < v2 && charSequence0.charAt(v13) == 58 && v13 + 2 < v2 && charSequence0.charAt(v13) == 58) {
                            int v16 = i.b(charSequence0, v13 + 1);
                            int v17 = i.b(charSequence0, v13 + 2);
                            if(v16 >= 0 && v17 >= 0) {
                                int v18 = v16 * 10 + v17;
                                if(v13 + 5 < v2 && charSequence0.charAt(v13 + 3) == 58) {
                                    int v19 = i.b(charSequence0, v13 + 4);
                                    int v20 = i.b(charSequence0, v13 + 5);
                                    return v19 < 0 || v20 < 0 ? v0.f(ChronoField.OFFSET_SECONDS, (((long)v18) * 60L + ((long)v14) * 3600L) * ((long)v4), v1, v13 + 3) : v0.f(ChronoField.OFFSET_SECONDS, (((long)v18) * 60L + ((long)v14) * 3600L + ((long)(v19 * 10 + v20))) * ((long)v4), v1, v13 + 6);
                                }
                                return v0.f(ChronoField.OFFSET_SECONDS, (((long)v18) * 60L + ((long)v14) * 3600L) * ((long)v4), v1, v13 + 3);
                            }
                        }
                    }
                    return v0.f(ChronoField.OFFSET_SECONDS, ((long)v14) * 3600L * ((long)v4), v1, v13);
                }
            }
        }
        return ~v1;
    }

    @Override
    public final String toString() {
        return this.a == 0 ? "LocalizedOffset(" + ((TextStyle)this.b) + ")" : "\'" + ((String)this.b).replace("\'", "\'\'") + "\'";
    }
}

