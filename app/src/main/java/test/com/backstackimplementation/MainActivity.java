package test.com.backstackimplementation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity{

    Fragment currentFragment;

    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;
    private Button buttonE;
    private Button buttonPrint;
    private Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = (Button) findViewById(R.id.add_a);
        buttonB = (Button) findViewById(R.id.add_b);
        buttonC = (Button) findViewById(R.id.add_c);
        buttonD = (Button) findViewById(R.id.add_d);
        buttonE = (Button) findViewById(R.id.add_e);
        buttonBack = (Button) findViewById(R.id.back);
        buttonPrint = (Button) findViewById(R.id.print);

        buttonA.setOnClickListener(new HandleOnClickListener(0));
        buttonB.setOnClickListener(new HandleOnClickListener(1));
        buttonC.setOnClickListener(new HandleOnClickListener(2));
        buttonD.setOnClickListener(new HandleOnClickListener(3));
        buttonE.setOnClickListener(new HandleOnClickListener(4));

        buttonBack.setOnClickListener(new HandleOnClickListener(5));
        buttonPrint.setOnClickListener(new HandleOnClickListener(6));

    }

    public void setFragment(int position) {
        boolean addToBackStack = true;
        String name = "";
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

            case 4:
                DemoFragmentD demoFragmentD = new DemoFragmentD();
                name = "D";
                demoFragmentD.setName(name);
                currentFragment = demoFragmentD;
                break;
            case 5:
                DemoFragmentE demoFragmentE = new DemoFragmentE();
                name = "E";
                demoFragmentE.setName(name);
                currentFragment = demoFragmentE;
                break;
        }


        android.app.FragmentTransaction fragmentTransaction;
        if (addToBackStack) {

            fragmentTransaction = getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, currentFragment, ""+name)
                    .addToBackStack(name);
            fragmentTransaction.commit();

        } else {

            fragmentTransaction = getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, currentFragment, ""+name);
            fragmentTransaction.commit();
        }

    }

    private void printBackStack(){
        Log.d("there are total fragments", "in back stack" + getFragmentManager()
                .getBackStackEntryCount());

        for(int entry = 0; entry < getFragmentManager().getBackStackEntryCount(); entry++){
            Log.d("Found fragment: ","" + getFragmentManager().getBackStackEntryAt(entry).getName());
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

                getFragmentManager().popBackStack();

            } else if (position == 6) {
                printBackStack();
            } else {
                setFragment(position);
            }
        }
    }

}
