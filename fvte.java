import java.util.Arrays;

public abstract class fvte {
    public final long a;

    protected fvte(long v) {
        this.a = v;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract String e();

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fvte) ? fvte.i(this.g(), ((fvte)object0).g()) && fvte.i(this.f(), ((fvte)object0).f()) && this.e().equals(((fvte)object0).e()) && this.a() == ((fvte)object0).a() && this.b() == ((fvte)object0).b() && this.c() == ((fvte)object0).c() && Arrays.equals(this.h(), ((fvte)object0).h()) && this.d() == ((fvte)object0).d() : false;
    }

    public abstract String f();

    public abstract String g();

    public abstract String[] h();

    @Override
    public int hashCode() {
        String s = this.g();
        String s1 = this.e();
        Integer integer0 = this.b();
        Integer integer1 = this.c();
        Integer integer2 = this.a();
        if(s == null) {
            s = "";
        }
        return Arrays.hashCode(new Object[]{s1, integer0, integer1, integer2, s, this.d(), Arrays.hashCode(this.h())});
    }

    private static boolean i(String s, String s1) {
        return s == s1 ? true : s != null && s.equals(s1);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BluetoothDeviceGetter [name=");
        stringBuilder0.append(this.g());
        stringBuilder0.append(", alias=");
        stringBuilder0.append(this.f());
        stringBuilder0.append(", deviceClass=");
        stringBuilder0.append(this.b());
        stringBuilder0.append(", majorDeviceClass=");
        stringBuilder0.append(this.c());
        stringBuilder0.append(", bondState=");
        stringBuilder0.append(this.a());
        stringBuilder0.append(", address=");
        stringBuilder0.append(this.e());
        stringBuilder0.append(", type=");
        stringBuilder0.append(this.d());
        stringBuilder0.append(", uuids=[");
        String[] arr_s = this.h();
        if(arr_s != null) {
            int v = 0;
            for(boolean z = true; v < arr_s.length; z = false) {
                String s = arr_s[v];
                if(!z) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
                ++v;
            }
        }
        stringBuilder0.append("]]");
        return stringBuilder0.toString();
    }
}

