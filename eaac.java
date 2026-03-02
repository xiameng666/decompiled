import android.content.Intent;

public final class eaac extends eaaf {
    public final boolean a;
    public final Intent b;

    public eaac(boolean z, Intent intent0) {
        ibuq.f(intent0, "nextStepIntent");
        super();
        this.a = z;
        this.b = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eaac)) {
            return false;
        }
        return this.a == ((eaac)object0).a ? ibuq.m(this.b, ((eaac)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "InstallWalletPromptScreen(isUpdate=" + this.a + ", nextStepIntent=" + this.b + ")";
    }
}

