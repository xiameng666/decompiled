import android.content.Intent;

public final class eyuk {
    public final eyuj a;
    public final eytx b;
    public final Intent c;

    public eyuk(eyuj eyuj0, eytx eytx0, Intent intent0, int v) {
        if((v & 2) != 0) {
            eytx0 = new eytx(eytw.a, null, null, null, null, null, null, null, null, 510);
        }
        if((v & 4) != 0) {
            intent0 = null;
        }
        ibuq.f(eyuj0, "state");
        ibuq.f(eytx0, "dialogState");
        super();
        this.a = eyuj0;
        this.b = eytx0;
        this.c = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyuk)) {
            return false;
        }
        if(this.a != ((eyuk)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((eyuk)object0).b) ? ibuq.m(this.c, ((eyuk)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F : v * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "EnrollmentUiState(state=" + this.a + ", dialogState=" + this.b + ", settingsIntent=" + this.c + ")";
    }
}

