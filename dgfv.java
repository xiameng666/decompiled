import android.os.ParcelFileDescriptor.AutoCloseOutputStream;

public final class dgfv {
    public final cuwu a;
    private final ParcelFileDescriptor.AutoCloseOutputStream b;

    public dgfv(ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0, cuwu cuwu0) {
        ibuq.f(cuwu0, "payload");
        super();
        this.b = parcelFileDescriptor$AutoCloseOutputStream0;
        this.a = cuwu0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfv)) {
            return false;
        }
        return ibuq.m(this.b, ((dgfv)object0).b) ? ibuq.m(this.a, ((dgfv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a.hashCode() : this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PreviewData(fileDescriptor=" + this.b + ", payload=" + this.a + ")";
    }
}

