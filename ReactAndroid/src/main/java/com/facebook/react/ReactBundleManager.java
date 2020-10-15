package com.facebook.react;

import android.text.TextUtils;

import java.util.HashMap;
import java.util.Map;

public class ReactBundleManager {
  private Map<String, Boolean> mLoadedBundles;

  public ReactBundleManager() {
    mLoadedBundles = new HashMap<>();
  }

  public synchronized void setState(String bundleName, boolean loaded) {
    if (!TextUtils.isEmpty(bundleName)) {
      mLoadedBundles.put(bundleName, loaded);
    }
  }

  public synchronized boolean isLoaded(String bundleName) {
    if (TextUtils.isEmpty(bundleName) ||
        !mLoadedBundles.containsKey(bundleName)) {
      return false;
    }

    return mLoadedBundles.get(bundleName);
  }
}
