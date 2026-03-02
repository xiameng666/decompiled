public enum crlz {
    STORAGE(new crma[]{crma.a, crma.b}),
    DMA(new crma[]{crma.c});

    public final crma[] c;

    private crlz(crma[] arr_crma) {
        this.c = arr_crma;
    }
}

