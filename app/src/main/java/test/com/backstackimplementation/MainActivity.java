package test.com.backstackimplementation;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonA = (Button) findViewById(R.id.add_a);
        Button buttonB = (Button) findViewById(R.id.add_b);
        Button buttonC = (Button) findViewById(R.id.add_c);
        Button buttonD = (Button) findViewById(R.id.add_d);
        Button buttonE = (Button) findViewById(R.id.add_e);
        Button buttonBack = (Button) findViewById(R.id.back);
        Button buttonPrint = (Button) findViewById(R.id.print);

        buttonA.setOnClickListener(new HandleOnClickListener(0));
        buttonB.setOnClickListener(new HandleOnClickListener(1));
        buttonC.setOnClickListener(new HandleOnClickListener(2));
        buttonD.setOnClickListener(new HandleOnClickListener(3));
        buttonE.setOnClickListener(new HandleOnClickListener(4));

        buttonBack.setOnClickListener(new HandleOnClickListener(5));
        buttonPrint.setOnClickListener(new HandleOnClickListener(6));

    }

    public void setFragment(int position) {
        Fragment currentFragment;
        boolean addToBackStack = true;
        String name;
        switch (position) {
            case 0:
                name = "A";
                DemoFragment demoFragment = new DemoFragment();
                demoFragment.setName(name);
                currentFragment = demoFragment;

                break;
            case 1:
                DemoFragmentB demoFragmentB = new DemoFragmentB();
                name = "B";
                demoFragmentB.setName(name);
                currentFragment = demoFragmentB;
                break;

            case 2:
                DemoFragmentC demoFragmentC = new DemoFragmentC();
                name = "C";
                demoFragmentC.setName(name);
                currentFragment = demoFragmentC;
                break;

            case 3:
                DemoFragmentD demoFragmentD = new DemoFragmentD();
                name = "D";
                demoFragmentD.setName(name);
                currentFragment = demoFragmentD;
                break;
            default:
                DemoFragmentE demoFragmentE = new DemoFragmentE();
                name = "E";
                demoFragmentE.setName(name);
                currentFragment = demoFragmentE;
                break;
        }


        if (addToBackStack) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, currentFragment, name)
                    .addToBackStack(name).commit();
        } else {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, currentFragment, name)
                    .commit();
        }

    }

    @SuppressLint("LongLogTag")
    private void printBackStack() {
        Log.d("there are total fragments", "in back stack" + getSupportFragmentManager()
                .getBackStackEntryCount());

        for (int entry = 0; entry < getSupportFragmentManager().getBackStackEntryCount(); entry++) {
            Log.d("Found fragment: ", "" + getSupportFragmentManager().getBackStackEntryAt(entry).getName());
        }
    }


    class HandleOnClickListener implements View.OnClickListener {

        int position = 0;

        HandleOnClickListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {

            if (position == 5) {

                getSupportFragmentManager().popBackStack();

            } else if (position == 6) {
                printBackStack();
                //startActivity(new Intent(MainActivity.this, MyPagerActivity.class));
            } else {
                setFragment(position);
            }
        }
    }

}
