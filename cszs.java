import android.accounts.Account;
import java.util.Set;

public final class cszs {
    public final Account a;
    public boolean b;
    public final Set c;

    public cszs(Account account0, Set set0) {
        ibuq.f(account0, "account");
        super();
        this.a = account0;
        this.b = true;
        this.c = set0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cszs)) {
            return false;
        }
        if(!ibuq.m(this.a, ((cszs)object0).a)) {
            return false;
        }
        return this.b == ((cszs)object0).b ? ibuq.m(this.c, ((cszs)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b ? (v + 0x4CF) * 0x1F + this.c.hashCode() : (v + 0x4D5) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DevicePickerSelectionState(account=" + this.a + ", isEnabled=" + this.b + ", invitedDevices=" + this.c + ")";
    }
}

