import android.content.res.Resources;
import java.util.Collection;
import java.util.List;

public final class ilx {
    public static final ify a(ify ify0, ibts ibts0) {
        for(ify ify1 = ify0.n(); ify1 != null; ify1 = ify1.n()) {
            if(((Boolean)ibts0.a(ify1)).booleanValue()) {
                return ify1;
            }
        }
        return null;
    }

    public static final iwj b(iug iug0) {
        iwj iwj0 = (iwj)itz.a(iug0.b, iuz.E);
        List list0 = (List)itz.a(iug0.b, iuz.A);
        return iwj0 == null ? (list0 == null ? null : ((iwj)ibpo.T(list0))) : iwj0;
    }

    public static final String c(iug iug0, Resources resources0) {
        int v;
        ity ity0 = iug0.b;
        Object object0 = itz.a(ity0, iuz.b);
        ivz ivz0 = (ivz)itz.a(ity0, iuz.I);
        its its0 = (its)itz.a(ity0, iuz.x);
        Object object1 = null;
        if(ivz0 != null) {
            switch(ivz0.ordinal()) {
                case 0: {
                    if(its0 == null) {
                        its0 = null;
                    }
                    else if(its0.a == 2 && object0 == null) {
                        object0 = "On";
                    }
                    break;
                }
                case 1: {
                    if(its0 == null) {
                        its0 = null;
                    }
                    else if(its0.a == 2 && object0 == null) {
                        object0 = "Off";
                    }
                    break;
                }
                case 2: {
                    if(object0 == null) {
                        object0 = "Partially checked";
                    }
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        Boolean boolean0 = (Boolean)itz.a(ity0, iuz.H);
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if((its0 == null || its0.a != 4) && object0 == null) {
                object0 = z ? "Selected" : "Not selected";
            }
        }
        itr itr0 = (itr)itz.a(ity0, iuz.c);
        if(itr0 != null) {
            if(itr0 == itr.a) {
                if(object0 == null) {
                    object0 = "In progress";
                }
            }
            else if(object0 == null) {
                float f = ((Number)itr0.c.b()).floatValue() - ((Number)itr0.c.c()).floatValue() == 0.0f ? 0.0f : (itr0.b - ((Number)itr0.c.c()).floatValue()) / (((Number)itr0.c.b()).floatValue() - ((Number)itr0.c.c()).floatValue());
                if((f < 0.0f)) {
                    f = 0.0f;
                }
                if((f > 1.0f)) {
                    f = 1.0f;
                }
                if(f == 0.0f) {
                    v = 0;
                }
                else {
                    v = f == 1.0f ? 100 : ibwt.j(Math.round(f * 100.0f), 1, 99);
                }
                object0 = resources0.getString(0x7F1530BF, new Object[]{v});  // string:template_percent "%1$d percent."
            }
        }
        ivi ivi0 = iuz.E;
        if(ity0.f(ivi0)) {
            ity ity1 = iug0.f().e();
            Collection collection0 = (Collection)itz.a(ity1, iuz.a);
            if(collection0 == null || collection0.isEmpty()) {
                Collection collection1 = (Collection)itz.a(ity1, iuz.A);
                if(collection1 == null || collection1.isEmpty()) {
                    CharSequence charSequence0 = (CharSequence)itz.a(ity1, ivi0);
                    return charSequence0 != null && charSequence0.length() != 0 ? null : "Empty";
                }
            }
        }
        else {
            object1 = object0;
        }
        return (String)object1;
    }

    public static final boolean d(iug iug0) {
        return !iug0.e().f(iuz.i);
    }

    public static final boolean e(iug iug0) {
        ivz ivz0 = (ivz)itz.a(iug0.b, iuz.I);
        its its0 = (its)itz.a(iug0.b, iuz.x);
        if(((Boolean)itz.a(iug0.b, iuz.H)) != null) {
            if(its0 == null) {
                return true;
            }
            return its0.a == 4 ? ivz0 != null : true;
        }
        return ivz0 != null;
    }

    public static final boolean f(iug iug0) {
        return iug0.a.r == jlm.b;
    }

    public static final boolean g(iug iug0, Resources resources0) {
        ity ity0 = iug0.b;
        List list0 = (List)itz.a(ity0, iuz.a);
        boolean z = (list0 == null ? null : ((String)ibpo.T(list0))) != null || ilx.b(iug0) != null || ilx.c(iug0, resources0) != null || ilx.e(iug0);
        if(!iuk.a(iug0)) {
            if(!ity0.a) {
                return iug0.j() ? z : false;
            }
            return true;
        }
        return false;
    }
}

