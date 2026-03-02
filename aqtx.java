public final class aqtx {
    public final boolean a;
    public final int b;
    public final long c;
    public final fpue d;
    public final aqvk e;

    public aqtx() {
        throw null;
    }

    public aqtx(boolean z, int v, long v1, fpue fpue0, aqvk aqvk0) {
        this.a = z;
        this.b = v;
        this.c = v1;
        if(fpue0 == null) {
            throw new NullPointerException("Null permissionAskingState");
        }
        this.d = fpue0;
        this.e = aqvk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aqtx) && this.a == ((aqtx)object0).a && this.b == ((aqtx)object0).b && this.c == ((aqtx)object0).c && this.d.equals(((aqtx)object0).d)) {
            return this.e == null ? ((aqtx)object0).e == null : this.e.equals(((aqtx)object0).e);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ this.d.hashCode();
        return this.e == null ? v * 1000003 : this.e.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "PhotosStatus{areRequiredPermissionsGranted=" + this.a + ", numWaitingForBackup=" + this.b + ", lastCompleteBackupTimestampUtcMillis=" + this.c + ", permissionAskingState=" + this.d.toString() + ", photosBackupStatus=" + this.e + "}";
    }
}

