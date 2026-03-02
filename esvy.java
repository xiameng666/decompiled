public final class esvy {
    public final eswc a() {
        eswc eswc1;
        eswc eswc0 = eswc.b;
        if(eswc0 == null) {
            synchronized(this) {
                eswc1 = eswc.b;
                if(eswc1 == null) {
                    eswc1 = new eswc();
                    eswc.b = eswc1;
                }
            }
            return eswc1;
        }
        return eswc0;
    }
}

