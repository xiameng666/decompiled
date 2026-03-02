public final class eswz {
    public final esxa a() {
        esxa esxa1;
        esxa esxa0 = esxa.b;
        if(esxa0 == null) {
            synchronized(this) {
                esxa1 = esxa.b;
                if(esxa1 == null) {
                    esxa1 = new esxa();
                    esxa.b = esxa1;
                }
            }
            return esxa1;
        }
        return esxa0;
    }
}

