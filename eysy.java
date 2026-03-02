import android.content.Intent;

public final class eysy {
    public final int a;
    public final Intent b;
    public final ibth c;

    public eysy(int v, Intent intent0, ibth ibth0, int v1) {
        this.a = v;
        if((v1 & 2) != 0) {
            intent0 = null;
        }
        this.b = intent0;
        if((v1 & 4) != 0) {
            ibth0 = null;
        }
        this.c = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eysy)) {
            return false;
        }
        if(this.a != ((eysy)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((eysy)object0).b) ? ibuq.m(this.c, ((eysy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.a;
        ibth ibth0 = this.c;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return (v2 * 0x1F + v1) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "WarningMessageButtonUiState(labelId=" + this.a + ", actionIntent=" + this.b + ", acknowledge=" + this.c + ")";
    }
}

