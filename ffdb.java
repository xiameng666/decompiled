public final class ffdb {
    public static String a(ffcd ffcd0) {
        if(ffcd0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("receivedSeqId=");
        stringBuilder0.append(ffcd0.c);
        stringBuilder0.append(", syncTable={");
        ggdy ggdy0 = new ggdy();
        for(Object object0: ffcd0.d) {
            ggdy0.i("(" + ((ffcc)object0).c + ":" + ((ffcc)object0).d + ")");
        }
        gfss.d(',').i(stringBuilder0, ggdy0.h());
        stringBuilder0.append("}, version=");
        stringBuilder0.append(ffcd0.e);
        stringBuilder0.append(", restrictions=");
        stringBuilder0.append(ffcz.b((ffcd0.f == null ? ffaz.a : ffcd0.f)));
        return stringBuilder0.toString();
    }
}

