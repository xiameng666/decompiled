import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import j..util.Objects;

public final class egzx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final gged_interceptors r;
    public final GroupContactOrder s;
    public final boolean t;
    public final eggh u;

    public egzx() {
        throw null;
    }

    public egzx(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Long long0, Long long1, Long long2, String s, String s1, String s2, String s3, String s4, String s5, String s6, gged_interceptors gged0, GroupContactOrder groupContactOrder0, boolean z7, eggh eggh0) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = long0;
        this.i = long1;
        this.j = long2;
        this.k = s;
        this.l = s1;
        this.m = s2;
        this.n = s3;
        this.o = s4;
        this.p = s5;
        this.q = s6;
        this.r = gged0;
        this.s = groupContactOrder0;
        this.t = z7;
        this.u = eggh0;
    }

    public final ContentValues a() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("sourceid", this.k);
        String s = this.l;
        contentValues0.put("system_id", s);
        contentValues0.put("group_is_read_only", Integer.valueOf(((int)this.c)));
        contentValues0.put("auto_add", Integer.valueOf(((int)this.d)));
        contentValues0.put("favorites", Integer.valueOf(((int)this.a)));
        String s1 = this.m;
        contentValues0.put("title", s1);
        contentValues0.put("sync2", this.n);
        contentValues0.put("sync3", this.j);
        if(hwzs.a.b().a() && !TextUtils.isEmpty(s1)) {
            if(!TextUtils.isEmpty(s)) {
                s1 = "System Group: " + s1;
            }
            contentValues0.put("notes", s1);
        }
        return contentValues0;
    }

    public static egzw b() {
        egzw egzw0 = new egzw();
        egzw0.e(false);
        egzw0.h(false);
        egzw0.f(false);
        egzw0.b(false);
        egzw0.g(true);
        egzw0.d(false);
        egzw0.i(false);
        egzw0.c(false);
        return egzw0;
    }

    public final gged_interceptors c() {
        return this.s == null ? ggna.a : this.s.b();
    }

    public final boolean d() {
        gged_interceptors gged0 = this.c();
        return gged0 == null || gged0.isEmpty() ? this.r != null && !this.r.isEmpty() : true;
    }

    public final boolean e() {
        return Objects.equals(this.m, "Starred in Android");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof egzx) && this.a == ((egzx)object0).a && this.b == ((egzx)object0).b && this.c == ((egzx)object0).c && this.d == ((egzx)object0).d && this.e == ((egzx)object0).e && this.f == ((egzx)object0).f && this.g == ((egzx)object0).g) {
            Long long0 = this.h;
            if(long0 != null) {
                if(long0.equals(((egzx)object0).h)) {
                label_8:
                    Long long1 = this.i;
                    if(long1 != null) {
                        if(long1.equals(((egzx)object0).i)) {
                        label_13:
                            Long long2 = this.j;
                            if(long2 != null) {
                                if(long2.equals(((egzx)object0).j)) {
                                label_18:
                                    String s = this.k;
                                    if(s != null) {
                                        if(s.equals(((egzx)object0).k)) {
                                        label_23:
                                            String s1 = this.l;
                                            if(s1 != null) {
                                                if(s1.equals(((egzx)object0).l)) {
                                                label_28:
                                                    String s2 = this.m;
                                                    if(s2 != null) {
                                                        if(s2.equals(((egzx)object0).m)) {
                                                        label_33:
                                                            String s3 = this.n;
                                                            if(s3 != null) {
                                                                if(s3.equals(((egzx)object0).n)) {
                                                                label_38:
                                                                    String s4 = this.o;
                                                                    if(s4 != null) {
                                                                        if(s4.equals(((egzx)object0).o)) {
                                                                        label_43:
                                                                            String s5 = this.p;
                                                                            if(s5 != null) {
                                                                                if(s5.equals(((egzx)object0).p)) {
                                                                                label_48:
                                                                                    String s6 = this.q;
                                                                                    if(s6 != null) {
                                                                                        if(s6.equals(((egzx)object0).q)) {
                                                                                        label_53:
                                                                                            gged_interceptors gged0 = this.r;
                                                                                            if(gged0 != null) {
                                                                                                if(ggia.i(gged0, ((egzx)object0).r)) {
                                                                                                label_58:
                                                                                                    GroupContactOrder groupContactOrder0 = this.s;
                                                                                                    if(groupContactOrder0 != null) {
                                                                                                        if(groupContactOrder0.equals(((egzx)object0).s)) {
                                                                                                        label_63:
                                                                                                            if(this.t == ((egzx)object0).t) {
                                                                                                                return this.u == null ? ((egzx)object0).u == null : ((ProtoLiteMessage)this.u).equals(((egzx)object0).u);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if(((egzx)object0).s == null) {
                                                                                                        goto label_63;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if(((egzx)object0).r == null) {
                                                                                                goto label_58;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if(((egzx)object0).q == null) {
                                                                                        goto label_53;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if(((egzx)object0).p == null) {
                                                                                goto label_48;
                                                                            }
                                                                        }
                                                                    }
                                                                    else if(((egzx)object0).o == null) {
                                                                        goto label_43;
                                                                    }
                                                                }
                                                            }
                                                            else if(((egzx)object0).n == null) {
                                                                goto label_38;
                                                            }
                                                        }
                                                    }
                                                    else if(((egzx)object0).m == null) {
                                                        goto label_33;
                                                    }
                                                }
                                            }
                                            else if(((egzx)object0).l == null) {
                                                goto label_28;
                                            }
                                        }
                                    }
                                    else if(((egzx)object0).k == null) {
                                        goto label_23;
                                    }
                                }
                            }
                            else if(((egzx)object0).j == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((egzx)object0).i == null) {
                        goto label_13;
                    }
                }
            }
            else if(((egzx)object0).h == null) {
                goto label_8;
            }
        }
        return false;
    }

    public final boolean f() {
        return !TextUtils.isEmpty(this.l) || "Starred in Android".equals(this.m);
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.h == null ? 0 : this.h.hashCode();
        int v2 = 0x4D5;
        int v3 = this.g ? 0x4CF : 0x4D5;
        int v4 = this.f ? 0x4CF : 0x4D5;
        int v5 = this.e ? 0x4CF : 0x4D5;
        int v6 = this.d ? 0x4CF : 0x4D5;
        int v7 = this.c ? 0x4CF : 0x4D5;
        int v8 = this.b ? 0x4CF : 0x4D5;
        int v9 = this.a ? 0x4CF : 0x4D5;
        int v10 = this.i == null ? 0 : this.i.hashCode();
        int v11 = this.j == null ? 0 : this.j.hashCode();
        int v12 = this.k == null ? 0 : this.k.hashCode();
        int v13 = this.l == null ? 0 : this.l.hashCode();
        int v14 = this.m == null ? 0 : this.m.hashCode();
        int v15 = this.n == null ? 0 : this.n.hashCode();
        int v16 = this.o == null ? 0 : this.o.hashCode();
        int v17 = this.p == null ? 0 : this.p.hashCode();
        int v18 = this.q == null ? 0 : this.q.hashCode();
        int v19 = this.r == null ? 0 : this.r.hashCode();
        int v20 = this.s == null ? 0 : this.s.hashCode();
        if(this.t) {
            v2 = 0x4CF;
        }
        eggh eggh0 = this.u;
        if(eggh0 != null) {
            if(((ProtoLiteMessage)eggh0).isImmutable()) {
                return (((((((((((((v1 ^ (v3 ^ (v4 ^ (v5 ^ (v6 ^ (v7 ^ (v8 ^ (v9 ^ 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003 ^ v10) * 1000003 ^ v11) * 1000003 ^ v12) * 1000003 ^ v13) * 1000003 ^ v14) * 1000003 ^ v15) * 1000003 ^ v16) * 1000003 ^ v17) * 1000003 ^ v18) * 1000003 ^ v19) * 1000003 ^ v20) * 1000003 ^ v2) * 1000003 ^ ((ProtoLiteMessage)eggh0).s();
            }
            v = eggh0.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)eggh0).s();
                eggh0.memoizedHashCode = v;
            }
        }
        return (((((((((((((v1 ^ (v3 ^ (v4 ^ (v5 ^ (v6 ^ (v7 ^ (v8 ^ (v9 ^ 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003) * 1000003 ^ v10) * 1000003 ^ v11) * 1000003 ^ v12) * 1000003 ^ v13) * 1000003 ^ v14) * 1000003 ^ v15) * 1000003 ^ v16) * 1000003 ^ v17) * 1000003 ^ v18) * 1000003 ^ v19) * 1000003 ^ v20) * 1000003 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "Group{isMarkedAsFavorite=" + this.a + ", isVisible=" + this.b + ", isReadOnly=" + this.c + ", isAutoAdd=" + this.d + ", isDirty=" + this.e + ", isDeleted=" + this.f + ", isShouldSync=" + this.g + ", rowId=" + this.h + ", version=" + this.i + ", lastUpdateDate=" + this.j + ", id=" + this.k + ", systemId=" + this.l + ", title=" + this.m + ", etag=" + this.n + ", accountName=" + this.o + ", accountType=" + this.p + ", dataSet=" + this.q + ", contactSourceIdOrder=" + this.r + ", groupContactOrder=" + this.s + ", needsSecondSyncPass=" + this.t + ", syncOneColumnData=" + this.u + "}";
    }
}

