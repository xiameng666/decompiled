public final class eswg {
    public final eswh a() {
        eswh eswh1;
        eswh eswh0 = eswh.c;
        if(eswh0 == null) {
            synchronized(this) {
                eswh1 = eswh.c;
                if(eswh1 == null) {
                    eswh1 = new eswh();
                    eswh.c = eswh1;
                }
            }
            return eswh1;
        }
        return eswh0;
    }
}

