import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.util.Size;
import com.android.onboarding.utils.persistable.PersistableIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import jeb.synthetic.FIN;

public final class scv {
    public static final PersistableBundle a(Bundle bundle0, ibtw ibtw0) {
        Object object6;
        Iterator iterator2;
        Bundle bundle2;
        Object object1;
        Parcel parcel0 = Parcel.obtain();
        ibuq.e(parcel0, "obtain(...)");
        int v = FIN.finallyOpen$NT();
        parcel0.writeBundle(bundle0);
        parcel0.setDataPosition(0);
        Bundle bundle1 = parcel0.readBundle(bundle0.getClassLoader());
        if(bundle1 != null) {
            FIN.finallyCodeBegin$NT(v);
            PersistableBundle persistableBundle0 = new PersistableBundle();
            PersistableBundle persistableBundle1 = new PersistableBundle();
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    object1 = bundle1.get(s);
                }
                catch(Exception exception0) {
                    if(ibtw0 == null) {
                        sct.c("BundleExt", a.L(exception0, s, "Dropping object with key ", " due to error: "));
                    }
                    else {
                        ibuq.c(s);
                        ibtw0.a(s, a.L(exception0, s, "Dropping object with key ", " due to error: "));
                    }
                    object1 = null;
                }
                if(object1 == null) {
                    continue;
                }
                String s1 = new ibuk(object1.getClass()).b();
                persistableBundle1.putString(s, s1);
                if((object1 instanceof Integer)) {
                    persistableBundle0.putInt(s, ((Number)object1).intValue());
                }
                else if((object1 instanceof int[])) {
                    persistableBundle0.putIntArray(s, ((int[])object1));
                }
                else if((object1 instanceof Long)) {
                    persistableBundle0.putLong(s, ((Number)object1).longValue());
                }
                else if((object1 instanceof long[])) {
                    persistableBundle0.putLongArray(s, ((long[])object1));
                }
                else if((object1 instanceof Double)) {
                    persistableBundle0.putDouble(s, ((Number)object1).doubleValue());
                }
                else if((object1 instanceof double[])) {
                    persistableBundle0.putDoubleArray(s, ((double[])object1));
                }
                else if((object1 instanceof Boolean)) {
                    persistableBundle0.putBoolean(s, ((Boolean)object1).booleanValue());
                }
                else if((object1 instanceof boolean[])) {
                    persistableBundle0.putBooleanArray(s, ((boolean[])object1));
                }
                else if((object1 instanceof String)) {
                    persistableBundle0.putString(s, ((String)object1));
                }
                else if((object1 instanceof PersistableBundle)) {
                    persistableBundle0.putPersistableBundle(s, ((PersistableBundle)object1));
                }
                else if((object1 instanceof scz)) {
                    ibuq.c(s);
                    sdn.b(persistableBundle0, s, ((scz)object1));
                }
                else if((object1 instanceof Bundle)) {
                    persistableBundle0.putPersistableBundle(s, scv.a(((Bundle)object1), ibtw0));
                }
                else if((object1 instanceof Byte)) {
                    persistableBundle0.putInt(s, ((Number)object1).byteValue());
                }
                else if((object1 instanceof byte[])) {
                    ArrayList arrayList0 = new ArrayList(((byte[])object1).length);
                    for(int v1 = 0; v1 < ((byte[])object1).length; ++v1) {
                        arrayList0.add(Integer.valueOf(((byte[])object1)[v1]));
                    }
                    persistableBundle0.putIntArray(s, ibpo.aF(arrayList0));
                }
                else if((object1 instanceof Short)) {
                    persistableBundle0.putInt(s, ((Number)object1).shortValue());
                }
                else if((object1 instanceof short[])) {
                    ArrayList arrayList1 = new ArrayList(((short[])object1).length);
                    for(int v2 = 0; v2 < ((short[])object1).length; ++v2) {
                        arrayList1.add(Integer.valueOf(((short[])object1)[v2]));
                    }
                    persistableBundle0.putIntArray(s, ibpo.aF(arrayList1));
                }
                else if((object1 instanceof Character)) {
                    persistableBundle0.putString(s, String.valueOf(((Character)object1).charValue()));
                }
                else if((object1 instanceof char[])) {
                    ArrayList arrayList2 = new ArrayList(((char[])object1).length);
                    for(int v3 = 0; v3 < ((char[])object1).length; ++v3) {
                        arrayList2.add(String.valueOf(((char[])object1)[v3]));
                    }
                    persistableBundle0.putStringArray(s, ((String[])arrayList2.toArray(new String[0])));
                }
                else if((object1 instanceof CharSequence)) {
                    persistableBundle0.putString(s, object1.toString());
                }
                else if((object1 instanceof Float)) {
                    persistableBundle0.putDouble(s, ((double)((Number)object1).floatValue()));
                }
                else if((object1 instanceof float[])) {
                    ArrayList arrayList3 = new ArrayList(((float[])object1).length);
                    for(int v4 = 0; v4 < ((float[])object1).length; ++v4) {
                        arrayList3.add(Double.valueOf(((float[])object1)[v4]));
                    }
                    double[] arr_f = new double[arrayList3.size()];
                    int v5 = 0;
                    for(Object object2: arrayList3) {
                        arr_f[v5] = ((Number)object2).doubleValue();
                        ++v5;
                    }
                    persistableBundle0.putDoubleArray(s, arr_f);
                }
                else if((object1 instanceof Size)) {
                    persistableBundle0.putString(s, ((Size)object1).toString());
                }
                else if((object1 instanceof ComponentName)) {
                    persistableBundle0.putString(s, ((ComponentName)object1).flattenToString());
                }
                else if((object1 instanceof Intent)) {
                    ibuq.c(s);
                    sdn.b(persistableBundle0, s, new PersistableIntent(((Intent)object1)));
                }
                else if((object1 instanceof Account)) {
                    PersistableBundle persistableBundle2 = new PersistableBundle();
                    persistableBundle2.putString("accountName", ((Account)object1).name);
                    persistableBundle2.putString("accountType", ((Account)object1).type);
                    persistableBundle0.putPersistableBundle(s, persistableBundle2);
                }
                else if((object1 instanceof Locale)) {
                    persistableBundle0.putString(s, ((Locale)object1).toLanguageTag());
                }
                else if((object1 instanceof Uri)) {
                    persistableBundle1.putString(s, new ibuk(Uri.class).b());
                    persistableBundle0.putString(s, ((Uri)object1).toString());
                }
                else {
                    if((object1 instanceof ArrayList)) {
                        if(((ArrayList)object1).size() == 0) {
                            sct.c("BundleExt", a.a(s, "Dropping empty arraylist with key ", " because we can\'t determine the type"));
                            continue;
                        }
                        else {
                            bundle2 = bundle1;
                            Object object3 = ((ArrayList)object1).get(0);
                            ibuq.c(object3);
                            iterator2 = iterator0;
                            persistableBundle1.putString(s, s1 + "<" + new ibuk(object3.getClass()).b() + ">");
                            if((object3 instanceof Integer)) {
                                int v6 = ((ArrayList)object1).size();
                                int[] arr_v = new int[v6];
                                for(int v7 = 0; v7 < v6; ++v7) {
                                    Object object4 = ((ArrayList)object1).get(v7);
                                    ibuq.d(object4, "null cannot be cast to non-null type kotlin.Int");
                                    arr_v[v7] = (int)(((Integer)object4));
                                }
                                persistableBundle0.putIntArray(s, arr_v);
                            }
                            else if((object3 instanceof CharSequence)) {
                                ArrayList arrayList4 = new ArrayList(ibpo.q(((Iterable)object1), 10));
                                for(Object object5: ((Iterable)object1)) {
                                    arrayList4.add(object5.toString());
                                }
                                persistableBundle0.putStringArray(s, ((String[])arrayList4.toArray(new String[0])));
                            }
                            else if(ibtw0 == null) {
                                sct.c("BundleExt", "Dropping arraylist with key " + s + " due to unknown or unpersistable type " + object3.getClass());
                            }
                            else {
                                ibuq.c(s);
                                ibtw0.a(s, "Arraylist with key " + s + " contains unknown or unpersistable type " + object3.getClass());
                            }
                            goto label_251;
                        }
                        goto label_183;
                    }
                    else {
                    label_183:
                        bundle2 = bundle1;
                        iterator2 = iterator0;
                        if((object1 instanceof Object[])) {
                            if(((Object[])object1).length == 0) {
                                sct.c("BundleExt", a.a(s, "Dropping empty array with key ", " because we can\'t determine the type"));
                            }
                            else {
                                int v8 = 0;
                                while(true) {
                                    object6 = null;
                                    if(v8 < ((Object[])object1).length) {
                                        Object object7 = ((Object[])object1)[v8];
                                        if(object7 == null) {
                                            ++v8;
                                            continue;
                                        }
                                        else {
                                            object6 = object7;
                                        }
                                    }
                                    break;
                                }
                                if(object6 == null) {
                                    String[] arr_s = new String[((Object[])object1).length];
                                    for(int v9 = 0; v9 < ((Object[])object1).length; ++v9) {
                                        arr_s[v9] = null;
                                    }
                                    persistableBundle0.putStringArray(s, arr_s);
                                }
                                else {
                                    persistableBundle1.putString(s, s1 + "<" + new ibuk(object6.getClass()).b() + ">");
                                    if((object6 instanceof String)) {
                                        ArrayList arrayList5 = new ArrayList(((Object[])object1).length);
                                        for(int v10 = 0; v10 < ((Object[])object1).length; ++v10) {
                                            Object object8 = ((Object[])object1)[v10];
                                            arrayList5.add((object8 == null ? null : object8.toString()));
                                        }
                                        persistableBundle0.putStringArray(s, ((String[])arrayList5.toArray(new String[0])));
                                    }
                                    else if((object6 instanceof CharSequence)) {
                                        ArrayList arrayList6 = new ArrayList(((Object[])object1).length);
                                        for(int v11 = 0; v11 < ((Object[])object1).length; ++v11) {
                                            Object object9 = ((Object[])object1)[v11];
                                            arrayList6.add((object9 == null ? null : object9.toString()));
                                        }
                                        persistableBundle0.putStringArray(s, ((String[])arrayList6.toArray(new String[0])));
                                    }
                                    else if((object6 instanceof Bundle)) {
                                        ArrayList arrayList7 = new ArrayList(((Object[])object1).length);
                                        for(int v12 = 0; v12 < ((Object[])object1).length; ++v12) {
                                            Object object10 = ((Object[])object1)[v12];
                                            Bundle bundle3 = (object10 instanceof Bundle) ? ((Bundle)object10) : null;
                                            arrayList7.add((bundle3 == null ? null : new sdu(scv.a(bundle3, ibtw0))));
                                        }
                                        sde.d(persistableBundle0, s, arrayList7);
                                    }
                                    else if(ibtw0 == null) {
                                        sct.c("BundleExt", "Dropping array with key " + s + " due to unknown or unpersistable type " + object6.getClass());
                                    }
                                    else {
                                        ibuq.c(s);
                                        ibtw0.a(s, "array with key " + s + " contains unknown or unpersistable type " + object6.getClass());
                                    }
                                }
                            }
                        }
                        else if(ibtw0 == null) {
                            sct.c("BundleExt", "Dropping object with key " + s + " due to unknown or unpersistable type " + object1.getClass());
                        }
                        else {
                            ibuq.c(s);
                            ibtw0.a(s, "Dropping object with key " + s + " due to unknown or unpersistable type " + object1.getClass());
                        }
                    }
                label_251:
                    bundle1 = bundle2;
                    iterator0 = iterator2;
                }
            }
            PersistableBundle persistableBundle3 = new PersistableBundle();
            persistableBundle3.putPersistableBundle("_original_types", persistableBundle1);
            persistableBundle0.putPersistableBundle("_conversion", persistableBundle3);
            return persistableBundle0;
        }
        throw new IllegalStateException("Should never happen... we just wrote a bundle and can\'t read it back");
    }

    public static final void b(Bundle bundle0, scz scz0) {
        PersistableBundle persistableBundle0 = scz.k.d(scz0);
        bundle0.putBundle("gms_delegate_pending_contract", (persistableBundle0 == null ? null : sde.e(persistableBundle0)));
    }
}

