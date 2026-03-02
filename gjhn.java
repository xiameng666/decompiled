public enum gjhn implements hfub {
    UNKNOWN_STAGE(0),
    GROUP_SYNC_DOWN_PROGRESS(1),
    CONTACT_SYNC_DOWN_PROGRESS(2),
    PHOTO_SYNC_DOWN_PROGRESS(3),
    GROUP_SYNC_UP_PROGRESS(4),
    CONTACT_SYNC_UP_PROGRESS(5),
    PHOTO_SYNC_UP_PROGRESS(6);

    public final int h;

    private gjhn(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

