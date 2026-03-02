enum ifxs {
    DISABLED(0),
    DISK(1),
    DISK_NO_HTTP(1),
    MEMORY(2);

    public final int e;

    private ifxs(int v1) {
        this.e = v1;
    }
}

