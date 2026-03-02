public final class atos {
    public static atou a(atos atos0) {
        atou atou1;
        atou atou0 = atou.c;
        if(atou0 == null) {
            synchronized(atos0) {
                atou1 = atou.c;
                if(atou1 == null) {
                    atou1 = new atou(cclw.d);
                    atou.c = atou1;
                }
            }
            return atou1;
        }
        return atou0;
    }
}

