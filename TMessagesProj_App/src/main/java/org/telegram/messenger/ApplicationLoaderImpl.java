package org.telegram.messenger;

import com.google.android.exoplayer2.util.Log;

import org.telegram.messenger.regular.BuildConfig;

public class ApplicationLoaderImpl extends ApplicationLoader {
    @Override
    protected String onGetApplicationId() {
        Log.d("ApplicationLoaderImpl", "onGetApplicationId");
        return BuildConfig.APPLICATION_ID;
    }
}
