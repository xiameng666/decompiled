import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import java.util.Arrays;

public final class eksg implements Comparable {
    public final String a;
    public final int b;

    public eksg(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public final PackageManager a(eksf eksf0) {
        PackageManager packageManager0 = eksf0.c(this.b);
        if(packageManager0 != null) {
            return packageManager0;
        }
        throw new PackageManager.NameNotFoundException("Unable to get PackageManager for user");
    }

    public final clms b() {
        clmr clmr0 = new clmr();
        clmr0.d(this.b);
        clmr0.b(this.a);
        return new clms(clmr0);
    }

    public final ApplicationInfo c(eksf eksf0) {
        return this.a(eksf0).getApplicationInfo(this.a, 0);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.toString().compareTo(((eksg)object0).toString());
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof eksg) ? this.b == ((eksg)object0).b && bata.b(this.a, ((eksg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return this.a + ":" + this.b;
    }
}

