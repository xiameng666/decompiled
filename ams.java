public final class ams {
    public static int a(alm alm0, alk alk0, boolean z) {
        if(alm0 == null) {
            return 0;
        }
        int v = (alm0.j & 0x10000) != 0x10000 || z ? alm0.j : alm0.j & 0xFFFEFFFF;
        if(v == 0) {
            int v1 = alk0 == null ? 0xFF : 15;
            return alm0.i ? 0x8000 | v1 : v1;
        }
        return v;
    }

    public static boolean b(int v) {
        return (v & 0x8000) != 0;
    }
}

