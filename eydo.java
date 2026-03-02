import android.content.Intent;

public final class eydo {
    public final String a;
    public final Intent b;

    public eydo(String s, Intent intent0) {
        ibuq.f(intent0, "launchIntent");
        super();
        this.a = s;
        this.b = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eydo)) {
            return false;
        }
        return ibuq.m(this.a, ((eydo)object0).a) ? ibuq.m(this.b, ((eydo)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AssociatedDeviceCompanionAppInfo(appName=" + this.a + ", launchIntent=" + this.b + ")";
    }
}

