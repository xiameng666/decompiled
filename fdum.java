import j..util.Objects;

public final class fdum extends fdul {
    private final String a;

    public fdum(String s) {
        this.a = s;
    }

    @Override  // fdul
    public final boolean a(fduq fduq0, int v, boolean z, String s) {
        if(!hzzi.a.i().ag()) {
            return false;
        }
        boolean z1 = Objects.equals(fduq0.a.b, "com.google.android.wearable.app");
        String s1 = fduq0.b.b;
        if(z1 && s1.startsWith("/bugreport/")) {
            return !fduq0.c && !z;
        }
        if(hzvm.c()) {
            String s2 = fduq0.b.a;
            if(((s2.equals(this.a) || s2.equals("cloud") ? 1 : 0) | s2.equals(s)) == 0 && !Objects.equals(s, "cloud")) {
                return true;
            }
        }
        return v >= 2 ? z1 && (s1.startsWith("/contacts2/") || s1.startsWith("/package_manager/")) : false;
    }
}

