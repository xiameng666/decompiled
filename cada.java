import j..time.LocalDate;
import java.util.List;

public final class cada {
    public final long a;
    public final LocalDate b;
    public final List c;
    private final cact d;
    private final long e;
    private final LocalDate f;

    public cada(cact cact0, long v, long v1, LocalDate localDate0, LocalDate localDate1, List list0) {
        ibuq.f(localDate0, "uploadTimestamp");
        ibuq.f(localDate1, "expiryTimestamp");
        super();
        this.d = cact0;
        this.a = v;
        this.e = v1;
        this.b = localDate0;
        this.f = localDate1;
        this.c = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cada)) {
            return false;
        }
        if(!ibuq.m(this.d, ((cada)object0).d)) {
            return false;
        }
        if(this.a != ((cada)object0).a) {
            return false;
        }
        if(this.e != ((cada)object0).e) {
            return false;
        }
        if(!ibuq.m(this.b, ((cada)object0).b)) {
            return false;
        }
        return ibuq.m(this.f, ((cada)object0).f) ? ibuq.m(this.c, ((cada)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.d.hashCode() * 0x1F + cacy.a(this.a)) * 0x1F + cacy.a(this.e)) * 0x1F + this.b.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "LogFileMetadata(device=" + this.d + ", logFileId=" + this.a + ", blobSize=" + this.e + ", uploadTimestamp=" + this.b + ", expiryTimestamp=" + this.f + ", logFileKeys=" + this.c + ")";
    }
}

