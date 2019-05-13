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
import podra.compubase.com.podraschoolapp.ui.fragments.InboxFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.NotificationsFragment;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    HomeFragment homeFragment = new HomeFragment();
                    displaySelectedFragment(homeFragment);

//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.inbox:

                    InboxFragment inboxFragment = new InboxFragment();
                    displaySelectedFragment(inboxFragment);

//                    mTextMessage.setText(R.string.inbox);
                    return true;
                case R.id.navigation_notifications:

                    NotificationsFragment notificationsFragment = new NotificationsFragment();
                    displaySelectedFragment(notificationsFragment);

//                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_home);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        HomeFragment homeFragment = new HomeFragment();
        displaySelectedFragment(homeFragment);
    }
    public void displaySelectedFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.addToBackStack(null).commit();
    }
}
