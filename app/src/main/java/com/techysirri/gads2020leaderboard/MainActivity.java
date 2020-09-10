package com.techysirri.gads2020leaderboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.techysirri.gads2020leaderboard.ui.main.SectionsPagerAdapter sectionsPagerAdapter = new com.techysirri.gads2020leaderboard.ui.main.SectionsPagerAdapter(this,
                getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        MaterialButton submitProjectButton = findViewById(R.id.submit_project_button);
        submitProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                projectSubmissionActivity();
            }
        });
    }

    private void projectSubmissionActivity() {
        Intent projectSubmission = new Intent(this, SubmitProjectActivity.class);
        startActivity(projectSubmission);

    }
}
