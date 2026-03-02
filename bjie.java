import android.os.IInterface;

public interface bjie extends IInterface {
    bjgw createModuleContext(bjgw arg1, String arg2, int arg3);

    bjgw createModuleContext3NoCrashUtils(bjgw arg1, String arg2, int arg3, bjgw arg4);

    bjgw createModuleContextNoCrashUtils(bjgw arg1, String arg2, int arg3);

    int getIDynamiteLoaderVersion();

    int getModuleVersion(bjgw arg1, String arg2);

    int getModuleVersion2(bjgw arg1, String arg2, boolean arg3);

    int getModuleVersion2NoCrashUtils(bjgw arg1, String arg2, boolean arg3);

    bjgw queryForDynamiteModuleNoCrashUtils(bjgw arg1, String arg2, boolean arg3, long arg4);
}

