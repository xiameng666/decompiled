import android.app.ActionBar;
import android.app.Activity.TranslucentConversionListener;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.app.ActivityOptions;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.ComponentCaller;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.SharedElementCallback;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toolbar;
import android.window.OnBackInvokedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public interface xja extends xix {
    void support_addContentView(View arg1, ViewGroup.LayoutParams arg2);

    void support_clearOverrideActivityTransition(int arg1);

    void support_closeContextMenu();

    void support_closeOptionsMenu();

    void support_convertFromTranslucent();

    boolean support_convertToTranslucent(Activity.TranslucentConversionListener arg1, ActivityOptions arg2);

    PendingIntent support_createPendingResult(int arg1, Intent arg2, int arg3);

    boolean support_dispatchGenericMotionEvent(MotionEvent arg1);

    boolean support_dispatchKeyEvent(KeyEvent arg1);

    boolean support_dispatchKeyShortcutEvent(KeyEvent arg1);

    boolean support_dispatchPopulateAccessibilityEvent(AccessibilityEvent arg1);

    boolean support_dispatchTouchEvent(MotionEvent arg1);

    boolean support_dispatchTrackballEvent(MotionEvent arg1);

    void support_dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    @Deprecated
    void support_enterPictureInPictureMode();

    boolean support_enterPictureInPictureMode(PictureInPictureParams arg1);

    View support_findViewById(int arg1);

    void support_finish();

    void support_finishActivity(int arg1);

    void support_finishActivityFromChild(Activity arg1, int arg2);

    void support_finishAffinity();

    void support_finishAfterTransition();

    void support_finishAndRemoveTask();

    void support_finishFromChild(Activity arg1);

    ActionBar support_getActionBar();

    ComponentCaller support_getCaller();

    ComponentName support_getCallingActivity();

    String support_getCallingPackage();

    int support_getChangingConfigurations();

    ComponentName support_getComponentName();

    Scene support_getContentScene();

    TransitionManager support_getContentTransitionManager();

    ComponentCaller support_getCurrentCaller();

    View support_getCurrentFocus();

    FragmentManager support_getFragmentManager();

    ComponentCaller support_getInitialCaller();

    Intent support_getIntent();

    @Deprecated
    Object support_getLastCustomNonConfigurationInstance();

    Object support_getLastNonConfigurationInstance();

    String support_getLaunchedFromPackage();

    int support_getLaunchedFromUid();

    LayoutInflater support_getLayoutInflater();

    LoaderManager support_getLoaderManager();

    String support_getLocalClassName();

    int support_getMaxNumPictureInPictureActions();

    MenuInflater support_getMenuInflater();

    OnBackInvokedDispatcher support_getOnBackInvokedDispatcher();

    Intent support_getParentActivityIntent();

    SharedPreferences support_getPreferences(int arg1);

    Uri support_getReferrer();

    int support_getRequestedOrientation();

    int support_getTaskId();

    VoiceInteractor support_getVoiceInteractor();

    Window support_getWindow();

    WindowManager support_getWindowManager();

    boolean support_hasWindowFocus();

    void support_invalidateOptionsMenu();

    boolean support_isActivityTransitionRunning();

    boolean support_isBackgroundVisibleBehind();

    boolean support_isChangingConfigurations();

    boolean support_isDestroyed();

    boolean support_isFinishing();

    boolean support_isImmersive();

    boolean support_isInMultiWindowMode();

    boolean support_isInPictureInPictureMode();

    boolean support_isLaunchedFromBubble();

    boolean support_isLocalVoiceInteractionSupported();

    boolean support_isTaskRoot();

    boolean support_isVoiceInteraction();

    boolean support_isVoiceInteractionRoot();

    boolean support_moveTaskToBack(boolean arg1);

    boolean support_navigateUpTo(Intent arg1);

    boolean support_navigateUpToFromChild(Activity arg1, Intent arg2);

    void support_onActionModeFinished(ActionMode arg1);

    void support_onActionModeStarted(ActionMode arg1);

    void support_onActivityReenter(int arg1, Intent arg2);

    void support_onActivityResult(int arg1, int arg2, Intent arg3);

    void support_onActivityResult(int arg1, int arg2, Intent arg3, ComponentCaller arg4);

    void support_onAttachFragment(Fragment arg1);

    void support_onAttachedToWindow();

    @Deprecated
    void support_onBackPressed();

    void support_onBackgroundVisibleBehindChanged(boolean arg1);

    void support_onChildTitleChanged(Activity arg1, CharSequence arg2);

    void support_onConfigurationChanged(Configuration arg1);

    void support_onContentChanged();

    boolean support_onContextItemSelected(MenuItem arg1);

    void support_onContextMenuClosed(Menu arg1);

    void support_onCreate(Bundle arg1);

    void support_onCreate(Bundle arg1, PersistableBundle arg2);

    void support_onCreateContextMenu(ContextMenu arg1, View arg2, ContextMenu.ContextMenuInfo arg3);

    CharSequence support_onCreateDescription();

    Dialog support_onCreateDialog(int arg1);

    Dialog support_onCreateDialog(int arg1, Bundle arg2);

    void support_onCreateNavigateUpTaskStack(TaskStackBuilder arg1);

    boolean support_onCreateOptionsMenu(Menu arg1);

    boolean support_onCreatePanelMenu(int arg1, Menu arg2);

    View support_onCreatePanelView(int arg1);

    boolean support_onCreateThumbnail(Bitmap arg1, Canvas arg2);

    View support_onCreateView(View arg1, String arg2, Context arg3, AttributeSet arg4);

    View support_onCreateView(String arg1, Context arg2, AttributeSet arg3);

    void support_onDestroy();

    void support_onDetachedFromWindow();

    void support_onEnterAnimationComplete();

    boolean support_onGenericMotionEvent(MotionEvent arg1);

    boolean support_onKeyDown(int arg1, KeyEvent arg2);

    boolean support_onKeyLongPress(int arg1, KeyEvent arg2);

    boolean support_onKeyMultiple(int arg1, int arg2, KeyEvent arg3);

    boolean support_onKeyShortcut(int arg1, KeyEvent arg2);

    boolean support_onKeyUp(int arg1, KeyEvent arg2);

    void support_onLocalVoiceInteractionStarted();

    void support_onLocalVoiceInteractionStopped();

    void support_onLowMemory();

    boolean support_onMenuItemSelected(int arg1, MenuItem arg2);

    boolean support_onMenuOpened(int arg1, Menu arg2);

    void support_onMultiWindowModeChanged(boolean arg1);

    void support_onMultiWindowModeChanged(boolean arg1, Configuration arg2);

    boolean support_onNavigateUp();

    boolean support_onNavigateUpFromChild(Activity arg1);

    void support_onNewIntent(Intent arg1);

    void support_onNewIntent(Intent arg1, ComponentCaller arg2);

    boolean support_onOptionsItemSelected(MenuItem arg1);

    void support_onOptionsMenuClosed(Menu arg1);

    void support_onPanelClosed(int arg1, Menu arg2);

    void support_onPause();

    void support_onPictureInPictureModeChanged(boolean arg1);

    void support_onPictureInPictureModeChanged(boolean arg1, Configuration arg2);

    boolean support_onPictureInPictureRequested();

    void support_onPictureInPictureUiStateChanged(PictureInPictureUiState arg1);

    void support_onPointerCaptureChanged(boolean arg1);

    void support_onPostCreate(Bundle arg1);

    void support_onPostCreate(Bundle arg1, PersistableBundle arg2);

    void support_onPostResume();

    void support_onPrepareDialog(int arg1, Dialog arg2);

    void support_onPrepareDialog(int arg1, Dialog arg2, Bundle arg3);

    void support_onPrepareNavigateUpTaskStack(TaskStackBuilder arg1);

    boolean support_onPrepareOptionsMenu(Menu arg1);

    boolean support_onPreparePanel(int arg1, View arg2, Menu arg3);

    void support_onProvideAssistContent(AssistContent arg1);

    void support_onProvideAssistData(Bundle arg1);

    void support_onProvideKeyboardShortcuts(List arg1, Menu arg2, int arg3);

    Uri support_onProvideReferrer();

    void support_onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3);

    void support_onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3, int arg4);

    void support_onRestart();

    void support_onRestoreInstanceState(Bundle arg1);

    void support_onRestoreInstanceState(Bundle arg1, PersistableBundle arg2);

    void support_onResume();

    void support_onResumeFragments();

    Object support_onRetainNonConfigurationInstance();

    void support_onSaveInstanceState(Bundle arg1);

    void support_onSaveInstanceState(Bundle arg1, PersistableBundle arg2);

    boolean support_onSearchRequested();

    boolean support_onSearchRequested(SearchEvent arg1);

    void support_onStart();

    void support_onStateNotSaved();

    void support_onStop();

    void support_onTitleChanged(CharSequence arg1, int arg2);

    void support_onTopResumedActivityChanged(boolean arg1);

    boolean support_onTouchEvent(MotionEvent arg1);

    boolean support_onTrackballEvent(MotionEvent arg1);

    void support_onTrimMemory(int arg1);

    void support_onUserInteraction();

    void support_onUserLeaveHint();

    void support_onVisibleBehindCanceled();

    void support_onWindowAttributesChanged(WindowManager.LayoutParams arg1);

    void support_onWindowFocusChanged(boolean arg1);

    ActionMode support_onWindowStartingActionMode(ActionMode.Callback arg1);

    ActionMode support_onWindowStartingActionMode(ActionMode.Callback arg1, int arg2);

    void support_openContextMenu(View arg1);

    void support_openOptionsMenu();

    void support_overrideActivityTransition(int arg1, int arg2, int arg3);

    void support_overrideActivityTransition(int arg1, int arg2, int arg3, int arg4);

    void support_overridePendingTransition(int arg1, int arg2);

    void support_overridePendingTransition(int arg1, int arg2, int arg3);

    void support_postponeEnterTransition();

    void support_recreate();

    void support_registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks arg1);

    void support_registerForContextMenu(View arg1);

    boolean support_releaseInstance();

    void support_reportFullyDrawn();

    DragAndDropPermissions support_requestDragAndDropPermissions(DragEvent arg1);

    void support_requestFullscreenMode(int arg1, OutcomeReceiver arg2);

    boolean support_requestVisibleBehind(boolean arg1);

    void support_setActionBar(Toolbar arg1);

    void support_setAllowCrossUidActivitySwitchFromBelow(boolean arg1);

    void support_setContentTransitionManager(TransitionManager arg1);

    void support_setContentView(int arg1);

    void support_setContentView(View arg1);

    void support_setContentView(View arg1, ViewGroup.LayoutParams arg2);

    void support_setEnterSharedElementCallback(SharedElementCallback arg1);

    void support_setExitSharedElementCallback(SharedElementCallback arg1);

    void support_setFinishOnTouchOutside(boolean arg1);

    void support_setImmersive(boolean arg1);

    void support_setInheritShowWhenLocked(boolean arg1);

    void support_setIntent(Intent arg1);

    void support_setIntent(Intent arg1, ComponentCaller arg2);

    void support_setLocusContext(LocusId arg1, Bundle arg2);

    void support_setPictureInPictureParams(PictureInPictureParams arg1);

    void support_setRecentsScreenshotEnabled(boolean arg1);

    void support_setRequestedOrientation(int arg1);

    void support_setShouldDockBigOverlays(boolean arg1);

    void support_setShowWhenLocked(boolean arg1);

    void support_setTaskDescription(ActivityManager.TaskDescription arg1);

    void support_setTitle(int arg1);

    void support_setTitle(CharSequence arg1);

    void support_setTitleColor(int arg1);

    boolean support_setTranslucent(boolean arg1);

    void support_setTurnScreenOn(boolean arg1);

    void support_setVisible(boolean arg1);

    void support_setVrModeEnabled(boolean arg1, ComponentName arg2);

    boolean support_shouldDockBigOverlays();

    boolean support_shouldShowRequestPermissionRationale(String arg1);

    boolean support_shouldShowRequestPermissionRationale(String arg1, int arg2);

    boolean support_shouldUpRecreateTask(Intent arg1);

    boolean support_showAssist(Bundle arg1);

    void support_showLockTaskEscapeMessage();

    ActionMode support_startActionMode(ActionMode.Callback arg1);

    ActionMode support_startActionMode(ActionMode.Callback arg1, int arg2);

    void support_startActivities(Intent[] arg1);

    void support_startActivities(Intent[] arg1, Bundle arg2);

    void support_startActivity(Intent arg1);

    void support_startActivity(Intent arg1, Bundle arg2);

    @Deprecated
    void support_startActivityForResult(Intent arg1, int arg2);

    @Deprecated
    void support_startActivityForResult(Intent arg1, int arg2, Bundle arg3);

    void support_startActivityForResultAsUser(Intent arg1, int arg2, Bundle arg3, UserHandle arg4);

    void support_startActivityForResultAsUser(Intent arg1, int arg2, UserHandle arg3);

    void support_startActivityForResultAsUser(Intent arg1, String arg2, int arg3, Bundle arg4, UserHandle arg5);

    @Deprecated
    void support_startActivityFromChild(Activity arg1, Intent arg2, int arg3);

    @Deprecated
    void support_startActivityFromChild(Activity arg1, Intent arg2, int arg3, Bundle arg4);

    @Deprecated
    void support_startActivityFromFragment(Fragment arg1, Intent arg2, int arg3);

    @Deprecated
    void support_startActivityFromFragment(Fragment arg1, Intent arg2, int arg3, Bundle arg4);

    boolean support_startActivityIfNeeded(Intent arg1, int arg2);

    boolean support_startActivityIfNeeded(Intent arg1, int arg2, Bundle arg3);

    void support_startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5);

    void support_startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5, Bundle arg6);

    @Deprecated
    void support_startIntentSenderForResult(IntentSender arg1, int arg2, Intent arg3, int arg4, int arg5, int arg6);

    @Deprecated
    void support_startIntentSenderForResult(IntentSender arg1, int arg2, Intent arg3, int arg4, int arg5, int arg6, Bundle arg7);

    @Deprecated
    void support_startIntentSenderFromChild(Activity arg1, IntentSender arg2, int arg3, Intent arg4, int arg5, int arg6, int arg7);

    @Deprecated
    void support_startIntentSenderFromChild(Activity arg1, IntentSender arg2, int arg3, Intent arg4, int arg5, int arg6, int arg7, Bundle arg8);

    void support_startLocalVoiceInteraction(Bundle arg1);

    void support_startLockTask();

    void support_startManagingCursor(Cursor arg1);

    boolean support_startNextMatchingActivity(Intent arg1);

    boolean support_startNextMatchingActivity(Intent arg1, Bundle arg2);

    void support_startPostponedEnterTransition();

    void support_startSearch(String arg1, boolean arg2, Bundle arg3, boolean arg4);

    void support_stopLocalVoiceInteraction();

    void support_stopLockTask();

    void support_stopManagingCursor(Cursor arg1);

    void support_supportFinishAfterTransition();

    @Deprecated
    void support_supportInvalidateOptionsMenu();

    void support_supportPostponeEnterTransition();

    void support_supportStartPostponedEnterTransition();

    void support_takeKeyEvents(boolean arg1);

    void support_triggerSearch(String arg1, Bundle arg2);

    void support_unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks arg1);

    void support_unregisterForContextMenu(View arg1);
}

