package test.com.backstackimplementation;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shivam on 6/11/15.
 */
public class DemoFragmentE extends Fragment {

    String TAG = "FRAGMENT BACK STACK for E";
    String name = "";

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG + " ", " onCreate()");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG + " ", " onCreateView() creating new view");
        View view = inflater.inflate(R.layout.fragment_demo, null);
        TextView  textView = (TextView) view.findViewById(R.id.fragment_name);
        textView.setText("current fragment is "+name);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG+" "," onActivityCreated()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG+" "," onDestroyView()");
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG + " ", " onAttach()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG+" "," onPause()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG+" "," onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG+" "," onResume()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG+" "," onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG+" "," onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG+" "," onDetach()");
    }
}
