public enum gync {
    QUICK_START(1),
    ESIM_TRANSFER(2),
    RESTORE_ANYTIME(3);

    public final byte d;

    private gync(byte b) {
        this.d = b;
    }
}

