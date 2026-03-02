import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;
import j..util.Objects;

public final class egvy extends du implements fs {
    public static final int a;
    private static final bboh b;
    private Account c;

    static {
        egvy.b = bboh.b("SimImportContainerFragment", bbcu.f);
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        if(Objects.equals(s, "StartSimImportFragment")) {
            if(bundle0 == null) {
                bundle0 = null;
            }
            else if(bundle0.getInt("result_code") == -1) {
                ImportSimContactsRequest importSimContactsRequest0 = (ImportSimContactsRequest)bundle0.getParcelable("import_request");
                if(importSimContactsRequest0 == null) {
                    throw new IllegalStateException("Result bundle is missing import request.");
                }
                this.y(importSimContactsRequest0);
                return;
            }
            if(bundle0 != null && bundle0.getInt("action_code", 0) == 1) {
                ImportSimContactsSuggestion importSimContactsSuggestion0 = (ImportSimContactsSuggestion)bundle0.getParcelable("import_suggestion");
                if(importSimContactsSuggestion0 != null) {
                    int v = bundle0.getInt("import_suggestion_count", 1);
                    egvi egvi0 = new egvi();
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable("suggestion", importSimContactsSuggestion0);
                    bundle1.putInt("suggestion_count", v);
                    egvi0.setArguments(bundle1);
                    egvi0.a = null;
                    ca ca0 = new ca(this.getChildFragmentManager());
                    ca0.G(0x7F0B1C53, egvi0);  // id:people_sync_core_sim_import_container
                    ca0.w("ImportSimContactsListFragment");
                    ca0.a();
                    return;
                }
                ((ggtj)egvy.b.j()).x("Can\'t view list. Missing ImportSimContactsSuggestion.");
                return;
            }
            this.getParentFragmentManager().ae("SimImportContainerFragment", bundle0);
            return;
        }
        if(Objects.equals(s, "ImportSimContactsListFragment")) {
            if(bundle0 == null) {
                bundle0 = null;
            }
            else if(bundle0.getInt("result_code") == 0) {
                this.getChildFragmentManager().U();
                return;
            }
            if(egwg.d(bundle0)) {
                ImportSimContactsRequest importSimContactsRequest1 = (ImportSimContactsRequest)bundle0.getParcelable("import_request");
                if(importSimContactsRequest1 == null) {
                    throw new IllegalStateException("Result bundle is missing import request.");
                }
                this.getChildFragmentManager().U();
                this.y(importSimContactsRequest1);
            }
        }
        else if(Objects.equals(s, "ImportingSimContactsFragment")) {
            this.getParentFragmentManager().ae("SimImportContainerFragment", bundle0);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        Account account0 = (Account)bundle1.getParcelable("account");
        if(account0 == null) {
            throw new IllegalStateException("Account is required.");
        }
        this.c = account0;
        this.getChildFragmentManager().af("StartSimImportFragment", this, this);
        this.getChildFragmentManager().af("ImportingSimContactsFragment", this, this);
        this.getChildFragmentManager().af("ImportSimContactsListFragment", this, this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = new FrameLayout(this.requireContext());
        ((FrameLayout)view0).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((FrameLayout)view0).setId(0x7F0B1C53);  // id:people_sync_core_sim_import_container
        return view0;
    }

    @Override  // du
    public final void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(this.getChildFragmentManager().g(0x7F0B1C53) == null) {  // id:people_sync_core_sim_import_container
            ca ca0 = new ca(this.getChildFragmentManager());
            Account account0 = (Account)Objects.requireNonNull(this.c);
            gftb.check(account0);
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("account", account0);
            egwk egwk0 = new egwk();
            egwk0.setArguments(bundle1);
            ca0.u(0x7F0B1C53, egwk0, "StartSimImportFragment");  // id:people_sync_core_sim_import_container
            ca0.f();
        }
    }

    private final void y(ImportSimContactsRequest importSimContactsRequest0) {
        if(this.getContext() != null) {
            ((egik)((gftm)egik.f()).a).a.a(bbdg.fi);
        }
        ca ca0 = new ca(this.getChildFragmentManager());
        ca0.B(0x7F010003, 0x7F010004, 0x7F010003, 0x7F010004);  // anim:abc_popup_enter
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("import_request", importSimContactsRequest0);
        egvo egvo0 = new egvo();
        egvo0.setArguments(bundle0);
        ca0.z(0x7F0B1C53, egvo0, "ImportingSimContactsFragment");  // id:people_sync_core_sim_import_container
        ca0.a();
    }
}

