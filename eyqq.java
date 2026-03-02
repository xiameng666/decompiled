import java.util.List;

public final class eyqq {
    public final List a;
    public final eysx b;
    public final eysz c;
    public final eypl d;
    public final boolean e;

    public eyqq(List list0, eysx eysx0, eysz eysz0, eypl eypl0, boolean z) {
        this.a = list0;
        this.b = eysx0;
        this.c = eysz0;
        this.d = eypl0;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyqq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((eyqq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((eyqq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((eyqq)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((eyqq)object0).d) ? this.e == ((eyqq)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        eysz eysz0 = this.c;
        if(eysz0 != null) {
            v1 = eysz0.hashCode();
        }
        int v3 = (((v + v2) * 0x1F + v1) * 0x1F + this.d.hashCode()) * 0x1F;
        return this.e ? v3 + 0x4CF : v3 + 0x4D5;
    }

    @Override
    public final String toString() {
        return "EnrolledDeviceListUiState(enrolledDeviceUiStates=" + this.a + ", userAcknowledgableDialogUiState=" + this.b + ", warningMessageUiState=" + this.c + ", distanceBasedRelockSettingUiState=" + this.d + ", canEnrollNewDevices=" + this.e + ")";
    }
}

