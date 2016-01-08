package com.obyknovenius.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by obyknovenius on 08/01/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
