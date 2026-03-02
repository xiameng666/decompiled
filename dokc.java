import java.util.Arrays;
import java.util.UUID;

public final class dokc {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    public static final UUID d;
    public final UUID e;
    public final UUID f;
    public final UUID g;
    public final UUID h;
    private final byte[] i;
    private final int j;
    private final int k;
    private final dokb l;

    static {
        UUID uUID0 = UUID.fromString("00000000-0001-1000-8000-e83935499f35");
        ibuq.e(uUID0, "fromString(...)");
        dokc.a = uUID0;
        UUID uUID1 = UUID.fromString(hwkh.d());
        ibuq.e(uUID1, "fromString(...)");
        dokc.b = uUID1;
        UUID uUID2 = UUID.fromString("6b489e0e-97de-4d4d-9c06-2505e7bc66bf");
        ibuq.e(uUID2, "fromString(...)");
        dokc.c = uUID2;
        UUID uUID3 = UUID.fromString("b0f8edaa-60eb-4ee8-a543-e235a0b6cc52");
        ibuq.e(uUID3, "fromString(...)");
        dokc.d = uUID3;
    }

    public dokc(UUID uUID0, UUID uUID1, UUID uUID2, UUID uUID3, byte[] arr_b, dokb dokb0) {
        ibuq.f(uUID0, "baseUuid");
        ibuq.f(uUID1, "serviceUuid");
        ibuq.f(uUID2, "rxCharacteristic");
        ibuq.f(uUID3, "txCharacteristic");
        ibuq.f(dokb0, "partnerName");
        super();
        this.e = uUID0;
        this.f = uUID1;
        this.g = uUID2;
        this.h = uUID3;
        this.i = arr_b;
        this.j = 1;
        this.k = 1;
        this.l = dokb0;
    }

    public static final dokc a() {
        return new dokc(dokc.a, dokc.b, dokc.c, dokc.d, new byte[0], dokb.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dokc)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dokc)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dokc)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((dokc)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((dokc)object0).h)) {
            return false;
        }
        return ibuq.m(this.i, ((dokc)object0).i) ? this.l == ((dokc)object0).l : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.i);
        return ((((((this.e.hashCode() * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F + v) * 0x1F + 1) * 0x1F + 1) * 0x1F + this.l.hashCode();
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.i);
        return "HospitalityPartnerData(baseUuid=" + this.e + ", serviceUuid=" + this.f + ", rxCharacteristic=" + this.g + ", txCharacteristic=" + this.h + ", serviceData=" + s + ", powerLevel=1, advertiseMode=1, partnerName=" + this.l + ")";
    }
}

