package com.mycompany.navigationdrawer;

import android.preference.*;
import android.os.Bundle;

public class GeneralSettingActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.activity_preference);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction().replace(R.id.fragment_preferences,
                new PreferFragment()).commit();
    }
}
