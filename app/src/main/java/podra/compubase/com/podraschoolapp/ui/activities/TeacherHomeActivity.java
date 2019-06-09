package podra.compubase.com.podraschoolapp.ui.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.ui.fragments.HomeFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.TeacherHomeFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.TeacherInboxFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.TeacherNotificationFragment;

public class TeacherHomeActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home_teacher:

                    TeacherHomeFragment teacherHomeFragment = new TeacherHomeFragment();
                    displaySelectedTeacherFragment(teacherHomeFragment);
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.inbox_teacher:

                    TeacherInboxFragment teacherInboxFragment = new TeacherInboxFragment();
                    displaySelectedTeacherFragment(teacherInboxFragment);
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications_teacher:

                    TeacherNotificationFragment teacherNotificationFragment = new TeacherNotificationFragment();
                    displaySelectedTeacherFragment(teacherNotificationFragment);
//                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation_teacher);
        navigation.setSelectedItemId(R.id.navigation_home_teacher);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        TeacherHomeFragment teacherHomeFragment = new TeacherHomeFragment();
        displaySelectedTeacherFragment(teacherHomeFragment);
    }

    public void displaySelectedTeacherFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_teacher, fragment);
        fragmentTransaction.addToBackStack(null).commit();
    }
}
