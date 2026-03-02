import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.List;

public final class abum extends SearchIndexablesProvider {
    private abuo a;

    private final void a(MatrixCursor matrixCursor0, boolean z) {
        for(Object object0: this.a.a(false)) {
            abup abup0 = (abup)object0;
            if(!z || abup0.c()) {
                Object[] arr_object = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
                arr_object[1] = abup0.b();
                GoogleSettingsItem googleSettingsItem0 = abup0.a;
                arr_object[2] = googleSettingsItem0.h;
                List list0 = googleSettingsItem0.k;
                Object object1 = null;
                if(list0 != null && !list0.isEmpty()) {
                    object1 = new gfss(",").b(list0);
                }
                arr_object[5] = object1;
                arr_object[12] = abup0.a();
                arr_object[6] = googleSettingsItem0.q;
                arr_object[9] = abup0.b;
                arr_object[10] = abup0.c;
                arr_object[11] = abup0.d;
                matrixCursor0.addRow(arr_object);
            }
        }
    }

    public final boolean onCreate() {
        Context context0 = this.getContext();
        gftb.check(context0);
        this.a = new abuo(context0.getApplicationContext());
        return true;
    }

    public final Cursor queryDynamicRawData(String[] arr_s) {
        if(hryn.c()) {
            Context context0 = this.getContext();
            gftb.check(context0);
            if(!azqk.g(context0)) {
                Cursor cursor0 = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
                this.a(((MatrixCursor)cursor0), true);
                return cursor0;
            }
        }
        return super.queryDynamicRawData(arr_s);
    }

    public final Cursor queryNonIndexableKeys(String[] arr_s) {
        Cursor cursor0 = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        if(!hryn.c() && hryn.d()) {
            for(Object object0: this.a.a(true)) {
                Object[] arr_object = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
                arr_object[0] = ((abup)object0).a();
                ((MatrixCursor)cursor0).addRow(arr_object);
            }
        }
        return cursor0;
    }

    public final Cursor queryRawData(String[] arr_s) {
        Cursor cursor0 = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        if(hryn.d()) {
            this.a(((MatrixCursor)cursor0), false);
        }
        return cursor0;
    }

    public final Cursor queryXmlResources(String[] arr_s) {
        return new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
    }
}

