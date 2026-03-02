public final class ggtw {
    public static boolean a(int v, ggso ggso0, StringBuilder stringBuilder0) {
        if(v - 1 != 0) {
            return false;
        }
        if(ggso0 == ggso.a) {
            return false;
        }
        stringBuilder0.append(ggso0.b());
        stringBuilder0.append('.');
        stringBuilder0.append(ggso0.d());
        stringBuilder0.append(':');
        stringBuilder0.append(ggso0.a());
        return true;
    }
}

