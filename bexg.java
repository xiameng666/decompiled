import android.support.v7.widget.RecyclerView;
import com.google.android.gms.credential.manager.passwordimport.ImportPreviewFragment;

public final class bexg implements ibts {
    public final ImportPreviewFragment a;
    public final RecyclerView b;
    public final ibnn c;

    public bexg(ImportPreviewFragment importPreviewFragment0, RecyclerView recyclerView0, ibnn ibnn0) {
        this.a = importPreviewFragment0;
        this.b = recyclerView0;
        this.c = ibnn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        RecyclerView recyclerView0 = this.b;
        ibnn ibnn0 = this.c;
        if((((bezw)object0) instanceof bezn)) {
            ibuq.c(recyclerView0);
            recyclerView0.an(new qq(new tk[]{new bgnw(0x7F0E086B, new bewy(ImportPreviewFragment.y(ibnn0).b(), ((bezn)(((bezw)object0))))), new bfau(((bezn)(((bezw)object0))).a)}));  // layout:pwm_import_status
            return ibom.a;
        }
        if((((bezw)object0) instanceof bezu)) {
            ibuq.c(recyclerView0);
            bgnw bgnw0 = new bgnw(0x7F0E086B, new bewx(ImportPreviewFragment.y(ibnn0).b(), ((bezu)(((bezw)object0)))));  // layout:pwm_import_status
            bgnw bgnw1 = new bgnw(0x7F0E0861, new bexc());  // layout:pwm_import_password_list_header
            bgnw bgnw2 = hsam.f() ? new bgnw(0x7F0E0869) : new bgnw(0x7F0E086A);  // layout:pwm_import_section_separator
            bgnw bgnw3 = new bgnw(0x7F0E0861, new bexd());  // layout:pwm_import_password_list_header
            recyclerView0.an(new qq(new tk[]{bgnw0, bgnw1, new beww(((bezu)(((bezw)object0))).b), bgnw2, bgnw3, new bfau(((bezu)(((bezw)object0))).a)}));
            return ibom.a;
        }
        if((((bezw)object0) instanceof bezo)) {
            ibuq.c(recyclerView0);
            recyclerView0.an(new qq(new tk[]{new bgnw(0x7F0E086B, new bewz(ImportPreviewFragment.y(ibnn0).b(), ((bezo)(((bezw)object0))))), new beww(((bezo)(((bezw)object0))).a)}));  // layout:pwm_import_status
            return ibom.a;
        }
        ImportPreviewFragment importPreviewFragment0 = this.a;
        if(ibuq.m(((bezw)object0), bezt.a)) {
            ibuq.c(recyclerView0);
            ImportPreviewFragment.z(recyclerView0, ImportPreviewFragment.y(ibnn0).b(), 0x7F1526F5);  // string:pwm_import_preview_no_passwords_can_be_imported "No passwords can be imported"
            return ibom.a;
        }
        if(ibuq.m(((bezw)object0), bezp.a)) {
            ibuq.c(recyclerView0);
            recyclerView0.an(new bgnw(0x7F0E086B, new bexa()));  // layout:pwm_import_status
            return ibom.a;
        }
        if(ibuq.m(((bezw)object0), bezq.a)) {
            ibuq.c(recyclerView0);
            ImportPreviewFragment.z(recyclerView0, ImportPreviewFragment.y(ibnn0).b(), 0x7F1526F2);  // string:pwm_import_preview_file_read_error "Unable to read the import file"
            return ibom.a;
        }
        if(ibuq.m(((bezw)object0), bezr.a)) {
            ibuq.c(recyclerView0);
            ImportPreviewFragment.z(recyclerView0, ImportPreviewFragment.y(ibnn0).b(), 0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
            return ibom.a;
        }
        if(ibuq.m(((bezw)object0), bezs.a)) {
            ibuq.c(recyclerView0);
            recyclerView0.an(new bgnw(0x7F0E086B, new bexe(ImportPreviewFragment.y(ibnn0).b(), importPreviewFragment0)));  // layout:pwm_import_status
            return ibom.a;
        }
        if(!ibuq.m(((bezw)object0), bezv.a)) {
            throw new ibnq();
        }
        ibuq.c(recyclerView0);
        ImportPreviewFragment.z(recyclerView0, ImportPreviewFragment.y(ibnn0).b(), 0x7F1526FB);  // string:pwm_import_preview_too_many_passwords_error "The selected file contains too 
                                                                                                 // many passwords. Import supports up to 3000 passwords per file."
        return ibom.a;
    }
}

