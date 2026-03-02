import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class sde {
    public static final int a(PersistableBundle persistableBundle0) {
        int v1;
        ibuq.f(persistableBundle0, "<this>");
        Parcel parcel0 = Parcel.obtain();
        ibuq.e(parcel0, "obtain(...)");
        try {
            parcel0.writePersistableBundle(persistableBundle0);
            v1 = parcel0.dataSize();
        }
        finally {
            parcel0.recycle();
        }
        return v1;
    }

    public static final List b(PersistableBundle persistableBundle0, String s, sdg sdg0) {
        ibuq.f(persistableBundle0, "<this>");
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle(s);
        return persistableBundle1 == null ? null : new seb(sdg0, new sdo()).d(persistableBundle1);
    }

    public static final void c(PersistableBundle persistableBundle0, String s, Object object0, scx scx0) {
        persistableBundle0.putPersistableBundle(s, (object0 == null ? null : scx0.d(object0)));
    }

    public static final void d(PersistableBundle persistableBundle0, String s, List list0) {
        persistableBundle0.putPersistableBundle(s, (list0 == null ? null : new sdq(new scw(scz.k)).a(list0)));
    }

    public static final Bundle e(PersistableBundle persistableBundle0) {
        Parcelable[] arr_parcelable;
        Bundle bundle1;
        boolean[] arr_z;
        Parcelable parcelable0;
        String s2;
        PersistableBundle persistableBundle2;
        ibuq.f(persistableBundle0, "<this>");
        Bundle bundle0 = new Bundle(persistableBundle0);
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("_conversion");
        if(persistableBundle1 == null) {
            persistableBundle2 = new PersistableBundle();
        }
        else {
            persistableBundle2 = persistableBundle1.getPersistableBundle("_original_types");
            if(persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
            }
        }
        for(Object object0: persistableBundle2.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(object1 != null) {
                String s1 = persistableBundle2.getString(s);
                int v = 0;
                if(s1 != null) {
                    List list0 = ibzk.T(s1, new String[]{"<"}, 0, 6);
                    if(list0 != null) {
                        s2 = (String)list0.get(0);
                        goto label_23;
                    }
                }
                s2 = null;
            label_23:
                if(!ibuq.m(new ibuk(object1.getClass()).b(), s2)) {
                    if(ibuq.m(s2, new ibuk(Byte.TYPE).b())) {
                        bundle0.putByte(s, ((byte)(((int)(((Integer)object1))))));
                    }
                    else if(ibuq.m(s2, new ibuk(byte[].class).b())) {
                        ArrayList arrayList0 = new ArrayList(((int[])object1).length);
                        while(v < ((int[])object1).length) {
                            arrayList0.add(Byte.valueOf(((byte)((int[])object1)[v])));
                            ++v;
                        }
                        bundle0.putByteArray(s, ibpo.aC(arrayList0));
                    }
                    else if(ibuq.m(s2, new ibuk(Short.TYPE).b())) {
                        bundle0.putShort(s, ((short)(((int)(((Integer)object1))))));
                    }
                    else if(ibuq.m(s2, new ibuk(short[].class).b())) {
                        ArrayList arrayList1 = new ArrayList(((int[])object1).length);
                        for(int v1 = 0; v1 < ((int[])object1).length; ++v1) {
                            arrayList1.add(Short.valueOf(((short)((int[])object1)[v1])));
                        }
                        short[] arr_v = new short[arrayList1.size()];
                        for(Object object2: arrayList1) {
                            arr_v[v] = ((Number)object2).shortValue();
                            ++v;
                        }
                        bundle0.putShortArray(s, arr_v);
                    }
                    else if(ibuq.m(s2, new ibuk(Character.TYPE).b())) {
                        bundle0.putChar(s, ((String)object1).subSequence(0, 1).charAt(0));
                    }
                    else if(ibuq.m(s2, new ibuk(char[].class).b())) {
                        ArrayList arrayList2 = new ArrayList(((String[])object1).length);
                        for(int v2 = 0; v2 < ((String[])object1).length; ++v2) {
                            arrayList2.add(Character.valueOf(((String[])object1)[v2].subSequence(0, 1).charAt(0)));
                        }
                        bundle0.putCharArray(s, ibpo.aD(arrayList2));
                    }
                    else if(ibuq.m(s2, new ibuk(ComponentName.class).b())) {
                        bundle0.putParcelable(s, ComponentName.unflattenFromString(((String)object1)));
                    }
                    else if(ibuq.m(s2, new ibuk(Account.class).b())) {
                        if(((PersistableBundle)object1).containsKey("accountType") && ((PersistableBundle)object1).containsKey("accountName")) {
                            String s3 = ((PersistableBundle)object1).getString("accountName");
                            if(s3 == null) {
                                throw new IllegalStateException("Account name not found");
                            }
                            String s4 = ((PersistableBundle)object1).getString("accountType");
                            if(s4 == null) {
                                throw new IllegalStateException("Account type not found");
                            }
                            parcelable0 = new Account(s3, s4);
                        }
                        else {
                            parcelable0 = null;
                        }
                        if(parcelable0 == null) {
                            continue;
                        }
                        bundle0.putParcelable(s, parcelable0);
                    }
                    else if(ibuq.m(s2, new ibuk(Locale.class).b())) {
                        bundle0.putSerializable(s, Locale.forLanguageTag(((String)object1)));
                    }
                    else if(ibuq.m(s2, new ibuk(Uri.class).b())) {
                        bundle0.putParcelable(s, Uri.parse(((String)object1)));
                    }
                    else if(ibuq.m(s2, new ibuk(Float.TYPE).b())) {
                        bundle0.putFloat(s, ((float)(((double)(((Double)object1))))));
                    }
                    else if(ibuq.m(s2, new ibuk(float[].class).b())) {
                        ArrayList arrayList3 = new ArrayList(((double[])object1).length);
                        while(v < ((double[])object1).length) {
                            arrayList3.add(Float.valueOf(((float)((double[])object1)[v])));
                            ++v;
                        }
                        bundle0.putFloatArray(s, ibpo.aE(arrayList3));
                    }
                    else if(ibuq.m(s2, new ibuk(Size.class).b())) {
                        bundle0.putSize(s, Size.parseSize(((String)object1)));
                    }
                    else if(ibuq.m(s2, new ibuk(Bundle.class).b())) {
                        bundle0.putBundle(s, sde.e(((PersistableBundle)object1)));
                    }
                    else if(ibuq.m(s2, new ibuk(Boolean.TYPE).b())) {
                        bundle0.putBoolean(s, rjc.a(persistableBundle0, s));
                    }
                    else if(ibuq.m(s2, new ibuk(boolean[].class).b())) {
                        ibuq.f(persistableBundle0, "<this>");
                        Object object3 = persistableBundle0.get(s);
                        if((object3 instanceof boolean[])) {
                            arr_z = (boolean[])object3;
                        }
                        else if((object3 instanceof int[])) {
                            ArrayList arrayList4 = new ArrayList(((int[])object3).length);
                            for(int v3 = 0; v3 < ((int[])object3).length; ++v3) {
                                arrayList4.add(Boolean.valueOf(((int[])object3)[v3] == 1));
                            }
                            arr_z = ibpo.aH(arrayList4);
                        }
                        else {
                            arr_z = null;
                        }
                        if(arr_z == null) {
                            throw new IllegalStateException("Missing BoolenArray");
                        }
                        bundle0.putBooleanArray(s, arr_z);
                    }
                    else if(ibuq.m(s2, new ibuk(ArrayList.class).b())) {
                        String s5 = persistableBundle2.getString(s, "");
                        ibuq.e(s5, "getString(...)");
                        String s6 = (String)ibzk.T(((CharSequence)ibzk.T(s5, new String[]{"<"}, 0, 6).get(1)), new String[]{">"}, 0, 6).get(0);
                        if(ibuq.m(s6, new ibuk(Integer.TYPE).b())) {
                            bundle0.putIntegerArrayList(s, new ArrayList(ibpg.L(((int[])object1))));
                        }
                        else {
                            if(!ibuq.m(s6, new ibuk(String.class).b())) {
                                continue;
                            }
                            bundle0.putCharSequenceArrayList(s, new ArrayList(ibpg.N(((String[])object1))));
                        }
                    }
                    else if(ibuq.m(s2, new ibuk(Object[].class).b())) {
                        String s7 = persistableBundle2.getString(s, "");
                        ibuq.e(s7, "getString(...)");
                        String s8 = (String)ibzk.T(((CharSequence)ibzk.T(s7, new String[]{"<"}, 0, 6).get(1)), new String[]{">"}, 0, 6).get(0);
                        if(ibuq.m(s8, new ibuk(CharSequence.class).b())) {
                            bundle0.putCharSequenceArray(s, ((String[])object1));
                        }
                        else {
                            if(!ibuq.m(s8, new ibuk(Bundle.class).b())) {
                                continue;
                            }
                            List list1 = sde.b(persistableBundle0, s, sdu.a);
                            if(list1 == null) {
                                arr_parcelable = null;
                            }
                            else {
                                ArrayList arrayList5 = new ArrayList(ibpo.q(list1, 10));
                                for(Object object4: list1) {
                                    sdu sdu0 = (sdu)object4;
                                    if(sdu0 != null) {
                                        PersistableBundle persistableBundle3 = sdu0.b;
                                        if(persistableBundle3 != null) {
                                            bundle1 = sde.e(persistableBundle3);
                                            goto label_160;
                                        }
                                    }
                                    bundle1 = null;
                                label_160:
                                    arrayList5.add(bundle1);
                                }
                                arr_parcelable = (Bundle[])arrayList5.toArray(new Bundle[0]);
                            }
                            bundle0.putParcelableArray(s, arr_parcelable);
                        }
                    }
                    else {
                        if(!ibuq.m(s2, new ibuk(Intent.class).b())) {
                            continue;
                        }
                        bundle0.putParcelable(s, sdm.e(((PersistableBundle)object1)).b());
                    }
                    continue;
                }
            }
        }
        bundle0.remove("_conversion");
        return bundle0;
    }
}

