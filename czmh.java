import android.os.WorkSource;
import android.text.TextUtils;
import java.net.Inet6Address;

public final class czmh {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final WorkSource g;
    public final int h;
    public final gyby i;
    public final Inet6Address j;
    public final boolean k;
    public final int l;
    public final int m;

    public czmh() {
        throw null;
    }

    public czmh(String s, String s1, String s2, int v, int v1, int v2, boolean z, WorkSource workSource0, int v3, gyby gyby0, Inet6Address inet6Address0, boolean z1, int v4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = v1;
        this.m = v2;
        this.f = z;
        this.g = workSource0;
        this.h = v3;
        this.i = gyby0;
        this.j = inet6Address0;
        this.k = z1;
        this.l = v4;
    }

    public static czmg a() {
        czmg czmg0 = new czmg();
        czmg0.e(true);
        czmg0.g = 1;
        czmg0.d(-1);
        czmg0.c(0);
        czmg0.f(false);
        czmg0.b(0);
        return czmg0;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.b);
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czmh)) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((czmh)object0).a)) {
                label_8:
                    String s1 = this.b;
                    if(s1 != null) {
                        if(s1.equals(((czmh)object0).b)) {
                        label_13:
                            String s2 = this.c;
                            if(s2 != null) {
                                if(s2.equals(((czmh)object0).c)) {
                                label_18:
                                    if(this.d == ((czmh)object0).d && this.e == ((czmh)object0).e) {
                                        int v = this.m;
                                        int v1 = ((czmh)object0).m;
                                        if(v == 0) {
                                            throw null;
                                        }
                                        if(v == v1 && this.f == ((czmh)object0).f) {
                                            WorkSource workSource0 = this.g;
                                            if(workSource0 != null) {
                                                if(workSource0.equals(((czmh)object0).g)) {
                                                label_28:
                                                    if(this.h == ((czmh)object0).h) {
                                                        gyby gyby0 = this.i;
                                                        if(gyby0 != null) {
                                                            if(((ProtoLiteMessage)gyby0).equals(((czmh)object0).i)) {
                                                            label_34:
                                                                Inet6Address inet6Address0 = this.j;
                                                                if(inet6Address0 == null) {
                                                                    return ((czmh)object0).j == null ? this.k == ((czmh)object0).k && this.l == ((czmh)object0).l : false;
                                                                }
                                                                return inet6Address0.equals(((czmh)object0).j) ? this.k == ((czmh)object0).k && this.l == ((czmh)object0).l : false;
                                                            }
                                                        }
                                                        else if(((czmh)object0).i == null) {
                                                            goto label_34;
                                                        }
                                                    }
                                                }
                                            }
                                            else if(((czmh)object0).g == null) {
                                                goto label_28;
                                            }
                                        }
                                    }
                                }
                            }
                            else if(((czmh)object0).c == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((czmh)object0).b == null) {
                        goto label_13;
                    }
                }
            }
            else if(((czmh)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v5;
        int v = 0;
        int v1 = 0x4D5;
        int v2 = ((((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003;
        int v3 = this.m;
        if(v3 == 0) {
            throw null;
        }
        int v4 = ((((v2 ^ v3) * 1000003 ^ (this.f ? 0x4CF : 0x4D5)) * 1000003 ^ (this.g == null ? 0 : this.g.hashCode())) * 1000003 ^ this.h) * 1000003;
        gyby gyby0 = this.i;
        if(gyby0 == null) {
            v5 = 0;
        }
        else if(((ProtoLiteMessage)gyby0).isImmutable()) {
            v5 = ((ProtoLiteMessage)gyby0).s();
        }
        else {
            int v6 = gyby0.memoizedHashCode;
            if(v6 == 0) {
                v6 = ((ProtoLiteMessage)gyby0).s();
                gyby0.memoizedHashCode = v6;
            }
            v5 = v6;
        }
        Inet6Address inet6Address0 = this.j;
        if(inet6Address0 != null) {
            v = inet6Address0.hashCode();
        }
        if(this.k) {
            v1 = 0x4CF;
        }
        return this.l ^ (((v4 ^ v5) * 1000003 ^ v) * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return this.m == 0 ? "WifiConnectMetadata{ssid=" + this.a + ", password=" + this.b + ", gateway=" + this.c + ", port=" + this.d + ", frequency=" + this.e + ", band=" + "null" + ", isDisruptiveUpgrade=" + this.f + ", workSource=" + this.g + ", connectionType=" + this.h + ", remoteOsInfo=" + this.i + ", ipV6Address=" + this.j + ", isMediumTheFirstPlaceInBandwidth=" + this.k + ", connectionMode=" + this.l + "}" : "WifiConnectMetadata{ssid=" + this.a + ", password=" + this.b + ", gateway=" + this.c + ", port=" + this.d + ", frequency=" + this.e + ", band=" + Integer.toString(this.m - 1) + ", isDisruptiveUpgrade=" + this.f + ", workSource=" + this.g + ", connectionType=" + this.h + ", remoteOsInfo=" + this.i + ", ipV6Address=" + this.j + ", isMediumTheFirstPlaceInBandwidth=" + this.k + ", connectionMode=" + this.l + "}";
    }
}

