import android.content.ComponentName;
import android.content.Intent;
import android.os.UserHandle;
import j..util.Objects;
import java.net.SocketAddress;

public final class iaql extends SocketAddress {
    public final Intent a;
    public final UserHandle b;
    private static final long serialVersionUID;

    public iaql(Intent intent0, UserHandle userHandle0) {
        gftb.b(intent0.getComponent() != null || intent0.getPackage() != null, "\'bindIntent\' must be explicit. Specify either a package or ComponentName.");
        this.a = intent0;
        this.b = userHandle0;
    }

    public static iaql a(ComponentName componentName0) {
        return new iaql(new Intent("grpc.io.action.BIND").setComponent(componentName0), null);
    }

    public static iaql b(String s, String s1) {
        return iaql.a(new ComponentName(s, s1));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iaql) && this.a.filterEquals(((iaql)object0).a) && Objects.equals(this.b, ((iaql)object0).b);
    }

    @Override
    public final int hashCode() {
        return (this.a.getPackage() == null ? this.a : this.a.cloneFilter().setPackage(null)).filterHashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AndroidComponentAddress[");
        UserHandle userHandle0 = this.b;
        if(userHandle0 != null) {
            stringBuilder0.append(userHandle0);
            stringBuilder0.append("@");
        }
        stringBuilder0.append(this.a);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

