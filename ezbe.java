import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.trustagent.common.service.PreferenceChimeraService;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ezbe extends wby implements ezbf {
    final PreferenceChimeraService a;

    public ezbe() {
        super("com.google.android.gms.trustagent.common.service.IPreferenceService");
    }

    public ezbe(PreferenceChimeraService preferenceChimeraService0) {
        Objects.requireNonNull(preferenceChimeraService0);
        this.a = preferenceChimeraService0;
        super("com.google.android.gms.trustagent.common.service.IPreferenceService");
    }

    @Override  // ezbf
    public final Bundle a(String s) {
        Map map0 = this.a.c.getAll();
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s1 = (String)object0;
            if(s.isEmpty() || s1.startsWith(s)) {
                Object object1 = map0.get(s1);
                if((object1 instanceof String)) {
                    bundle0.putString(s1, ((String)object1));
                }
                else if((object1 instanceof Boolean)) {
                    bundle0.putBoolean(s1, ((Boolean)object1).booleanValue());
                }
                else if((object1 instanceof Integer)) {
                    bundle0.putInt(s1, ((Integer)object1).intValue());
                }
                else if((object1 instanceof Set)) {
                    bundle0.putStringArrayList(s1, new ArrayList(((Set)object1)));
                }
                else if((object1 instanceof Long)) {
                    bundle0.putLong(s1, ((Long)object1).longValue());
                }
                else {
                    ((ggtj)((ggtj)PreferenceChimeraService.a.i()).ar(0x4369)).R("[PreferenceChimeraService] Unsupported type in SharedPreference for key %s type %s, ignored.", s1, object1.getClass());
                }
            }
        }
        return bundle0;
    }

    @Override  // ezbf
    public final void b(String s, boolean z) {
        this.a.c.edit().putBoolean(s, z).apply();
    }

    @Override  // ezbf
    public final void c(String s, int v) {
        this.a.c.edit().putInt(s, v).apply();
    }

    @Override  // ezbf
    public final void d(String s, long v) {
        this.a.c.edit().putLong(s, v).apply();
    }

    @Override  // ezbf
    public final void e(String s, String s1) {
        this.a.c.edit().putString(s, s1).apply();
    }

    @Override  // ezbf
    public final void f(String s, List list0) {
        this.a.c.edit().putStringSet(s, new HashSet(list0)).apply();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                ezbe.gr(parcel0);
                Bundle bundle0 = this.a(s);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                boolean z = wbz.i(parcel0);
                ezbe.gr(parcel0);
                this.b(s1, z);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                ezbe.gr(parcel0);
                this.e(s2, s3);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                String s4 = parcel0.readString();
                int v1 = parcel0.readInt();
                ezbe.gr(parcel0);
                this.c(s4, v1);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s5 = parcel0.readString();
                long v2 = parcel0.readLong();
                ezbe.gr(parcel0);
                this.d(s5, v2);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s6 = parcel0.readString();
                ArrayList arrayList0 = parcel0.createStringArrayList();
                ezbe.gr(parcel0);
                this.f(s6, arrayList0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                String s7 = parcel0.readString();
                ezbe.gr(parcel0);
                this.g(s7);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ezbf
    public final void g(String s) {
        this.a.c.edit().remove(s).apply();
    }
}

